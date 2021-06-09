package com.lzw.servletmethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: a5071
 * @version: 2021/6/9 9:13
 */
public class RequestMethod extends HttpServlet{
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("getRequestURI:"+req.getRequestURI());
        System.out.println("getRequestURL:"+req.getRequestURL());
        System.out.println("getContextPath:"+req.getAuthType());
        System.out.println("getContextPath:"+req.getContextPath());
        System.out.println("getMethod:"+req.getMethod());
        System.out.println("getPathInfo:"+req.getPathInfo());
        System.out.println("客户端ip地址：getRemoteHost:"+req.getRemoteHost());
        System.out.println("getParameter:"+req.getParameter("name"));
        System.out.println("getCookies:"+req.getCookies());
        System.out.println("getHttpServletMapping:"+req.getHttpServletMapping());

        System.out.println("getHeader:"+req.getHeader("User-Agent"));
        System.out.println("getHeaderNames:"+req.getHeaderNames());
        System.out.println("getAttribute:"+req.getAttribute("/rm"));

    }
}
