package com.trinet.restcontrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by ssubramani on 5/8/17.
 */
@RestController
public class HelloWorld {
    @RequestMapping(value = "/netinfo", method = RequestMethod.GET)
    public String getHostName() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        return String.format("Hostname : %s, IP : %s", localHost.getHostName(), localHost.getHostAddress());
    }
}
