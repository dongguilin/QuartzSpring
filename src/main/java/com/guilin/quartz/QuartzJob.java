package com.guilin.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by guilin1 on 15/5/7.
 */
public class QuartzJob {

    public void sayHello1(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("sayHello1");
    }

    public void sayHello2(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("sayHello2");
    }
}
