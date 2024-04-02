/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBCon;

/**
 *
 * @author User
 */
public class DatabaseConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DBCon con=new DBCon();
        String sql="insert into student (roll,name,age) values(?,?,?)";
        
        try {
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            ps.setInt(1, 1271696);
            ps.setString(2, "K M Saifullah");
            ps.setInt(3, 25);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ok");
    }
    
}
