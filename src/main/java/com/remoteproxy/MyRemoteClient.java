package com.remoteproxy;

import java.rmi.Naming;

/**
 * Created by xuzhongming on 2017/7/16.
 */
public class MyRemoteClient {
    public static void main(String[] args){
        new MyRemoteClient().go();
    }
    public void go(){
        try {
            MyRemote service= (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");

            String s=service.sayHello();
            System.out.println(s);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
