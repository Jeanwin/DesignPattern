package com.zonekey.factory_method;

import com.zonekey.factory_common.Sender;

public class FactoryTest {  
  
    public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produceMail();  
        sender.Send();  
    }  
}  