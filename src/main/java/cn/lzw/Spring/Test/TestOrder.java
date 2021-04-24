package cn.lzw.Spring.Test;


import cn.lzw.Spring.Order;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lzw
 * @version 2021/4/24 17:23
 */
public class TestOrder{
    @Test
    public void textOrder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Order order = context.getBean("order",Order.class);

        System.out.println(order);
        order.testOrder();
    }


}
