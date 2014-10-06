package dev.bay.ws.publisher;

import dev.bay.ws.SayHelloImpl;
import dev.bay.ws.SayRPCImpl;

import javax.xml.ws.Endpoint;

public class Publisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new SayHelloImpl());
        Endpoint.publish("http://localhost:9999/ws/rpc", new SayRPCImpl());
    }
}
