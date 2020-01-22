package classes;

import independent.SystemClass;
import static independent.SystemClass.connect;
import static independent.SystemClass.loggedUser;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Student extends User implements Loginable {

    private Grade grades;
    public static Student loggedUser;
    private int term;
    private String department;

    private static ArrayList<Subject> subjectsList = null;
    private static ArrayList<Subject> takeSubjectSubjectList = null;
    private static ArrayList<Teacher> takeSubjectTeacherList = null;
    private static ArrayList<Subject> takeSubjectRequestSubjectList = null;
    private static ArrayList<Teacher> takeSubjectRequestTeacherList = null;
    private static ArrayList<Subject> attendanceSubjectList = null;

    public Student(int id, String first_name, String last_name, String department) {
        super(id, first_name, last_name, "");
        this.department = department;
    }

    @Override
    public boolean login(String username, String password) {
        try {
            Statement loginSt = connect().createStatement();

            String query;

            query = "SELECT * FROM students";

            ResultSet loginSet = loginSt.executeQuery(query);

            while (loginSet.next()) {
                if (String.valueOf(loginSet.getInt(1)).equals(username) && loginSet.getString(4).equals(password)) {
                    Student.loggedUser = new Student(loginSet.getInt(1), loginSet.getString(2), loginSet.getString(3), loginSet.getString(5));
                    Student.loggedUser.term = loginSet.getInt(6);
                    SystemClass.loggedUser = Student.loggedUser;
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return false;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public int getTerm() {
        return term;
    }

    public String getDepartment() {
        return department;
    }

    public static boolean setStudentAttendanceSubjectComboBox(JComboBox comboBoxToSet) {
        attendanceSubjectList = new ArrayList<>();

        comboBoxToSet.removeAllItems();

        String query
                = "SELECT subjects.id,subjects.subject_code,subjects.subject_name "
                + "FROM subjects "
                + "JOIN students_teachers_subjects "
                + "ON subjects.id=students_teachers_subjects.subject_id "
                + "WHERE students_teachers_subjects.student_id=" + SystemClass.loggedUser.getId();

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

    public static boolean sendAttendanceCode(int code, JComboBox subjectComboBox) {
        String query
                = "INSERT INTO attendance(attendance.student_id,attendance.teacher_id,attendance.subject_id) "
                + "SELECT students_teachers_subjects.student_id,students_teachers_subjects.teacher_id,students_teachers_subjects.subject_id "
                + "FROM students_teachers_subjects "
                + "JOIN teachers_subjects "
                + "ON (students_teachers_subjects.teacher_id=teachers_subjects.teacher_id "
                + "AND students_teachers_subjects.subject_id=teachers_subjects.subject_id) "
                + "WHERE teachers_subjects.attendance_code=" + code + " "
                + "AND students_teachers_subjects.student_id=" + SystemClass.loggedUser.getId() + " "
                + "AND students_teachers_subjects.teacher_id="
                + "(SELECT students_teachers_subjects.teacher_id "
                + "FROM students_teachers_subjects "
                + "WHERE students_teachers_subjects.subject_id=" + attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId()
                + " AND students_teachers_subjects.student_id=" + SystemClass.loggedUser.getId()
                + ") AND students_teachers_subjects.subject_id=" + attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId();

        try {
            SystemClass.connect().createStatement().executeUpdate(query);

        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static int getAttendanceCurrentAbsence(JComboBox subjectComboBox){
        String query
                ="SELECT students_subjects.current_absence "
                + "FROM students_subjects "
                + "WHERE students_subjects.student_id="+SystemClass.loggedUser.getId()+" "
                + "AND students_subjects.subject_id="+attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId();
        
        try{
            ResultSet rs=SystemClass.connect().createStatement().executeQuery(query);
            
            rs.next();
            
            return rs.getInt(1);
        }catch(SQLException ex){
            System.out.println(ex);
            return -1;
        }
    }

    public static int getAttendanceMaximumAbsence(JComboBox subjectComboBox){
        String query
                ="SELECT subjects.max_absence "
                + "FROM subjects "
                + "WHERE subjects.id="+attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId();
        
        try{
            ResultSet rs=SystemClass.connect().createStatement().executeQuery(query);
            
            rs.next();
            
            return rs.getInt(1);
        }catch(SQLException ex){
            System.out.println(ex);
            return -1;
        }
    }
    
    public static int getAttendanceHoursPerDay(JComboBox subjectComboBox){
        String query
                ="SELECT subjects.hours_per_day "
                + "FROM subjects "
                + "WHERE subjects.id="+attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId();
        
        try{
            ResultSet rs=SystemClass.connect().createStatement().executeQuery(query);
            
            rs.next();
            
            return rs.getInt(1);
        }catch(SQLException ex){
            System.out.println(ex);
            return -1;
        }
    }
    
    public static boolean checkIfAttended(JComboBox subjectComboBox) {
        String query
                = "SELECT * "
                + "FROM attendance "
                + "WHERE attendance.subject_id=" + attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId() + " "
                + "AND attendance.student_id=" + SystemClass.loggedUser.getId();

        try {
            ResultSet rs = SystemClass.connect().createStatement().executeQuery(query);

            return rs.next();
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public static boolean checkIfAttendanceIsBeingTaken(JComboBox subjectComboBox) {
        String query
                = "SELECT * "
                + "FROM teachers_subjects "
                + "WHERE teachers_subjects.subject_id=" + attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId() + " "
                + "AND teachers_subjects.teacher_id="
                + "(SELECT students_teachers_subjects.teacher_id "
                + "FROM students_teachers_subjects "
                + "WHERE students_teachers_subjects.student_id=" + SystemClass.loggedUser.getId() + " "
                + "AND students_teachers_subjects.subject_id=" + attendanceSubjectList.get(subjectComboBox.getSelectedIndex()).getId() + ")";

        try {
            ResultSet rs = SystemClass.connect().createStatement().executeQuery(query);

            rs.next();

            if (rs.getInt(4) != 0) {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return false;
    }

    public static boolean setSubjectsTable(JTable tableToSet) {
        subjectsList = new ArrayList<>();

        String query
                = "SELECT subjects.subject_code,subjects.subject_name,students_subjects.midterm,students_subjects.homework,students_subjects.final "
                + "FROM students_subjects "
                + "JOIN subjects "
                + "ON students_subjects.subject_id=subjects.id "
                + "WHERE students_subjects.student_id=" + SystemClass.loggedUser.getId();

        return SystemClass.setTableValues(tableToSet, "placeholder", query);
    }

    public static boolean setRequestsTable(JTable tableToSet) {
        String[] columnNames = {"Subject", "Teacher"};
        takeSubjectRequestSubjectList = new ArrayList<>();
        takeSubjectRequestTeacherList = new ArrayList<>();
        DefaultTableModel model = new DefaultTableModel(null, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        String query
                = "SELECT subjects.id,subjects.subject_code,subjects.subject_name,teachers.id,teachers.first_name,teachers.last_name "
                + "FROM requests "
                + "JOIN subjects ON requests.subject_id=subjects.id "
                + "JOIN teachers ON requests.teacher_id=teachers.id "
                + "WHERE requests.student_id=" + SystemClass.loggedUser.getId();

        try {
            Statement st = SystemClass.connect().createStatement();
            ResultSet rs = st.executeQuery(query);

            int i = 0;
            while (rs.next()) {
                takeSubjectRequestSubjectList.add(new Subject(rs.getInt(1), rs.getString(2), rs.getString(3), 0, 0));
                takeSubjectRequestTeacherList.add(new Teacher(rs.getInt(4), rs.getString(5), rs.getString(6), ""));

                Object[] temp = {"(" + takeSubjectRequestSubjectList.get(i).getCode() + ") " + takeSubjectRequestSubjectList.get(i).getName(), takeSubjectRequestTeacherList.get(i).getFirstName() + " " + takeSubjectRequestTeacherList.get(i).getLastName()};

                model.addRow(temp);
                i++;
            }

            tableToSet.setModel(model);

        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean setTakeSubjectSubjectComboBox(JComboBox comboBoxToSet) {
        takeSubjectSubjectList = null;
        takeSubjectSubjectList = new ArrayList<>();

        comboBoxToSet.removeAllItems();

        System.out.println(Student.loggedUser.getTerm());

        String query
                = "SELECT subjects.id,subjects.subject_code,subjects.subject_name "
                + "FROM subjects "
                + "WHERE subjects.term=" + Student.loggedUser.getTerm()
                + " AND subjects.id NOT IN"
                + "(SELECT requests.subject_id "
                + "FROM requests "
                + "WHERE requests.student_id=" + Student.loggedUser.getId() + ") "
                + "AND subjects.id NOT IN"
                + "(SELECT students_subjects.subject_id "
                + "FROM students_subjects "
                + "WHERE students_subjects.student_id=" + Student.loggedUser.getId() + ")";

        try {
            Statement st = SystemClass.connect().createStatement();

            ResultSet rs = st.executeQuery(query);

            int i = 0;
            while (rs.next()) {
                takeSubjectSubjectList.add(new Subject(rs.getInt(1), rs.getString(2), rs.getString(3), 0, 0));
                comboBoxToSet.addItem("(" + takeSubjectSubjectList.get(i).getCode() + ") " + takeSubjectSubjectList.get(i).getName());
                i++;
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean setTakeSubjectTeacherComboBox(JComboBox comboBoxToSet, JComboBox comboBoxToGet) {
        takeSubjectTeacherList = null;
        takeSubjectTeacherList = new ArrayList<>();

        comboBoxToSet.removeAllItems();

        if (comboBoxToGet.getSelectedIndex() != -1) {
            String query
                    = "SELECT teachers.id,teachers.first_name,teachers.last_name "
                    + "FROM teachers JOIN teachers_subjects "
                    + "ON teachers.id=teachers_subjects.teacher_id "
                    + "WHERE teachers_subjects.subject_id=" + takeSubjectSubjectList.get(comboBoxToGet.getSelectedIndex()).getId();

            try {
                Statement st = SystemClass.connect().createStatement();

                ResultSet rs = st.executeQuery(query);

                int i = 0;
                while (rs.next()) {
                    takeSubjectTeacherList.add(new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), ""));
                    comboBoxToSet.addItem(takeSubjectTeacherList.get(i).getFirstName() + " " + takeSubjectTeacherList.get(i).getLastName());
                    i++;
                }

            } catch (SQLException ex) {
                System.out.println(ex);
                return false;
            }

            return true;
        }

        return false;
    }

    public static boolean addSubjectRequest(JComboBox subjectComboBox, JComboBox teacherComboBox) {
        if (subjectComboBox.getSelectedIndex() != -1 && teacherComboBox.getSelectedIndex() != -1) {
            String query
                    = "INSERT INTO requests(requests.student_id,requests.teacher_id,requests.subject_id) "
                    + "VALUES(" + SystemClass.loggedUser.getId() + ", "
                    + takeSubjectTeacherList.get(teacherComboBox.getSelectedIndex()).getId() + ","
                    + takeSubjectSubjectList.get(subjectComboBox.getSelectedIndex()).getId() + ")";

            try {
                Statement st = SystemClass.connect().createStatement();
                st.executeUpdate(query);

            } catch (SQLException ex) {
                System.out.println(ex);
                return false;
            }

            return true;
        }

        return false;
    }

    public static boolean removeSubjectRequest(JTable subjectsTable) {
        String query
                = "DELETE FROM requests "
                + "WHERE requests.student_id=" + SystemClass.loggedUser.getId() + " "
                + "AND requests.subject_id ";

        if (subjectsTable.getSelectedRowCount() > 1) {
            query += " IN(";

            int[] rows = subjectsTable.getSelectedRows();

            for (int i = 0; i < rows.length; i++) {
                query += takeSubjectRequestSubjectList.get(rows[i]).getId();

                if (i != rows.length - 1) {
                    query += ", ";
                }
            }

            query += ")";
        } else {
            query += "=" + takeSubjectRequestSubjectList.get(subjectsTable.getSelectedRow()).getId();
        }

        SystemClass.removeFromTable(subjectsTable, "", query);

        return setRequestsTable(subjectsTable);
    }
}
