package com.piramide.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionSQL {

    private static DBConnectionSQL dbConnectionSQL = null;
    private Connection connection = null;

    public DBConnectionSQL() throws SQLException {
        //datos personalizados para cada BD, usuario, etc.
        String user = "admin";
        String password = "admin";
        String host = "80.34.34.150";
        String port = "33063";
        String database = "tenis";

        connection = DriverManager.getConnection("jdbc:mysql://"+ host +":"+port+"/"+database+"?"+"user="+user+"&password="+password,user,password);
    }

    public static Connection getInstance() throws SQLException{
        if(dbConnectionSQL == null){
            dbConnectionSQL = new DBConnectionSQL();
        }
        return dbConnectionSQL.connection;
    }

}
