package dbcrud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBUtil;

public class DBCrud {

    static DBUtil db = new DBUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static void main(String[] args) {
        
//        insertEmp("Raju", "raju@gmail.com", "Azimpur", "123456789");
//        System.out.println("After Insert Data \n");
//        showEmp();
//        deleteEmp(1);
//        System.out.println("\n After Delete Data \n");
//        showEmp();
        editEmp("Raju Ahmed", "raju Ahmed@gmail.com", "Azimpur, Dhaka", "9875650654", 2);
        System.out.println("\n After Edit Data \n");
        showEmp();

    }

    public static void insertEmp(String name, String email, String address, String cell) {
        sql = "insert into employee (name, email, address, cell) values(?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cell);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void showEmp() {
        sql = "select * from employee";

        try {
            ps = db.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {

                String name = rs.getString("name");
                String email = rs.getString("name");
                String address = rs.getString("address");
                String cell = rs.getString("cell");
                String id = rs.getString("id");

                System.out.println("ID No: " + id + "\tName: " + name + "\tEmail: " + email + "\tAddress: " + address + "\tCell: " + cell);
            }

            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteEmp(int id) {
        sql = "delete from employee where id=?";

        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void editEmp(String name, String email, String address, String cell, int id) {
        sql = "update employee set name=?, email=?, address=?, cell=? where id=?";
        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setString(4, cell);
            ps.setInt(5, id);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
