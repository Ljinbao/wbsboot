package com.lten.wbsboot.service;

import javax.jws.WebService;

/**
 * @author lijinbao
 * @version 1.0
 * @date 2019/3/5 10:51
 */
@WebService(name = "HelloWebService", endpointInterface = "com.lten.wbsboot.service.HelloWebService", targetNamespace = "http://wbsboot.lten.com")
public class HelloWebServiceImpl implements HelloWebService{
    @Override
    public String sayHello(String line) {
        return "My first WebServiceDemo:" + line;
    }
}
