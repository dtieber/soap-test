package com.rbmh;

import com.rbmh.soap.PersonServiceImpl;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/ws/person", new PersonServiceImpl());
    }
}
