package com.manerstech.aopDemo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manerstech.resources.SpringConfigFile;
import com.manerstech.services.Transactions;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Transactions trans=(Transactions) context.getBean(Transactions.class);
        trans.transactionUsingUPI();
        System.out.println();
        trans.transactionUsingInternetBanking();
        System.out.println();
        trans.transactionUsingRupay();
    }
}
