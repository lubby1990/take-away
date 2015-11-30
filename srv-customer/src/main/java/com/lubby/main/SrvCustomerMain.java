package com.lubby.main;

import com.lubby.bean.Customer;
import com.lubby.dao.CustomerMapper;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by lubby on 2015/10/1.
 * 启动用户平台服务的主函数
 */
public class SrvCustomerMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
//        Customer customer = (Customer) context.getBean("customer");
//        PropertyPlaceholderConfigurer propertyConfigurer = (PropertyPlaceholderConfigurer)context.getBean("propertyConfigurer");
//
//        System.out.println(propertyConfigurer.getOrder());
        CustomerMapper customerMapper = (CustomerMapper) context.getBean("customerMapper");
        Customer customer = customerMapper.getCustomerById(1);
        System.out.println(customer);
    }
}
