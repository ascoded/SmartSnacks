//DB connection file
package com.example.androidstudio;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    Connection con;
    String uname, pass, ip, port, database;
    @SuppressLint("NewApi")

    public Connection connectionclass(){
        ip = "";
        database = "";
        uname = "";
        pass = "";
        port = "";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectionURL = null;

        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectionURL = "jdbc:jtds:sqlsever//" + ip + ":" + port + ";" +"databasename=" + database + ";user=" + uname + ";password=" + pass + ";";
            connection = DriverManager.getConnection(ConnectionURL);
        }
        catch (Exception ex){
            Log.e ("Error", ex.getMessage());
        }
        return connection;
    }
}

