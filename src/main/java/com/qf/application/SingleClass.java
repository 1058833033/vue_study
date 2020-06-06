package com.qf.application;

/**
 * @author ChenJie
 * @date 2020-06-04 13:27:09
 * 功能说明
 */

/**
 * 单例模式
 * 懒汉式   一般的不安全   手写一个安全的懒汉式单例模式（双重锁判定）
 */
public class SingleClass {

    // volatile关键字保证了可见性和局部有序性
    public static volatile SingleClass singleClass;

    // 构造方法私有化
    private SingleClass(){}

    /**
     * 只有第一次初始化才会出现安全问题   没必要使用synchronized关键字
     * @return
     */
    // 静态方法返回单例对象
    public static SingleClass getInstance(){
        if (singleClass == null) {
            // 多线程进入，出现重复初始化，要加锁
            // 但是1线程初始化后等在这里的其他线程仍然会进去初始化，所以在锁里面还要加判断
            synchronized (SingleClass.class){
                if(singleClass == null){
                    /**
                     * 有序性，计算机在初始化的时候下列步骤可能会进行指令重排
                     * 可能堆内存还没初始化，但是引用已经指向地址
                     * 外层判断拿到了对象，但是给外界返回的对象不可用
                     * 此时加上volatile关键字防止计算机进行指令重排
                     */
                    //1、申请堆内存地址
                    //2、初始化堆内存地址
                    //3、将引用指向的内存地址
                    singleClass = new SingleClass();
                }
            }
        }
        return singleClass;
    }
}
