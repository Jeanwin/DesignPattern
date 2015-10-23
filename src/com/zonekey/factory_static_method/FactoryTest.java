package com.zonekey.factory_static_method;

import com.zonekey.factory_common.Sender;

public class FactoryTest {  
  
    public static void main(String[] args) {      
        Sender sender = SendFactory.produceMail();  
        sender.Send();  
    }  
}  