package com.lzw.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author: a5071
 * @version: 2021/6/8 9:45
 * servlet learn
 */
public class HelloServlet implements Servlet{
    public HelloServlet(){
        System.out.println("1.构造器方法");
    }


    @Override
    public void init(ServletConfig servletConfig) throws ServletException{
        System.out.println("2.init初始化方法");
        System.out.println("servletConfig.getServletName()获取别名:"+servletConfig.getServletName());
        System.out.println("获取初始化参数："+servletConfig.getInitParameter("age"));
        System.out.println("获取初始化参数："+servletConfig.getInitParameter("name"));

    }

    @Override
    public ServletConfig getServletConfig(){
        return null;
    }

    /**
     * @author: a5071
     * @time: 2021/6/8 9:56
     *<p>
     *     专门用来处理请求和响应的
     *     请求分发处理
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException{
        System.out.println("3.hello servlet 被访问了！");
        //    类型转换
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        //    获取请求方式
        String method = httpServletRequest.getMethod();
        System.out.println(method);

        if( "GET".equals(method) ){
            doGet();
        } else {
            doPost();
        }
    }

    /**
     * @author: a5071
     * @time: 2021/6/8 10:48
     *<p>
     *     做get请求的操作
     */
    public void doGet(){
        System.out.println("get 请求");
        System.out.println("get 请求");
    }

    /**
     * @author: a5071
     * @time: 2021/6/8 10:49
     *<p>
     *     post请求
     */
    public void doPost(){
        System.out.println("post 请求");
        System.out.println("post 请求");
    }

    @Override
    public String getServletInfo(){
        return null;
    }

    @Override
    public void destroy(){
        System.out.println("4.servlet被销毁了");

    }
}
