package com.remoteproxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by xuzhongming on 2017/7/14.
 */
public interface MyRemote extends Remote{
    public String sayHello() throws RemoteException;
}
