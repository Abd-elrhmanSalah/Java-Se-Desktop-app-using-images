/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Salah
 */
import javax.swing.*;
import java.sql.*;

public class javaConnection {

    static Connection conn = null;

    public static Connection ConnecrDB() {
        try {
            String unicode = "?useUnicode=yes&characterEncoding=UTF-8";

            String drivername = "com.mysql.jdbc.Driver";
            Class.forName(drivername);

               String ServerName = "128.16.11.25";
            //String ServerName = "localhost";
            String ServerPort = "3306";
            String dbname = "prescription_db";

            String url = "jdbc:mysql://" + ServerName + ":" + ServerPort + "/" + dbname + unicode;
            String username = "user1";
            String Password = "123";

            conn = DriverManager.getConnection(url, username, Password);
            return conn;

        } catch (Exception ex) {
          ex.printStackTrace();
        }
        return null;

    }

}
