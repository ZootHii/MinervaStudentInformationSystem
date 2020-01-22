package classes;

import independent.SystemClass;
import static independent.SystemClass.connect;
import static independent.SystemClass.loggedUser;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Teacher extends User implements Loginable {

    private static Teacher loggedUser = null;
    private static ArrayList<Subject> attendanceSubjectList = null;
    private static ArrayList<Subject> subjectsSubjectList = null;

    public Teacher(int id, String first_name, String last_name, String password) {
        super(id, first_name, last_name, password);
    }

    @Override
    public boolean login(String username, String password) {
        try {
            Statement loginSt = connect().createStatement();

            String query;

            query = "SELECT * FROM teachers";

            ResultSet loginSet = loginSt.executeQuery(query);

            while (loginSet.next()) {
                if (String.valueOf(loginSet.getInt(1)).equals(username) && loginSet.getString(4).equals(password)) {
                    Teacher.loggedUser = new Teacher(loginSet.getInt(1), loginSet.getString(2), loginSet.getString(3), loginSet.getString(4));
                    SystemClass.loggedUser = Teacher.loggedUser;
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return false;
    }

    public static boolean setGrades(JTable studentTable, JComboBox subjectComboBox, Grade grade) {
        String query
                = "UPDATE students_subjects "
                + "SET students_subjects.midterm=" + grade.midtermGrade + ", "
                + "students_subjects.homework=" + grade.homeworkGrade + ", "
                + "students_subjects.final=" + grade.finalGrade + " "
                + "WHERE students_subjects.subject_id=" + subjectsSubjectList.get(subjectComboBox.getSelectedIndex()).getId() + " "
                + "AND students_subjects.student_id=" + studentTable.getValueAt(studentTable.getSelectedRow(), 0);

        try {
            SystemClass.connect().createStatement().executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean setSubjectsStudentsTable(JTable tableToSet, JComboBox subjectComboBox) {
        if (subjectComboBox.getSelectedIndex() != -1) {
            String query
                    = "SELECT students.id,students.first_name,students.last_name,students_subjects.midterm,students_subjects.homework,students_subjects.final "
                    + "FROM students "
                    + "JOIN students_teachers_subjects "
                    + "ON students.id=students_teachers_subjects.student_id "
                    + "JOIN students_subjects "
                    + "ON students_teachers_subjects.student_id=students_subjects.student_id "
                    + "AND students_teachers_subjects.subject_id=students_subjects.subject_id "
                    + "WHERE students_teachers_subjects.subject_id=" + subjectsSubjectList.get(subjectComboBox.getSelectedIndex()).getId()
                    + " AND students_teachers_subjects.teacher_id=" + SystemClass.loggedUser.getId();

            try {
                Statement ps = SystemClass.connect().createStatement();

                SystemClass.setTableValues(tableToSet, "", query);

                return true;

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }

        return false;
    }

    public static boolean setSubjectsSubjectsComboBox(JComboBox comboBoxToSet) {
        subjectsSubjectList = new ArrayList<>();

        comboBoxToSet.removeAllItems();

        String query
                = "SELECT subjects.id,subjects.subject_code,subjects.subject_name "
                + "FROM subjects "
                + "JOIN teachers_subjects "
                + "ON subjects.id=teachers_subjects.subject_id "
                + "WHERE teachers_subjects.teacher_id=" + SystemClass.loggedUser.getId();

        try {
            Statement st = SystemClass.connect().createStatement();

            ResultSet rs = st.executeQuery(query);

            int i = 0;
            while (rs.next()) {
                subjectsSubjectList.add(new Subject(rs.getInt(1), rs.getString(2), rs.getString(3), 0, 0));
                comboBoxToSet.addItem("(" + subjectsSubjectList.get(i).getCode() + ") " + subjectsSubjectList.get(i).getName());
                i++;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean setAttendanceSubjectsComboBox(JComboBox comboBoxToSet) {
        attendanceSubjectList = new ArrayList<>();

        comboBoxToSet.removeAllItems();

        String query
                = "SELECT subjects.id,subjects.subject_code,subjects.subject_name "
                + "FROM subjects "
                + "JOIN teachers_subjects "
                + "ON subjects.id=teachers_subjects.subject_id "
                + "WHERE teachers_subjects.teacher_id=" + SystemClass.loggedUser.getId();

        try {
            Statement st = SystemClass.connect().createStatement();

            ResultSet rs = st.executeQuery(query);

            int i = 0;
            while (rs.next()) {
                attendanceSubjectList.add(new Subject(rs.getInt(1), rs.getString(2), rs.getString(3), 0, 0));
                comboBoxToSet.addItem("(" + attendanceSubjectList.get(i).getCode() + ") " + attendanceSubjectList.get(i).getName());
                i++;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean startAttendance(int code, JComboBox subjectComboBox) {
        String query
                = "UPDATE teachers_subjects "
                + "SET teachers_subjects.attendance_code=" + code + " "
                + "WHERE teachers_subjects.teacher_id=" + SystemClass.loggedUser.getId() + " "
                + "AND teachers_subjects.subject_id=" + attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId();

        try {
            SystemClass.connect().createStatement().executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean setAttendanceStudentsAttendanceTable(JTable tableToSet, JComboBox comboBoxToGet) {
        if (comboBoxToGet.getSelectedIndex() != -1) {
            String query
                    = "SELECT students.id,students.first_name,students.last_name,attendance.date_added "
                    + "FROM students JOIN attendance ON students.id=attendance.student_id "
                    + "WHERE attendance.teacher_id=" + SystemClass.loggedUser.getId() + " "
                    + "AND attendance.subject_id=" + attendanceSubjectList.get(comboBoxToGet.getSelectedIndex()).getId();

            return SystemClass.setTableValues(tableToSet, "", query);
        } else {
            return false;
        }
    }

    public static boolean setAttendanceCodeTextField(JTextField textFieldToSet, JComboBox subjectComboBox) {
        if (subjectComboBox.getSelectedIndex() != -1) {
            String query
                    = "SELECT teachers_subjects.attendance_code "
                    + "FROM teachers_subjects "
                    + "WHERE teachers_subjects.teacher_id=" + SystemClass.loggedUser.getId() + " "
                    + "AND teachers_subjects.subject_id=" + attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId();

            try {
                Statement st = SystemClass.connect().createStatement();

                ResultSet rs = st.executeQuery(query);

                textFieldToSet.setText("");

                while (rs.next()) {
                    if (rs.getInt(1) != 0) {
                        textFieldToSet.setText(String.valueOf(rs.getInt(1)));
                    }
                }
            } catch (SQLException ex) {
                System.out.println(ex);
                return false;
            }

            return true;
        }

        return false;
    }

    public static boolean expireAndTakeAttendance(int code, JComboBox subjectComboBox) {
        String query
                = "SELECT students_teachers_subjects.student_id "
                + "FROM students_teachers_subjects "
                + "JOIN attendance "
                + "ON students_teachers_subjects.teacher_id=attendance.teacher_id "
                + "AND students_teachers_subjects.subject_id=attendance.subject_id "
                + "WHERE attendance.teacher_id=" + SystemClass.loggedUser.getId() + " "
                + "AND attendance.subject_id=" + attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId() + " "
                + "AND students_teachers_subjects.student_id "
                + "NOT IN(SELECT attendance.student_id "
                + "FROM attendance)";

        Statement st;

        try {
            String query2;
            st = SystemClass.connect().createStatement();

            ResultSet rs = st.executeQuery(query);

            ArrayList<Integer> temp = new ArrayList<>();

            while (rs.next()) {
                temp.add(rs.getInt(1));
            }

            if (temp.size() != 0) {
                query2
                        = "UPDATE (students_subjects "
                        + "JOIN subjects "
                        + "ON students_subjects.subject_id=subjects.id "
                        + "JOIN students_teachers_subjects "
                        + "ON students_teachers_subjects.student_id=students_subjects.student_id "
                        + "AND students_teachers_subjects.subject_id=students_subjects.subject_id) "
                        + "SET students_subjects.current_absence=students_subjects.current_absence+subjects.hours_per_day "
                        + "WHERE subjects.id=" + attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId() + " "
                        + "AND students_teachers_subjects.teacher_id=" + SystemClass.loggedUser.getId() + " "
                        + "AND students_subjects.student_id IN(";

                for (int i = 0; i < temp.size(); i++) {
                    query2 += temp.get(i);
                    temp.get(i);
                    if (i != temp.size() - 1) {
                        query2 += ",";
                    }
                }

                query2 += ")";

                st.close();

            } else {
                query2
                        = "UPDATE (students_subjects "
                        + "JOIN subjects "
                        + "ON students_subjects.subject_id=subjects.id "
                        + "JOIN students_teachers_subjects "
                        + "ON students_teachers_subjects.student_id=students_subjects.student_id "
                        + "AND students_teachers_subjects.subject_id=students_subjects.subject_id) "
                        + "SET students_subjects.current_absence=students_subjects.current_absence+subjects.hours_per_day "
                        + "WHERE subjects.id=" + attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId() + " "
                        + "AND students_teachers_subjects.teacher_id=" + SystemClass.loggedUser.getId() + " ";
            }

            st = SystemClass.connect().createStatement();

            st.executeUpdate(query2);
            st.close();

        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("1");
            return false;
        }

        try {

            String query3
                    = "UPDATE teachers_subjects "
                    + "SET teachers_subjects.attendance_code=NULL "
                    + "WHERE teachers_subjects.teacher_id=" + SystemClass.loggedUser.getId() + " "
                    + "AND teachers_subjects.subject_id=" + attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId();

            String query4
                    = "DELETE FROM attendance "
                    + "WHERE attendance.teacher_id=" + SystemClass.loggedUser.getId() + " "
                    + "AND attendance.subject_id=" + attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId();

            Statement st2 = SystemClass.connect().createStatement();
            st2.executeUpdate(query3);
            st2.executeUpdate(query4);

        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("2");
            return false;
        }

        return true;
    }
}
