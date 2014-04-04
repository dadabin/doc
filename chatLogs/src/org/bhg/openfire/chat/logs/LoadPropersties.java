package org.bhg.openfire.chat.logs;

import java.io.IOException;
import java.util.Properties;

public class LoadPropersties {
     public String getProperties(final String key){
    		Properties prop = new Properties();  
            try {  
                prop.load( this.getClass().getResourceAsStream("redis.properties"));
            } catch(IOException e) {  
                e.printStackTrace(); 
    	    }
            return prop.getProperty(key);
     }
}
