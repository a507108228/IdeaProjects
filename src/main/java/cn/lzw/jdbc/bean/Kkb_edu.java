package cn.lzw.jdbc.bean;

/**
 * @author lzw
 * @version 2021/5/25 14:46
 */
public class Kkb_edu{

    private int id;
    private int userid;
    private String start;
    private String end;
    private String school;
    private String study;
    private String description;

    public Kkb_edu(){
        super();
    }

    public Kkb_edu(int id, int userid, String start
            , String end, String school
            , String study, String description){
        super();
        this.id = id;
        this.userid = userid;
        this.start = start;
        this.end = end;
        this.school = school;
        this.study = study;
        this.description = description;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getUserid(){
        return userid;
    }

    public void setUserid(int userid){
        this.userid = userid;
    }

    public String getStart(){
        return start;
    }

    public void setStart(String start){
        this.start = start;
    }

    public String getEnd(){
        return end;
    }

    public void setEnd(String end){
        this.end = end;
    }

    public String getSchool(){
        return school;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public String getStudy(){
        return study;
    }

    public void setStudy(String study){
        this.study = study;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return "Kkb_edu{" +
                "id=" + id +
                ", userid=" + userid +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", school='" + school + '\'' +
                ", study='" + study + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
