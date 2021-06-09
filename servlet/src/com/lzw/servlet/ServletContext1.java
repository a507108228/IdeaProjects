package com.lzw.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: a5071
 * @version: 2021/6/8 16:12
 */
public class ServletContext1 extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{


        ServletContext context = getServletConfig().getServletContext();
        //    获取xml里面的配置参数
        String name = context.getInitParameter("name");
        System.out.println("name:"+name);
        //    获取当前的工程路径
        System.out.println("当前路径："+context.getContextPath());
        //    获取当前的绝对路径
        System.out.println("绝对路径："+context.getRealPath("/"));
    }
}
