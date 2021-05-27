package cn.lzw.jdbc.exer;

import cn.lzw.util.JDBCUtils;

import javax.lang.model.element.NestingKind;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class Question02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入流水号：");
        int flowid = sc.nextInt();
        System.out.print("请输入四级/六级：");
        int type = sc.nextInt();
        System.out.print("请输入身份证号码：");
        String idcard = sc.next();
        System.out.print("请输入准考证号码：");
        String examcard = sc.next();
        System.out.print("请输入学生姓名：");
        String studentname = sc.next();
        System.out.print("请输入区域：");
        String location = sc.next();
        System.out.print("请输入成绩：");
        int grade = sc.nextInt();

        String sql = "insert into examstu values(?,?,?,?,?,?,?)";
        int update = update(sql, flowid, type, idcard, examcard, studentname, location, grade);

        if( update > 0 ){
            System.out.println("恭喜您，插入成功");
        } else {
            System.out.println("很遗憾，插入失败");
        }

        sc.close();
    }

    public static int update(String sql, Object... args){

        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);

            for( int i = 0; i < args.length; i++ ){
                ps.setObject(i + 1, args[i]);
            }

            return ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, ps);
        }
        return 0;
    }

}
