package ru.ankhell.soaphelloworld;

import javax.jws.WebService;

@WebService(endpointInterface = "ru.ankhell.soaphelloworld.HelloWorldWebService")
public class HelloWorldWebServiceImpl implements HelloWorldWebService {
    public String getHelloString(String input) {
        return "Hello " + input + "!";
    }
}
