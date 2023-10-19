package com.manerstech.aopDemo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manerstech.services.Transactions;
import com.manerstech.services.paytmTransaction;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("/com/manerstech/resources/applicationContext.xml");
        Transactions trans=(Transactions)  context.getBean("transId");
        trans.transactionUsingUPI();
        System.out.println("----------------------------------");
        trans.transactionUsingInternetBanking();
        System.out.println("----------------------------------");
        trans.transactionUsingRupay();
        System.out.println("*****************************************");
        paytmTransaction ptrance=(paytmTransaction)  context.getBean("pTransId");
        ptrance.walletBanking();
    }
}
