package cn.lzw.jdbc.dao;

import cn.lzw.jdbc.bean.Kkb_skill;

import java.sql.Connection;
import java.util.List;

/**
 * @author lzw
 * @version 2021/5/27 16:37
 */

public class Kkb_skillDAOImp extends BaseDAO implements Kkb_skillDAO{

    @Override
    public void insert(Connection conn, Kkb_skill skill){
        String sql = "insert into kkb_skill(id,userid,keywords) values(?,?,?)";
        update(conn,sql,skill.getId(),skill.getUserid(),skill.getKeywords());
    }

    @Override
    public void delete(Connection conn, int id){
        String sql = "delete from kkb_skill where id = ?";
        update(conn,sql,id);
    }

    @Override
    public void update(Connection conn, Kkb_skill skill){
        String sql = "update kkb_skill set userid = ? where id = ?  ";
        update(conn,sql,skill.getUserid(),skill.getId());
    }

    @Override
    public Kkb_skill getKkbById(Connection conn, int id){
        String sql = "select *from kkb_skill where id = ?";
        Kkb_skill instance = getInstance(conn, Kkb_skill.class, sql, id);
        return instance;
    }

    @Override
    public List< Kkb_skill > getAll(Connection conn){
        String sql = "select *from kkb_skill";
        List< Kkb_skill > forList = getForList(conn, Kkb_skill.class, sql);
        return forList;
    }

    @Override
    public Long getCount(Connection conn){
        String sql = "select count(*) from kkb_skill";
        return getValue(conn,sql);
    }

    @Override
    public Integer getMaxUserid(Connection conn){
        String sql = "select max(userid) from kkb_skill ";
        return getValue(conn, sql);
    }
}
