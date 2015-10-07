package com.lubby.main;

import com.lubby.bean.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lubby on 2015/10/1.
 * �����û�ƽ̨�����������
 */
public class SrvCustomer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring.xml"});
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);
    }
}
