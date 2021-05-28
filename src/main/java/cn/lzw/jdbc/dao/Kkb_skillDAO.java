package cn.lzw.jdbc.dao;

import cn.lzw.jdbc.bean.Kkb_skill;

import java.sql.Connection;

import java.util.List;

/**
 * @author lzw
 * @version 2021/5/27 16:30
 */

public interface Kkb_skillDAO{

    void insert(Connection conn, Kkb_skill skill);

    void delete(Connection conn, int id);

    void update(Connection conn, Kkb_skill skill);

    Kkb_skill getKkbById(Connection conn, int id);

    List< Kkb_skill > getAll(Connection conn);

    Long getCount(Connection conn);

    Integer getMaxUserid(Connection conn);

}
