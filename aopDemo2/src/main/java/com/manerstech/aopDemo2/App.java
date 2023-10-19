package com.manerstech.aopDemo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manerstech.services.Transactions;
import com.manerstech.services.paytmTransactions;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("/com/manerstech/resources/applicationContext.xml");
        Transactions trans=(Transactions) context.getBean("TransId");
        trans.transactionUsingUPI();
        System.out.println("-----------");
        trans.transactionUsingRupay();
        System.out.println("-----------");
        trans.transactionUsingInternetBanking();
        System.out.println("*******************************************************");
        paytmTransactions ptrans=(paytmTransactions) context.getBean("paytmTransId");
        ptrans.transactionUsingPaytm();
    }
}
