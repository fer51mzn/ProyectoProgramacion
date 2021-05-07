package com.piramide.db;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

public class DBConnectionORM {

    private static DBConnectionORM dbConnection = null;
    private ConnectionSource connection = null;

    public DBConnectionORM() throws SQLException {
        //datos personalizados para cada BD, usuario, etc.
        String user = "admin";
        String password = "admin";
        String host = "80.34.34.150";
        String port = "33063";
        String database = "tenis";
        connection = new JdbcConnectionSource("jdbc:mysql://"+ host +":"+port+"/"+database+"?"+"user="+user+"&password="+password,user,password);
    }

    public static ConnectionSource getInstance() throws SQLException{
        if(dbConnection == null){
            dbConnection = new DBConnectionORM();
        }
        return dbConnection.connection;
    }


}