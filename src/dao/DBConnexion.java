/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;

/**
 *
 * @author M@nU_LP
 */
public class DBConnexion {
    protected String dbName;
    protected String user;
    protected String password;

    public DBConnexion(String dbName, String user, String password) {
        this.dbName = dbName;
        this.user = user;
        this.password = password;
    }
    
    // Créer une connection
    public Connection connectToDB() throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/" 
                                                + this.getDbName(), this.getUser(), this.getPassword());
        return conn;
    }
    
    

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
