package com.lten.wbsboot.config;

import com.lten.wbsboot.service.HelloWebServiceImpl;

import org.apache.cxf.Bus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @author lijinbao
 * @version 1.0
 * @date 2019/3/5 10:53
 */
@Configuration
public class WebServiceConfig {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus,new HelloWebServiceImpl());
        endpoint.publish("/HelloWebService");
        return endpoint;
    }
}
