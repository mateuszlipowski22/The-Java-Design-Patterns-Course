package com.udemy.section18.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet{

    private RealInternet realInternet;

    private List<String> bannedList = new ArrayList<>(Arrays.asList(
            "onet.pl",
            "wp.pl",
            "reddit.com",
            "cos.pl"
    ));

    public ProxyInternet() {
        this.realInternet = new RealInternet();
    }

    @Override
    public void connect(String website) {
        if(bannedList.contains(website)){
            System.out.println("Access denied");
        }else{
            realInternet.connect(website);
        }
    }
}
