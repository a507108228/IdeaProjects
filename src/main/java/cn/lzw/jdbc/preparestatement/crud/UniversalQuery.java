package cn.lzw.jdbc.preparestatement.crud;


import cn.lzw.jdbc.bean.Kkb_skill;
import cn.lzw.util.JDBCUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * @author lzw
 * @version 2021/5/25 7:58
 *  通用查询
 */
public class UniversalQuery{

    @Test
    public void testqueryForKkb_skill(){
        String sql = "select id,userid,keywords from kkb_skill where keywords = ?";
        Kkb_skill k1 = queryForKkb_skill(sql,"睡觉");
        Kkb_skill k2 = queryForKkb_skill(sql, "学习");

        System.out.println(k1);
        System.out.println(k2);
    }

    public Kkb_skill queryForKkb_skill(String sql , Object...args){

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

            //    获取结果集的元数据
            ResultSetMetaData rsmd = rs.getMetaData();

            //    获取结果集中的列数
            int columnCount = rsmd.getColumnCount();

            if( rs.next() ){
                Kkb_skill kksk = new Kkb_skill();
                for( int i = 0; i < columnCount; i++ ){
                    Object values = rs.getObject(i + 1);
                    //    获取每个列的列名
                    String columnName = rsmd.getColumnLabel(i + 1);

                    Field field = Kkb_skill.class.getDeclaredField(columnName);

                    field.setAccessible(true);
                    field.set(kksk,values);
                }
                return kksk;
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,ps,rs);
        }
        return null;

    }
}
