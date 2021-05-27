package cn.lzw.jdbc.blob;

import java.sql.Blob;

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
    private byte photo;

    public Student(int flowid, String studentname, Blob photo){
        super();
    }

    public Student(int flowid, int type, String idcard, String examcard, String studentname, String location, int grade ,byte photo){
        super();
        this.flowid = flowid;
        this.type = type;
        this.idcard = idcard;
        this.examcard = examcard;
        this.studentname = studentname;
        this.location = location;
        this.grade = grade;
        this.photo = photo;
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

    public byte getPhoto(){
        return photo;
    }

    public void setPhoto(byte photo){
        this.photo = photo;
    }

    @Override
    public String toString(){
        return "flowid=" + "\t" + flowid + "\n" +
                "type=" + "\t" + type + "\n" +
                "idcard=" + "\t" + idcard + "\n" +
                "examcard=" + "\t" + examcard + "\n" +
                "studentname=" + "\t" + studentname + "\n" +
                "location=" + "\t" + location + "\n" +
                "grade=" + "\t" + grade + "\n"+
                "photo="+"\t"+ photo+"\n";

    }
}

