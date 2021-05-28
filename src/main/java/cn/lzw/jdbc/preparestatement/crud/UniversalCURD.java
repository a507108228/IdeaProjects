package cn.lzw.jdbc.preparestatement.crud;

import cn.lzw.util.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author lzw
 * @version 2021/5/24 20:01
 * <p>
 *     使用了封装工具的通用的增删改
 */
public class UniversalCURD{

    //    删除
    @Test
    public void testDelete(){

        String sql = "delete from kkb_skill where id = ?";
        update(sql,3);
    }

    //    增加
    @Test
    public void testInsert(){
        String sql = "insert into kkb_skill values(?,?,?)";
        update(sql,3,3,"学习");
    }

    //    修改

    @Test
    public void testUpdate(){
        String sql = "update kkb_skill set userid = ? where id = ?";
        update(sql,1,1);
    }


    public int update(String sql , Object ...args){

        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);

            for( int i = 0; i < args.length; i++ ){
                ps.setObject(i+1,args[i]);
            }

            ps.execute();

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,ps);
        }
        return 0;
    }
}
