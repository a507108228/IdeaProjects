package cn.lzw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author lzw
 * @version 2021/5/9 9:40
 */
public class TestJdbc{
    public static void main(String[] args) throws Exception{
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //用户信息和url  这三个可以换一种写法
        String url = "jdbc:mysql://localhost:3306/kkbdb?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String username = "root";
        String password = "201314";
//      Connection connection = DriverManager.getConnectionn(url:"jdbc:mysql://localhost:3306/kkbdb?useUnicode=true&characterEncoding=utf8&useSSL=true",uesr,"root",password:"201314");
        //连接成功 数据库对象
        Connection connection = DriverManager.getConnection(url,username,password);
        //执行SQL的对象Statement 执行sql对象
        Statement statement = connection.createStatement();
        //执行sql对象执行SQL 可能存在的结果，查看返回结果
        String sql = "select *from kkb_edu";
        //返回结果集
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            System.out.println("id="+resultSet.getObject("id"));
            System.out.println("userid="+resultSet.getObject("userid"));
            System.out.println("start="+resultSet.getObject("start"));
            System.out.println("end="+resultSet.getObject("end"));
            System.out.println("school="+resultSet.getObject("school"));
            System.out.println("study="+resultSet.getObject("study"));
            System.out.println("description="+resultSet.getObject("description"));
        }
        //释放连接
        resultSet.close();
        statement.close();
        connection.close();

    }
}
