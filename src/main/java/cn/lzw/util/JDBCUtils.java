package cn.lzw.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.DbUtils;

import javax.sql.DataSource;
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


    /**
     * 使用Druid数据库连接池技术
     */
    private static DataSource source1;
    static{
        try {
            Properties pros = new Properties();

            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");

            pros.load(is);

            source1 = DruidDataSourceFactory.createDataSource(pros);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection1() throws SQLException{

        Connection conn = source1.getConnection();
        return conn;
    }


    /**
     * @author: a5071
     * @time: 2021/5/28 14:32
     *<p>
     *     关闭操作
     */
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


    /**
     * @author: a5071
     * @time: 2021/5/28 14:42
     *<p>
     *
     */
    public static void closeResource1(Connection conn,Statement ps,ResultSet rs){

        DbUtils.closeQuietly(conn);
        DbUtils.closeQuietly(ps);
        DbUtils.closeQuietly(rs);
    }
}
