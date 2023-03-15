package com.mszlu.blog.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 让spring可以扫描到它
@MapperScan("com.mszlu.blog.dao.mapper") // mybatis扫包，将此包下的接口生成代理实现类，注册到spring容器中
public class MybatisPlusConfig {
    // 分页插件
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        // 通过mybatis-plus中的Interceptor自定义一个拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();

        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();

        interceptor.addInnerInterceptor(paginationInnerInterceptor);

        return interceptor;
    }
}
