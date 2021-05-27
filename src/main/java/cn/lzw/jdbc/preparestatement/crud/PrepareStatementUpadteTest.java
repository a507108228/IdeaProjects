package cn.lzw.jdbc.preparestatement.crud;

import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.Properties;


/**
 * @author lzw
 * @version 2021/5/24 15:10
 *
 * 普通方式增删改
 */

public class PrepareStatementUpadteTest{

    //    添加一条记录
    @Test
    public void testInsert(){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            //    调用系统加载器
            InputStream is = ClassLoader.getSystemClassLoader()
                    .getResourceAsStream("jdbc.properties");
            Properties properties = new Properties();
            properties.load(is);

            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driverClass = properties.getProperty("driverClass");

            Class.forName(driverClass);

            //    获取连接
            conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);
            //    预编译sql语句
            String sql = "insert into kkb_skill(userid,keywords)values (?,?)";
            ps = conn.prepareStatement(sql);

            //    填充占位符
            ps.setInt(1, 2);
            ps.setString(2, "睡觉");

            //    执行sql
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            //    关闭资源
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


    //    删除操作
    @Test
    public void testDelete(){

        Connection conn = null;
        PreparedStatement ps = null;
        try{
            //    调用系统加载器
            InputStream is = ClassLoader.getSystemClassLoader()
                    .getResourceAsStream("jdbc.properties");
            Properties properties = new Properties();
            properties.load(is);

            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driverClass = properties.getProperty("driverClass");

            Class.forName(driverClass);

            //    获取连接
            conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);
            //    预编译sql语句
            String sql = "delete from kkb_skill where id = ?";
            ps = conn.prepareStatement(sql);

            //    填充占位符
            ps.setInt(1, 1);

            //    执行sql
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            //    关闭资源
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

    //    更新数据
    @Test
    public void testUpdate2(){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");

            Properties properties = new Properties();
            properties.load(is);

            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            String driverClass = properties.getProperty("driverClass");

            Class.forName(driverClass);

            conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);


            String sql = "update kkb_skill set id = ? where keywords = ?";
            ps = conn.prepareStatement(sql);

            ps.setInt(1, 4);
            ps.setString(2,"睡觉");

            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
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
