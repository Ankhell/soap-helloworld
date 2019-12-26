package ru.ankhell.soaphelloworld;

import javax.xml.ws.Endpoint;

public class HelloWorldWebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/", new HelloWorldWebServiceImpl());
    }
}
