package cn.lzw.jdbc.preparestatement.crud;


import cn.lzw.jdbc.bean.Kkb_edu;
import cn.lzw.jdbc.bean.Kkb_skill;
import cn.lzw.util.JDBCUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.*;

/**
 * @author lzw
 * @version 2021/5/25 14:30
 *<p>针对不同表的通用查询</p>
 *
 */
public class PrepareStatementQueryTest{


    @Test
    public void test(){
        String sql = "select id,userid,keywords from kkb_skill where id = ?";
        Object instance = getInstance(Kkb_skill.class, sql, 1);
        System.out.println(instance);

        String sql1 = "select * from kkb_edu where id = ?";
        Kkb_edu instance1 = getInstance(Kkb_edu.class, sql1, 2);
        System.out.println(instance1);


    }

    public <T> T getInstance(Class<T> clazz ,String sql , Object...args){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = JDBCUtils.getConnection();

            ps = conn.prepareStatement(sql);

            for( int i = 0; i < args.length; i++ ){
                ps.setObject(i+1,args[i]);
            }

            rs = ps.executeQuery();

            //    获取结果集的元素据
            ResultSetMetaData rsmd = rs.getMetaData();

            //    获取结果集中的列数
            int columnCount = rsmd.getColumnCount();

            if( rs.next() ){
                T t = clazz.newInstance();
                //    获取列的个数
                for( int i = 0; i < columnCount; i++ ){
                    Object values = rs.getObject(i + 1);
                    //    获取每个列的列名
                    String columnName = rsmd.getColumnLabel(i + 1);

                    Field field = clazz.getDeclaredField(columnName);

                    field.setAccessible(true);
                    field.set(t,values);
                }
                return t;
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,ps,rs);
        }
        return null;

    }

}
