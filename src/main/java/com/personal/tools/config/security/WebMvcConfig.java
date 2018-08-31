/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.personal.tools.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

/**
 * @author zhangqingqing
 * @version WebMvcConfig, v0.1 2018/6/6 10:56
 */
@Configuration
class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:"+ File.separator+"META-INF"+ File.separator+"resources"+ File.separator);

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:"+ File.separator+"META-INF"+ File.separator+"resources"+ File.separator+"webjars"+ File.separator);
        registry.addResourceHandler("/js/**")
                .addResourceLocations("classpath:"+ File.separator+ "js" +File.separator);
        registry.addResourceHandler("/css/**")
                .addResourceLocations("classpath:"+ File.separator+ "css" +File.separator);
    }
}