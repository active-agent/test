package com.activeagent.test;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Hello World Handler.
 */
public class HelloWorldHandler extends AbstractHandler {

    public void handle(
        String s,
        Request request,
        HttpServletRequest httpServletRequest,
        HttpServletResponse httpServletResponse
    ) throws IOException, ServletException {

        httpServletResponse.setContentType("text/plain; charset=utf-8");
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
        httpServletResponse.getWriter().print("Hello World");

        request.setHandled(true);
    }
}
