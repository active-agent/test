package com.activeagent.test;

import org.eclipse.jetty.server.Server;

/**
 * Main.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        server.setHandler(new HelloWorldHandler());

        server.start();
        server.join();
    }

}
