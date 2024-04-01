package com.example.cuisineservice.config;//config包内的文件用于构建各种补丁

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {//该补丁用于解决向客户端传输文件查看和检测问题
    @Value("${upload.accessPath}")
    private String accessPath;
    @Value("${upload.localPath}")
    private String localPath;
    @Override

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(accessPath+"**").addResourceLocations("file:"+localPath);
    }
}

