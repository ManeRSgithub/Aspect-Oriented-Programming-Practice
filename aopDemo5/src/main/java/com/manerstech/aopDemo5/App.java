package com.manerstech.aopDemo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manerstech.resources.SpringConfigFile;
import com.manerstech.services.TransactionServices;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
        TransactionServices trans=(TransactionServices) context.getBean(TransactionServices.class);
        trans.transactionUsingUPI();
        System.out.println();
        trans.transactionUsingInternetBanking();
        System.out.println();
        trans.transactionUsingRupay();
        
    }
}
