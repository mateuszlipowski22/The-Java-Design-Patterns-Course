package com.udemy.section21.challenge;

public class Client {

    public static void main(String[] args){
        System.out.println("Chain of responsibility");

        Receiver faxHandler, emailHandler, authenticationHandler;

        emailHandler=new EmailErrorHandler();

        faxHandler=new FaxErrorHandler();

        authenticationHandler=new AuthenticationErrorHandler();
        IssueRaiser issueRaiser = new IssueRaiser(faxHandler);

        faxHandler.setNextChain(emailHandler);

        emailHandler.setNextChain(authenticationHandler);

        Message m1 = new Message("fax is reaching late to the destination", MessagePriority.Normal);
        Message m2 = new Message("email is not going", MessagePriority.Normal);
        Message m3 = new Message("authentication error", MessagePriority.High);
        Message m4 = new Message("fax", MessagePriority.High);

        issueRaiser.raiseMessage(m1);
        issueRaiser.raiseMessage(m2);
        issueRaiser.raiseMessage(m3);
        issueRaiser.raiseMessage(m4);
    }

}
