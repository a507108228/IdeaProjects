package cn.lzw.jdbc.durid;


import cn.lzw.util.JDBCUtils;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;



/**
 * @author lzw
 * @version 2021/5/28 9:56
 * <p>
 *     durid连接池
 * </p>
 */
public class DuridTest{

    @Test
    public void getConnection() throws Exception{
        Properties pros = new Properties();

        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");

        pros.load(is);

        DataSource ds = DruidDataSourceFactory.createDataSource(pros);

        Connection conn = ds.getConnection();

        System.out.println(conn);

    }


    @Test
    public void test(){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = JDBCUtils.getConnection1();

            String sql = "insert into kkb_skill values (?,?,?)";

            ps = conn.prepareStatement(sql);

            ps.setObject(1,1);
            ps.setObject(2,1);
            ps.setObject(3,"学习");

            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, ps);
        }


    }

}
