package com.chenyinjie;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @Author chenyj
 * @Description
 * @Date create by 2019/7/10 22:56
 * 陈银杰专属测试
 */
public class RandomRule_ZY extends AbstractLoadBalancerRule {

    private int total=0;
    private int currentIndex=0;
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                /*int index = this.chooseRandomInt(serverCount);
                server = (Server)upList.get(index);*/
                if (total<5){
                    server=upList.get(currentIndex);
                    total++;
                }else {
                    total=0;
                    currentIndex++;
                    if (currentIndex>=upList.size()){
                        currentIndex=0;
                    }
                }
                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    @Override
    public Server choose(Object o) {
        return this.choose(getLoadBalancer(), o);
    }
}
