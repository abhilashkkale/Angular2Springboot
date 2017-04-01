package com.clairvoyant.workshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by mohammad on 1/4/17.
 */
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {


  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    if (!registry.hasMappingForPattern("/dist/**")) {
      registry.addResourceHandler("/dist/**").addResourceLocations("classpath:/dist/");
    }
    if (!registry.hasMappingForPattern("/**")) {
      registry.addResourceHandler("/**").addResourceLocations("classpath:/dist/");
    }
  }

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**").allowedOrigins("http://localhost:4200");
  }


  @Bean
  public InternalResourceViewResolver internalViewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setPrefix("/dist/");
    viewResolver.setSuffix(".html");
    return viewResolver;
  }
}
