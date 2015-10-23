package com.zonekey.factory_static_method;

import com.zonekey.factory_common.MailSender;
import com.zonekey.factory_common.Sender;
import com.zonekey.factory_common.SmsSender;

public class SendFactory {  
      
    public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}  