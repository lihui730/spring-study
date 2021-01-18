package com.shimmer.staticProxy;

import java.util.Properties;

/**
 * Created by Hui Li on 2021/1/12 21:06
 */
public class Proxy {
    private Landlord landlord;
    public Proxy(Landlord landlord){
        this.landlord = landlord;
    }

    public void rent(){
        FindHouses();
        landlord.rent();
        Charge();
        SignContract();
    }

    public void FindHouses(){
        System.out.println("中介找房子");
    }

    public void SignContract(){
        System.out.println("中介带租客签合同");
    }

    public void Charge(){
        System.out.println("中介收费");
    }
}
