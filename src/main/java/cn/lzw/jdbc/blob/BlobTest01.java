package cn.lzw.jdbc.blob;

import cn.lzw.util.JDBCUtils;
import org.junit.Test;

import java.io.*;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 * @author lzw
 * @version 2021/5/27 10:36
 * <p>
 * 测试使用preparestatement 操作blob数据
 * 使用了 io 管道流 字符输入输出流 文件复制
 * 封装工具 查询 插入
 * </p>
 */
public class BlobTest01{

    //    插入blob
    @Test
    public void testInsert(){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = JDBCUtils.getConnection();

            String sql = "insert into examstu(flowid,studentname,grade,photo) values (?,?,?,?)";
            ps = conn.prepareStatement(sql);

            ps.setObject(1, 3);
            ps.setObject(2, "李梓玮");
            ps.setObject(3, 500);
            BufferedInputStream bs = new BufferedInputStream(new FileInputStream(new File("3f509a76696595783c07814d8164db24.jpg")));

            ps.setBlob(4, bs);

            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, ps);
        }
    }

    //    查询blob
    @Test
    public void testSelect(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        InputStream bs = null;
        BufferedOutputStream bos = null;
        try{
            conn = JDBCUtils.getConnection();
            String sql = "select *from examstu where flowid = ?";

            ps = conn.prepareStatement(sql);

            ps.setObject(1, 3);

            rs = ps.executeQuery();

            if( rs.next() ){
                int flowid = rs.getInt("flowid");
                String studentname = rs.getString("studentname");
                Blob photo = rs.getBlob("photo");
                Student stu = new Student(flowid, studentname, photo);
                System.out.println(stu);

                bs = photo.getBinaryStream();
                bos = new BufferedOutputStream(new FileOutputStream("3f509a76696595783c07814d8164db241.jpg"));


                byte[] bytes = new byte[1024];
                int len;
                while( (len = bs.read(bytes)) != -1 ){
                    bos.write(bytes, 0, len);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try{
                bos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            try{
                bs.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            JDBCUtils.closeResource(conn, ps, rs);
        }
    }

}
