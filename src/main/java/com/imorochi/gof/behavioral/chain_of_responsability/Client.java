package com.imorochi.gof.behavioral.chain_of_responsability;

/* *
 * We have to implement a login following these steps:
 * 1. Validate token
 * 2. Validate requests per IP
 * 3. Validate the username and password values
 * 4. Validate the username and password in the Database
 **/
public class Client {

    public static void test() {
        AuthenticationRequest validRequest = new AuthenticationRequest();
        validRequest.username = "batmam";
        validRequest.password = "Password.1";
        validRequest.token = new Token("192.168.2.45", "2233rf3l2l2l2222222ddff");

        AuthenticationRequest sqlInjectionAttack = new AuthenticationRequest();
        sqlInjectionAttack.username = "'SELECT * FROM USERS'";
        sqlInjectionAttack.password = "Password.2";
        sqlInjectionAttack.token = new Token("192.168.2.45", "2233rf3l2l2l2222222ddff");

        AuthenticationRequest wronPassword = new AuthenticationRequest();
        wronPassword.username = "batman";
        wronPassword.password = "Password.2";
        wronPassword.token = new Token("192.168.2.45", "2233rf3l2l2l2222222ddff");

        AuthenticationRequest invalidToken = new AuthenticationRequest();
        invalidToken.username = "batman";
        invalidToken.password = "Password.1";
        invalidToken.token = null;

        AuthenticationRequest maxIpConnection = new AuthenticationRequest();
        maxIpConnection.username = "batman";
        maxIpConnection.password = "Password.1";
        maxIpConnection.token = new Token("192.168.2.0", "2233rf3l2l2l2222222ddff");;


        System.out.println("\n****************************");
        LoginHelper.login(maxIpConnection);

    }
}
