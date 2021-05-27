package cn.lzw.jdbc.exer;

import cn.lzw.jdbc.preparestatement.crud.UniversalCURD;
import cn.lzw.util.JDBCUtils;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.Scanner;

/**
 * @author lzw
 * @version 2021/5/26 17:50
 * <p>
 *     针对一个表的增删改查
 * 请选择您要输入的类型：
 * a.准考证号
 * b.身份证号       进行查询
 * </p>
 */

class Student{
    private int flowid;
    private int type;
    private String idcard;
    private String examcard;
    private String studentname;
    private String location;
    private int grade;

    public Student(){
        super();
    }

    public Student(int flowid, int type, String idcard, String examcard, String studentname, String location, int grade){
        super();
        this.flowid = flowid;
        this.type = type;
        this.idcard = idcard;
        this.examcard = examcard;
        this.studentname = studentname;
        this.location = location;
        this.grade = grade;
    }

    public int getFlowid(){
        return flowid;
    }

    public void setFlowid(int flowid){
        this.flowid = flowid;
    }

    public int getType(){
        return type;
    }

    public void setType(int type){
        this.type = type;
    }

    public String getIdcard(){
        return idcard;
    }

    public void setIdcard(String idcard){
        this.idcard = idcard;
    }

    public String getExamcard(){
        return examcard;
    }

    public void setExamcard(String examcard){
        this.examcard = examcard;
    }

    public String getStudentname(){
        return studentname;
    }

    public void setStudentname(String studentname){
        this.studentname = studentname;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "flowid=" + "\t" + flowid + "\n" +
                "type=" + "\t" + type + "\n" +
                "idcard=" + "\t" + idcard + "\n" +
                "examcard=" + "\t" + examcard + "\n" +
                "studentname=" + "\t" + studentname + "\n" +
                "location=" + "\t" + location + "\n" +
                "grade=" + "\t" + grade + "\n";
    }
}

public class Question03{
    public static void main(String[] args){
        System.out.println("请选择您要输入的类型：");
        System.out.println("a.准考证号");
        System.out.println("b.身份证号");
        System.out.println("c.删除操作");
        System.out.println("d.增加操作");
        System.out.println("e.修改操作");
        System.out.print("您的选择为：");
        Scanner sc = new Scanner(System.in);
        String selection = sc.next();
        if( "a".equalsIgnoreCase(selection) ){
            System.out.print("请输入准考证号：");
            String examcard = sc.next();
            String sql = "select *from examstu where examcard = ?";
            Student instance = getInstance(Student.class, sql, examcard);
            if( instance != null ){
                System.out.println(instance);
            } else {
                System.out.println("false");
            }
        } else if( "b".equalsIgnoreCase(selection) ){
            System.out.print("请输入身份证号：");
            String idcard = sc.next();
            String sql0 = "select *from examstu where idcard = ?";
            Student instance = getInstance(Student.class, sql0, idcard);
            if( instance != null ){
                System.out.println(instance);
            } else {
                System.out.println("false");
            }

        } else if( "c".equalsIgnoreCase(selection) ){
            System.out.print("请输入学生的姓名：");
            String studentname = sc.next();
            String sql1 = "delete from examstu where studentname = ?";
            UniversalCURD uni = new UniversalCURD();
            int update = uni.update(sql1, studentname);
            if( update > 0 ){
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else if( "d".equalsIgnoreCase(selection) ){
            System.out.print("请添加信息：");
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

            String sql2 = "insert into examstu values(?,?,?,?,?,?,?)";
            UniversalCURD uni = new UniversalCURD();
            int update1 = uni.update(sql2, flowid, type, idcard, examcard, studentname, location, grade);
            if( update1 == 0 ){
                System.out.println("插入成功");
            } else {
                System.out.println("插入失败");
            }
        } else if( "e".equalsIgnoreCase(selection) ){
            System.out.print("请输入要修改的字段：");
            String i = sc.next();
            UniversalCURD uni = new UniversalCURD();

            switch (i) {
                case "flowid":
                    System.out.print("请输入修改的flowid：");
                    int flowid = sc.nextInt();
                    System.out.print("请输入studentname列:");
                    String studentname = sc.next();
                    String sql3 = "update examstu set flowid = ? where studentname = ? ";
                    int update = uni.update(sql3, flowid, studentname);
                    if( update == 0 ){
                        System.out.println("更新成功");
                    } else {
                        System.out.println("更新失败");
                    }
                    break;

                case "type":
                    System.out.print("请输入修改的type：");
                    int type = sc.nextInt();
                    System.out.print("请输入studentname列:");
                    String studentname1 = sc.next();
                    String sql4 = "update examstu set type = ? where studentname = ? ";
                    int update1 = uni.update(sql4, type, studentname1);
                    if( update1 == 0 ){
                        System.out.println("更新成功");
                    } else {
                        System.out.println("更新失败");
                    }
                    break;
                case "idcard":
                    System.out.print("请输入修改的idcard：");
                    String idcard = sc.next();
                    System.out.print("请输入studentname列:");
                    String studentname2 = sc.next();
                    String sql5 = "update examstu set idcard = ? where studentname = ? ";
                    int update2 = uni.update(sql5, idcard, studentname2);
                    if( update2 == 0 ){
                        System.out.println("更新成功");
                    } else {
                        System.out.println("更新失败");
                    }

                    break;
                case "examcard":
                    System.out.print("请输入修改的examcard：");
                    String examcard = sc.next();
                    System.out.print("请输入studentname列:");
                    String studentname3 = sc.next();
                    String sql6 = "update examstu set examcard = ? where studentname = ? ";
                    int update3 = uni.update(sql6, examcard, studentname3);
                    if( update3 == 0 ){
                        System.out.println("更新成功");
                    } else {
                        System.out.println("更新失败");
                    }
                    break;
                case "studentname":
                    System.out.print("请输入修改的studentname：");
                    String studentname4 = sc.next();
                    System.out.print("请输入flowid列:");
                    int flowid1 = sc.nextInt();
                    String sql7 = "update examstu set studentname = ? where flowid = ? ";
                    int update4 = uni.update(sql7, studentname4, flowid1);
                    if( update4 == 0 ){
                        System.out.println("更新成功");
                    } else {
                        System.out.println("更新失败");
                    }
                    break;
                case "location":
                    System.out.print("请输入修改的location：");
                    String location = sc.next();
                    System.out.print("请输入studentname列:");
                    String studentname5 = sc.next();
                    String sql8 = "update examstu set location = ? where studentname = ? ";
                    int update5 = uni.update(sql8, location, studentname5);
                    if( update5 == 0 ){
                        System.out.println("更新成功");
                    } else {
                        System.out.println("更新失败");
                    }

                    break;
                case "grade":
                    System.out.print("请输入修改的grade：");
                    int grade = sc.nextInt();
                    System.out.print("请输入studentname列:");
                    String studentname6 = sc.next();
                    String sql9 = "update examstu set grade = ? where studentname = ? ";
                    int update6 = uni.update(sql9, grade, studentname6);
                    if( update6 == 0 ){
                        System.out.println("更新成功");
                    } else {
                        System.out.println("更新失败");
                    }

                    break;
                default:
                    System.out.println("拜拜了您嘞！");
                    break;
            }

        } else {
            System.out.println("您的输入有误！");
        }
        sc.close();
    }

    public static < T > T getInstance(Class< T > clazz, String sql, Object... args){

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);

            for( int i = 0; i < args.length; i++ ){
                ps.setObject(i + 1, args[i]);
            }

            //    获取结果集
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
                    field.set(t, values);
                }
                return t;
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, ps, rs);
        }
        return null;
    }

}
