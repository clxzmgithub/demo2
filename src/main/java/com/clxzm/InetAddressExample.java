package com.clxzm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.net.*;

/**
 * Created by xuzhongming on 2017/7/10.
 */
public class InetAddressExample {

    public static void main(String[] args) {
        String[] arrs = {"www.mkp.com", "blah.blah", "129.35.69.7"};
        fun(arrs);
    }

    private static void fun(String[] args) {
        //get the network interface and associated for this host
        try {
            Enumeration<NetworkInterface> interfaceList = NetworkInterface.getNetworkInterfaces();
            if (interfaceList == null) {
                System.out.println("--No interfaces found--");
            } else {
                while (interfaceList.hasMoreElements()) {
                    NetworkInterface iface = interfaceList.nextElement();
                    System.out.println("Interface " + iface.getName() + ":");
                    Enumeration<InetAddress> addrList = iface.getInetAddresses();
                    if (!addrList.hasMoreElements()) {
                        System.out.println("\t(No address for this interface)");
                    }
                    while (addrList.hasMoreElements()) {
                        InetAddress address = addrList.nextElement();
                        System.out.print("\tAddress " + (address instanceof Inet4Address ? "(v4)" : (address instanceof Inet6Address ? "(v6)" : "(?)")));
                        System.out.println(": " + address.getHostAddress());
                    }
                }
            }
        } catch (SocketException e) {
            System.out.println("Error getting network interfaces:" + e.getMessage());
        }
        for (String host : args) {
            try {
                System.out.println(host + ":");
                InetAddress[] addressList = InetAddress.getAllByName(host);
                for (InetAddress address : addressList) {
                    System.out.println("\t" + address.getHostName() + "／" + address.getHostAddress());
                }

            } catch (UnknownHostException e) {

                System.out.println("\tUnable to find address for " + host);
            }
        }
    }
}