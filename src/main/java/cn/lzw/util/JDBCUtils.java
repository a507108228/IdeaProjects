package cn.lzw.util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author lzw
 * @version 2021/5/24 15:17
 */
public class JDBCUtils{
    public static Connection getConnection() throws Exception{
        //    读取配置文件的基本信息
        InputStream is = ClassLoader.getSystemClassLoader()
                .getResourceAsStream("jdbc.properties");

        Properties ps = new Properties();
        ps.load(is);

        String user = ps.getProperty("user");
        String password = ps.getProperty("password");
        String url = ps.getProperty("url");
        String driverClass = ps.getProperty("driverClass");

        //    加载驱动
        Class.forName(driverClass);

        //    获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    public static void closeResource(Connection conn, Statement ps){
        //    资源关闭
        if( ps != null ){
            try{
                ps.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if( conn != null ){
            try{
                conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

    }

    public static void closeResource(Connection conn, Statement ps, ResultSet resultSet){
        //    资源关闭
        if( resultSet != null ){
            try{
                resultSet.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
            if( ps != null ){
                try{
                    ps.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if( conn != null ){
                try{
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }


        }
    }
}
