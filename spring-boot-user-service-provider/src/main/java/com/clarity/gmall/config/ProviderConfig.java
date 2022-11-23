package com.clarity.gmall.config;

import com.clarity.gmall.service.UserService;
import org.apache.dubbo.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务提供者配置文件
 *
 * @author: clarity
 * @date: 2022年11月23日 17:20
 */

@Configuration
public class ProviderConfig {

    //    <!-- 1. 指定当前服务 / 应用的名字（同样的服务名字相同，不要和别的服务同名） -->
    //    <dubbo:application name="spring-boot-user-service-provider"/>
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("spring-boot-user-service-provider-provider-config");
        return applicationConfig;
    }

    //    <!-- 2. 指定注册中兴的位置 -->
    //    <!--<dubbo:registry protocol="zookeeper" address="127.0.0.1:2181" />-->
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }

    //    <!-- 3. 指定通信规则 -->
    //    <dubbo:protocol name="dubbo" port="20890"/>
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20890);
        return protocolConfig;
    }

    //    <!-- 4. 暴露服务 ref：指向服务的真正的真实对象 -->
    //    <!-- 4.1 创建服务的真实对象 -->
    //    <bean id="userServiceImpl1" class="com.clarity.gmall.service.impl.UserServiceImpl"/>
    //    <!-- 4.2 暴露服务，指向真实对象 -->
    //    <dubbo:service interface="com.clarity.gmall.service.UserService" ref="userServiceImpl1" version="1.0.0">
    //        <dubbo:method name="getUserAddressList" timeout="6000"/>
    //    </dubbo:service>
    @Bean
    public ServiceConfig<UserService> serviceServiceConfig(UserService userService) {
        ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
        // serviceConfig.setInterface("com.clarity.gmall.service.UserService");
        serviceConfig.setInterface(UserService.class);
        serviceConfig.setRef(userService);
        serviceConfig.setVersion("1.0.0");

        // 配置每一个方法的单独配置实现
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(6000);

        // 将其与服务的绑定
        List<MethodConfig> methodConfigList = new ArrayList<>();
        methodConfigList.add(methodConfig);
        serviceConfig.setMethods(methodConfigList);
        return serviceConfig;
    }
}
