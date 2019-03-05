package com.lten.wbsboot.service;

import javax.jws.WebService;

@WebService(name = "HelloWebService", targetNamespace = "http://wbsboot.lten.com")
public interface HelloWebService {

    String sayHello(String line);
}
