package com.xjt.service.impl;

import redis.clients.jedis.HostAndPort;

import java.util.HashSet;

public class RedisTest {
    public static void main(String[] args) {
        HashSet <HostAndPort> hostAndPorts=new HashSet<HostAndPort>();
        hostAndPorts.add(new HostAndPort("pro.cachecluster1.ccapp.cc.cn",7011));
        hostAndPorts.add(new HostAndPort("pro.cachecluster2.ccapp.cc.cn",7011));
        hostAndPorts.add(new HostAndPort("pro.cachecluster3.ccapp.cc.cn",7011));
        hostAndPorts.add(new HostAndPort("pro.cachecluster4.ccapp.cc.cn",7011));
        hostAndPorts.add(new HostAndPort("pro.cachecluster5.ccapp.cc.cn",7011));
        hostAndPorts.add(new HostAndPort("pro.cachecluster1.ccapp.cc.cn",7012));
        hostAndPorts.add(new HostAndPort("pro.cachecluster2.ccapp.cc.cn",7012));
        hostAndPorts.add(new HostAndPort("pro.cachecluster3.ccapp.cc.cn",7012));
        hostAndPorts.add(new HostAndPort("pro.cachecluster4.ccapp.cc.cn",7012));
        hostAndPorts.add(new HostAndPort("pro.cachecluster5.ccapp.cc.cn",7012));
        System.out.println(hostAndPorts);

    }
}
