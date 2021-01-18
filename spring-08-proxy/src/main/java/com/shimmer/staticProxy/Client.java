package com.shimmer.staticProxy;

import java.util.Properties;

/**
 * Created by Hui Li on 2021/1/12 21:10
 */
public class Client {
    public static void main(String[] args){
        Proxy proxy = new Proxy(new Landlord());
        proxy.rent();
    }
}
