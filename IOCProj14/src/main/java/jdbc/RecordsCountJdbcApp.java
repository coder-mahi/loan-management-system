package jdbc;

import java.beans.Statement;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class RecordsCountJdbcApp {
    public static void main(String[] args) throws Exception{
        InputStream is = new FileInputStream("src/main/java/commons/DBDetails.properties");
        Properties props = new Properties();
        props.load(is);

    
        Class.forName(props.getProperty("jdbc.driver"));
        Connection con = DriverManager.getConnection(props.getProperty("jdbc.url"), props.getProperty("db.user"), props.getProperty("db.pwd"));

        java.sql.Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select count(*) from student");

        int cnt = 0;
        if(rs.next()){
            cnt = rs.getInt(1);
        }
        System.out.println("Records count"+cnt);

        rs.close();
        stmt.close();
        con.close();

    }
}
