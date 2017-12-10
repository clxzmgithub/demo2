package com.remoteproxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by xuzhongming on 2017/7/14.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

    public String sayHello(){
        return "Server says,hey";
    }
    public MyRemoteImpl() throws RemoteException{

    }
    public static void main(String[] args){
        try {
            MyRemote service=new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
