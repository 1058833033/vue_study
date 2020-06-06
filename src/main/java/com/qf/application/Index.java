package com.qf.application;

import org.springframework.aop.interceptor.ConcurrencyThrottleInterceptor;
import org.springframework.context.annotation.ComponentScan;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author ChenJie
 * @date 2020-06-02 16:08:13
 * 功能说明
 */

public class Index {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Scanner write = new Scanner(System.in);
        write.next();
    }

}
