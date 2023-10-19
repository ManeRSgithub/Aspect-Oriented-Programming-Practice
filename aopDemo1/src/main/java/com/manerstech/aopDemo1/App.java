package com.manerstech.aopDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manerstech.services.TransactionServices;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("/com/manerstech/resources/applicationContext.xml");
        TransactionServices ts=(TransactionServices) context.getBean("TransServiceId");
        ts.TransactionUsingUPI();
        System.out.println("------------------------------------------------");
        ts.TransactionUsingMobileBanking();
        System.out.println("------------------------------------------------");
        ts.TransactionUsingInternetBanking();
    }
}
