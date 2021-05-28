package cn.lzw.jdbc.durid;

import cn.lzw.jdbc.bean.Kkb_skill;
import cn.lzw.util.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author lzw
 * @version 2021/5/28 14:48
 * <p>
 * 别人封装的增删改查的工具类
 * </p>
 */
public class QueryUpdate{


    /**
     * @author: a5071
     * @time: 2021/5/28 14:57
     * <p>
     * 更新一条数据
     */
    @Test
    public void test(){

        Connection conn = null;
        try{
            QueryRunner qr = new QueryRunner();
            conn = JDBCUtils.getConnection1();
            String sql = "update kkb_skill set id = ? where userid = ?";
            int update = qr.update(conn, sql, 5, 6);
            System.out.println(update);
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource1(conn, null, null);
        }
    }


    /**
     * @author: a5071
     * @time: 2021/5/28 14:58
     * <p>
     * 查询操作
     */
    @Test
    public void test1(){
        Connection conn = null;
        try{
            QueryRunner qr = new QueryRunner();
            conn = JDBCUtils.getConnection1();
            String sql = "select *from kkb_skill where id = ?";

            BeanHandler< Kkb_skill > handler = new BeanHandler<>(Kkb_skill.class);
            Kkb_skill query = qr.query(conn, sql, handler, 1);
            System.out.println(query);
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource1(conn, null, null);
        }
    }


    /**
     * @author: a5071
     * @time: 2021/5/28 15:06
     * <p>
     * 返回多条数据
     */
    @Test
    public void test2(){
        Connection conn = null;

        try{
            QueryRunner qr = new QueryRunner();
            conn = JDBCUtils.getConnection1();

            BeanListHandler< Kkb_skill > listHandler = new BeanListHandler<>(Kkb_skill.class);
            String sql = "select *from kkb_skill where id < ?";

            List< Kkb_skill > query = qr.query(conn, sql, listHandler, 10);

            System.out.println(query);
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource1(conn, null, null);
        }

    }

    /**
     * @author: a5071
     * @time: 2021/5/28 15:38
     * <p>
     * 查询特殊的sql
     */
    @Test
    public void test3(){
        Connection conn = null;

        try{
            QueryRunner qr = new QueryRunner();
            conn = JDBCUtils.getConnection1();

            ScalarHandler scalarHandler = new ScalarHandler();
            String sql = "select count(*) from kkb_skill";

            Object query = qr.query(conn, sql, scalarHandler);

            System.out.println(query);
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource1(conn, null, null);
        }
    }


    /**
     * @author: a5071
     * @time: 2021/5/28 15:38
     * <p>
     * 结果放入maplist里
     */
    @Test
    public void test4(){
        Connection conn = null;

        try{
            QueryRunner qr = new QueryRunner();
            conn = JDBCUtils.getConnection1();

            MapListHandler mapListHandler = new MapListHandler();
            String sql = "select *from kkb_skill where id < ?";

            List< Map< String, Object > > query = qr.query(conn, sql, mapListHandler, 10);

            query.forEach(System.out::println);
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource1(conn, null, null);
        }
    }


}
