package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;
import util.DButil;

public class EmployeeDAO {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static int saveEmployee(Employee e) {

        int status = 0;

        sql = "insert into employee (name, email, address) values(?,?,?)";

        try {
            ps = DButil.getCon().prepareStatement(sql);

            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setString(3, e.getAddress());

            status = ps.executeUpdate();
            System.out.println(status);

            ps.close();
            DButil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public static List<Employee> viewAllEmployee() {
        List<Employee> empList = new ArrayList<>();

        sql = "select * from employee";

        try {
            ps = DButil.getCon().prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                Employee e = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("address")
                );
                empList.add(e);

            }

            rs.close();
            ps.close();

            DButil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return empList;
    }

    public static void editEmployee(Employee e) {
        sql = "update employee set name=?, email=?, address=? where id=?";

        try {
            ps = DButil.getCon().prepareStatement(sql);

            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setString(3, e.getAddress());
            ps.setInt(4, e.getId());

            ps.executeUpdate();

            ps.close();
            DButil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void deleteEmployee(Employee e) {

        sql = "delete from employee where id=?";

        try {
            ps = DButil.getCon().prepareStatement(sql);

            ps.setInt(1, e.getId());

            ps.executeUpdate();

            ps.close();
            DButil.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
