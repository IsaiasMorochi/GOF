package com.imorochi.gof.behavioral.chain_of_responsability;

import java.util.HashMap;
import java.util.Map;

public class LoginHelper {

    public static void login(AuthenticationRequest request) {
        validateToken(request);
        validateIPRequests(request);
        sanitizeParameters(request);
        validateUsernameAndPasssword(request);
    }

    private static final Map<String, Integer> IP_CONNECTION_MAP = new HashMap<String, Integer>() {
        {
        put("192.168.2.45",2);
        put("192.168.2.0",999);
        }
    };

    private static void validateIPRequests(AuthenticationRequest request) {
        Integer totalConnections = IP_CONNECTION_MAP.get(request.token.ip);
        if (totalConnections.intValue()+1 == 1000) {
            System.out.println("The IP: " + request.token.ip + " has reached the max aamount of connections :(");
        } else {
            System.out.println("The IP: " + request.token.ip + " is still able to do connections :)");
        }
    }

    private static void validateToken(AuthenticationRequest request) {
        if (request.token == null) {
            System.out.println("Invalid Token :(");
        } else {
            System.out.println("Token :)");
        }
    }

    private static Boolean containsSQLStatement(String text) {
        text = text.toUpperCase();
        return (text.contains("SELECT") || text.contains("FROM"));
    }

    private static void sanitizeParameters(AuthenticationRequest request) {
        if (containsSQLStatement(request.username) || containsSQLStatement(request.password)) {
            System.out.println("You are trying to do an SQL Injection :(");
        } else {
            System.out.println("The request parameters are clean :)");
        }
    }

    private static void validateUsernameAndPasssword(AuthenticationRequest request) {
        // Connect to database
        System.out.println("Connect to Database");

        // Verify username and password
        System.out.println("Verify username and password");

        // Fake
        Map<String, String> userMap = new HashMap<String, String>();
        userMap.put("batman", "Password.1");
        userMap.put("robin", "Password.2");

        String passworInDB = userMap.get(request.username);
        if (passworInDB == null) {
            System.out.println("The username !" + request.username + " doesn't exists!");
        } else {
            if (passworInDB == request.password) {
                System.out.println("Valid username and password :)");
            } else {
                System.out.println("Your password is wrong!");
            }
        }
    }

}
