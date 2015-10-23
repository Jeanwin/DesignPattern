package com.zonekey.factory_method;

import com.zonekey.factory_common.MailSender;
import com.zonekey.factory_common.Sender;
import com.zonekey.factory_common.SmsSender;

/**
 * 多个工厂方法模式，每个对象都有自己的创建方法
 * @author admin
 *
 */
public class SendFactory {
	
   public Sender produceMail(){  
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}  