package com.mycompany.beanvaljersey2;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

@ApplicationPath("res")
public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        
        System.out.println("Setting BV_SEND_ERROR_IN_RESPONSE on ");
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
    }

    
    
    
    
    
    

    
}
