package classes;

import independent.SystemClass;
import static independent.SystemClass.connect;
import static independent.SystemClass.loggedUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Admin extends User implements Loginable {

    private static Admin loggedUser = null;
    private static int lastId = 1;
    private static ArrayList<Teacher> subjectsTeacherList = null;
    private static ArrayList<Subject> requestsSubjectList = null;
    private static ArrayList<Teacher> requestsTeacherList = null;
    private static ArrayList<Teacher> adminSubjectsManageMembersAddTeacherList = null;

    public Admin(int id, String first_name, String last_name, String password) {
        super(id, first_name, last_name, password);
    }

    public static boolean addStudent(int id, String firstName, String lastName, String department, int term) {
        String query
                = "INSERT INTO students(students.id,students.first_name,students.last_name,students.department,students.term) "
                + "VALUES(" + id + ", '" + firstName + "', '" + lastName + "', '" + department + "', " + term + ")";

        try {
            SystemClass.connect().createStatement().executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean editStudent(int id, String firstName, String lastName, String password, String department, int term) {
        String query
                = "UPDATE students "
                + "SET students.first_name='" + firstName + "', "
                + "students.last_name='" + lastName + "', "
                + "students.u_password='" + password + "', "
                + "students.department='" + department + "', "
                + "students.term='" + term + "' "
                + "WHERE students.id=" + id;

        try {
            SystemClass.connect().createStatement().executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean setAdminSubjectsManageMembersAddTeacherComboBox(JComboBox comboBoxToSet, JTable tableToGet) {
        adminSubjectsManageMembersAddTeacherList = new ArrayList<>();

        String query
                = "SELECT teachers.id,teachers.first_name,teachers.last_name "
                + "FROM teachers "
                + "WHERE teachers.id NOT IN "
                + "(SELECT teachers_subjects.teacher_id "
                + "FROM teachers_subjects "
                + "WHERE teachers_subjects.subject_id=" + tableToGet.getValueAt(tableToGet.getSelectedRow(), 0) + ")";

        try {
            Statement st = SystemClass.connect().createStatement();

            ResultSet rs = st.executeQuery(query);

            int i = 0;

            while (rs.next()) {
                adminSubjectsManageMembersAddTeacherList.add(new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), ""));
                comboBoxToSet.addItem(adminSubjectsManageMembersAddTeacherList.get(i).getFirstName() + " " + adminSubjectsManageMembersAddTeacherList.get(i).getLastName());

                i++;
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;

    }

    public static boolean setAdminStudentSubjectTable(JTable tableToSet, JTable tableToGet) {
        String query
                = "SELECT subjects.id,subjects.subject_code,subjects.subject_name "
                + "FROM students_subjects "
                + "JOIN subjects "
                + "ON students_subjects.subject_id=subjects.id "
                + "WHERE students_subjects.student_id=" + tableToGet.getValueAt(tableToGet.getSelectedRow(), 0)
                + " ORDER BY students_subjects.subject_id";

        return SystemClass.setTableValues(tableToSet, "gd", query);
    }

    public static boolean setAdminRequestsSubjectComboBox(JComboBox comboBox, JTable tableToGet) {
        requestsSubjectList = null;
        requestsSubjectList = new ArrayList<>();

        comboBox.removeAllItems();

        String query
                = "SELECT DISTINCT subjects.id,subjects.subject_code,subjects.subject_name "
                + "FROM subjects ";

        try {
            Statement st = SystemClass.connect().createStatement();
            ResultSet resultSet = st.executeQuery(query);

            int i = 0;
            while (resultSet.next()) {
                requestsSubjectList.add(new Subject(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        0, 0));
                comboBox.addItem("(" + requestsSubjectList.get(i).getCode() + ") " + requestsSubjectList.get(i).getName());
                i++;
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean setAdminRequestsTeacherComboBox(JComboBox comboBoxToSet, JComboBox comboBoxToGet) {
        requestsTeacherList = null;
        requestsTeacherList = new ArrayList<>();

        comboBoxToSet.removeAllItems();

        if (comboBoxToGet.getSelectedIndex() != -1) {
            String query
                    = "SELECT DISTINCT teachers.id,teachers.first_name,teachers.last_name "
                    + "FROM teachers_subjects "
                    + "JOIN teachers "
                    + "ON teachers_subjects.teacher_id=teachers.id "
                    + "WHERE teachers_subjects.subject_id=" + requestsSubjectList.get(comboBoxToGet.getSelectedIndex()).getId();

            try {
                Statement ps = SystemClass.connect().createStatement();

                ResultSet rs = ps.executeQuery(query);

                int i = 0;
                while (rs.next()) {
                    requestsTeacherList.add(new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), ""));
                    comboBoxToSet.addItem((requestsTeacherList.get(i).getFirstName() + " " + requestsTeacherList.get(i).getLastName()));
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

    public static boolean setAdminRequestInputTable(JTable tableToSet, JComboBox subjectComboBox, JComboBox teacherComboBox) {
        if (subjectComboBox.getSelectedIndex() != -1 && teacherComboBox.getSelectedIndex() != -1) {
            String query
                    = "SELECT students.id,students.first_name,students.last_name "
                    + "FROM requests JOIN students "
                    + "ON requests.student_id=students.id "
                    + "WHERE requests.subject_id="
                    + requestsSubjectList.get(subjectComboBox.getSelectedIndex()).getId()
                    + " AND requests.teacher_id=" + requestsTeacherList.get(teacherComboBox.getSelectedIndex()).getId();
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

    public static boolean setAdminRequestOutputTable(JTable tableToSet, JComboBox subjectComboBox, JComboBox teacherComboBox) {
        DefaultTableModel model = (DefaultTableModel) tableToSet.getModel();
        model.setRowCount(0);

        if (subjectComboBox.getSelectedIndex() != -1 && teacherComboBox.getSelectedIndex() != -1) {
            String query
                    = "SELECT students.id,students.first_name,students.last_name "
                    + "FROM students "
                    + "JOIN students_teachers_subjects "
                    + "ON students.id=students_teachers_subjects.student_id "
                    + "WHERE students_teachers_subjects.subject_id="
                    + requestsSubjectList.get(subjectComboBox.getSelectedIndex()).getId()
                    + " AND students_teachers_subjects.teacher_id=" + requestsTeacherList.get(teacherComboBox.getSelectedIndex()).getId();

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

    public static boolean removeRequest(JTable tableToGet, JComboBox subjectComboBox){
        int[] rowList = tableToGet.getSelectedRows();

        String queryToRemove
                = "DELETE FROM requests "
                + "WHERE requests.subject_id="+requestsSubjectList.get(subjectComboBox.getSelectedIndex()).getId()+" "
                + "AND requests.student_id ";

        if (rowList.length == 1) {
            queryToRemove += "=" + tableToGet.getValueAt(tableToGet.getSelectedRow(), 0);
        } else {
            queryToRemove += " IN(";

            for (int i = 0; i < rowList.length; i++) {
                queryToRemove += tableToGet.getValueAt(rowList[i], 0);

                if (i != rowList.length - 1) {
                    queryToRemove += ", ";
                }
            }

            queryToRemove += ")";
        }
        
        try {
            Statement st = SystemClass.connect().createStatement();

            st.executeUpdate(queryToRemove);

        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }
    
    public static boolean addRequestToDatabase(JTable tableToGet, JComboBox subjectComboBox, JComboBox teacherComboBox) {
        int[] rowList = tableToGet.getSelectedRows();

        String queryToRemove
                = "DELETE FROM requests "
                + "WHERE requests.student_id";

        if (rowList.length == 1) {
            queryToRemove += "=" + tableToGet.getValueAt(tableToGet.getSelectedRow(), 0);
        } else {
            queryToRemove += " IN(";

            for (int i = 0; i < rowList.length; i++) {
                queryToRemove += tableToGet.getValueAt(rowList[i], 0);

                if (i != rowList.length - 1) {
                    queryToRemove += ", ";
                }
            }

            queryToRemove += ")";
        }

        String queryToAdd
                = "INSERT INTO students_teachers_subjects(student_id,teacher_id,subject_id) "
                + "VALUES";

        for (int i = 0; i < rowList.length; i++) {
            queryToAdd += "(" + tableToGet.getValueAt(rowList[i], 0)
                    + ","
                    + requestsTeacherList.get(teacherComboBox.getSelectedIndex()).getId()
                    + ","
                    + requestsSubjectList.get(subjectComboBox.getSelectedIndex()).getId()
                    + ")";

            if (i != rowList.length - 1) {
                queryToAdd += ", ";
            }
        }

        try {
            Statement st = SystemClass.connect().createStatement();

            st.executeUpdate(queryToAdd);
            st.executeUpdate(queryToRemove);

        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean addTeacherToSubject(JComboBox comboBoxToGet, JTable tableToGet) {
        String query
                = "INSERT INTO teachers_subjects(teachers_subjects.teacher_id,teachers_subjects.subject_id) "
                + "VALUES("
                + adminSubjectsManageMembersAddTeacherList.get(comboBoxToGet.getSelectedIndex()).getId() + ","
                + tableToGet.getValueAt(tableToGet.getSelectedRow(), 0) + ")";

        try {
            Statement st = SystemClass.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean editUser(User user) {
        try {
            boolean isLogged = false;

            if (user.getId() == SystemClass.loggedUser.getId()) {
                isLogged = true;
            }

            String type;
            if (user instanceof Student) {
                type = "students";
            } else if (user instanceof Teacher) {
                type = "teachers";
            } else {
                type = "admins";
            }
            PreparedStatement editStatement = connect().prepareStatement("UPDATE " + type + " SET first_name=?,last_name=?,u_password=? WHERE id=?");

            editStatement.setString(1, user.getFirstName());
            editStatement.setString(2, user.getLastName());
            editStatement.setString(3, user.getPassword());
            editStatement.setInt(4, user.getId());
            editStatement.execute();

            if (isLogged) {
                SystemClass.loggedUser = new Admin(user.getId(), user.getFirstName(), user.getLastName(), user.getPassword());
            }

            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public static boolean removeStudentFromSubject(JTable tableToRemoveFrom, JTable tableToGet, JComboBox comboBoxToGet) {
        String query
                = "DELETE FROM students_teachers_subjects WHERE students_teachers_subjects.student_id="
                + tableToGet.getValueAt(tableToGet.getSelectedRow(), 0)
                + " AND students_teachers_subjects.teacher_id="
                + subjectsTeacherList.get(comboBoxToGet.getSelectedIndex()).getId()
                + " AND students_teachers_subjects.subject_id="
                + tableToRemoveFrom.getValueAt(tableToRemoveFrom.getSelectedRow(), 0);

        SystemClass.removeFromTable(tableToRemoveFrom, "fe", query);

        return setAdminStudentSubjectTable(tableToRemoveFrom, tableToGet);
    }

    public static boolean removeTeacherFromSubject(JComboBox comboBoxToGet) {
        String query
                = "DELETE FROM teachers_subjects "
                + "WHERE teachers_subjects.teacher_id=" + subjectsTeacherList.get(comboBoxToGet.getSelectedIndex()).getId();

        try {
            Statement st = SystemClass.connect().createStatement();
            st.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean setTeachersGivingSubjectComboBox(JComboBox comboBox, JTable tableToGet) {
        subjectsTeacherList = null;
        subjectsTeacherList = new ArrayList<>();
        comboBox.removeAllItems();

        String query
                = "SELECT DISTINCT teachers.id,teachers.first_name,teachers.last_name "
                + "FROM teachers_subjects "
                + "JOIN teachers "
                + "ON teachers_subjects.teacher_id=teachers.id "
                + "WHERE teachers_subjects.subject_id=" + tableToGet.getValueAt(tableToGet.getSelectedRow(), 0);

        try {
            Statement ps = SystemClass.connect().createStatement();

            ResultSet rs = ps.executeQuery(query);

            int i = 0;
            while (rs.next()) {
                subjectsTeacherList.add(new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), ""));
                comboBox.addItem((subjectsTeacherList.get(i).getFirstName() + " " + subjectsTeacherList.get(i).getLastName()));
                i++;
            }

        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

        return true;
    }

    public static boolean setAdminSubjectsStudentTable(JTable tableToSet, JTable tableToGet, JComboBox comboBox) {
        if (comboBox.getSelectedIndex() != -1) {
            String query
                    = "SELECT students.id,students.first_name,students.last_name "
                    + "FROM students_teachers_subjects JOIN students "
                    + "ON students_teachers_subjects.student_id=students.id "
                    + "WHERE students_teachers_subjects.teacher_id="
                    + subjectsTeacherList.get(comboBox.getSelectedIndex()).getId()
                    + " AND students_teachers_subjects.subject_id=" + tableToGet.getValueAt(tableToGet.getSelectedRow(), 0);

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

    @Override
    public boolean login(String username, String password) {
        try {
            Statement loginSt = connect().createStatement();

            String query;

            query = "SELECT * FROM admins";

            ResultSet loginSet = loginSt.executeQuery(query);

            while (loginSet.next()) {
                if (String.valueOf(loginSet.getInt(1)).equals(username) && loginSet.getString(4).equals(password)) {
                    Admin.loggedUser = new Admin(loginSet.getInt(1), loginSet.getString(2), loginSet.getString(3), loginSet.getString(4));
                    SystemClass.loggedUser = Admin.loggedUser;
                    return true;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return false;
    }
}
