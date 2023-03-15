package com.mszlu.blog.config;


import com.mszlu.blog.handler.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;
    // 跨域映射
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // WebMvcConfigurer.super.addCorsMappings(registry);
        // 跨域配置，不可为*，不安全
        // 本地的测试
        // 所有接口，只允许localhost:8080访问
        registry.addMapping("/**").allowedOrigins("http://localhost:8080", "https://web.postman.co/","http://localhost:5173");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 登录鉴权配置（拦截器）
        registry.addInterceptor(loginInterceptor).addPathPatterns("/test","/comments/create/change","/articles/publish");
    }
}
