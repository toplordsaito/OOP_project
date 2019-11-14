/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author waruwat
 */
public class Db_connect {
    public static Connection getConnection() {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://192.168.99.100:3306/keeplearning", "root", "keep1234");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("x");
            return null;
        }
    }
    public static void executeSQlQuery(String query, String message) {
        Connection con = new Db_connect().getConnection();
        Statement st;
        try {
            st = con.createStatement();
            if ((st.executeUpdate(query)) == 1) {
                // refresh jtable data
                System.out.println("OK");

                JOptionPane.showMessageDialog(null, "Data " + message + " Succefully");
            } else {
                JOptionPane.showMessageDialog(null, "Data Not " + message);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
