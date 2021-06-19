//package com.caffeineshawn.thebigiscoming.CorsConfiguration;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//@Configuration
//public class CorsConfig implements WebMvcConfigurer {
//    static final String Origins[] = new String[]{"GET", "POST", "PUT", "DELETE" };
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedHeaders(Origins)
//                .allowedOrigins("localhost")
//                .allowCredentials(true)
//                .allowedMethods("*")
//                .maxAge(3600);
//    }
//
//}