package com.xiongliang.nacos;

import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.client.naming.NacosNamingService;

import java.util.Properties;

/**
 * 服务注册源码 发现
 * @Author 六月
 * @Date 2023/2/27 23:53
 * @Version 1.0
 */
public class ServiceRegisterApplication {

    public static void main(String[] args) {
        NacosNamingService client;
        Properties prop = new Properties();
        prop.setProperty("serverAddr", "localhost");
        prop.put(PropertyKeyConst.NAMESPACE, "test");
        try {
            client = new NacosNamingService(prop);
            client.registerInstance("service-register-application", "127.0.0.1", 8080);
        } catch (NacosException e) {
            throw new RuntimeException(e);
        }
    }

}
