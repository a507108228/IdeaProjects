package cn.lzw.jdbc.preparestatement.crud;

import cn.lzw.jdbc.bean.Kkb_skill;
import cn.lzw.util.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author lzw
 * @version 2021/5/24 17:15
 * <p>
 *     封装的工具增删改 查
 */
public class PrepareStatementCURD{

    //    普通查询 具体的表的普通查询
    @Test
    public void testSelect(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try{
            conn = JDBCUtils.getConnection();

            String sql = "select id,userid,keywords from kkb_skill where id = ?; ";
            ps = conn.prepareStatement(sql);

            ps.setObject(1,1);

            //    返回结果集
            resultSet = ps.executeQuery();
            //    判断下一条是否有数据 如果有数据 返回true
            if( resultSet.next() ){
                //    获取数据的字段值
                int id = resultSet.getInt(1);
                int userid = resultSet.getInt(2);
                String keywords = resultSet.getString(3);

                // Object[] objects = new Object[]{id,userid,keywords};
                // for( int i = 0; i < objects.length; i++ ){
                //     System.out.println(objects[i]);
                // }
                Kkb_skill kkb_skill = new Kkb_skill(id, userid, keywords);
                System.out.println(kkb_skill);

            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,ps,resultSet);
        }
    }




    //    封装的jdbc工具 插入数据
    @Test
    public void testInsert(){
        Connection conn1 = null;
        PreparedStatement ps1 = null;
        try{
            conn1 = JDBCUtils.getConnection();

            String sql = "insert into kkb_edu(userid,start,end,school,study,description)" +
                    "values (?,?,?,?,?,?)";
            ps1 = conn1.prepareStatement(sql);

            ps1.setInt(1,2);
            ps1.setString(2,"2000年3月18日");
            ps1.setString(3,"2004年6月18日");
            ps1.setString(4,"火星大学");
            ps1.setString(5,"宇宙工程");
            ps1.setString(6,"无");

            ps1.execute();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn1,ps1);
        }
    }



    //    删除数据
    @Test
    public void testDelete() throws Exception{
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = JDBCUtils.getConnection();

            String sql = "delete from kkb_skill where id = ?";
            ps = conn.prepareStatement(sql);

            ps.setObject(1,5);

            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,ps);
        }
    }



    //    更新数据
    @Test
    public void testUpdate() throws Exception{
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = JDBCUtils.getConnection();

            String sql = "update kkb_skill set id = ? where keywords = ?";
            ps = conn.prepareStatement(sql);

            ps.setObject(1,1);
            ps.setObject(2,"睡觉");

            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,ps);
        }
    }
}
