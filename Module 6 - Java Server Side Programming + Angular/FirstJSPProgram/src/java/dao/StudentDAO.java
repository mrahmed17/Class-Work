
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql="";
    
    
    public static int saveStudent(){
    
        sql="insert into student (name, email, address, cell) values(?,?,?,?)";
        return 0;
    
    } 
    
    
}
