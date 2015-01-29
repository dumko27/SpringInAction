package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Novikov Dmitry
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring_idol.xml");
        
        Perfomer perfomer = (Perfomer) ctx.getBean("duke");
        perfomer.perform();
    }
}
