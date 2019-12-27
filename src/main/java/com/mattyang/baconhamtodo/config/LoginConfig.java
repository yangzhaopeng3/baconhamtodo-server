package com.mattyang.baconhamtodo.config;

import com.mattyang.baconhamtodo.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 杨肇鹏
 * @version 1.0
 * @name LoginConfig
 * @desc TODO
 * @date 2019/12/27 15:46
 */
@Configuration
public class LoginConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/user/**");
    }
}