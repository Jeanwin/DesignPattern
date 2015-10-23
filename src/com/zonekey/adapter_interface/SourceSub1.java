package com.zonekey.adapter_interface;
/**
 * 可以不实现Sourceable接口中的所有方法
 * 重写wraper2中的方法即可
 * @author admin
 *
 */
public class SourceSub1 extends Wrapper2 {  
    public void method1(){  
        System.out.println("the sourceable interface's first Sub1!");  
    }  
}  