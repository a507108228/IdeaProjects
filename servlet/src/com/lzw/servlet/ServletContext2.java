package com.lzw.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: a5071
 * @version: 2021/6/8 16:33
 */
public class ServletContext2 extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ServletContext context = getServletContext();

        System.out.println("保存之前context中获取数据key1值为："+context.getAttribute("key1"));

        context.setAttribute("key1","value1");

        System.out.println("context中获取数据key1值为："+context.getAttribute("key1"));

    }
}
