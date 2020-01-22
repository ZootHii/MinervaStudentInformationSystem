package independent;

import classes.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.MouseInputAdapter;
import javax.swing.plaf.basic.BasicListUI;
import javax.swing.table.DefaultTableModel;

public class MinervaGUI extends javax.swing.JFrame {

    private static Color color1 = new Color(55, 55, 55);
    private static Color color2 = new Color(40, 40, 40);
    private static Color defaultColor = new Color(60, 63, 65);

    public MinervaGUI() {
        initComponents();
        userFunc();
    }

    public void userFunc() {
        studentRadioButton.doClick();
        loginButton.setEnabled(false);
        loginDialog.setVisible(true);
    }

    public void loginDialogEnable() {
        if (usernameField.getText().isEmpty() || passwordField.getPassword().length == 0) {
            loginButton.setEnabled(false);
        } else {
            loginButton.setEnabled(true);
        }
    }

    //@SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginDialog = new javax.swing.JDialog();
        mainDialogPanel = new javax.swing.JPanel();
        passwordLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        studentRadioButton = new javax.swing.JRadioButton();
        teacherRadioButton = new javax.swing.JRadioButton();
        loginButton = new javax.swing.JButton();
        adminRadioButton = new javax.swing.JRadioButton();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginInfoLabel = new javax.swing.JLabel();
        loginTitleBarPanel = new javax.swing.JPanel();
        loginExitButton = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        loginTypeGroup = new javax.swing.ButtonGroup();
        adminAddUserDialog = new javax.swing.JDialog();
        adminAddUserDialogMainPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        adminAddUserDialogAddButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        adminAddUserIdField = new javax.swing.JTextField();
        adminEditUserDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        adminEditUserFirstNameField = new javax.swing.JTextField();
        adminEditUserLastNameField = new javax.swing.JTextField();
        adminEditUserPasswordField = new javax.swing.JTextField();
        adminEditUserApplyButton = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        adminAddSubjectDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        subjectIdField = new javax.swing.JTextField();
        subjectCodeField = new javax.swing.JTextField();
        subjectNameField = new javax.swing.JTextField();
        subjectHoursInWeekField = new javax.swing.JTextField();
        subjectMaxAbsenceField = new javax.swing.JTextField();
        adminAddSubjectDialogCancelButton = new javax.swing.JButton();
        adminAddSubjectDialogAddButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        subjectTermField = new javax.swing.JTextField();
        adminStudentsManageSubjectsDialog = new javax.swing.JDialog();
        jScrollPane8 = new javax.swing.JScrollPane();
        adminStudentSubjectsTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        adminSubjectsManageMembersDialog = new javax.swing.JDialog();
        jScrollPane7 = new javax.swing.JScrollPane();
        adminSubjectsManageMembersStudentsTable = new javax.swing.JTable();
        adminSubjectsManageMembersRemoveStudentButton = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        adminSubjectsManageMembersAddTeacherButton = new javax.swing.JButton();
        adminSubjectsManageMembersAddTeacherComboBox = new javax.swing.JComboBox<>();
        adminSubjectsManageMembersRemoveTeacherButton = new javax.swing.JButton();
        teachersGivingSubjectComboBox = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        studentSubjectsTakeSubjectDialog = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        studentSubjectsTakeSubjectSendRequestButton = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        studentSubjectsTakeSubjectRequestTable = new javax.swing.JTable();
        studentSubjectsTakeSubjectTeacherComboBox = new javax.swing.JComboBox<>();
        studentSubjectsTakeSubjectSubjectComboBox = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        studentSubjectsTakeSubjectRemoveRequestButton = new javax.swing.JButton();
        adminAddStudentDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        adminAddStudentDialogExitButton = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        adminAddStudentLastNameField = new javax.swing.JTextField();
        adminAddStudentDepartmentField = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        adminAddStudentAddStudentButton = new javax.swing.JButton();
        adminAddStudentFirstNameField = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        adminAddStudentTermField = new javax.swing.JTextField();
        adminAddStudentCancelButton = new javax.swing.JButton();
        adminEditStudentDialog = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        adminEditStudentDialogExitButton = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        adminEditStudentLastNameField = new javax.swing.JTextField();
        adminEditStudentDepartmentField = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        adminEditStudentEditStudentButton = new javax.swing.JButton();
        adminEditStudentFirstNameField = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        adminEditStudentTermField = new javax.swing.JTextField();
        adminEditStudentCancelButton = new javax.swing.JButton();
        adminEditStudentPasswordField = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        teacherSubjectsManageGradesDialog = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        teacherSubjectsManageGradesFinalField = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        teacherSubjectsManageGradesApplyButton = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        teacherSubjectsManageGradesMidtermField = new javax.swing.JTextField();
        teacherSubjectsManageGradesHomeworkField = new javax.swing.JTextField();
        teacherSubjectsManageGradesInfoLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        studentPanel = new javax.swing.JPanel();
        studentCardPanel = new javax.swing.JPanel();
        studentAttendancePanel = new javax.swing.JPanel();
        studentAttendanceSubmitCodeButton = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        studentAttendanceCodeField = new javax.swing.JTextField();
        studentAttendanceSubjectComboBox = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        studentAttendanceInfoLabel = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        studentAttendanceCurrentAbsentHoursLabel = new javax.swing.JLabel();
        studentAttendanceMaximumAbsentHours = new javax.swing.JLabel();
        studentAttendanceHoursLeft = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        studentAttendanceHoursPerDayLabel = new javax.swing.JLabel();
        studentSubjectsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentSubjectsTable = new javax.swing.JTable();
        studentSubjectsRequestSubjectButton = new javax.swing.JButton();
        studentInfoPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        studentIdLabel = new javax.swing.JLabel();
        studentFirstNameLabel = new javax.swing.JLabel();
        studentLastNameLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        studentDepartmentLabel = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        studentAcademicYearLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        studentInfoPanelButtonSymbol = new javax.swing.JLabel();
        studentSubjectsPanelButtonSymbol = new javax.swing.JLabel();
        studentSubjectsPanelButton = new javax.swing.JButton();
        studentInfoPanelButton = new javax.swing.JButton();
        studentLogoutButton = new javax.swing.JButton();
        studentAttendancePanelButton = new javax.swing.JButton();
        studentAttendancePanelButtonSymbol = new javax.swing.JLabel();
        teacherPanel = new javax.swing.JPanel();
        teacherCardPanel = new javax.swing.JPanel();
        teacherAttendancePanel = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        teacherAttendanceSubjectComboBox = new javax.swing.JComboBox<>();
        teacherAttendanceSubjectCodeTextField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        teacherAttendanceStartAttendanceButton = new javax.swing.JButton();
        teacherAttendanceRandomizeButton = new javax.swing.JButton();
        teacherAttendanceExpireCodeButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        teacherAttendanceStudentAttendanceTable = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        teacherAttendanceInfoLabel = new javax.swing.JLabel();
        teacherInfoPanel = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        teacherIdLabel = new javax.swing.JLabel();
        teacherFirstNameLabel = new javax.swing.JLabel();
        teacherLastNameLabel = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        teacherSubjectsPanel = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        teacherSubjectsSubjectsComboBox = new javax.swing.JComboBox<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        teacherSubjectsStudentsTable = new javax.swing.JTable();
        teacherSubjectsManageGradesButton = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        teacherInfoPanelButtonSymbol = new javax.swing.JLabel();
        teacherInfoPanelButton = new javax.swing.JButton();
        teacherAttendancePanelButton = new javax.swing.JButton();
        teacherAttendancePanelButtonSymbol = new javax.swing.JLabel();
        teacherLogoutButton = new javax.swing.JButton();
        teacherSubjectsPanelButton = new javax.swing.JButton();
        teacherSubjectsPanelButtonSymbol = new javax.swing.JLabel();
        adminPanel = new javax.swing.JPanel();
        adminCardPanel = new javax.swing.JPanel();
        adminInfoPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        adminIdLabel = new javax.swing.JLabel();
        adminFirstNameLabel = new javax.swing.JLabel();
        adminLastNameLabel = new javax.swing.JLabel();
        adminStudentsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        adminStudentsTable = new javax.swing.JTable();
        addStudentButton = new javax.swing.JButton();
        removeStudentButton = new javax.swing.JButton();
        editStudentButton = new javax.swing.JButton();
        manageSubjectsButton = new javax.swing.JButton();
        adminTeachersPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        adminTeachersTable = new javax.swing.JTable();
        addTeacherButton = new javax.swing.JButton();
        removeTeacherButton = new javax.swing.JButton();
        editTeacherButton = new javax.swing.JButton();
        adminAdminsPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        adminAdminsTable = new javax.swing.JTable();
        addAdminButton = new javax.swing.JButton();
        removeAdminButton = new javax.swing.JButton();
        editAdminButton = new javax.swing.JButton();
        adminSubjectsPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        adminSubjectsTable = new javax.swing.JTable();
        adminAddSubjectButton = new javax.swing.JButton();
        adminRemoveSubjectButton = new javax.swing.JButton();
        adminManageMembersButton = new javax.swing.JButton();
        adminRequestsPanel = new javax.swing.JPanel();
        adminRequestsSubjectComboBox = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        adminRequestsOutputTable = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        adminRequestsInputTable = new javax.swing.JTable();
        adminRequestsAcceptButton = new javax.swing.JButton();
        adminRequestsRejectButton = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        adminRequestsTeacherComboBox = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        adminStudentsPanelButtonSymbol = new javax.swing.JLabel();
        adminSubjectsPanelButtonSymbol = new javax.swing.JLabel();
        adminTeachersPanelButton = new javax.swing.JButton();
        adminAdminsPanelButtonSymbol = new javax.swing.JLabel();
        adminStudentsPanelButton = new javax.swing.JButton();
        adminAdminsPanelButton = new javax.swing.JButton();
        adminSubjectsPanelButton = new javax.swing.JButton();
        adminInfoPanelButtonSymbol = new javax.swing.JLabel();
        adminInfoPanelButton = new javax.swing.JButton();
        adminRequestsPanelButton = new javax.swing.JButton();
        adminRequestsPanelButtonSymbol = new javax.swing.JLabel();
        adminTeachersPanelButtonSymbol = new javax.swing.JLabel();
        adminLogoutButton = new javax.swing.JButton();
        frameTitleBar = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        loginDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        loginDialog.setTitle("Minerva");
        loginDialog.setBackground(new java.awt.Color(70, 70, 70));
        loginDialog.setModal(true);
        loginDialog.setUndecorated(true);
        loginDialog.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                loginDialogWindowClosed(evt);
            }
        });

        mainDialogPanel.setBackground(color1);

        passwordLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password:");

        usernameLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("User ID:");

        studentRadioButton.setBackground(color1);
        loginTypeGroup.add(studentRadioButton);
        studentRadioButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        studentRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        studentRadioButton.setText("Student");
        studentRadioButton.setContentAreaFilled(false);
        studentRadioButton.setFocusPainted(false);

        teacherRadioButton.setBackground(color1);
        loginTypeGroup.add(teacherRadioButton);
        teacherRadioButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        teacherRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        teacherRadioButton.setText("Teacher");
        teacherRadioButton.setFocusPainted(false);

        loginButton.setBackground(color1);
        loginButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("LOGIN");
        loginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        loginButton.setFocusPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        adminRadioButton.setBackground(color1);
        loginTypeGroup.add(adminRadioButton);
        adminRadioButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        adminRadioButton.setText("Admin");
        adminRadioButton.setFocusPainted(false);

        usernameField.setBackground(color1);
        usernameField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        usernameField.setCaretColor(new java.awt.Color(255, 255, 255));
        usernameField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                usernameFieldPropertyChange(evt);
            }
        });

        passwordField.setBackground(color1);
        passwordField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));

        loginInfoLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        loginInfoLabel.setForeground(new java.awt.Color(255, 103, 103));
        loginInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        loginTitleBarPanel.setBackground(new java.awt.Color(40, 40, 40));
        loginTitleBarPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        loginExitButton.setBackground(new java.awt.Color(40, 40, 40));
        loginExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_delete_40px.png"))); // NOI18N
        loginExitButton.setBorder(null);
        loginExitButton.setBorderPainted(false);
        loginExitButton.setContentAreaFilled(false);
        loginExitButton.setFocusPainted(false);
        loginExitButton.setOpaque(true);
        loginExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginExitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginExitButtonMouseEntered(evt);
            }
        });
        loginExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginExitButtonActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_owl_25px.png"))); // NOI18N
        jLabel35.setText("Minerva Information System");
        jLabel35.setIconTextGap(15);

        javax.swing.GroupLayout loginTitleBarPanelLayout = new javax.swing.GroupLayout(loginTitleBarPanel);
        loginTitleBarPanel.setLayout(loginTitleBarPanelLayout);
        loginTitleBarPanelLayout.setHorizontalGroup(
            loginTitleBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginTitleBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginTitleBarPanelLayout.setVerticalGroup(
            loginTitleBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginTitleBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(loginExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        loginExitButton.addMouseListener(exitButtonMouseAnimation);

        javax.swing.GroupLayout mainDialogPanelLayout = new javax.swing.GroupLayout(mainDialogPanel);
        mainDialogPanel.setLayout(mainDialogPanelLayout);
        mainDialogPanelLayout.setHorizontalGroup(
            mainDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginTitleBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainDialogPanelLayout.createSequentialGroup()
                .addGroup(mainDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainDialogPanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(mainDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(usernameField)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                            .addComponent(loginInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mainDialogPanelLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainDialogPanelLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(studentRadioButton)
                        .addGap(54, 54, 54)
                        .addComponent(teacherRadioButton)
                        .addGap(65, 65, 65)
                        .addComponent(adminRadioButton)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        mainDialogPanelLayout.setVerticalGroup(
            mainDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDialogPanelLayout.createSequentialGroup()
                .addComponent(loginTitleBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(usernameLabel)
                .addGap(21, 21, 21)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(passwordLabel)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(loginInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainDialogPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentRadioButton)
                    .addComponent(teacherRadioButton)
                    .addComponent(adminRadioButton))
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        usernameField.getDocument().addDocumentListener(fieldFullCheck);
        passwordField.getDocument().addDocumentListener(fieldFullCheck);
        LoginDialogDragListener drag=new LoginDialogDragListener();
        loginTitleBarPanel.addMouseListener(drag);
        loginTitleBarPanel.addMouseMotionListener(drag);

        javax.swing.GroupLayout loginDialogLayout = new javax.swing.GroupLayout(loginDialog.getContentPane());
        loginDialog.getContentPane().setLayout(loginDialogLayout);
        loginDialogLayout.setHorizontalGroup(
            loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDialogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        loginDialogLayout.setVerticalGroup(
            loginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainDialogPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        loginDialog.pack();

        loginDialog.pack();

        loginDialog.setLocationRelativeTo(null);

        adminAddUserDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        adminAddUserDialog.setAlwaysOnTop(true);
        adminAddUserDialog.setModal(true);

        jLabel4.setText("Name:");

        jLabel5.setText("Surname:");

        adminAddUserDialogAddButton.setText("Add User");
        adminAddUserDialogAddButton.setFocusPainted(false);
        adminAddUserDialogAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddUserDialogAddButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("ID:");

        adminAddUserIdField.setFocusable(false);
        adminAddUserIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddUserIdFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminAddUserDialogMainPanelLayout = new javax.swing.GroupLayout(adminAddUserDialogMainPanel);
        adminAddUserDialogMainPanel.setLayout(adminAddUserDialogMainPanelLayout);
        adminAddUserDialogMainPanelLayout.setHorizontalGroup(
            adminAddUserDialogMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAddUserDialogMainPanelLayout.createSequentialGroup()
                .addGroup(adminAddUserDialogMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminAddUserDialogMainPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(adminAddUserDialogMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminAddUserDialogMainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminAddUserDialogMainPanelLayout.createSequentialGroup()
                                .addGroup(adminAddUserDialogMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(114, 114, 114)
                                .addGroup(adminAddUserDialogMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(adminAddUserIdField)))))
                    .addGroup(adminAddUserDialogMainPanelLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButton3))
                    .addGroup(adminAddUserDialogMainPanelLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(adminAddUserDialogAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        adminAddUserDialogMainPanelLayout.setVerticalGroup(
            adminAddUserDialogMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAddUserDialogMainPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(adminAddUserDialogMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(adminAddUserIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(adminAddUserDialogMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(adminAddUserDialogMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(adminAddUserDialogAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout adminAddUserDialogLayout = new javax.swing.GroupLayout(adminAddUserDialog.getContentPane());
        adminAddUserDialog.getContentPane().setLayout(adminAddUserDialogLayout);
        adminAddUserDialogLayout.setHorizontalGroup(
            adminAddUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminAddUserDialogMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adminAddUserDialogLayout.setVerticalGroup(
            adminAddUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminAddUserDialogMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        adminAddUserDialog.pack();

        adminAddUserDialog.setLocationRelativeTo(null);

        adminEditUserDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        adminEditUserDialog.setAlwaysOnTop(true);
        adminEditUserDialog.setModal(true);

        jLabel6.setText("First Name:");

        jLabel7.setText("Last Name:");

        jLabel9.setText("Password");

        adminEditUserApplyButton.setText("Apply");
        adminEditUserApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEditUserApplyButtonActionPerformed(evt);
            }
        });

        jButton7.setText("Cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(53, 53, 53)
                .addComponent(adminEditUserApplyButton)
                .addGap(103, 103, 103))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminEditUserFirstNameField)
                    .addComponent(adminEditUserLastNameField)
                    .addComponent(adminEditUserPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(adminEditUserFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(adminEditUserLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(adminEditUserPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminEditUserApplyButton)
                    .addComponent(jButton7))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout adminEditUserDialogLayout = new javax.swing.GroupLayout(adminEditUserDialog.getContentPane());
        adminEditUserDialog.getContentPane().setLayout(adminEditUserDialogLayout);
        adminEditUserDialogLayout.setHorizontalGroup(
            adminEditUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adminEditUserDialogLayout.setVerticalGroup(
            adminEditUserDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        adminEditUserDialog.pack();
        adminEditUserDialog.setLocationRelativeTo(null);

        adminAddSubjectDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        adminAddSubjectDialog.setAlwaysOnTop(true);

        jLabel2.setText("Subject Code:");

        jLabel17.setText("Maximum Absence:");

        jLabel16.setText("Hours per Day:");

        jLabel3.setText("Subject Name:");

        jLabel1.setText("Subject ID:");

        adminAddSubjectDialogCancelButton.setText("Cancel");
        adminAddSubjectDialogCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddSubjectDialogCancelButtonActionPerformed(evt);
            }
        });

        adminAddSubjectDialogAddButton.setText("Add Course");
        adminAddSubjectDialogAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddSubjectDialogAddButtonActionPerformed(evt);
            }
        });

        jLabel21.setText("Term:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel21))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(subjectTermField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(subjectMaxAbsenceField)
                                    .addComponent(subjectHoursInWeekField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(subjectNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(subjectCodeField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(subjectIdField)))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(adminAddSubjectDialogCancelButton)
                        .addGap(99, 99, 99)
                        .addComponent(adminAddSubjectDialogAddButton)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(subjectIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(subjectCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(subjectNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(subjectHoursInWeekField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(subjectMaxAbsenceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(subjectTermField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminAddSubjectDialogCancelButton)
                    .addComponent(adminAddSubjectDialogAddButton))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout adminAddSubjectDialogLayout = new javax.swing.GroupLayout(adminAddSubjectDialog.getContentPane());
        adminAddSubjectDialog.getContentPane().setLayout(adminAddSubjectDialogLayout);
        adminAddSubjectDialogLayout.setHorizontalGroup(
            adminAddSubjectDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adminAddSubjectDialogLayout.setVerticalGroup(
            adminAddSubjectDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        adminAddSubjectDialog.pack();

        adminAddSubjectDialog.setLocationRelativeTo(null);

        adminStudentsManageSubjectsDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        adminStudentsManageSubjectsDialog.setAlwaysOnTop(true);
        adminStudentsManageSubjectsDialog.setModal(true);
        adminStudentsManageSubjectsDialog.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                adminStudentsManageSubjectsDialogComponentShown(evt);
            }
        });

        adminStudentSubjectsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Subject Code", "Subject Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane8.setViewportView(adminStudentSubjectsTable);

        jButton2.setText("Remove Student From Subject");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminStudentsManageSubjectsDialogLayout = new javax.swing.GroupLayout(adminStudentsManageSubjectsDialog.getContentPane());
        adminStudentsManageSubjectsDialog.getContentPane().setLayout(adminStudentsManageSubjectsDialogLayout);
        adminStudentsManageSubjectsDialogLayout.setHorizontalGroup(
            adminStudentsManageSubjectsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminStudentsManageSubjectsDialogLayout.createSequentialGroup()
                .addGroup(adminStudentsManageSubjectsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminStudentsManageSubjectsDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminStudentsManageSubjectsDialogLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminStudentsManageSubjectsDialogLayout.setVerticalGroup(
            adminStudentsManageSubjectsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminStudentsManageSubjectsDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        adminStudentsManageSubjectsDialog.pack();

        adminSubjectsManageMembersDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        adminSubjectsManageMembersDialog.setAlwaysOnTop(true);
        adminSubjectsManageMembersDialog.setModal(true);

        adminSubjectsManageMembersStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane7.setViewportView(adminSubjectsManageMembersStudentsTable);

        adminSubjectsManageMembersRemoveStudentButton.setText("Remove Student");
        adminSubjectsManageMembersRemoveStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubjectsManageMembersRemoveStudentButtonActionPerformed(evt);
            }
        });

        jLabel27.setText("Students Taking This Subject from Selected Teacher:");

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));

        adminSubjectsManageMembersAddTeacherButton.setText("Add a Teacher to Subject");
        adminSubjectsManageMembersAddTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubjectsManageMembersAddTeacherButtonActionPerformed(evt);
            }
        });

        adminSubjectsManageMembersAddTeacherComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubjectsManageMembersAddTeacherComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(adminSubjectsManageMembersAddTeacherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(adminSubjectsManageMembersAddTeacherButton)
                        .addGap(60, 60, 60))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(adminSubjectsManageMembersAddTeacherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminSubjectsManageMembersAddTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        adminSubjectsManageMembersRemoveTeacherButton.setText("Remove Teacher from Subject");
        adminSubjectsManageMembersRemoveTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubjectsManageMembersRemoveTeacherButtonActionPerformed(evt);
            }
        });

        teachersGivingSubjectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachersGivingSubjectComboBoxActionPerformed(evt);
            }
        });

        jLabel22.setText("Teachers Giving This Subject:");

        javax.swing.GroupLayout adminSubjectsManageMembersDialogLayout = new javax.swing.GroupLayout(adminSubjectsManageMembersDialog.getContentPane());
        adminSubjectsManageMembersDialog.getContentPane().setLayout(adminSubjectsManageMembersDialogLayout);
        adminSubjectsManageMembersDialogLayout.setHorizontalGroup(
            adminSubjectsManageMembersDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminSubjectsManageMembersDialogLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(adminSubjectsManageMembersDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminSubjectsManageMembersDialogLayout.createSequentialGroup()
                        .addGroup(adminSubjectsManageMembersDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, adminSubjectsManageMembersDialogLayout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(adminSubjectsManageMembersRemoveStudentButton)))
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(adminSubjectsManageMembersDialogLayout.createSequentialGroup()
                        .addGroup(adminSubjectsManageMembersDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(teachersGivingSubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminSubjectsManageMembersRemoveTeacherButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        adminSubjectsManageMembersDialogLayout.setVerticalGroup(
            adminSubjectsManageMembersDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminSubjectsManageMembersDialogLayout.createSequentialGroup()
                .addGroup(adminSubjectsManageMembersDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminSubjectsManageMembersDialogLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teachersGivingSubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminSubjectsManageMembersRemoveTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel27)
                .addGroup(adminSubjectsManageMembersDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminSubjectsManageMembersDialogLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminSubjectsManageMembersDialogLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(adminSubjectsManageMembersRemoveStudentButton)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        adminSubjectsManageMembersDialog.pack();

        studentSubjectsTakeSubjectDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        studentSubjectsTakeSubjectDialog.setAlwaysOnTop(true);
        studentSubjectsTakeSubjectDialog.setModal(true);
        studentSubjectsTakeSubjectDialog.setUndecorated(true);

        jPanel6.setBackground(color2);

        jButton5.setBackground(color2);
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_delete_40px.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton5.addMouseListener(exitButtonMouseAnimation);

        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(50, 50, 50)));

        jLabel28.setText("Subject:");

        jLabel29.setText("Teacher:");

        studentSubjectsTakeSubjectSendRequestButton.setText("Send Request");
        studentSubjectsTakeSubjectSendRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSubjectsTakeSubjectSendRequestButtonActionPerformed(evt);
            }
        });

        studentSubjectsTakeSubjectRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject", "Teacher"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane11.setViewportView(studentSubjectsTakeSubjectRequestTable);

        studentSubjectsTakeSubjectTeacherComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSubjectsTakeSubjectTeacherComboBoxActionPerformed(evt);
            }
        });

        studentSubjectsTakeSubjectSubjectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSubjectsTakeSubjectSubjectComboBoxActionPerformed(evt);
            }
        });

        jLabel30.setText("Current Requests:");

        studentSubjectsTakeSubjectRemoveRequestButton.setText("Remove Request");
        studentSubjectsTakeSubjectRemoveRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSubjectsTakeSubjectRemoveRequestButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel30)))
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(studentSubjectsTakeSubjectTeacherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(studentSubjectsTakeSubjectSubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentSubjectsTakeSubjectSendRequestButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentSubjectsTakeSubjectRemoveRequestButton, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentSubjectsTakeSubjectSubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentSubjectsTakeSubjectTeacherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(studentSubjectsTakeSubjectSendRequestButton)
                        .addGap(18, 18, 18)
                        .addComponent(studentSubjectsTakeSubjectRemoveRequestButton))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout studentSubjectsTakeSubjectDialogLayout = new javax.swing.GroupLayout(studentSubjectsTakeSubjectDialog.getContentPane());
        studentSubjectsTakeSubjectDialog.getContentPane().setLayout(studentSubjectsTakeSubjectDialogLayout);
        studentSubjectsTakeSubjectDialogLayout.setHorizontalGroup(
            studentSubjectsTakeSubjectDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        studentSubjectsTakeSubjectDialogLayout.setVerticalGroup(
            studentSubjectsTakeSubjectDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentSubjectsTakeSubjectDialogLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StudentSubjectsTakeSubjectDialogDragListener drag2=new StudentSubjectsTakeSubjectDialogDragListener();
        jPanel6.addMouseListener(drag2);
        jPanel6.addMouseMotionListener(drag2);

        studentSubjectsTakeSubjectDialog.pack();

        adminAddStudentDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        adminAddStudentDialog.setAlwaysOnTop(true);
        adminAddStudentDialog.setModal(true);
        adminAddStudentDialog.setUndecorated(true);

        jPanel3.setBackground(color2);

        adminAddStudentDialogExitButton.setBackground(new java.awt.Color(40, 40, 40));
        adminAddStudentDialogExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_delete_40px.png"))); // NOI18N
        adminAddStudentDialogExitButton.setBorder(null);
        adminAddStudentDialogExitButton.setBorderPainted(false);
        adminAddStudentDialogExitButton.setContentAreaFilled(false);
        adminAddStudentDialogExitButton.setFocusPainted(false);
        adminAddStudentDialogExitButton.setOpaque(true);
        adminAddStudentDialogExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminAddStudentDialogExitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminAddStudentDialogExitButtonMouseEntered(evt);
            }
        });
        adminAddStudentDialogExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddStudentDialogExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 538, Short.MAX_VALUE)
                .addComponent(adminAddStudentDialogExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminAddStudentDialogExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        adminAddStudentDialogExitButton.addMouseListener(exitButtonMouseAnimation);

        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, color1));

        jLabel37.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel37.setText("First Name:");

        jLabel38.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel38.setText("Last Name:");

        adminAddStudentLastNameField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        adminAddStudentDepartmentField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel39.setText("Department:");

        adminAddStudentAddStudentButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminAddStudentAddStudentButton.setText("Add Student");
        adminAddStudentAddStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddStudentAddStudentButtonActionPerformed(evt);
            }
        });

        adminAddStudentFirstNameField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel52.setText("Term:");

        adminAddStudentTermField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        adminAddStudentCancelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminAddStudentCancelButton.setText("Cancel");
        adminAddStudentCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddStudentCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel52))
                .addGap(40, 40, 40)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminAddStudentDepartmentField, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(adminAddStudentFirstNameField)
                    .addComponent(adminAddStudentLastNameField)
                    .addComponent(adminAddStudentTermField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminAddStudentAddStudentButton)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(adminAddStudentCancelButton)))
                .addGap(218, 218, 218))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminAddStudentFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(45, 45, 45)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(adminAddStudentLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminAddStudentDepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(48, 48, 48)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(adminAddStudentTermField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(adminAddStudentAddStudentButton)
                .addGap(18, 18, 18)
                .addComponent(adminAddStudentCancelButton)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        adminAddStudentLastNameField.getDocument().addDocumentListener(adminAddStudentFieldListener);
        adminAddStudentDepartmentField.getDocument().addDocumentListener(adminAddStudentFieldListener);
        adminAddStudentFirstNameField.getDocument().addDocumentListener(adminAddStudentFieldListener);
        adminAddStudentTermField.getDocument().addDocumentListener(adminAddStudentFieldListener);

        javax.swing.GroupLayout adminAddStudentDialogLayout = new javax.swing.GroupLayout(adminAddStudentDialog.getContentPane());
        adminAddStudentDialog.getContentPane().setLayout(adminAddStudentDialogLayout);
        adminAddStudentDialogLayout.setHorizontalGroup(
            adminAddStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adminAddStudentDialogLayout.setVerticalGroup(
            adminAddStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAddStudentDialogLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AdminAddStudentDialogDragListener adminAddStudentDialogDragListener=new AdminAddStudentDialogDragListener();
        jPanel3.addMouseListener(adminAddStudentDialogDragListener);
        jPanel3.addMouseMotionListener(adminAddStudentDialogDragListener);

        adminAddStudentDialog.pack();

        adminEditStudentDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        adminEditStudentDialog.setAlwaysOnTop(true);
        adminEditStudentDialog.setUndecorated(true);

        jPanel12.setBackground(color2);

        adminEditStudentDialogExitButton.setBackground(new java.awt.Color(40, 40, 40));
        adminEditStudentDialogExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_delete_40px.png"))); // NOI18N
        adminEditStudentDialogExitButton.setBorder(null);
        adminEditStudentDialogExitButton.setBorderPainted(false);
        adminEditStudentDialogExitButton.setContentAreaFilled(false);
        adminEditStudentDialogExitButton.setFocusPainted(false);
        adminEditStudentDialogExitButton.setOpaque(true);
        adminEditStudentDialogExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminEditStudentDialogExitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminEditStudentDialogExitButtonMouseEntered(evt);
            }
        });
        adminEditStudentDialogExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEditStudentDialogExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(adminEditStudentDialogExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminEditStudentDialogExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        adminEditStudentDialogExitButton.addMouseListener(exitButtonMouseAnimation);

        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, color1));

        jLabel53.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel53.setText("First Name:");

        jLabel54.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel54.setText("Last Name:");

        adminEditStudentLastNameField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        adminEditStudentDepartmentField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel55.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel55.setText("Department:");

        adminEditStudentEditStudentButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminEditStudentEditStudentButton.setText("Edit Student");
        adminEditStudentEditStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEditStudentEditStudentButtonActionPerformed(evt);
            }
        });

        adminEditStudentFirstNameField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel56.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel56.setText("Term:");

        adminEditStudentTermField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        adminEditStudentCancelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminEditStudentCancelButton.setText("Cancel");
        adminEditStudentCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminEditStudentCancelButtonActionPerformed(evt);
            }
        });

        adminEditStudentPasswordField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel57.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel57.setText("Password:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel54))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adminEditStudentFirstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                    .addComponent(adminEditStudentLastNameField)))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel57))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adminEditStudentPasswordField)
                                    .addComponent(adminEditStudentDepartmentField, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                    .addComponent(adminEditStudentTermField)))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(adminEditStudentCancelButton))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(adminEditStudentEditStudentButton)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminEditStudentFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(45, 45, 45)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(adminEditStudentLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminEditStudentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addGap(42, 42, 42)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminEditStudentDepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(48, 48, 48)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(adminEditStudentTermField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(adminEditStudentEditStudentButton)
                .addGap(18, 18, 18)
                .addComponent(adminEditStudentCancelButton)
                .addGap(26, 26, 26))
        );

        adminEditStudentLastNameField.getDocument().addDocumentListener(adminEditStudentFieldListener);
        adminEditStudentDepartmentField.getDocument().addDocumentListener(adminEditStudentFieldListener);
        adminEditStudentFirstNameField.getDocument().addDocumentListener(adminEditStudentFieldListener);
        adminEditStudentTermField.getDocument().addDocumentListener(adminEditStudentFieldListener);
        adminEditStudentPasswordField.getDocument().addDocumentListener(adminEditStudentFieldListener);

        javax.swing.GroupLayout adminEditStudentDialogLayout = new javax.swing.GroupLayout(adminEditStudentDialog.getContentPane());
        adminEditStudentDialog.getContentPane().setLayout(adminEditStudentDialogLayout);
        adminEditStudentDialogLayout.setHorizontalGroup(
            adminEditStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adminEditStudentDialogLayout.setVerticalGroup(
            adminEditStudentDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminEditStudentDialogLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AdminEditStudentDialogDragListener adminEditStudentDialogDragListener=new AdminEditStudentDialogDragListener();
        jPanel12.addMouseListener(adminEditStudentDialogDragListener);
        jPanel12.addMouseMotionListener(adminEditStudentDialogDragListener);

        adminEditStudentDialog.pack();

        teacherSubjectsManageGradesDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        teacherSubjectsManageGradesDialog.setModal(true);
        teacherSubjectsManageGradesDialog.setUndecorated(true);

        jPanel7.setBackground(color2);

        jButton9.setBackground(color2);
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_delete_40px.png"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusPainted(false);
        jButton9.setOpaque(true);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 708, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton9.addMouseListener(exitButtonMouseAnimation);

        jPanel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, color1));

        teacherSubjectsManageGradesFinalField.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        jLabel59.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel59.setText("Midterm:");

        teacherSubjectsManageGradesApplyButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        teacherSubjectsManageGradesApplyButton.setText("Apply");
        teacherSubjectsManageGradesApplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectsManageGradesApplyButtonActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel64.setText("Final:");

        jLabel62.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel62.setText("Homework:");

        teacherSubjectsManageGradesMidtermField.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        teacherSubjectsManageGradesHomeworkField.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        teacherSubjectsManageGradesInfoLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        teacherSubjectsManageGradesInfoLabel.setForeground(new java.awt.Color(255, 51, 51));
        teacherSubjectsManageGradesInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jLabel59)
                    .addComponent(jLabel64))
                .addGap(115, 115, 115)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherSubjectsManageGradesHomeworkField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherSubjectsManageGradesMidtermField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherSubjectsManageGradesFinalField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(teacherSubjectsManageGradesInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(teacherSubjectsManageGradesApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(teacherSubjectsManageGradesMidtermField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(teacherSubjectsManageGradesHomeworkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(teacherSubjectsManageGradesFinalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(teacherSubjectsManageGradesInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(teacherSubjectsManageGradesApplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        teacherSubjectsManageGradesFinalField.getDocument().addDocumentListener(teacherDocumentListener);
        teacherSubjectsManageGradesMidtermField.getDocument().addDocumentListener(teacherDocumentListener);
        teacherSubjectsManageGradesHomeworkField.getDocument().addDocumentListener(teacherDocumentListener);

        javax.swing.GroupLayout teacherSubjectsManageGradesDialogLayout = new javax.swing.GroupLayout(teacherSubjectsManageGradesDialog.getContentPane());
        teacherSubjectsManageGradesDialog.getContentPane().setLayout(teacherSubjectsManageGradesDialogLayout);
        teacherSubjectsManageGradesDialogLayout.setHorizontalGroup(
            teacherSubjectsManageGradesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        teacherSubjectsManageGradesDialogLayout.setVerticalGroup(
            teacherSubjectsManageGradesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherSubjectsManageGradesDialogLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TeacherSubjectsManageGradesDialogDragListener drag3=new TeacherSubjectsManageGradesDialogDragListener();
        jPanel7.addMouseListener(drag3);
        jPanel7.addMouseMotionListener(drag3);

        teacherSubjectsManageGradesDialog.pack();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minerva");
        setUndecorated(true);

        mainPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, color1));
        mainPanel.setLayout(new java.awt.CardLayout());

        studentCardPanel.setLayout(new java.awt.CardLayout());

        studentAttendancePanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                studentAttendancePanelComponentShown(evt);
            }
        });

        studentAttendanceSubmitCodeButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        studentAttendanceSubmitCodeButton.setText("Submit Code");
        studentAttendanceSubmitCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAttendanceSubmitCodeButtonActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel34.setText("Attendance Verification Code:");

        studentAttendanceCodeField.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        studentAttendanceCodeField.setForeground(Color.gray);
        studentAttendanceCodeField.setText("Enter Code");
        studentAttendanceCodeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                studentAttendanceCodeFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                studentAttendanceCodeFieldFocusLost(evt);
            }
        });
        studentAttendanceCodeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAttendanceCodeFieldActionPerformed(evt);
            }
        });

        studentAttendanceSubjectComboBox.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        studentAttendanceSubjectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAttendanceSubjectComboBoxActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel33.setText("Subject:");

        studentAttendanceInfoLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        studentAttendanceInfoLabel.setForeground(new java.awt.Color(163, 0, 0));
        studentAttendanceInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel42.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel42.setText("Current Absent Hours:");

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel43.setText("Maximum Absent Hours:");

        jLabel44.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel44.setText("Hours Left Before Failure:");

        studentAttendanceCurrentAbsentHoursLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        studentAttendanceMaximumAbsentHours.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        studentAttendanceHoursLeft.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel45.setText("Hours per Day");

        studentAttendanceHoursPerDayLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        javax.swing.GroupLayout studentAttendancePanelLayout = new javax.swing.GroupLayout(studentAttendancePanel);
        studentAttendancePanel.setLayout(studentAttendancePanelLayout);
        studentAttendancePanelLayout.setHorizontalGroup(
            studentAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentAttendancePanelLayout.createSequentialGroup()
                .addGroup(studentAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentAttendancePanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(studentAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentAttendancePanelLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(studentAttendanceSubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(studentAttendancePanelLayout.createSequentialGroup()
                                .addGroup(studentAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel45))
                                .addGap(73, 73, 73)
                                .addGroup(studentAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(studentAttendanceMaximumAbsentHours, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                                    .addComponent(studentAttendanceCurrentAbsentHoursLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(studentAttendanceHoursPerDayLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(studentAttendanceHoursLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(studentAttendancePanelLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(studentAttendanceCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentAttendanceSubmitCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentAttendancePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(studentAttendanceInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );
        studentAttendancePanelLayout.setVerticalGroup(
            studentAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentAttendancePanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(studentAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(studentAttendanceSubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addGroup(studentAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentAttendanceHoursPerDayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addGap(33, 33, 33)
                .addGroup(studentAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(studentAttendanceCurrentAbsentHoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(studentAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(studentAttendanceMaximumAbsentHours, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(studentAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(studentAttendanceHoursLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addGroup(studentAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(studentAttendanceCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentAttendanceSubmitCodeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentAttendanceInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        studentCardPanel.add(studentAttendancePanel, "studentAttendanceCard");

        studentSubjectsPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                studentSubjectsPanelComponentShown(evt);
            }
        });

        studentSubjectsTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        studentSubjectsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Code", "Subject Name", "Midterm", "Homework", "Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentSubjectsTable);

        studentSubjectsRequestSubjectButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        studentSubjectsRequestSubjectButton.setText("Request to Join a Subject");
        studentSubjectsRequestSubjectButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        studentSubjectsRequestSubjectButton.setFocusPainted(false);
        studentSubjectsRequestSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSubjectsRequestSubjectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentSubjectsPanelLayout = new javax.swing.GroupLayout(studentSubjectsPanel);
        studentSubjectsPanel.setLayout(studentSubjectsPanelLayout);
        studentSubjectsPanelLayout.setHorizontalGroup(
            studentSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentSubjectsPanelLayout.createSequentialGroup()
                .addGroup(studentSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentSubjectsPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentSubjectsPanelLayout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(studentSubjectsRequestSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        studentSubjectsPanelLayout.setVerticalGroup(
            studentSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentSubjectsPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(studentSubjectsRequestSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        studentCardPanel.add(studentSubjectsPanel, "studentSubjectsCard");

        studentInfoPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                studentInfoPanelComponentShown(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel13.setText("First Name:");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel14.setText("Last Name:");

        studentIdLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        studentFirstNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        studentLastNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel15.setText("Student ID:");

        jLabel40.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel40.setText("Department:");

        studentDepartmentLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel46.setText("Academic Year:");

        studentAcademicYearLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        javax.swing.GroupLayout studentInfoPanelLayout = new javax.swing.GroupLayout(studentInfoPanel);
        studentInfoPanel.setLayout(studentInfoPanelLayout);
        studentInfoPanelLayout.setHorizontalGroup(
            studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInfoPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentLastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(59, 59, 59)
                        .addComponent(studentDepartmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentInfoPanelLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentAcademicYearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentInfoPanelLayout.createSequentialGroup()
                        .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addGap(124, 124, 124)
                        .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        studentInfoPanelLayout.setVerticalGroup(
            studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInfoPanelLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(studentIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(studentFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(studentLastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40)
                    .addComponent(studentAcademicYearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(studentInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addComponent(studentDepartmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        studentCardPanel.add(studentInfoPanel, "studentInfoCard");

        jPanel4.setBackground(color1);

        studentInfoPanelButtonSymbol.setBackground(new Color(200,0,0));
        studentInfoPanelButtonSymbol.setOpaque(true);

        studentSubjectsPanelButtonSymbol.setBackground(color1);
        studentSubjectsPanelButtonSymbol.setOpaque(true);

        studentSubjectsPanelButton.setBackground(color1);
        studentSubjectsPanelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        studentSubjectsPanelButton.setForeground(new java.awt.Color(255, 255, 255));
        studentSubjectsPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_book_50px.png"))); // NOI18N
        studentSubjectsPanelButton.setText("Subjects");
        studentSubjectsPanelButton.setBorder(null);
        studentSubjectsPanelButton.setBorderPainted(false);
        studentSubjectsPanelButton.setContentAreaFilled(false);
        studentSubjectsPanelButton.setFocusPainted(false);
        studentSubjectsPanelButton.setHideActionText(true);
        studentSubjectsPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentSubjectsPanelButton.setIconTextGap(30);
        studentSubjectsPanelButton.setOpaque(true);
        studentSubjectsPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentSubjectsPanelButtonActionPerformed(evt);
            }
        });

        studentInfoPanelButton.setBackground(color1);
        studentInfoPanelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        studentInfoPanelButton.setForeground(new java.awt.Color(255, 255, 255));
        studentInfoPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_info_50px.png"))); // NOI18N
        studentInfoPanelButton.setText("Student Info");
        studentInfoPanelButton.setBorder(null);
        studentInfoPanelButton.setContentAreaFilled(false);
        studentInfoPanelButton.setFocusPainted(false);
        studentInfoPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentInfoPanelButton.setIconTextGap(30);
        studentInfoPanelButton.setOpaque(true);
        studentInfoPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentInfoPanelButtonActionPerformed(evt);
            }
        });

        studentLogoutButton.setBackground(color2);
        studentLogoutButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        studentLogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        studentLogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_logout_rounded_left_50px.png"))); // NOI18N
        studentLogoutButton.setText("Logout");
        studentLogoutButton.setBorder(null);
        studentLogoutButton.setBorderPainted(false);
        studentLogoutButton.setContentAreaFilled(false);
        studentLogoutButton.setFocusPainted(false);
        studentLogoutButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentLogoutButton.setIconTextGap(40);
        studentLogoutButton.setOpaque(true);
        studentLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentLogoutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentLogoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentLogoutButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentLogoutButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                studentLogoutButtonMouseReleased(evt);
            }
        });
        studentLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLogoutButtonActionPerformed(evt);
            }
        });

        studentAttendancePanelButton.setBackground(color1);
        studentAttendancePanelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        studentAttendancePanelButton.setForeground(new java.awt.Color(255, 255, 255));
        studentAttendancePanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_attendance_50px.png"))); // NOI18N
        studentAttendancePanelButton.setText("Attendance");
        studentAttendancePanelButton.setBorder(null);
        studentAttendancePanelButton.setBorderPainted(false);
        studentAttendancePanelButton.setContentAreaFilled(false);
        studentAttendancePanelButton.setFocusPainted(false);
        studentAttendancePanelButton.setHideActionText(true);
        studentAttendancePanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentAttendancePanelButton.setIconTextGap(30);
        studentAttendancePanelButton.setOpaque(true);
        studentAttendancePanelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentAttendancePanelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentAttendancePanelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentAttendancePanelButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentAttendancePanelButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                studentAttendancePanelButtonMouseReleased(evt);
            }
        });
        studentAttendancePanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentAttendancePanelButtonActionPerformed(evt);
            }
        });

        studentAttendancePanelButtonSymbol.setBackground(color1);
        studentAttendancePanelButtonSymbol.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentLogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentInfoPanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentSubjectsPanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentInfoPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(studentSubjectsPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(studentAttendancePanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(studentAttendancePanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentInfoPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentInfoPanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentSubjectsPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentSubjectsPanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentAttendancePanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentAttendancePanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(studentLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        studentSubjectsPanelButton.addMouseListener(fancyButtons);
        studentInfoPanelButton.addMouseListener(fancyButtons);
        studentLogoutButton.addMouseListener(exitButtonMouseAnimation);
        studentAttendancePanelButton.addMouseListener(fancyButtons);

        javax.swing.GroupLayout studentPanelLayout = new javax.swing.GroupLayout(studentPanel);
        studentPanel.setLayout(studentPanelLayout);
        studentPanelLayout.setHorizontalGroup(
            studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPanelLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(studentCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        studentPanelLayout.setVerticalGroup(
            studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(studentCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(studentPanel, "studentCard");

        teacherCardPanel.setLayout(new java.awt.CardLayout());

        teacherAttendancePanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                teacherAttendancePanelComponentShown(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel31.setText("Subject:");

        teacherAttendanceSubjectComboBox.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        teacherAttendanceSubjectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherAttendanceSubjectComboBoxActionPerformed(evt);
            }
        });

        teacherAttendanceSubjectCodeTextField.setEditable(false);
        teacherAttendanceSubjectCodeTextField.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel32.setText("Subject Attendance Code:");

        teacherAttendanceStartAttendanceButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        teacherAttendanceStartAttendanceButton.setText("Start Attendance");
        teacherAttendanceStartAttendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherAttendanceStartAttendanceButtonActionPerformed(evt);
            }
        });

        teacherAttendanceRandomizeButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        teacherAttendanceRandomizeButton.setText("Randomize Code");
        teacherAttendanceRandomizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherAttendanceRandomizeButtonActionPerformed(evt);
            }
        });

        teacherAttendanceExpireCodeButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        teacherAttendanceExpireCodeButton.setText("Expire Code and Take Attendance");
        teacherAttendanceExpireCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherAttendanceExpireCodeButtonActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton4.setText("Refresh the Table");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        teacherAttendanceStudentAttendanceTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        teacherAttendanceStudentAttendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Time of Entry"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        teacherAttendanceStudentAttendanceTable.setSelectionBackground(Color.gray);
        teacherAttendanceStudentAttendanceTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane12.setViewportView(teacherAttendanceStudentAttendanceTable);

        jLabel36.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel36.setText("Attended Students");

        teacherAttendanceInfoLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        teacherAttendanceInfoLabel.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout teacherAttendancePanelLayout = new javax.swing.GroupLayout(teacherAttendancePanel);
        teacherAttendancePanel.setLayout(teacherAttendancePanelLayout);
        teacherAttendancePanelLayout.setHorizontalGroup(
            teacherAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherAttendancePanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(teacherAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherAttendancePanelLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(363, 363, 363))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(teacherAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(teacherAttendancePanelLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(teacherAttendancePanelLayout.createSequentialGroup()
                            .addGroup(teacherAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel32)
                                .addGroup(teacherAttendancePanelLayout.createSequentialGroup()
                                    .addComponent(teacherAttendanceSubjectCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(teacherAttendanceRandomizeButton))
                                .addComponent(teacherAttendanceSubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teacherAttendanceInfoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(teacherAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(teacherAttendanceStartAttendanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(teacherAttendanceExpireCodeButton)))))
                .addGap(16, 16, 16))
        );
        teacherAttendancePanelLayout.setVerticalGroup(
            teacherAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherAttendancePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(teacherAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jButton4))
                .addGap(4, 4, 4)
                .addComponent(teacherAttendanceSubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addGroup(teacherAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherAttendanceSubjectCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherAttendanceRandomizeButton)
                    .addComponent(teacherAttendanceStartAttendanceButton))
                .addGap(4, 4, 4)
                .addGroup(teacherAttendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherAttendanceExpireCodeButton)
                    .addComponent(teacherAttendanceInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        teacherCardPanel.add(teacherAttendancePanel, "teacherAttendanceCard");
        teacherAttendanceSubjectCodeTextField.getDocument().addDocumentListener(teacherAttendanceCodeCheck);

        teacherInfoPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                teacherInfoPanelComponentShown(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel48.setText("First Name:");

        jLabel49.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel49.setText("Last Name:");

        teacherIdLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        teacherFirstNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        teacherLastNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        jLabel50.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel50.setText("Teacher ID:");

        javax.swing.GroupLayout teacherInfoPanelLayout = new javax.swing.GroupLayout(teacherInfoPanel);
        teacherInfoPanel.setLayout(teacherInfoPanelLayout);
        teacherInfoPanelLayout.setHorizontalGroup(
            teacherInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherInfoPanelLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(teacherInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addGap(88, 88, 88)
                .addGroup(teacherInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherFirstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(teacherIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacherLastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(281, 281, 281))
        );
        teacherInfoPanelLayout.setVerticalGroup(
            teacherInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherInfoPanelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(teacherInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(teacherIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addGroup(teacherInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48)
                    .addComponent(teacherFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131)
                .addGroup(teacherInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49)
                    .addComponent(teacherLastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(283, Short.MAX_VALUE))
        );

        teacherCardPanel.add(teacherInfoPanel, "teacherInfoCard");

        teacherSubjectsPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                teacherSubjectsPanelComponentShown(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel47.setText("Subjects:");

        teacherSubjectsSubjectsComboBox.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        teacherSubjectsSubjectsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectsSubjectsComboBoxActionPerformed(evt);
            }
        });

        teacherSubjectsStudentsTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        teacherSubjectsStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Midterm", "Homework", "Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        teacherSubjectsStudentsTable.setSelectionBackground(Color.gray);
        teacherSubjectsStudentsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane13.setViewportView(teacherSubjectsStudentsTable);
        teacherSubjectsStudentsTable.getSelectionModel().addListSelectionListener(teacherEnable);

        teacherSubjectsManageGradesButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        teacherSubjectsManageGradesButton.setText("Manage Grades");
        teacherSubjectsManageGradesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectsManageGradesButtonActionPerformed(evt);
            }
        });

        jLabel58.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel58.setText("Students In This Subject");

        javax.swing.GroupLayout teacherSubjectsPanelLayout = new javax.swing.GroupLayout(teacherSubjectsPanel);
        teacherSubjectsPanel.setLayout(teacherSubjectsPanelLayout);
        teacherSubjectsPanelLayout.setHorizontalGroup(
            teacherSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherSubjectsPanelLayout.createSequentialGroup()
                .addGroup(teacherSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherSubjectsPanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(teacherSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(teacherSubjectsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(18, 18, 18)
                                .addComponent(teacherSubjectsSubjectsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(teacherSubjectsPanelLayout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel58))
                    .addGroup(teacherSubjectsPanelLayout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(teacherSubjectsManageGradesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        teacherSubjectsPanelLayout.setVerticalGroup(
            teacherSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherSubjectsPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(teacherSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(teacherSubjectsSubjectsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(teacherSubjectsManageGradesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        teacherCardPanel.add(teacherSubjectsPanel, "teacherSubjectsCard");

        jPanel10.setBackground(color1);

        teacherInfoPanelButtonSymbol.setBackground(color1);
        teacherInfoPanelButtonSymbol.setOpaque(true);

        teacherInfoPanelButton.setBackground(color1);
        teacherInfoPanelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        teacherInfoPanelButton.setForeground(new java.awt.Color(255, 255, 255));
        teacherInfoPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_info_50px.png"))); // NOI18N
        teacherInfoPanelButton.setText("Teacher Info");
        teacherInfoPanelButton.setBorder(null);
        teacherInfoPanelButton.setBorderPainted(false);
        teacherInfoPanelButton.setContentAreaFilled(false);
        teacherInfoPanelButton.setFocusPainted(false);
        teacherInfoPanelButton.setHideActionText(true);
        teacherInfoPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        teacherInfoPanelButton.setIconTextGap(25);
        teacherInfoPanelButton.setOpaque(true);
        teacherInfoPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherInfoPanelButtonActionPerformed(evt);
            }
        });

        teacherAttendancePanelButton.setBackground(color1);
        teacherAttendancePanelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        teacherAttendancePanelButton.setForeground(new java.awt.Color(255, 255, 255));
        teacherAttendancePanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_attendance_50px.png"))); // NOI18N
        teacherAttendancePanelButton.setText("Attendance");
        teacherAttendancePanelButton.setBorder(null);
        teacherAttendancePanelButton.setBorderPainted(false);
        teacherAttendancePanelButton.setContentAreaFilled(false);
        teacherAttendancePanelButton.setFocusPainted(false);
        teacherAttendancePanelButton.setHideActionText(true);
        teacherAttendancePanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        teacherAttendancePanelButton.setIconTextGap(25);
        teacherAttendancePanelButton.setOpaque(true);
        teacherAttendancePanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherAttendancePanelButtonActionPerformed(evt);
            }
        });

        teacherAttendancePanelButtonSymbol.setBackground(color1);
        teacherAttendancePanelButtonSymbol.setOpaque(true);

        teacherLogoutButton.setBackground(color2);
        teacherLogoutButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        teacherLogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        teacherLogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_logout_rounded_left_50px.png"))); // NOI18N
        teacherLogoutButton.setText("Logout");
        teacherLogoutButton.setBorder(null);
        teacherLogoutButton.setBorderPainted(false);
        teacherLogoutButton.setContentAreaFilled(false);
        teacherLogoutButton.setFocusPainted(false);
        teacherLogoutButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        teacherLogoutButton.setIconTextGap(40);
        teacherLogoutButton.setOpaque(true);
        teacherLogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherLogoutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacherLogoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacherLogoutButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                teacherLogoutButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                teacherLogoutButtonMouseReleased(evt);
            }
        });
        teacherLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherLogoutButtonActionPerformed(evt);
            }
        });

        teacherSubjectsPanelButton.setBackground(color1);
        teacherSubjectsPanelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        teacherSubjectsPanelButton.setForeground(new java.awt.Color(255, 255, 255));
        teacherSubjectsPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_book_50px.png"))); // NOI18N
        teacherSubjectsPanelButton.setText("Subjects");
        teacherSubjectsPanelButton.setBorder(null);
        teacherSubjectsPanelButton.setBorderPainted(false);
        teacherSubjectsPanelButton.setContentAreaFilled(false);
        teacherSubjectsPanelButton.setFocusPainted(false);
        teacherSubjectsPanelButton.setHideActionText(true);
        teacherSubjectsPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        teacherSubjectsPanelButton.setIconTextGap(25);
        teacherSubjectsPanelButton.setOpaque(true);
        teacherSubjectsPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectsPanelButtonActionPerformed(evt);
            }
        });

        teacherSubjectsPanelButtonSymbol.setBackground(color1);
        teacherSubjectsPanelButtonSymbol.setOpaque(true);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teacherLogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(teacherInfoPanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(teacherInfoPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(teacherSubjectsPanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(teacherSubjectsPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(teacherAttendancePanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(teacherAttendancePanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherInfoPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherInfoPanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherSubjectsPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherSubjectsPanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherAttendancePanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherAttendancePanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(teacherLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        teacherInfoPanelButton.addMouseListener(fancyButtons);
        teacherAttendancePanelButton.addMouseListener(fancyButtons);
        teacherLogoutButton.addMouseListener(exitButtonMouseAnimation);
        teacherSubjectsPanelButton.addMouseListener(fancyButtons);

        javax.swing.GroupLayout teacherPanelLayout = new javax.swing.GroupLayout(teacherPanel);
        teacherPanel.setLayout(teacherPanelLayout);
        teacherPanelLayout.setHorizontalGroup(
            teacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherPanelLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(teacherCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        teacherPanelLayout.setVerticalGroup(
            teacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teacherCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(teacherPanel, "teacherCard");

        adminPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, color1));

        adminCardPanel.setLayout(new java.awt.CardLayout());

        adminInfoPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                adminInfoPanelComponentShown(evt);
            }
        });
        adminInfoPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                adminInfoPanelPropertyChange(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel10.setText("Student ID:");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel11.setText("First Name:");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel12.setText("Last Name:");

        adminIdLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        adminFirstNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        adminLastNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        javax.swing.GroupLayout adminInfoPanelLayout = new javax.swing.GroupLayout(adminInfoPanel);
        adminInfoPanel.setLayout(adminInfoPanelLayout);
        adminInfoPanelLayout.setHorizontalGroup(
            adminInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminInfoPanelLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(adminInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(adminInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminLastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(398, Short.MAX_VALUE))
        );
        adminInfoPanelLayout.setVerticalGroup(
            adminInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminInfoPanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(adminInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(adminIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(adminInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminFirstNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(adminInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminLastNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(202, 202, 202))
        );

        adminCardPanel.add(adminInfoPanel, "adminInfoCard");

        adminStudentsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminStudentsPanelMouseClicked(evt);
            }
        });
        adminStudentsPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                adminStudentsPanelComponentShown(evt);
            }
        });

        adminStudentsTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        adminStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Password", "Department", "Term"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        adminStudentsTable.setSelectionBackground(Color.gray);
        adminStudentsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(adminStudentsTable);

        addStudentButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        addStudentButton.setForeground(color1);
        addStudentButton.setText("Add Student");
        addStudentButton.setFocusPainted(false);
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        removeStudentButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        removeStudentButton.setText("Remove Student");
        removeStudentButton.setFocusPainted(false);
        removeStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentButtonActionPerformed(evt);
            }
        });

        editStudentButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        editStudentButton.setText("Edit Student");
        editStudentButton.setFocusPainted(false);
        editStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentButtonActionPerformed(evt);
            }
        });

        manageSubjectsButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        manageSubjectsButton.setText("Manage Courses");
        manageSubjectsButton.setFocusPainted(false);
        manageSubjectsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSubjectsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminStudentsPanelLayout = new javax.swing.GroupLayout(adminStudentsPanel);
        adminStudentsPanel.setLayout(adminStudentsPanelLayout);
        adminStudentsPanelLayout.setHorizontalGroup(
            adminStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminStudentsPanelLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(adminStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(adminStudentsPanelLayout.createSequentialGroup()
                        .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(editStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(manageSubjectsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        adminStudentsPanelLayout.setVerticalGroup(
            adminStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminStudentsPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(adminStudentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageSubjectsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(adminStudentsPanelLayout.createSequentialGroup()
                        .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(editStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        adminCardPanel.add(adminStudentsPanel, "adminStudentsCard");

        adminTeachersPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminTeachersPanelMouseClicked(evt);
            }
        });
        adminTeachersPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                adminTeachersPanelComponentShown(evt);
            }
        });

        adminTeachersTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        adminTeachersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(adminTeachersTable);

        addTeacherButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        addTeacherButton.setText("Add Teacher");
        addTeacherButton.setFocusPainted(false);
        addTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeacherButtonActionPerformed(evt);
            }
        });

        removeTeacherButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        removeTeacherButton.setText("Remove Teacher");
        removeTeacherButton.setFocusPainted(false);
        removeTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTeacherButtonActionPerformed(evt);
            }
        });

        editTeacherButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        editTeacherButton.setText("Edit Teacher");
        editTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTeacherButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminTeachersPanelLayout = new javax.swing.GroupLayout(adminTeachersPanel);
        adminTeachersPanel.setLayout(adminTeachersPanelLayout);
        adminTeachersPanelLayout.setHorizontalGroup(
            adminTeachersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminTeachersPanelLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(adminTeachersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(adminTeachersPanelLayout.createSequentialGroup()
                        .addComponent(addTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(removeTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        adminTeachersPanelLayout.setVerticalGroup(
            adminTeachersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminTeachersPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(adminTeachersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        adminCardPanel.add(adminTeachersPanel, "adminTeachersCard");

        adminAdminsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminAdminsPanelMouseClicked(evt);
            }
        });
        adminAdminsPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                adminAdminsPanelComponentShown(evt);
            }
        });

        adminAdminsTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        adminAdminsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(adminAdminsTable);

        addAdminButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        addAdminButton.setText("Add Admin");
        addAdminButton.setFocusPainted(false);
        addAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminButtonActionPerformed(evt);
            }
        });

        removeAdminButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        removeAdminButton.setText("Remove Admin");
        removeAdminButton.setFocusPainted(false);
        removeAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAdminButtonActionPerformed(evt);
            }
        });

        editAdminButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        editAdminButton.setText("Edit Admin");
        editAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAdminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminAdminsPanelLayout = new javax.swing.GroupLayout(adminAdminsPanel);
        adminAdminsPanel.setLayout(adminAdminsPanelLayout);
        adminAdminsPanelLayout.setHorizontalGroup(
            adminAdminsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAdminsPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(adminAdminsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(adminAdminsPanelLayout.createSequentialGroup()
                        .addComponent(addAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(editAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        adminAdminsPanelLayout.setVerticalGroup(
            adminAdminsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAdminsPanelLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(adminAdminsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        adminCardPanel.add(adminAdminsPanel, "adminAdminsCard");

        adminSubjectsPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                adminSubjectsPanelComponentShown(evt);
            }
        });

        adminSubjectsTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        adminSubjectsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Code", "Name", "Hours In Week", "Maximum Absence", "Term"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(adminSubjectsTable);

        adminAddSubjectButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminAddSubjectButton.setText("Add Subject");
        adminAddSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddSubjectButtonActionPerformed(evt);
            }
        });

        adminRemoveSubjectButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminRemoveSubjectButton.setText("Remove Subject");
        adminRemoveSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRemoveSubjectButtonActionPerformed(evt);
            }
        });

        adminManageMembersButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminManageMembersButton.setText("Manage Members");
        adminManageMembersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminManageMembersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminSubjectsPanelLayout = new javax.swing.GroupLayout(adminSubjectsPanel);
        adminSubjectsPanel.setLayout(adminSubjectsPanelLayout);
        adminSubjectsPanelLayout.setHorizontalGroup(
            adminSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminSubjectsPanelLayout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(adminSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminSubjectsPanelLayout.createSequentialGroup()
                        .addComponent(adminAddSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(adminRemoveSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(adminManageMembersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        adminSubjectsPanelLayout.setVerticalGroup(
            adminSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminSubjectsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(adminSubjectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminAddSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminRemoveSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminManageMembersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        adminCardPanel.add(adminSubjectsPanel, "adminSubjectsCard");

        adminRequestsPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                adminRequestsPanelComponentShown(evt);
            }
        });

        adminRequestsSubjectComboBox.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminRequestsSubjectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRequestsSubjectComboBoxActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel23.setText("Course:");

        adminRequestsOutputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        adminRequestsOutputTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                adminRequestsOutputTableFocusLost(evt);
            }
        });
        jScrollPane9.setViewportView(adminRequestsOutputTable);

        adminRequestsInputTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane10.setViewportView(adminRequestsInputTable);

        adminRequestsAcceptButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminRequestsAcceptButton.setText("Accept");
        adminRequestsAcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRequestsAcceptButtonActionPerformed(evt);
            }
        });

        adminRequestsRejectButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminRequestsRejectButton.setText("Reject");
        adminRequestsRejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRequestsRejectButtonActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel24.setText("Requests to Take the Course");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel25.setText("Members of the Course");

        adminRequestsTeacherComboBox.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminRequestsTeacherComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRequestsTeacherComboBoxActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel26.setText("Teacher:");

        javax.swing.GroupLayout adminRequestsPanelLayout = new javax.swing.GroupLayout(adminRequestsPanel);
        adminRequestsPanel.setLayout(adminRequestsPanelLayout);
        adminRequestsPanelLayout.setHorizontalGroup(
            adminRequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminRequestsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminRequestsSubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminRequestsTeacherComboBox, 0, 489, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminRequestsPanelLayout.createSequentialGroup()
                .addGroup(adminRequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminRequestsPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addGroup(adminRequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminRequestsAcceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminRequestsRejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(adminRequestsPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminRequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminRequestsPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminRequestsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(81, 81, 81))))
        );
        adminRequestsPanelLayout.setVerticalGroup(
            adminRequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminRequestsPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(adminRequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(adminRequestsSubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminRequestsTeacherComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(5, 5, 5)
                .addGroup(adminRequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminRequestsPanelLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(adminRequestsAcceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminRequestsRejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(adminRequestsPanelLayout.createSequentialGroup()
                        .addGap(0, 63, Short.MAX_VALUE)
                        .addGroup(adminRequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(adminRequestsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                            .addComponent(jScrollPane9))))
                .addGap(30, 30, 30))
        );

        adminCardPanel.add(adminRequestsPanel, "adminRequestsCard");

        jPanel9.setBackground(color1);

        adminStudentsPanelButtonSymbol.setBackground(color1);
        adminStudentsPanelButtonSymbol.setOpaque(true);
        adminStudentsPanelButtonSymbol.setPreferredSize(new java.awt.Dimension(6, 0));

        adminSubjectsPanelButtonSymbol.setBackground(color1);
        adminSubjectsPanelButtonSymbol.setOpaque(true);
        adminSubjectsPanelButtonSymbol.setPreferredSize(new java.awt.Dimension(6, 0));

        adminTeachersPanelButton.setBackground(color1);
        adminTeachersPanelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminTeachersPanelButton.setForeground(new java.awt.Color(255, 255, 255));
        adminTeachersPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_class_50px.png"))); // NOI18N
        adminTeachersPanelButton.setText("Teachers");
        adminTeachersPanelButton.setBorder(null);
        adminTeachersPanelButton.setContentAreaFilled(false);
        adminTeachersPanelButton.setFocusPainted(false);
        adminTeachersPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminTeachersPanelButton.setIconTextGap(25);
        adminTeachersPanelButton.setOpaque(true);
        adminTeachersPanelButton.setPreferredSize(new java.awt.Dimension(0, 77));
        adminTeachersPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTeachersPanelButtonActionPerformed(evt);
            }
        });

        adminAdminsPanelButtonSymbol.setBackground(color1);
        adminAdminsPanelButtonSymbol.setOpaque(true);
        adminAdminsPanelButtonSymbol.setPreferredSize(new java.awt.Dimension(6, 0));

        adminStudentsPanelButton.setBackground(color1);
        adminStudentsPanelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminStudentsPanelButton.setForeground(new java.awt.Color(255, 255, 255));
        adminStudentsPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_student_male_50px_2.png"))); // NOI18N
        adminStudentsPanelButton.setText("Students");
        adminStudentsPanelButton.setBorder(null);
        adminStudentsPanelButton.setContentAreaFilled(false);
        adminStudentsPanelButton.setFocusPainted(false);
        adminStudentsPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminStudentsPanelButton.setIconTextGap(25);
        adminStudentsPanelButton.setOpaque(true);
        adminStudentsPanelButton.setPreferredSize(new java.awt.Dimension(0, 77));
        adminStudentsPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminStudentsPanelButtonActionPerformed(evt);
            }
        });

        adminAdminsPanelButton.setBackground(color1);
        adminAdminsPanelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminAdminsPanelButton.setForeground(new java.awt.Color(255, 255, 255));
        adminAdminsPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_administrative_tools_50px.png"))); // NOI18N
        adminAdminsPanelButton.setText("Admins");
        adminAdminsPanelButton.setBorder(null);
        adminAdminsPanelButton.setContentAreaFilled(false);
        adminAdminsPanelButton.setFocusPainted(false);
        adminAdminsPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminAdminsPanelButton.setIconTextGap(25);
        adminAdminsPanelButton.setOpaque(true);
        adminAdminsPanelButton.setPreferredSize(new java.awt.Dimension(0, 77));
        adminAdminsPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAdminsPanelButtonActionPerformed(evt);
            }
        });

        adminSubjectsPanelButton.setBackground(color1);
        adminSubjectsPanelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminSubjectsPanelButton.setForeground(new java.awt.Color(255, 255, 255));
        adminSubjectsPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_book_50px.png"))); // NOI18N
        adminSubjectsPanelButton.setText("Subjects");
        adminSubjectsPanelButton.setBorder(null);
        adminSubjectsPanelButton.setContentAreaFilled(false);
        adminSubjectsPanelButton.setFocusPainted(false);
        adminSubjectsPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminSubjectsPanelButton.setIconTextGap(25);
        adminSubjectsPanelButton.setOpaque(true);
        adminSubjectsPanelButton.setPreferredSize(new java.awt.Dimension(0, 77));
        adminSubjectsPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubjectsPanelButtonActionPerformed(evt);
            }
        });

        adminInfoPanelButtonSymbol.setBackground(color1);
        adminInfoPanelButtonSymbol.setOpaque(true);
        adminInfoPanelButtonSymbol.setPreferredSize(new java.awt.Dimension(6, 0));

        adminInfoPanelButton.setBackground(color1);
        adminInfoPanelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminInfoPanelButton.setForeground(new java.awt.Color(255, 255, 255));
        adminInfoPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_info_50px.png"))); // NOI18N
        adminInfoPanelButton.setText("Admin Info");
        adminInfoPanelButton.setBorder(null);
        adminInfoPanelButton.setContentAreaFilled(false);
        adminInfoPanelButton.setFocusPainted(false);
        adminInfoPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminInfoPanelButton.setIconTextGap(25);
        adminInfoPanelButton.setOpaque(true);
        adminInfoPanelButton.setPreferredSize(new java.awt.Dimension(97, 77));
        adminInfoPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminInfoPanelButtonActionPerformed(evt);
            }
        });

        adminRequestsPanelButton.setBackground(color1);
        adminRequestsPanelButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminRequestsPanelButton.setForeground(new java.awt.Color(255, 255, 255));
        adminRequestsPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_invite_50px.png"))); // NOI18N
        adminRequestsPanelButton.setText("Requests");
        adminRequestsPanelButton.setBorder(null);
        adminRequestsPanelButton.setContentAreaFilled(false);
        adminRequestsPanelButton.setFocusPainted(false);
        adminRequestsPanelButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminRequestsPanelButton.setIconTextGap(25);
        adminRequestsPanelButton.setOpaque(true);
        adminRequestsPanelButton.setPreferredSize(new java.awt.Dimension(0, 77));
        adminRequestsPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRequestsPanelButtonActionPerformed(evt);
            }
        });

        adminRequestsPanelButtonSymbol.setBackground(color1);
        adminRequestsPanelButtonSymbol.setOpaque(true);
        adminRequestsPanelButtonSymbol.setPreferredSize(new java.awt.Dimension(6, 0));

        adminTeachersPanelButtonSymbol.setBackground(color1);
        adminTeachersPanelButtonSymbol.setOpaque(true);
        adminTeachersPanelButtonSymbol.setPreferredSize(new java.awt.Dimension(6, 0));

        adminLogoutButton.setBackground(color1);
        adminLogoutButton.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        adminLogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        adminLogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_logout_rounded_left_50px.png"))); // NOI18N
        adminLogoutButton.setText("Logout");
        adminLogoutButton.setBorder(null);
        adminLogoutButton.setContentAreaFilled(false);
        adminLogoutButton.setFocusPainted(false);
        adminLogoutButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adminLogoutButton.setIconTextGap(35);
        adminLogoutButton.setOpaque(true);
        adminLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(adminInfoPanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(adminInfoPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(adminRequestsPanelButtonSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adminAdminsPanelButtonSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adminSubjectsPanelButtonSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adminSubjectsPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adminRequestsPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adminAdminsPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(adminTeachersPanelButtonSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adminStudentsPanelButtonSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adminStudentsPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(adminTeachersPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addComponent(adminLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminInfoPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminInfoPanelButtonSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminStudentsPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminStudentsPanelButtonSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminTeachersPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminTeachersPanelButtonSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(adminAdminsPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminSubjectsPanelButtonSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adminSubjectsPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(adminAdminsPanelButtonSymbol, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adminRequestsPanelButtonSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminRequestsPanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        adminTeachersPanelButton.addMouseListener(fancyButtons);
        adminStudentsPanelButton.addMouseListener(fancyButtons);
        adminAdminsPanelButton.addMouseListener(fancyButtons);
        adminSubjectsPanelButton.addMouseListener(fancyButtons);
        adminInfoPanelButton.addMouseListener(fancyButtons);
        adminRequestsPanelButton.addMouseListener(fancyButtons);
        adminLogoutButton.addMouseListener(exitButtonMouseAnimation);

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(adminCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adminCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.add(adminPanel, "adminCard");

        frameTitleBar.setBackground(color2);

        jButton6.setBackground(color2);
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_delete_40px.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setModel(loginExitButton.getModel());
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_owl_30px.png"))); // NOI18N
        jLabel41.setText("Minerva Information System");
        jLabel41.setIconTextGap(20);

        jButton8.setBackground(color2);
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_horizontal_line_30px.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusPainted(false);
        jButton8.setOpaque(true);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frameTitleBarLayout = new javax.swing.GroupLayout(frameTitleBar);
        frameTitleBar.setLayout(frameTitleBarLayout);
        frameTitleBarLayout.setHorizontalGroup(
            frameTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameTitleBarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        frameTitleBarLayout.setVerticalGroup(
            frameTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton6.addMouseListener(exitButtonMouseAnimation);
        jButton8.addMouseListener(minimizeButtonAnimation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frameTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(frameTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FrameDragListener frameDrag=new FrameDragListener();
        frameTitleBar.addMouseListener(frameDrag);
        frameTitleBar.addMouseMotionListener(frameDrag);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginDialogWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_loginDialogWindowClosed
        if (!isVisible())
            System.exit(0);
        else {
            passwordField.setText("");
        }
    }//GEN-LAST:event_loginDialogWindowClosed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        loginInfoLabel.setText("");
        if (studentRadioButton.isSelected()) {
            try {
                Student student = new Student(Integer.parseInt(usernameField.getText()), "", "", "");
                if (student.login(usernameField.getText(), String.valueOf(passwordField.getPassword()))) {
                    setUserInfo();
                    CardLayout card = (CardLayout) mainPanel.getLayout();
                    CardLayout studentLayout = (CardLayout) studentCardPanel.getLayout();
                    card.show(mainPanel, "studentCard");
                    studentInfoPanelButton.doClick();
                    setLocationRelativeTo(null);
                    setVisible(true);
                    loginDialog.dispose();

                    requestFocus();

                } else {
                    loginInfoLabel.setText("Username or password is not correct");
                }
            } catch (NumberFormatException ex) {
                loginInfoLabel.setText("ID must only contain digits");
            }
        } else if (teacherRadioButton.isSelected()) {
            try {
                Teacher teacher = new Teacher(Integer.parseInt(usernameField.getText()), "", "", String.valueOf(passwordField.getPassword()));
                if (teacher.login(usernameField.getText(), String.valueOf(passwordField.getPassword()))) {
                    setUserInfo();
                    CardLayout card = (CardLayout) mainPanel.getLayout();
                    card.show(mainPanel, "teacherCard");
                    teacherInfoPanelButton.doClick();
                    setLocationRelativeTo(null);
                    setVisible(true);
                    loginDialog.dispose();
                    requestFocus();
                } else {
                    loginInfoLabel.setText("Username or password is not correct");
                }
            } catch (NumberFormatException ex) {
                loginInfoLabel.setText("ID must only contain digits");
            }
        } else {
            try {
                Admin admin = new Admin(Integer.parseInt(usernameField.getText()), "", "", String.valueOf(passwordField.getPassword()));
                if (admin.login(usernameField.getText(), String.valueOf(passwordField.getPassword()))) {
                    setUserInfo();
                    CardLayout card = (CardLayout) mainPanel.getLayout();
                    card.show(mainPanel, "adminCard");
                    adminInfoPanelButton.doClick();
                    setLocationRelativeTo(null);
                    setVisible(true);
                    loginDialog.dispose();
                    requestFocus();
                } else {
                    loginInfoLabel.setText("Username or password is not correct");
                }
            } catch (NumberFormatException ex) {
                loginInfoLabel.setText("ID must only contain digits");
            }
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        adminAddUserDialog.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        adminAddStudentFirstNameField.setText("");
        adminAddStudentLastNameField.setText("");
        adminAddStudentDepartmentField.setText("");
        adminAddStudentTermField.setText("1");
        adminAddStudentDialog.setLocationRelativeTo(null);
        adminAddStudentDialog.setVisible(true);
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void usernameFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_usernameFieldPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldPropertyChange

    private void adminAddUserDialogAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddUserDialogAddButtonActionPerformed
        ArrayList<Object> tempList = new ArrayList<>();
        tempList.add(Integer.parseInt(adminAddUserIdField.getText()));
        tempList.add(jTextField1.getText());
        tempList.add(jTextField2.getText());
        tempList.add("0");

        if (adminStudentsPanel.isVisible()) {
            tempList.add("1");
            Object[] values = tempList.toArray();
            SystemClass.addToTable(adminStudentsTable, "students", values);

        } else if (adminTeachersPanel.isVisible()) {
            Object[] values = tempList.toArray();
            SystemClass.addToTable(adminTeachersTable, "teachers", values);

        } else {
            Object[] values = tempList.toArray();
            SystemClass.addToTable(adminAdminsTable, "admins", values);
        }

        jTextField1.setText("");
        jTextField2.setText("");
        adminAddUserDialog.dispose();
    }//GEN-LAST:event_adminAddUserDialogAddButtonActionPerformed

    private void removeStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentButtonActionPerformed
        SystemClass.removeFromTable(adminStudentsTable, "students");
    }//GEN-LAST:event_removeStudentButtonActionPerformed

    private void editStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentButtonActionPerformed

        adminEditStudentFirstNameField.setText((String) adminStudentsTable.getValueAt(adminStudentsTable.getSelectedRow(), 1));
        adminEditStudentLastNameField.setText((String) adminStudentsTable.getValueAt(adminStudentsTable.getSelectedRow(), 2));
        adminEditStudentDepartmentField.setText((String) adminStudentsTable.getValueAt(adminStudentsTable.getSelectedRow(), 4));
        adminEditStudentTermField.setText(String.valueOf(adminStudentsTable.getValueAt(adminStudentsTable.getSelectedRow(), 5)));

        adminEditStudentDialog.setVisible(true);
        adminEditStudentDialog.setLocationRelativeTo(null);

    }//GEN-LAST:event_editStudentButtonActionPerformed

    private void adminEditUserApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminEditUserApplyButtonActionPerformed
        int selectedRow;

        ArrayList<Object> tempList = new ArrayList<>();

        tempList.add(0);
        tempList.add(adminEditUserFirstNameField.getText());
        tempList.add(adminEditUserLastNameField.getText());
        tempList.add(adminEditUserPasswordField.getText());

        Object[] values;

        if (adminStudentsPanel.isVisible()) {
            tempList.set(0, adminStudentsTable.getSelectedRow());
            values = tempList.toArray();
            SystemClass.editTable(adminStudentsTable, "students", values);
        } else if (adminTeachersPanel.isVisible()) {
            tempList.set(0, adminTeachersTable.getSelectedRow());
            values = tempList.toArray();
            SystemClass.editTable(adminTeachersTable, "teachers", values);
        } else {
            tempList.set(0, adminAdminsTable.getSelectedRow());
            values = tempList.toArray();
            SystemClass.editTable(adminAdminsTable, "admins", values);
        }

        adminEditUserDialog.dispose();
    }//GEN-LAST:event_adminEditUserApplyButtonActionPerformed

    private void adminAddUserIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddUserIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminAddUserIdFieldActionPerformed

    private void addTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeacherButtonActionPerformed
        if (adminTeachersTable.getRowCount() != 0) {
            adminAddUserIdField.setText(String.valueOf((int) adminTeachersTable.getValueAt((adminTeachersTable.getRowCount() - 1), 0) + 1));
        } else {
            adminAddUserIdField.setText("0");
        }

        adminAddUserDialog.setVisible(true);
    }//GEN-LAST:event_addTeacherButtonActionPerformed

    private void removeTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTeacherButtonActionPerformed
        SystemClass.removeFromTable(adminTeachersTable, "teachers");
    }//GEN-LAST:event_removeTeacherButtonActionPerformed

    private void editTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTeacherButtonActionPerformed
        adminEditUserFirstNameField.setText((String) adminTeachersTable.getValueAt(adminTeachersTable.getSelectedRow(), 1));
        adminEditUserLastNameField.setText((String) adminTeachersTable.getValueAt(adminTeachersTable.getSelectedRow(), 2));
        adminEditUserPasswordField.setText((String) adminTeachersTable.getValueAt(adminTeachersTable.getSelectedRow(), 3));
        adminEditUserDialog.setVisible(true);
        adminEditUserDialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_editTeacherButtonActionPerformed

    private void addAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminButtonActionPerformed
        if (adminAdminsTable.getRowCount() != 0) {
            adminAddUserIdField.setText(String.valueOf((int) adminAdminsTable.getValueAt((adminAdminsTable.getRowCount() - 1), 0) + 1));
        } else {
            adminAddUserIdField.setText("0");
        }

        adminAddUserDialog.setVisible(true);
    }//GEN-LAST:event_addAdminButtonActionPerformed

    private void removeAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAdminButtonActionPerformed
        SystemClass.removeFromTable(adminAdminsTable, "admins");
    }//GEN-LAST:event_removeAdminButtonActionPerformed

    private void editAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAdminButtonActionPerformed
        adminEditUserFirstNameField.setText((String) adminAdminsTable.getValueAt(adminAdminsTable.getSelectedRow(), 1));
        adminEditUserLastNameField.setText((String) adminAdminsTable.getValueAt(adminAdminsTable.getSelectedRow(), 2));
        adminEditUserPasswordField.setText((String) adminAdminsTable.getValueAt(adminAdminsTable.getSelectedRow(), 3));
        adminEditUserDialog.setVisible(true);
        adminEditUserDialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_editAdminButtonActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        adminEditUserDialog.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void adminTeachersPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTeachersPanelMouseClicked
        adminTeachersTable.clearSelection();
    }//GEN-LAST:event_adminTeachersPanelMouseClicked

    private void adminAdminsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminAdminsPanelMouseClicked
        adminAdminsTable.clearSelection();
    }//GEN-LAST:event_adminAdminsPanelMouseClicked

    private void adminInfoPanelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_adminInfoPanelPropertyChange

    }//GEN-LAST:event_adminInfoPanelPropertyChange

    private void manageSubjectsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSubjectsButtonActionPerformed
        adminStudentsManageSubjectsDialog.setVisible(true);
        adminStudentsManageSubjectsDialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_manageSubjectsButtonActionPerformed

    private void adminAddSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddSubjectButtonActionPerformed
        if (adminSubjectsTable.getRowCount() != 0) {
            subjectIdField.setText(String.valueOf((int) adminSubjectsTable.getValueAt((adminSubjectsTable.getRowCount() - 1), 0) + 1));
        } else {
            subjectIdField.setText("0");
        }

        adminAddSubjectDialog.setVisible(true);
    }//GEN-LAST:event_adminAddSubjectButtonActionPerformed

    private void adminAddSubjectDialogCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddSubjectDialogCancelButtonActionPerformed
        adminAddSubjectDialog.dispose();
    }//GEN-LAST:event_adminAddSubjectDialogCancelButtonActionPerformed

    private void adminAddSubjectDialogAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddSubjectDialogAddButtonActionPerformed
        ArrayList<Object> tempList = new ArrayList<>();

        tempList.add(Integer.parseInt(subjectIdField.getText()));
        tempList.add(subjectCodeField.getText());
        tempList.add(subjectNameField.getText());
        tempList.add(Integer.parseInt(subjectHoursInWeekField.getText()));
        tempList.add(Integer.parseInt(subjectMaxAbsenceField.getText()));
        tempList.add(Integer.parseInt(subjectTermField.getText()));

        Object[] values = tempList.toArray();

        if (SystemClass.addToTable(adminSubjectsTable, "subjects", values)) {
            adminAddSubjectDialog.dispose();
        }
    }//GEN-LAST:event_adminAddSubjectDialogAddButtonActionPerformed

    private void adminRemoveSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRemoveSubjectButtonActionPerformed
        SystemClass.removeFromTable(adminSubjectsTable, "subjects");
    }//GEN-LAST:event_adminRemoveSubjectButtonActionPerformed

    private void adminSubjectsPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_adminSubjectsPanelComponentShown
        SystemClass.setTableValues(adminSubjectsTable, "subjects");
        adminSubjectsTable.getSelectionModel().addListSelectionListener(adminPanelsEnable);
        adminMultipleButtonEnableFunc();
        adminSingularChoiceButtonEnableFunc();
    }//GEN-LAST:event_adminSubjectsPanelComponentShown

    private void adminAdminsPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_adminAdminsPanelComponentShown
        SystemClass.setTableValues(adminAdminsTable, "admins");
        adminAdminsTable.getSelectionModel().addListSelectionListener(adminPanelsEnable);
        adminMultipleButtonEnableFunc();
        adminSingularChoiceButtonEnableFunc();
    }//GEN-LAST:event_adminAdminsPanelComponentShown

    private void adminTeachersPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_adminTeachersPanelComponentShown
        SystemClass.setTableValues(adminTeachersTable, "teachers");
        adminTeachersTable.getSelectionModel().addListSelectionListener(adminPanelsEnable);
        adminMultipleButtonEnableFunc();
        adminSingularChoiceButtonEnableFunc();
    }//GEN-LAST:event_adminTeachersPanelComponentShown

    private void adminStudentsPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_adminStudentsPanelComponentShown
        SystemClass.setTableValues(adminStudentsTable, "students");
        adminStudentsTable.getSelectionModel().addListSelectionListener(adminPanelsEnable);
        adminMultipleButtonEnableFunc();
        adminSingularChoiceButtonEnableFunc();
    }//GEN-LAST:event_adminStudentsPanelComponentShown

    private void adminStudentsManageSubjectsDialogComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_adminStudentsManageSubjectsDialogComponentShown
        Admin.setAdminStudentSubjectTable(adminStudentSubjectsTable, adminStudentsTable);

    }//GEN-LAST:event_adminStudentsManageSubjectsDialogComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Admin.removeStudentFromSubject(adminStudentSubjectsTable, adminStudentsTable, teachersGivingSubjectComboBox);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void adminStudentsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminStudentsPanelMouseClicked
        adminStudentsTable.clearSelection();
    }//GEN-LAST:event_adminStudentsPanelMouseClicked

    private void adminInfoPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_adminInfoPanelComponentShown
        setUserInfo();
    }//GEN-LAST:event_adminInfoPanelComponentShown

    private void adminManageMembersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminManageMembersButtonActionPerformed

        teachersGivingSubjectComboBox.removeAllItems();
        Admin.setTeachersGivingSubjectComboBox(teachersGivingSubjectComboBox, adminSubjectsTable);
        adminSubjectsManageMembersAddTeacherComboBox.removeAllItems();
        Admin.setAdminSubjectsManageMembersAddTeacherComboBox(adminSubjectsManageMembersAddTeacherComboBox, adminSubjectsTable);

        adminSubjectsManageMembersDialog.setLocationRelativeTo(null);
        adminSubjectsManageMembersDialog.setVisible(true);

        if (teachersGivingSubjectComboBox.getSelectedIndex() == -1) {
            adminSubjectsManageMembersRemoveTeacherButton.setEnabled(false);
        } else {
            adminSubjectsManageMembersRemoveTeacherButton.setEnabled(true);
        }

        if (adminSubjectsManageMembersAddTeacherComboBox.getSelectedIndex() == -1) {
            adminSubjectsManageMembersAddTeacherButton.setEnabled(false);
        } else {
            adminSubjectsManageMembersAddTeacherButton.setEnabled(true);
        }
    }//GEN-LAST:event_adminManageMembersButtonActionPerformed

    private void teachersGivingSubjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachersGivingSubjectComboBoxActionPerformed
        DefaultTableModel model = (DefaultTableModel) adminSubjectsManageMembersStudentsTable.getModel();
        model.setRowCount(0);

        Admin.setAdminSubjectsStudentTable(adminSubjectsManageMembersStudentsTable, adminSubjectsTable, teachersGivingSubjectComboBox);
        if (teachersGivingSubjectComboBox.getSelectedIndex() == -1) {
            adminSubjectsManageMembersRemoveTeacherButton.setEnabled(false);
        } else {
            adminSubjectsManageMembersRemoveTeacherButton.setEnabled(true);
        }
    }//GEN-LAST:event_teachersGivingSubjectComboBoxActionPerformed

    private void adminRequestsAcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRequestsAcceptButtonActionPerformed

        Admin.addRequestToDatabase(adminRequestsInputTable, adminRequestsSubjectComboBox, adminRequestsTeacherComboBox);
        Admin.setAdminRequestInputTable(adminRequestsInputTable, adminRequestsSubjectComboBox, adminRequestsTeacherComboBox);
        Admin.setAdminRequestOutputTable(adminRequestsOutputTable, adminRequestsSubjectComboBox, adminRequestsTeacherComboBox);

    }//GEN-LAST:event_adminRequestsAcceptButtonActionPerformed

    private void adminRequestsSubjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRequestsSubjectComboBoxActionPerformed
        DefaultTableModel model1 = (DefaultTableModel) adminRequestsInputTable.getModel();
        model1.setRowCount(0);

        DefaultTableModel model2 = (DefaultTableModel) adminRequestsOutputTable.getModel();
        model2.setRowCount(0);

        if (adminRequestsSubjectComboBox.getSelectedIndex() != -1) {

            //adminRequestsTeacherComboBox.removeAllItems();
            Admin.setAdminRequestsTeacherComboBox(adminRequestsTeacherComboBox, adminRequestsSubjectComboBox);

        }
    }//GEN-LAST:event_adminRequestsSubjectComboBoxActionPerformed

    private void adminRequestsPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_adminRequestsPanelComponentShown
        Admin.setAdminRequestsSubjectComboBox(adminRequestsSubjectComboBox, adminRequestsInputTable);
        adminRequestsInputTable.getSelectionModel().addListSelectionListener(adminPanelsEnable);
        adminMultipleButtonEnableFunc();
        adminSingularChoiceButtonEnableFunc();
    }//GEN-LAST:event_adminRequestsPanelComponentShown

    private void adminRequestsRejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRequestsRejectButtonActionPerformed
        Admin.removeRequest(adminRequestsInputTable, adminRequestsSubjectComboBox);

        Admin.setAdminRequestInputTable(adminRequestsInputTable, adminRequestsSubjectComboBox, adminRequestsTeacherComboBox);
    }//GEN-LAST:event_adminRequestsRejectButtonActionPerformed

    private void adminSubjectsManageMembersRemoveStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubjectsManageMembersRemoveStudentButtonActionPerformed
        String query
                = "DELETE FROM students_teachers_subjects WHERE student_id="
                + adminSubjectsManageMembersStudentsTable.getValueAt(adminSubjectsManageMembersStudentsTable.getSelectedRow(), 0)
                + " AND subject_id="
                + adminSubjectsTable.getValueAt(adminSubjectsTable.getSelectedRow(), 0);

        SystemClass.removeFromTable(adminSubjectsManageMembersStudentsTable, "fe", query);

        Admin.setAdminSubjectsStudentTable(adminSubjectsManageMembersStudentsTable, adminSubjectsTable, teachersGivingSubjectComboBox);
    }//GEN-LAST:event_adminSubjectsManageMembersRemoveStudentButtonActionPerformed

    private void adminRequestsOutputTableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adminRequestsOutputTableFocusLost
        adminRequestsOutputTable.clearSelection();
    }//GEN-LAST:event_adminRequestsOutputTableFocusLost

    private void adminRequestsTeacherComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRequestsTeacherComboBoxActionPerformed
        Admin.setAdminRequestInputTable(adminRequestsInputTable, adminRequestsSubjectComboBox, adminRequestsTeacherComboBox);
        Admin.setAdminRequestOutputTable(adminRequestsOutputTable, adminRequestsSubjectComboBox, adminRequestsTeacherComboBox);
    }//GEN-LAST:event_adminRequestsTeacherComboBoxActionPerformed

    private void adminSubjectsManageMembersAddTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubjectsManageMembersAddTeacherButtonActionPerformed
        Admin.addTeacherToSubject(adminSubjectsManageMembersAddTeacherComboBox, adminSubjectsTable);
        teachersGivingSubjectComboBox.removeAllItems();
        Admin.setTeachersGivingSubjectComboBox(teachersGivingSubjectComboBox, adminSubjectsTable);
        adminSubjectsManageMembersAddTeacherComboBox.removeAllItems();
        Admin.setAdminSubjectsManageMembersAddTeacherComboBox(adminSubjectsManageMembersAddTeacherComboBox, adminSubjectsTable);
    }//GEN-LAST:event_adminSubjectsManageMembersAddTeacherButtonActionPerformed

    private void adminSubjectsManageMembersRemoveTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubjectsManageMembersRemoveTeacherButtonActionPerformed
        Admin.removeTeacherFromSubject(teachersGivingSubjectComboBox);
        teachersGivingSubjectComboBox.removeAllItems();
        Admin.setTeachersGivingSubjectComboBox(teachersGivingSubjectComboBox, adminSubjectsTable);
        adminSubjectsManageMembersAddTeacherComboBox.removeAllItems();
        Admin.setAdminSubjectsManageMembersAddTeacherComboBox(adminSubjectsManageMembersAddTeacherComboBox, adminSubjectsTable);
    }//GEN-LAST:event_adminSubjectsManageMembersRemoveTeacherButtonActionPerformed

    private void adminSubjectsManageMembersAddTeacherComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubjectsManageMembersAddTeacherComboBoxActionPerformed
        if (adminSubjectsManageMembersAddTeacherComboBox.getSelectedIndex() == -1) {
            adminSubjectsManageMembersAddTeacherButton.setEnabled(false);
        } else {
            adminSubjectsManageMembersAddTeacherButton.setEnabled(true);
        }
    }//GEN-LAST:event_adminSubjectsManageMembersAddTeacherComboBoxActionPerformed

    private void studentSubjectsTakeSubjectSubjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSubjectsTakeSubjectSubjectComboBoxActionPerformed
        Student.setTakeSubjectTeacherComboBox(studentSubjectsTakeSubjectTeacherComboBox, studentSubjectsTakeSubjectSubjectComboBox);

        if (studentSubjectsTakeSubjectSubjectComboBox.getSelectedIndex() == -1 || studentSubjectsTakeSubjectTeacherComboBox.getSelectedIndex() == -1) {
            studentSubjectsTakeSubjectSendRequestButton.setEnabled(false);
        } else {
            studentSubjectsTakeSubjectSendRequestButton.setEnabled(true);
        }

    }//GEN-LAST:event_studentSubjectsTakeSubjectSubjectComboBoxActionPerformed

    private void studentSubjectsTakeSubjectTeacherComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSubjectsTakeSubjectTeacherComboBoxActionPerformed
        if (studentSubjectsTakeSubjectSubjectComboBox.getSelectedIndex() == -1 || studentSubjectsTakeSubjectTeacherComboBox.getSelectedIndex() == -1) {
            studentSubjectsTakeSubjectSendRequestButton.setEnabled(false);
        } else {
            studentSubjectsTakeSubjectSendRequestButton.setEnabled(true);
        }
    }//GEN-LAST:event_studentSubjectsTakeSubjectTeacherComboBoxActionPerformed

    private void studentSubjectsTakeSubjectSendRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSubjectsTakeSubjectSendRequestButtonActionPerformed
        Student.addSubjectRequest(studentSubjectsTakeSubjectSubjectComboBox, studentSubjectsTakeSubjectTeacherComboBox);
        Student.setTakeSubjectSubjectComboBox(studentSubjectsTakeSubjectSubjectComboBox);
        Student.setRequestsTable(studentSubjectsTakeSubjectRequestTable);
    }//GEN-LAST:event_studentSubjectsTakeSubjectSendRequestButtonActionPerformed

    private void teacherAttendanceRandomizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherAttendanceRandomizeButtonActionPerformed
        teacherAttendanceSubjectCodeTextField.setText(String.valueOf((int) (1000 + 9000 * Math.random())));
    }//GEN-LAST:event_teacherAttendanceRandomizeButtonActionPerformed

    private void teacherAttendancePanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_teacherAttendancePanelComponentShown
        Teacher.setAttendanceSubjectsComboBox(teacherAttendanceSubjectComboBox);
        adminSingularChoiceButtonEnableFunc();
        if (teacherAttendanceSubjectComboBox.getSelectedIndex() == -1) {
            teacherAttendanceInfoLabel.setText("No course selected/found");
        }
    }//GEN-LAST:event_teacherAttendancePanelComponentShown

    private void teacherAttendanceSubjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherAttendanceSubjectComboBoxActionPerformed
        Teacher.setAttendanceStudentsAttendanceTable(teacherAttendanceStudentAttendanceTable, teacherAttendanceSubjectComboBox);
        Teacher.setAttendanceCodeTextField(teacherAttendanceSubjectCodeTextField, teacherAttendanceSubjectComboBox);

        teacherAttendanceActivation();

    }//GEN-LAST:event_teacherAttendanceSubjectComboBoxActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Teacher.setAttendanceStudentsAttendanceTable(teacherAttendanceStudentAttendanceTable, teacherAttendanceSubjectComboBox);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void teacherAttendanceStartAttendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherAttendanceStartAttendanceButtonActionPerformed
        if (Teacher.startAttendance(Integer.parseInt(teacherAttendanceSubjectCodeTextField.getText()), teacherAttendanceSubjectComboBox)) {
            teacherAttendanceRandomizeButton.setEnabled(false);
            teacherAttendanceStartAttendanceButton.setEnabled(false);
            teacherAttendanceExpireCodeButton.setEnabled(true);
            teacherAttendanceInfoLabel.setText("Code is set and attendance has started");
        }

    }//GEN-LAST:event_teacherAttendanceStartAttendanceButtonActionPerformed

    private void studentSubjectsPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_studentSubjectsPanelComponentShown
        Student.setSubjectsTable(studentSubjectsTable);
    }//GEN-LAST:event_studentSubjectsPanelComponentShown

    private void studentSubjectsRequestSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSubjectsRequestSubjectButtonActionPerformed
        studentSubjectsTakeSubjectSubjectComboBox.removeAllItems();
        Student.setTakeSubjectSubjectComboBox(studentSubjectsTakeSubjectSubjectComboBox);
        Student.setRequestsTable(studentSubjectsTakeSubjectRequestTable);

        if (studentSubjectsTakeSubjectSubjectComboBox.getSelectedIndex() == -1 || studentSubjectsTakeSubjectTeacherComboBox.getSelectedIndex() == -1) {
            studentSubjectsTakeSubjectSendRequestButton.setEnabled(false);
        } else {
            studentSubjectsTakeSubjectSendRequestButton.setEnabled(true);
        }

        studentMultipleChoiceEnableFunc();

        studentSubjectsTakeSubjectRequestTable.getSelectionModel().addListSelectionListener(studentEnable);

        studentSubjectsTakeSubjectRemoveRequestButton.setEnabled(false);

        studentSubjectsTakeSubjectDialog.setLocationRelativeTo(null);
        studentSubjectsTakeSubjectDialog.setVisible(true);
    }//GEN-LAST:event_studentSubjectsRequestSubjectButtonActionPerformed


    private void studentInfoPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_studentInfoPanelComponentShown
        setStudentInfo();
    }//GEN-LAST:event_studentInfoPanelComponentShown

    private void studentAttendanceCodeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAttendanceCodeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentAttendanceCodeFieldActionPerformed

    private void studentAttendanceCodeFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentAttendanceCodeFieldFocusLost
        if (studentAttendanceCodeField.getText().isEmpty()) {
            studentAttendanceCodeField.setForeground(Color.gray);
            studentAttendanceCodeField.setText("Enter Code");
        }
    }//GEN-LAST:event_studentAttendanceCodeFieldFocusLost

    private void studentAttendanceCodeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentAttendanceCodeFieldFocusGained
        if (studentAttendanceCodeField.getForeground().equals(Color.gray)) {
            studentAttendanceCodeField.setForeground(Color.black);
            studentAttendanceCodeField.setText("");
        }
    }//GEN-LAST:event_studentAttendanceCodeFieldFocusGained

    private void studentAttendanceSubmitCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAttendanceSubmitCodeButtonActionPerformed
        if (studentAttendanceCodeField.getText().matches("^[0-9]+")) {
            studentAttendanceInfoLabel.setText("");
            Student.sendAttendanceCode(Integer.parseInt(studentAttendanceCodeField.getText()), studentAttendanceSubjectComboBox);
            if (Student.checkIfAttended(studentAttendanceSubjectComboBox)) {
                studentAttendanceSubmitCodeButton.setEnabled(false);
                studentAttendanceInfoLabel.setText("Successfully Attended");
            } else {
                studentAttendanceInfoLabel.setText("Wrong Code");
            }
        } else {
            studentAttendanceInfoLabel.setText("Code must consist only of numbers");
        }

    }//GEN-LAST:event_studentAttendanceSubmitCodeButtonActionPerformed

    private void loginExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_loginExitButtonActionPerformed

    private void loginExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginExitButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginExitButtonMouseClicked

    private void teacherAttendanceExpireCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherAttendanceExpireCodeButtonActionPerformed
        if (Teacher.expireAndTakeAttendance(Integer.parseInt(teacherAttendanceSubjectCodeTextField.getText()), teacherAttendanceSubjectComboBox)) {
            teacherAttendanceSubjectCodeTextField.setText("");
            teacherAttendanceActivation();
            Teacher.setAttendanceStudentsAttendanceTable(teacherAttendanceStudentAttendanceTable, teacherAttendanceSubjectComboBox);
            teacherAttendanceInfoLabel.setText("Code expired and attendance taken");
        }
    }//GEN-LAST:event_teacherAttendanceExpireCodeButtonActionPerformed

    MouseListener fancyButtons = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            e.getComponent().setBackground(new Color(90, 90, 90));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if ((e.getLocationOnScreen().x >= e.getComponent().getLocationOnScreen().x && e.getLocationOnScreen().x <= e.getComponent().getLocationOnScreen().x + e.getComponent().getWidth())
                    && e.getLocationOnScreen().y >= e.getComponent().getLocationOnScreen().x && e.getLocationOnScreen().y <= e.getComponent().getLocationOnScreen().y + e.getComponent().getHeight()) {
                e.getComponent().setBackground(new Color(70, 70, 70));
            } else {
                e.getComponent().setBackground(color1);
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            e.getComponent().setBackground(new Color(70, 70, 70));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            e.getComponent().setBackground(color1);
        }
    };

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void studentSubjectsPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSubjectsPanelButtonActionPerformed
        studentInfoPanelButtonSymbol.setBackground(color1);
        studentSubjectsPanelButtonSymbol.setBackground(new Color(200, 0, 0));
        studentAttendancePanelButtonSymbol.setBackground(color1);

        CardLayout card = (CardLayout) studentCardPanel.getLayout();
        card.show(studentCardPanel, "studentSubjectsCard");
    }//GEN-LAST:event_studentSubjectsPanelButtonActionPerformed

    private void studentInfoPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentInfoPanelButtonActionPerformed
        studentInfoPanelButtonSymbol.setBackground(new Color(200, 0, 0));
        studentSubjectsPanelButtonSymbol.setBackground(color1);
        studentAttendancePanelButtonSymbol.setBackground(color1);

        CardLayout card = (CardLayout) studentCardPanel.getLayout();
        card.show(studentCardPanel, "studentInfoCard");
    }//GEN-LAST:event_studentInfoPanelButtonActionPerformed

    private void studentLogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentLogoutButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_studentLogoutButtonMouseClicked

    private void studentLogoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentLogoutButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_studentLogoutButtonMouseEntered

    private void studentLogoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentLogoutButtonMouseExited

    }//GEN-LAST:event_studentLogoutButtonMouseExited

    private void studentLogoutButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentLogoutButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentLogoutButtonMousePressed

    private void studentLogoutButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentLogoutButtonMouseReleased

    }//GEN-LAST:event_studentLogoutButtonMouseReleased

    private void studentLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentLogoutButtonActionPerformed
        logout();
    }//GEN-LAST:event_studentLogoutButtonActionPerformed

    private void loginExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginExitButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_loginExitButtonMouseEntered

    private void studentAttendancePanelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentAttendancePanelButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_studentAttendancePanelButtonMouseClicked

    private void studentAttendancePanelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentAttendancePanelButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_studentAttendancePanelButtonMouseEntered

    private void studentAttendancePanelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentAttendancePanelButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_studentAttendancePanelButtonMouseExited

    private void studentAttendancePanelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentAttendancePanelButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentAttendancePanelButtonMousePressed

    private void studentAttendancePanelButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentAttendancePanelButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_studentAttendancePanelButtonMouseReleased

    private void studentAttendancePanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAttendancePanelButtonActionPerformed
        studentInfoPanelButtonSymbol.setBackground(color1);
        studentSubjectsPanelButtonSymbol.setBackground(color1);
        studentAttendancePanelButtonSymbol.setBackground(new Color(200, 0, 0));

        CardLayout card = (CardLayout) studentCardPanel.getLayout();
        card.show(studentCardPanel, "studentAttendanceCard");
    }//GEN-LAST:event_studentAttendancePanelButtonActionPerformed

    private void studentAttendancePanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_studentAttendancePanelComponentShown

        Student.setStudentAttendanceSubjectComboBox(studentAttendanceSubjectComboBox);


    }//GEN-LAST:event_studentAttendancePanelComponentShown

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        studentSubjectsTakeSubjectDialog.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void studentSubjectsTakeSubjectRemoveRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentSubjectsTakeSubjectRemoveRequestButtonActionPerformed
        Student.removeSubjectRequest(studentSubjectsTakeSubjectRequestTable);
        Student.setTakeSubjectSubjectComboBox(studentSubjectsTakeSubjectSubjectComboBox);
        Student.setRequestsTable(studentSubjectsTakeSubjectRequestTable);

        if (studentSubjectsTakeSubjectSubjectComboBox.getSelectedIndex() == -1 || studentSubjectsTakeSubjectTeacherComboBox.getSelectedIndex() == -1) {
            studentSubjectsTakeSubjectSendRequestButton.setEnabled(false);
        } else {
            studentSubjectsTakeSubjectSendRequestButton.setEnabled(true);
        }

        studentMultipleChoiceEnableFunc();

        studentSubjectsTakeSubjectRequestTable.getSelectionModel().addListSelectionListener(studentEnable);

        studentSubjectsTakeSubjectRemoveRequestButton.setEnabled(false);
    }//GEN-LAST:event_studentSubjectsTakeSubjectRemoveRequestButtonActionPerformed

    private void studentAttendanceSubjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentAttendanceSubjectComboBoxActionPerformed
        if (studentAttendanceSubjectComboBox.getSelectedIndex() != -1) {

            studentAttendanceHoursPerDayLabel.setText(String.valueOf(Student.getAttendanceHoursPerDay(studentAttendanceSubjectComboBox)));
            studentAttendanceCurrentAbsentHoursLabel.setText(String.valueOf(Student.getAttendanceCurrentAbsence(studentAttendanceSubjectComboBox)));
            studentAttendanceMaximumAbsentHours.setText(String.valueOf(Student.getAttendanceMaximumAbsence(studentAttendanceSubjectComboBox)));

            int hoursLeft = Integer.parseInt(studentAttendanceMaximumAbsentHours.getText()) - Integer.parseInt(studentAttendanceCurrentAbsentHoursLabel.getText());
            if (hoursLeft < 0) {
                studentAttendanceHoursLeft.setForeground(new Color(163, 0, 0));
                studentAttendanceHoursLeft.setText("Maximum absent days exceeded, subject failed");
            } else {
                studentAttendanceHoursLeft.setForeground(color1);
                studentAttendanceHoursLeft.setText(hoursLeft + " hours (" + hoursLeft / Student.getAttendanceHoursPerDay(studentAttendanceSubjectComboBox) + " days) left");
            }

            if (Student.checkIfAttendanceIsBeingTaken(studentAttendanceSubjectComboBox)) {
                if (Student.checkIfAttended(studentAttendanceSubjectComboBox)) {
                    studentAttendanceSubmitCodeButton.setEnabled(false);
                    studentAttendanceInfoLabel.setText("Already Attended");
                } else {
                    studentAttendanceSubmitCodeButton.setEnabled(true);
                    studentAttendanceInfoLabel.setText("");
                }
            } else {
                studentAttendanceInfoLabel.setText("Attendance is not being taken right now");
                studentAttendanceSubmitCodeButton.setEnabled(false);
            }
        } else {
            studentAttendanceSubmitCodeButton.setEnabled(false);
            studentAttendanceInfoLabel.setText("Subject not selected/found");
        }
    }//GEN-LAST:event_studentAttendanceSubjectComboBoxActionPerformed

    private void adminInfoPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminInfoPanelButtonActionPerformed
        adminInfoPanelButtonSymbol.setBackground(new Color(200, 0, 0));
        adminStudentsPanelButtonSymbol.setBackground(color1);
        adminTeachersPanelButtonSymbol.setBackground(color1);
        adminAdminsPanelButtonSymbol.setBackground(color1);
        adminSubjectsPanelButtonSymbol.setBackground(color1);
        adminRequestsPanelButtonSymbol.setBackground(color1);

        CardLayout adminCard = (CardLayout) adminCardPanel.getLayout();
        adminCard.show(adminCardPanel, "adminInfoCard");
    }//GEN-LAST:event_adminInfoPanelButtonActionPerformed

    private void adminStudentsPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminStudentsPanelButtonActionPerformed
        adminInfoPanelButtonSymbol.setBackground(color1);
        adminStudentsPanelButtonSymbol.setBackground(new Color(200, 0, 0));
        adminTeachersPanelButtonSymbol.setBackground(color1);
        adminAdminsPanelButtonSymbol.setBackground(color1);
        adminSubjectsPanelButtonSymbol.setBackground(color1);
        adminRequestsPanelButtonSymbol.setBackground(color1);

        CardLayout adminCard = (CardLayout) adminCardPanel.getLayout();
        adminCard.show(adminCardPanel, "adminStudentsCard");
    }//GEN-LAST:event_adminStudentsPanelButtonActionPerformed

    private void adminTeachersPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTeachersPanelButtonActionPerformed
        adminInfoPanelButtonSymbol.setBackground(color1);
        adminStudentsPanelButtonSymbol.setBackground(color1);
        adminTeachersPanelButtonSymbol.setBackground(new Color(200, 0, 0));
        adminAdminsPanelButtonSymbol.setBackground(color1);
        adminSubjectsPanelButtonSymbol.setBackground(color1);
        adminRequestsPanelButtonSymbol.setBackground(color1);

        CardLayout adminCard = (CardLayout) adminCardPanel.getLayout();
        adminCard.show(adminCardPanel, "adminTeachersCard");
    }//GEN-LAST:event_adminTeachersPanelButtonActionPerformed

    private void adminAdminsPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAdminsPanelButtonActionPerformed
        adminInfoPanelButtonSymbol.setBackground(color1);
        adminStudentsPanelButtonSymbol.setBackground(color1);
        adminTeachersPanelButtonSymbol.setBackground(color1);
        adminAdminsPanelButtonSymbol.setBackground(new Color(200, 0, 0));
        adminSubjectsPanelButtonSymbol.setBackground(color1);
        adminRequestsPanelButtonSymbol.setBackground(color1);

        CardLayout adminCard = (CardLayout) adminCardPanel.getLayout();
        adminCard.show(adminCardPanel, "adminAdminsCard");
    }//GEN-LAST:event_adminAdminsPanelButtonActionPerformed

    private void adminSubjectsPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubjectsPanelButtonActionPerformed
        adminInfoPanelButtonSymbol.setBackground(color1);
        adminStudentsPanelButtonSymbol.setBackground(color1);
        adminTeachersPanelButtonSymbol.setBackground(color1);
        adminAdminsPanelButtonSymbol.setBackground(color1);
        adminSubjectsPanelButtonSymbol.setBackground(new Color(200, 0, 0));
        adminRequestsPanelButtonSymbol.setBackground(color1);

        CardLayout adminCard = (CardLayout) adminCardPanel.getLayout();
        adminCard.show(adminCardPanel, "adminSubjectsCard");
    }//GEN-LAST:event_adminSubjectsPanelButtonActionPerformed

    private void adminRequestsPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRequestsPanelButtonActionPerformed
        adminInfoPanelButtonSymbol.setBackground(color1);
        adminStudentsPanelButtonSymbol.setBackground(color1);
        adminTeachersPanelButtonSymbol.setBackground(color1);
        adminAdminsPanelButtonSymbol.setBackground(color1);
        adminSubjectsPanelButtonSymbol.setBackground(color1);
        adminRequestsPanelButtonSymbol.setBackground(new Color(200, 0, 0));

        CardLayout adminCard = (CardLayout) adminCardPanel.getLayout();
        adminCard.show(adminCardPanel, "adminRequestsCard");
    }//GEN-LAST:event_adminRequestsPanelButtonActionPerformed

    private void adminLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogoutButtonActionPerformed
        logout();
    }//GEN-LAST:event_adminLogoutButtonActionPerformed

    private void teacherInfoPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherInfoPanelButtonActionPerformed
        teacherInfoPanelButtonSymbol.setBackground(new Color(200, 0, 0));
        teacherAttendancePanelButtonSymbol.setBackground(color1);
        teacherSubjectsPanelButtonSymbol.setBackground(color1);

        CardLayout teacherCard = (CardLayout) teacherCardPanel.getLayout();
        teacherCard.show(teacherCardPanel, "teacherInfoCard");
    }//GEN-LAST:event_teacherInfoPanelButtonActionPerformed

    private void teacherAttendancePanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherAttendancePanelButtonActionPerformed
        teacherInfoPanelButtonSymbol.setBackground(color1);
        teacherAttendancePanelButtonSymbol.setBackground(new Color(200, 0, 0));
        teacherSubjectsPanelButtonSymbol.setBackground(color1);

        CardLayout teacherCard = (CardLayout) teacherCardPanel.getLayout();
        teacherCard.show(teacherCardPanel, "teacherAttendanceCard");
    }//GEN-LAST:event_teacherAttendancePanelButtonActionPerformed

    private void teacherLogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherLogoutButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherLogoutButtonMouseClicked

    private void teacherLogoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherLogoutButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherLogoutButtonMouseEntered

    private void teacherLogoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherLogoutButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherLogoutButtonMouseExited

    private void teacherLogoutButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherLogoutButtonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherLogoutButtonMousePressed

    private void teacherLogoutButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherLogoutButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherLogoutButtonMouseReleased

    private void teacherLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherLogoutButtonActionPerformed
        logout();
    }//GEN-LAST:event_teacherLogoutButtonActionPerformed

    private void adminAddStudentDialogExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminAddStudentDialogExitButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminAddStudentDialogExitButtonMouseClicked

    private void adminAddStudentDialogExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminAddStudentDialogExitButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_adminAddStudentDialogExitButtonMouseEntered

    private void adminAddStudentDialogExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddStudentDialogExitButtonActionPerformed
        adminAddStudentDialog.dispose();
    }//GEN-LAST:event_adminAddStudentDialogExitButtonActionPerformed

    private void adminAddStudentAddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddStudentAddStudentButtonActionPerformed
        int tempId = 0;
        if (adminStudentsTable.getRowCount() > 0) {
            tempId = (int) adminStudentsTable.getValueAt(adminStudentsTable.getRowCount() - 1, 0) + 1;
        }

        if (Admin.addStudent(
                tempId,
                adminAddStudentFirstNameField.getText(),
                adminAddStudentLastNameField.getText(),
                adminAddStudentDepartmentField.getText(),
                Integer.parseInt(adminAddStudentTermField.getText()))) {
            adminAddStudentDialog.dispose();
        }

        SystemClass.setTableValues(adminStudentsTable, "students");
    }//GEN-LAST:event_adminAddStudentAddStudentButtonActionPerformed

    private void adminAddStudentCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddStudentCancelButtonActionPerformed
        adminAddStudentDialog.dispose();
    }//GEN-LAST:event_adminAddStudentCancelButtonActionPerformed

    private void adminEditStudentDialogExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminEditStudentDialogExitButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminEditStudentDialogExitButtonMouseClicked

    private void adminEditStudentDialogExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminEditStudentDialogExitButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_adminEditStudentDialogExitButtonMouseEntered

    private void adminEditStudentDialogExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminEditStudentDialogExitButtonActionPerformed
        adminEditStudentDialog.dispose();
    }//GEN-LAST:event_adminEditStudentDialogExitButtonActionPerformed

    private void adminEditStudentEditStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminEditStudentEditStudentButtonActionPerformed
        if (Admin.editStudent(
                (int) adminStudentsTable.getValueAt(adminStudentsTable.getSelectedRow(), 0),
                adminEditStudentFirstNameField.getText(),
                adminEditStudentLastNameField.getText(),
                adminEditStudentPasswordField.getText(),
                adminEditStudentDepartmentField.getText(),
                Integer.valueOf(adminEditStudentTermField.getText()))) {
            adminEditStudentDialog.dispose();
        }

        SystemClass.setTableValues(adminStudentsTable, "students");
    }//GEN-LAST:event_adminEditStudentEditStudentButtonActionPerformed

    private void adminEditStudentCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminEditStudentCancelButtonActionPerformed
        adminEditStudentDialog.dispose();
    }//GEN-LAST:event_adminEditStudentCancelButtonActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void teacherSubjectsPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectsPanelButtonActionPerformed
        teacherInfoPanelButtonSymbol.setBackground(color1);
        teacherAttendancePanelButtonSymbol.setBackground(color1);
        teacherSubjectsPanelButtonSymbol.setBackground(new Color(200, 0, 0));

        CardLayout teacherCard = (CardLayout) teacherCardPanel.getLayout();
        teacherCard.show(teacherCardPanel, "teacherSubjectsCard");
    }//GEN-LAST:event_teacherSubjectsPanelButtonActionPerformed

    private void teacherSubjectsPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_teacherSubjectsPanelComponentShown
        Teacher.setSubjectsSubjectsComboBox(teacherSubjectsSubjectsComboBox);
        teacherSingularChoiceEnableFunc();
    }//GEN-LAST:event_teacherSubjectsPanelComponentShown

    private void teacherSubjectsSubjectsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectsSubjectsComboBoxActionPerformed
        Teacher.setSubjectsStudentsTable(teacherSubjectsStudentsTable, teacherSubjectsSubjectsComboBox);
    }//GEN-LAST:event_teacherSubjectsSubjectsComboBoxActionPerformed

    private void teacherSubjectsManageGradesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectsManageGradesButtonActionPerformed
        if (teacherSubjectsStudentsTable.getSelectedRow() == -1) {
            teacherSubjectsManageGradesMidtermField.setText("");
            teacherSubjectsManageGradesHomeworkField.setText("");
            teacherSubjectsManageGradesFinalField.setText("");
            teacherSubjectsManageGradesInfoLabel.setText("");
            teacherSubjectsManageGradesApplyButton.setEnabled(false);
        } else {

            teacherSubjectsManageGradesMidtermField.setText(String.valueOf(teacherSubjectsStudentsTable.getValueAt(teacherSubjectsStudentsTable.getSelectedRow(), 3)));
            teacherSubjectsManageGradesHomeworkField.setText(String.valueOf(teacherSubjectsStudentsTable.getValueAt(teacherSubjectsStudentsTable.getSelectedRow(), 4)));
            teacherSubjectsManageGradesFinalField.setText(String.valueOf(teacherSubjectsStudentsTable.getValueAt(teacherSubjectsStudentsTable.getSelectedRow(), 5)));
            teacherSubjectsManageGradesInfoLabel.setText("");

        }
        teacherSubjectsManageGradesDialog.setLocationRelativeTo(null);
        teacherSubjectsManageGradesDialog.setVisible(true);
    }//GEN-LAST:event_teacherSubjectsManageGradesButtonActionPerformed

    private void teacherSubjectsManageGradesApplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectsManageGradesApplyButtonActionPerformed
        try {
            Double midtermGrade = Double.parseDouble(teacherSubjectsManageGradesMidtermField.getText());
            Double homeworkGrade = Double.parseDouble(teacherSubjectsManageGradesHomeworkField.getText());
            Double finalGrade = Double.parseDouble(teacherSubjectsManageGradesFinalField.getText());
            if (midtermGrade < 0 || midtermGrade > 100 || homeworkGrade < 0 || homeworkGrade > 100 || finalGrade < 0 || finalGrade > 100) {
                teacherSubjectsManageGradesInfoLabel.setText("Grades must be between 0-100");
            } else {
                teacherSubjectsManageGradesInfoLabel.setText("");
                if (Teacher.setGrades(teacherSubjectsStudentsTable, teacherSubjectsSubjectsComboBox, new Grade(
                        Double.parseDouble(teacherSubjectsManageGradesMidtermField.getText()),
                        Double.parseDouble(teacherSubjectsManageGradesHomeworkField.getText()),
                        Double.parseDouble(teacherSubjectsManageGradesFinalField.getText())))) {
                    Teacher.setSubjectsStudentsTable(teacherSubjectsStudentsTable, teacherSubjectsSubjectsComboBox);
                    teacherSubjectsManageGradesDialog.dispose();
                }
            }
        } catch (NumberFormatException ex) {
            teacherSubjectsManageGradesInfoLabel.setText("Grades must be numerical");
        }
    }//GEN-LAST:event_teacherSubjectsManageGradesApplyButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        teacherSubjectsManageGradesDialog.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void teacherInfoPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_teacherInfoPanelComponentShown
        setTeacherInfo();
    }//GEN-LAST:event_teacherInfoPanelComponentShown

    MouseListener minimizeButtonAnimation = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            e.getComponent().setBackground(Color.lightGray);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            e.getComponent().setBackground(color2);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            e.getComponent().setBackground(Color.gray);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            e.getComponent().setBackground(color2);
        }
    };

    MouseListener interiorButtonModel = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getComponent().isEnabled()) {
                e.getComponent().setBackground(Color.lightGray);
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (e.getComponent().isEnabled()) {
                e.getComponent().setBackground(Color.gray);
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (e.getComponent().isEnabled()) {
                e.getComponent().setBackground(Color.gray);
            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (e.getComponent().isEnabled()) {
                e.getComponent().setBackground(color1);
            }
        }
    };

    public void logout() {
        setVisible(false);
        loginDialog.setVisible(true);
        loginDialog.setLocationRelativeTo(null);
        passwordField.setText("");
    }

    DocumentListener fieldFullCheck = new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            loginDialogEnable();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            loginDialogEnable();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            loginDialogEnable();
        }
    };

    private void adminAddStudentFieldCheck() {
        if (adminAddStudentFirstNameField.getText().isEmpty()
                || adminAddStudentLastNameField.getText().isEmpty()
                || adminAddStudentDepartmentField.getText().isEmpty()
                || adminAddStudentTermField.getText().isEmpty()) {
            adminAddStudentAddStudentButton.setEnabled(false);
        } else {
            adminAddStudentAddStudentButton.setEnabled(true);
        }
    }

    private void adminEditStudentFieldCheck() {
        if (adminEditStudentFirstNameField.getText().isEmpty()
                || adminEditStudentLastNameField.getText().isEmpty()
                || adminEditStudentDepartmentField.getText().isEmpty()
                || adminEditStudentTermField.getText().isEmpty()) {
            adminEditStudentEditStudentButton.setEnabled(false);
        } else {
            adminEditStudentEditStudentButton.setEnabled(true);
        }
    }

    DocumentListener adminAddStudentFieldListener = new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            adminAddStudentFieldCheck();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            adminAddStudentFieldCheck();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            adminAddStudentFieldCheck();
        }
    };

    DocumentListener adminEditStudentFieldListener = new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            adminEditStudentFieldCheck();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            adminEditStudentFieldCheck();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            adminEditStudentFieldCheck();
        }
    };

    DocumentListener teacherAttendanceCodeCheck = new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            if (teacherAttendanceSubjectCodeTextField.getText().isEmpty()) {
                teacherAttendanceStartAttendanceButton.setEnabled(false);
            } else {
                teacherAttendanceStartAttendanceButton.setEnabled(true);

            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            if (teacherAttendanceSubjectCodeTextField.getText().isEmpty()) {
                teacherAttendanceStartAttendanceButton.setEnabled(false);
            } else {
                teacherAttendanceStartAttendanceButton.setEnabled(true);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            if (teacherAttendanceSubjectCodeTextField.getText().isEmpty()) {
                teacherAttendanceStartAttendanceButton.setEnabled(false);
            } else {
                teacherAttendanceStartAttendanceButton.setEnabled(true);
            }
        }
    };

    ListSelectionListener adminPanelsEnable = new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            adminMultipleButtonEnableFunc();
            adminSingularChoiceButtonEnableFunc();
        }
    };

    private void adminMultipleButtonEnableFunc() {
        if (adminStudentsPanel.isVisible()) {

            if (adminStudentsTable.getSelectionModel().isSelectionEmpty()) {
                removeStudentButton.setEnabled(false);
            } else {
                removeStudentButton.setEnabled(true);
            }

        } else if (adminTeachersPanel.isVisible()) {

            if (adminTeachersTable.getSelectionModel().isSelectionEmpty()) {
                removeTeacherButton.setEnabled(false);
            } else {
                removeTeacherButton.setEnabled(true);
            }
        } else if (adminAdminsPanel.isVisible()) {

            if (adminAdminsTable.getSelectionModel().isSelectionEmpty()) {
                removeAdminButton.setEnabled(false);
            } else {
                removeAdminButton.setEnabled(true);
            }
        } else if (adminSubjectsPanel.isVisible()) {

            if (adminSubjectsTable.getSelectionModel().isSelectionEmpty()) {
                adminRemoveSubjectButton.setEnabled(false);
            } else {
                adminRemoveSubjectButton.setEnabled(true);
            }
        } else if (adminPanel.isVisible()) {
            if (adminRequestsInputTable.getSelectedRow() == -1 || adminRequestsTeacherComboBox.getSelectedIndex() == -1) {
                adminRequestsAcceptButton.setEnabled(false);
                adminRequestsRejectButton.setEnabled(false);
            } else {
                adminRequestsAcceptButton.setEnabled(true);
                adminRequestsRejectButton.setEnabled(true);
            }
        }

    }

    public void adminSingularChoiceButtonEnableFunc() {
        if (adminStudentsPanel.isVisible()) {
            if (adminStudentsTable.getSelectedRowCount() == 1) {
                editStudentButton.setEnabled(true);
                manageSubjectsButton.setEnabled(true);
            } else {
                editStudentButton.setEnabled(false);
                manageSubjectsButton.setEnabled(false);
            }
        } else if (adminTeachersPanel.isVisible()) {
            if (adminTeachersTable.getSelectedRowCount() == 1) {
                editTeacherButton.setEnabled(true);
                manageSubjectsButton.setEnabled(true);
            } else {
                editTeacherButton.setEnabled(false);
                manageSubjectsButton.setEnabled(false);
            }
        } else if (adminAdminsPanel.isVisible()) {
            if (adminAdminsTable.getSelectedRowCount() == 1) {
                editAdminButton.setEnabled(true);
                manageSubjectsButton.setEnabled(true);
            } else {
                editAdminButton.setEnabled(false);
                manageSubjectsButton.setEnabled(false);
            }
        } else if (adminSubjectsPanel.isVisible()) {
            if (adminSubjectsTable.getSelectedRowCount() == 1) {
                adminManageMembersButton.setEnabled(true);
            } else {
                adminManageMembersButton.setEnabled(false);
            }
        } else if (teacherAttendancePanel.isVisible()) {
            teacherAttendanceActivation();
        }

    }

    private void studentMultipleChoiceEnableFunc() {
        if (studentSubjectsTakeSubjectDialog.isVisible()) {
            studentSubjectsTakeSubjectRemoveRequestButton.setEnabled(!studentSubjectsTakeSubjectRequestTable.getSelectionModel().isSelectionEmpty());

        }
    }

    ListSelectionListener studentEnable = new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            studentMultipleChoiceEnableFunc();
        }
    };

    DocumentListener teacherDocumentListener = new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            if (teacherSubjectsManageGradesDialog.isVisible()) {
                if (teacherSubjectsManageGradesMidtermField.getText().isEmpty()
                        || teacherSubjectsManageGradesHomeworkField.getText().isEmpty()
                        || teacherSubjectsManageGradesFinalField.getText().isEmpty()) {

                    teacherSubjectsManageGradesApplyButton.setEnabled(false);
                } else {
                    teacherSubjectsManageGradesApplyButton.setEnabled(true);
                }
            }
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            if (teacherSubjectsManageGradesDialog.isVisible()) {
                if (teacherSubjectsManageGradesMidtermField.getText().isEmpty()
                        || teacherSubjectsManageGradesHomeworkField.getText().isEmpty()
                        || teacherSubjectsManageGradesFinalField.getText().isEmpty()) {

                    teacherSubjectsManageGradesApplyButton.setEnabled(false);
                } else {
                    teacherSubjectsManageGradesApplyButton.setEnabled(true);
                }
            }
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            if (teacherSubjectsManageGradesDialog.isVisible()) {
                if (teacherSubjectsManageGradesMidtermField.getText().isEmpty()
                        || teacherSubjectsManageGradesHomeworkField.getText().isEmpty()
                        || teacherSubjectsManageGradesFinalField.getText().isEmpty()) {

                    teacherSubjectsManageGradesApplyButton.setEnabled(false);
                } else {
                    teacherSubjectsManageGradesApplyButton.setEnabled(true);
                }
            }
        }
    };

    private void teacherSingularChoiceEnableFunc() {
        if (teacherSubjectsPanel.isVisible()) {
            if (teacherSubjectsStudentsTable.getSelectedRowCount() == 1) {
                teacherSubjectsManageGradesButton.setEnabled(true);
            } else {
                teacherSubjectsManageGradesButton.setEnabled(false);
            }

        }
    }

    ListSelectionListener teacherEnable = new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            teacherSingularChoiceEnableFunc();
        }
    };

    public boolean setTeacherInfo(){
        if (SystemClass.loggedUser != null) {
            teacherIdLabel.setText(String.valueOf(SystemClass.loggedUser.getId()));
            teacherFirstNameLabel.setText(SystemClass.loggedUser.getFirstName());
            teacherLastNameLabel.setText(SystemClass.loggedUser.getLastName());
            
            return true;
        }
        
        return false;
    }
    
    public boolean setStudentInfo() {
        if (SystemClass.loggedUser != null) {
            Student student = (Student) SystemClass.loggedUser;
            studentIdLabel.setText(String.valueOf(student.getId()));
            studentFirstNameLabel.setText(student.getFirstName());
            studentLastNameLabel.setText(student.getLastName());
            studentDepartmentLabel.setText(student.getDepartment());
            String academicYear = String.valueOf(Calendar.getInstance().get(Calendar.YEAR)) + " - " + String.valueOf(Calendar.getInstance().get(Calendar.YEAR) + 1) + " ";

            if (Calendar.getInstance().get(Calendar.MONTH) >= 9) {
                academicYear += "Fall";
            } else {
                academicYear += "Spring";
            }

            academicYear += " / Year " + ((Student.loggedUser.getTerm() + 1) / 2);

            studentAcademicYearLabel.setText(academicYear);

            return true;
        }

        return false;
    }

    public boolean setAdminInfo() {
        if (SystemClass.loggedUser != null) {
            adminIdLabel.setText(String.valueOf(SystemClass.loggedUser.getId()));
            adminFirstNameLabel.setText(SystemClass.loggedUser.getFirstName());
            adminLastNameLabel.setText(SystemClass.loggedUser.getLastName());

            return true;
        }

        return false;
    }

    public void setUserInfo() {
        if (SystemClass.loggedUser != null) {
            if (SystemClass.loggedUser instanceof Student) {
                setStudentInfo();
            } else if (SystemClass.loggedUser instanceof Admin) {
                setAdminInfo();
            } else {

            }
        } else {
        }
    }

    public class AdminAddStudentDialogDragListener extends MouseInputAdapter {

        Point location;
        MouseEvent pressed;

        public void mousePressed(MouseEvent me) {
            pressed = me;
        }

        public void mouseDragged(MouseEvent me) {
            location = adminAddStudentDialog.getLocation(location);
            int x = location.x - pressed.getX() + me.getX();
            int y = location.y - pressed.getY() + me.getY();
            adminAddStudentDialog.setLocation(x, y);
        }
    }

    public class AdminEditStudentDialogDragListener extends MouseInputAdapter {

        Point location;
        MouseEvent pressed;

        public void mousePressed(MouseEvent me) {
            pressed = me;
        }

        public void mouseDragged(MouseEvent me) {
            location = adminEditStudentDialog.getLocation(location);
            int x = location.x - pressed.getX() + me.getX();
            int y = location.y - pressed.getY() + me.getY();
            adminEditStudentDialog.setLocation(x, y);
        }
    }

    public class TeacherSubjectsDialogDragListener extends MouseInputAdapter {

        Point location;
        MouseEvent pressed;

        public void mousePressed(MouseEvent me) {
            pressed = me;
        }

        public void mouseDragged(MouseEvent me) {
            location = adminAddStudentDialog.getLocation(location);
            int x = location.x - pressed.getX() + me.getX();
            int y = location.y - pressed.getY() + me.getY();
            adminAddStudentDialog.setLocation(x, y);
        }
    }

    public class TeacherSubjectsManageGradesDialogDragListener extends MouseInputAdapter {

        Point location;
        MouseEvent pressed;

        public void mousePressed(MouseEvent me) {
            pressed = me;
        }

        public void mouseDragged(MouseEvent me) {
            location = teacherSubjectsManageGradesDialog.getLocation(location);
            int x = location.x - pressed.getX() + me.getX();
            int y = location.y - pressed.getY() + me.getY();
            teacherSubjectsManageGradesDialog.setLocation(x, y);
        }
    }

    public class StudentSubjectsTakeSubjectDialogDragListener extends MouseInputAdapter {

        Point location;
        MouseEvent pressed;

        public void mousePressed(MouseEvent me) {
            pressed = me;
        }

        public void mouseDragged(MouseEvent me) {
            location = studentSubjectsTakeSubjectDialog.getLocation(location);
            int x = location.x - pressed.getX() + me.getX();
            int y = location.y - pressed.getY() + me.getY();
            studentSubjectsTakeSubjectDialog.setLocation(x, y);
        }
    }

    public class LoginDialogDragListener extends MouseInputAdapter {

        Point location;
        MouseEvent pressed;

        public void mousePressed(MouseEvent me) {
            pressed = me;
        }

        public void mouseDragged(MouseEvent me) {
            location = loginDialog.getLocation(location);
            int x = location.x - pressed.getX() + me.getX();
            int y = location.y - pressed.getY() + me.getY();
            loginDialog.setLocation(x, y);
        }
    }

    public class FrameDragListener extends MouseInputAdapter {

        Point location;
        MouseEvent pressed;

        public void mousePressed(MouseEvent me) {
            pressed = me;
        }

        public void mouseDragged(MouseEvent me) {
            location = getLocation(location);
            int x = location.x - pressed.getX() + me.getX();
            int y = location.y - pressed.getY() + me.getY();
            setLocation(x, y);
        }
    }

    MouseListener exitButtonMouseAnimation = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            e.getComponent().setBackground(new Color(128, 0, 0));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            e.getComponent().setBackground(color2);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            e.getComponent().setBackground(Color.red);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            e.getComponent().setBackground(color2);
        }
    };

    private void teacherAttendanceActivation() {
        if (teacherAttendanceSubjectCodeTextField.getText().isEmpty()) {
            teacherAttendanceInfoLabel.setText("");
            teacherAttendanceStartAttendanceButton.setEnabled(false);
            teacherAttendanceExpireCodeButton.setEnabled(false);
            teacherAttendanceRandomizeButton.setEnabled(true);
        } else {
            teacherAttendanceStartAttendanceButton.setEnabled(false);
            teacherAttendanceRandomizeButton.setEnabled(false);
            teacherAttendanceInfoLabel.setText("Attendance is already active");

            if (teacherAttendanceStartAttendanceButton.isEnabled()) {
                teacherAttendanceExpireCodeButton.setEnabled(false);
            } else {
                teacherAttendanceExpireCodeButton.setEnabled(true);
            }

        }

        if (!teacherAttendanceStartAttendanceButton.isEnabled() && !teacherAttendanceExpireCodeButton.isEnabled()) {
            teacherAttendanceRandomizeButton.setEnabled(true);
        } else {
            teacherAttendanceRandomizeButton.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAdminButton;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton addTeacherButton;
    private javax.swing.JButton adminAddStudentAddStudentButton;
    private javax.swing.JButton adminAddStudentCancelButton;
    private javax.swing.JTextField adminAddStudentDepartmentField;
    private javax.swing.JDialog adminAddStudentDialog;
    private javax.swing.JButton adminAddStudentDialogExitButton;
    private javax.swing.JTextField adminAddStudentFirstNameField;
    private javax.swing.JTextField adminAddStudentLastNameField;
    private javax.swing.JTextField adminAddStudentTermField;
    private javax.swing.JButton adminAddSubjectButton;
    private javax.swing.JDialog adminAddSubjectDialog;
    private javax.swing.JButton adminAddSubjectDialogAddButton;
    private javax.swing.JButton adminAddSubjectDialogCancelButton;
    private javax.swing.JDialog adminAddUserDialog;
    private javax.swing.JButton adminAddUserDialogAddButton;
    private javax.swing.JPanel adminAddUserDialogMainPanel;
    private javax.swing.JTextField adminAddUserIdField;
    private javax.swing.JPanel adminAdminsPanel;
    private javax.swing.JButton adminAdminsPanelButton;
    private javax.swing.JLabel adminAdminsPanelButtonSymbol;
    private javax.swing.JTable adminAdminsTable;
    private javax.swing.JPanel adminCardPanel;
    private javax.swing.JButton adminEditStudentCancelButton;
    private javax.swing.JTextField adminEditStudentDepartmentField;
    private javax.swing.JDialog adminEditStudentDialog;
    private javax.swing.JButton adminEditStudentDialogExitButton;
    private javax.swing.JButton adminEditStudentEditStudentButton;
    private javax.swing.JTextField adminEditStudentFirstNameField;
    private javax.swing.JTextField adminEditStudentLastNameField;
    private javax.swing.JTextField adminEditStudentPasswordField;
    private javax.swing.JTextField adminEditStudentTermField;
    private javax.swing.JButton adminEditUserApplyButton;
    private javax.swing.JDialog adminEditUserDialog;
    private javax.swing.JTextField adminEditUserFirstNameField;
    private javax.swing.JTextField adminEditUserLastNameField;
    private javax.swing.JTextField adminEditUserPasswordField;
    private javax.swing.JLabel adminFirstNameLabel;
    private javax.swing.JLabel adminIdLabel;
    private javax.swing.JPanel adminInfoPanel;
    private javax.swing.JButton adminInfoPanelButton;
    private javax.swing.JLabel adminInfoPanelButtonSymbol;
    private javax.swing.JLabel adminLastNameLabel;
    private javax.swing.JButton adminLogoutButton;
    private javax.swing.JButton adminManageMembersButton;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JRadioButton adminRadioButton;
    private javax.swing.JButton adminRemoveSubjectButton;
    private javax.swing.JButton adminRequestsAcceptButton;
    private javax.swing.JTable adminRequestsInputTable;
    private javax.swing.JTable adminRequestsOutputTable;
    private javax.swing.JPanel adminRequestsPanel;
    private javax.swing.JButton adminRequestsPanelButton;
    private javax.swing.JLabel adminRequestsPanelButtonSymbol;
    private javax.swing.JButton adminRequestsRejectButton;
    private javax.swing.JComboBox<String> adminRequestsSubjectComboBox;
    private javax.swing.JComboBox<String> adminRequestsTeacherComboBox;
    private javax.swing.JTable adminStudentSubjectsTable;
    private javax.swing.JDialog adminStudentsManageSubjectsDialog;
    private javax.swing.JPanel adminStudentsPanel;
    private javax.swing.JButton adminStudentsPanelButton;
    private javax.swing.JLabel adminStudentsPanelButtonSymbol;
    private javax.swing.JTable adminStudentsTable;
    private javax.swing.JButton adminSubjectsManageMembersAddTeacherButton;
    private javax.swing.JComboBox<String> adminSubjectsManageMembersAddTeacherComboBox;
    private javax.swing.JDialog adminSubjectsManageMembersDialog;
    private javax.swing.JButton adminSubjectsManageMembersRemoveStudentButton;
    private javax.swing.JButton adminSubjectsManageMembersRemoveTeacherButton;
    private javax.swing.JTable adminSubjectsManageMembersStudentsTable;
    private javax.swing.JPanel adminSubjectsPanel;
    private javax.swing.JButton adminSubjectsPanelButton;
    private javax.swing.JLabel adminSubjectsPanelButtonSymbol;
    private javax.swing.JTable adminSubjectsTable;
    private javax.swing.JPanel adminTeachersPanel;
    private javax.swing.JButton adminTeachersPanelButton;
    private javax.swing.JLabel adminTeachersPanelButtonSymbol;
    private javax.swing.JTable adminTeachersTable;
    private javax.swing.JButton editAdminButton;
    private javax.swing.JButton editStudentButton;
    private javax.swing.JButton editTeacherButton;
    private javax.swing.JPanel frameTitleBar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton loginButton;
    private javax.swing.JDialog loginDialog;
    private javax.swing.JButton loginExitButton;
    private javax.swing.JLabel loginInfoLabel;
    private javax.swing.JPanel loginTitleBarPanel;
    private javax.swing.ButtonGroup loginTypeGroup;
    private javax.swing.JPanel mainDialogPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton manageSubjectsButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton removeAdminButton;
    private javax.swing.JButton removeStudentButton;
    private javax.swing.JButton removeTeacherButton;
    private javax.swing.JLabel studentAcademicYearLabel;
    private javax.swing.JTextField studentAttendanceCodeField;
    private javax.swing.JLabel studentAttendanceCurrentAbsentHoursLabel;
    private javax.swing.JLabel studentAttendanceHoursLeft;
    private javax.swing.JLabel studentAttendanceHoursPerDayLabel;
    private javax.swing.JLabel studentAttendanceInfoLabel;
    private javax.swing.JLabel studentAttendanceMaximumAbsentHours;
    private javax.swing.JPanel studentAttendancePanel;
    private javax.swing.JButton studentAttendancePanelButton;
    private javax.swing.JLabel studentAttendancePanelButtonSymbol;
    private javax.swing.JComboBox<String> studentAttendanceSubjectComboBox;
    private javax.swing.JButton studentAttendanceSubmitCodeButton;
    private javax.swing.JPanel studentCardPanel;
    private javax.swing.JLabel studentDepartmentLabel;
    private javax.swing.JLabel studentFirstNameLabel;
    private javax.swing.JLabel studentIdLabel;
    private javax.swing.JPanel studentInfoPanel;
    private javax.swing.JButton studentInfoPanelButton;
    private javax.swing.JLabel studentInfoPanelButtonSymbol;
    private javax.swing.JLabel studentLastNameLabel;
    private javax.swing.JButton studentLogoutButton;
    private javax.swing.JPanel studentPanel;
    private javax.swing.JRadioButton studentRadioButton;
    private javax.swing.JPanel studentSubjectsPanel;
    private javax.swing.JButton studentSubjectsPanelButton;
    private javax.swing.JLabel studentSubjectsPanelButtonSymbol;
    private javax.swing.JButton studentSubjectsRequestSubjectButton;
    private javax.swing.JTable studentSubjectsTable;
    private javax.swing.JDialog studentSubjectsTakeSubjectDialog;
    private javax.swing.JButton studentSubjectsTakeSubjectRemoveRequestButton;
    private javax.swing.JTable studentSubjectsTakeSubjectRequestTable;
    private javax.swing.JButton studentSubjectsTakeSubjectSendRequestButton;
    private javax.swing.JComboBox<String> studentSubjectsTakeSubjectSubjectComboBox;
    private javax.swing.JComboBox<String> studentSubjectsTakeSubjectTeacherComboBox;
    private javax.swing.JTextField subjectCodeField;
    private javax.swing.JTextField subjectHoursInWeekField;
    private javax.swing.JTextField subjectIdField;
    private javax.swing.JTextField subjectMaxAbsenceField;
    private javax.swing.JTextField subjectNameField;
    private javax.swing.JTextField subjectTermField;
    private javax.swing.JButton teacherAttendanceExpireCodeButton;
    private javax.swing.JLabel teacherAttendanceInfoLabel;
    private javax.swing.JPanel teacherAttendancePanel;
    private javax.swing.JButton teacherAttendancePanelButton;
    private javax.swing.JLabel teacherAttendancePanelButtonSymbol;
    private javax.swing.JButton teacherAttendanceRandomizeButton;
    private javax.swing.JButton teacherAttendanceStartAttendanceButton;
    private javax.swing.JTable teacherAttendanceStudentAttendanceTable;
    private javax.swing.JTextField teacherAttendanceSubjectCodeTextField;
    private javax.swing.JComboBox<String> teacherAttendanceSubjectComboBox;
    private javax.swing.JPanel teacherCardPanel;
    private javax.swing.JLabel teacherFirstNameLabel;
    private javax.swing.JLabel teacherIdLabel;
    private javax.swing.JPanel teacherInfoPanel;
    private javax.swing.JButton teacherInfoPanelButton;
    private javax.swing.JLabel teacherInfoPanelButtonSymbol;
    private javax.swing.JLabel teacherLastNameLabel;
    private javax.swing.JButton teacherLogoutButton;
    private javax.swing.JPanel teacherPanel;
    private javax.swing.JRadioButton teacherRadioButton;
    private javax.swing.JButton teacherSubjectsManageGradesApplyButton;
    private javax.swing.JButton teacherSubjectsManageGradesButton;
    private javax.swing.JDialog teacherSubjectsManageGradesDialog;
    private javax.swing.JTextField teacherSubjectsManageGradesFinalField;
    private javax.swing.JTextField teacherSubjectsManageGradesHomeworkField;
    private javax.swing.JLabel teacherSubjectsManageGradesInfoLabel;
    private javax.swing.JTextField teacherSubjectsManageGradesMidtermField;
    private javax.swing.JPanel teacherSubjectsPanel;
    private javax.swing.JButton teacherSubjectsPanelButton;
    private javax.swing.JLabel teacherSubjectsPanelButtonSymbol;
    private javax.swing.JTable teacherSubjectsStudentsTable;
    private javax.swing.JComboBox<String> teacherSubjectsSubjectsComboBox;
    private javax.swing.JComboBox<String> teachersGivingSubjectComboBox;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
