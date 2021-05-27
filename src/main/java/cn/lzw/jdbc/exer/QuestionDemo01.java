package cn.lzw.jdbc.exer;

import cn.lzw.util.JDBCUtils;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


/**
 * @author lzw
 * @version 2021/5/25 16:59
 *<p>键盘录入数据 插入表中</p>
 */
public class QuestionDemo01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入ID：");
        int id = scanner.nextInt();
        System.out.print("请输入USERID：");
        int userid = scanner.nextInt();
        System.out.print("请输入爱好：");
        String keywords = scanner.next();

        String sql = "insert into kkb_skill(id,userid,keywords) values(?,?,?)";
        int update = update(sql,id,userid,keywords);

        if( update > 0 ){
            System.out.println("插入成功");
        }else {
            System.out.println("插入失败");
        }

        // scanner.close();
    }


    public static int update(String sql, Object... args){
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);

            //    填充占位符
            for( int i = 0; i < args.length; i++ ){
                ps.setObject(i + 1, args[i]);
            }

            // ps.execute();
            return ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, ps);
        }
        return 0;
    }

}
