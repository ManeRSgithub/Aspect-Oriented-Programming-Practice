package com.manerstech.aopDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manerstech.services.Transactions;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("/com/manerstech/resources/applicationContext.xml");
        Transactions transaction=(Transactions) context.getBean("transServices");
        transaction.transactionUsingUPI() ;
        System.out.println();
        transaction.transactionUsingMobileBanking();
        System.out.println();
        transaction.transactionUsingInternetBanking();
    }
}
