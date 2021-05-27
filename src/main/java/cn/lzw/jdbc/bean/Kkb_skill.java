package cn.lzw.jdbc.bean;

/**
 * @author lzw
 * @version 2021/5/25 8:12
 */
public class Kkb_skill{
    private int id;
    private int userid;
    private String keywords;

    public Kkb_skill(){
        super();
    }

    public Kkb_skill(int id, int userid, String keywords){
        super();
        this.id = id;
        this.userid = userid;
        this.keywords = keywords;
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

    public String getKeywords(){
        return keywords;
    }

    public void setKeywords(String keywords){
        this.keywords = keywords;
    }

    @Override
    public String toString(){
        return "Kkb_skill{" +
                "id=" + id +
                ", userid=" + userid +
                ", keywords='" + keywords + '\'' +
                '}';
    }
}
