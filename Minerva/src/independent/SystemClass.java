package independent;

import classes.*;
import java.awt.Dimension;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class SystemClass {

    public static User loggedUser = null;

    public static Connection connect() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minerva", "root", "root");

        return con;
    }

    public static String[] getColumns(String tableName) {
        try {
            Statement st = connect().createStatement();

            ResultSet result = st.executeQuery("SELECT * FROM " + tableName);

            String[] columns = new String[result.getMetaData().getColumnCount()];

            for (int i = 0; i < result.getMetaData().getColumnCount(); i++) {
                columns[i] = result.getMetaData().getColumnName(i + 1);
            }

            return columns;

        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    
    public static String joinTables(String tableName1, String tableName2, String[] columns, String onCondition, String whereCondition) {
        String query = "SELECT ";
        for (int i = 0; i < columns.length; i++) {
            query += columns[i];

            if (i != columns.length - 1) {
                query += ", ";
            }
        }

        query += " FROM " + tableName1 + " JOIN " + tableName2 + " ON " + onCondition + " WHERE " + whereCondition + " ORDER BY id";

        return query;
    }

    public static boolean setTableValues(JTable tableToSet, String tableName) {
        Object[][] data = null;

        ArrayList<String> columnArray = new ArrayList<>();

        for (int i = 0; i < tableToSet.getColumnCount(); i++) {
            columnArray.add(tableToSet.getColumnName(i));
        }

        Object[] columns = columnArray.toArray();

        ResultSet row;

        ResultSetMetaData rowData;

        DefaultTableModel tableModel = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {
            Connection con = SystemClass.connect();

            Statement st = con.createStatement();
            row = st.executeQuery("SELECT * FROM " + tableName);
            rowData = row.getMetaData();

            Object[] tempRow = new Object[rowData.getColumnCount()];

            while (row.next()) {
                for (int i = 0; i < rowData.getColumnCount(); i++) {
                    tempRow[i] = row.getObject(i + 1);
                }

                tableModel.addRow(tempRow);
            }

            tableToSet.setModel(tableModel);
            return true;
        } catch (SQLException ex) {
            System.out.println("Could not set table");
            return false;
        }
    }

    public static boolean setTableValues(JTable tableToSet, String tableName, String query) {
        Object[][] data = null;

        ArrayList<String> columnArray = new ArrayList<>();

        for (int i = 0; i < tableToSet.getColumnCount(); i++) {
            columnArray.add(tableToSet.getColumnName(i));
        }

        Object[] columns = columnArray.toArray();

        ResultSet row;

        ResultSetMetaData rowData;

        DefaultTableModel tableModel = new DefaultTableModel(data, columns) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        try {
            Connection con = SystemClass.connect();

            Statement st = con.createStatement();

            row = st.executeQuery(query);
            rowData = row.getMetaData();

            Object[] tempRow = new Object[rowData.getColumnCount()];

            while (row.next()) {
                for (int i = 0; i < rowData.getColumnCount(); i++) {
                    tempRow[i] = row.getObject(i + 1);
                }

                tableModel.addRow(tempRow);
            }

            tableToSet.setModel(tableModel);
            return true;
        } catch (SQLException ex) {
            System.out.println("Could not set table");
            return false;
        }
    }

    public static boolean addToTable(JTable table, String tableName, Object[] values) {
        try {
            PreparedStatement ps;

            Connection con = connect();

            String[] columns = SystemClass.getColumns(tableName);

            String query = "INSERT INTO " + tableName + "(";

            for (int i = 0; i < columns.length; i++) {
                query += columns[i];

                if (i != columns.length - 1) {
                    query += ", ";
                }
            }

            query += ") VALUES(";

            for (int i = 0; i < columns.length; i++) {
                query += "?";

                if (i != columns.length - 1) {
                    query += ", ";
                }
            }

            query += ")";

            ps = con.prepareStatement(query);

            for (int i = 0; i < columns.length; i++) {
                ps.setObject(i + 1, values[i]);
            }

            ps.executeUpdate();

            setTableValues(table, tableName);

            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public static boolean editTable(JTable table, String tableName, Object[] values) {
        try {
            String[] columns = getColumns(tableName);

            String query = "UPDATE " + tableName + " SET ";

            for (int i = 0; i < columns.length; i++) {
                query += columns[i] + "=";
                if (values[i].getClass() == String.class) {
                    query += "'" + values[i] + "'";
                } else {
                    query += values[i];
                }

                if (i != columns.length - 1) {
                    query += ", ";
                }
            }

            query += " WHERE " + columns[0] + "=" + table.getValueAt(table.getSelectedRow(), 0);

            PreparedStatement ps = connect().prepareStatement(query);

            ps.execute();

            setTableValues(table, tableName);

            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public static boolean removeFromTable(JTable table, String tableName) {
        int[] temp = table.getSelectedRows();

        ArrayList<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < table.getSelectedRowCount(); i++) {
            tempList.add((Integer) table.getValueAt(temp[i], 0));
        }

        int[] idList = new int[tempList.size()];

        for (int i = 0; i < tempList.size(); i++) {
            idList[i] = tempList.get(i);
        }

        try {
            Statement removeStatement = connect().createStatement();
            String query = "DELETE FROM " + tableName + " WHERE id IN (";

            for (int i = 0; i < idList.length; i++) {
                query += idList[i];

                if (i != idList.length - 1) {
                    query += ", ";
                }
            }

            query += ")";

            removeStatement.executeUpdate(query);

            setTableValues(table, tableName);

            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

    }

    public static boolean removeFromTable(JTable table, String tableName, String query) {
        /*int[] temp = table.getSelectedRows();

        ArrayList<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < table.getSelectedRowCount(); i++) {
            tempList.add((Integer) table.getValueAt(temp[i], 0));
        }

        int[] idList = new int[tempList.size()];

        for (int i = 0; i < tempList.size(); i++) {
            idList[i] = tempList.get(i);
        }
*/
        try {
            Statement removeStatement = connect().createStatement();

            removeStatement.executeUpdate(query);

            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }

    }

    public static void setTableColumnWidth(JTable table, int[] widthList) {
        int sum = 0;
        for (int i = 0; i < widthList.length; i++) {
            table.getColumnModel().getColumn(i).setMaxWidth(widthList[i]);
            sum += widthList[i];
        }
        table.setMaximumSize(new Dimension(sum, table.getPreferredSize().height));
        table.getColumnModel().getColumn(0).setResizable(false);
    }

    public static void setListValues(JList listToSet, String tableName, String column) {
        try {
            String query = "SELECT " + column + " FROM " + tableName;

            Statement st = connect().createStatement();

            ResultSet result = st.executeQuery(query);

            DefaultListModel model = new DefaultListModel();

            int i = 0;

            while (result.next()) {
                model.add(i, result.getString(column));
                i++;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
