package it.unisalento.myairbnb.configurations;

import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebappConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings (CorsRegistry registry)
	{
		//TODO Auto-genetrated method stub
		registry.addMapping("/**").allowedMethods("DELETE","PUT","UPDATE","GET","POST","");
	}
	@Override 
	 public void configureContentNegotiation(ContentNegotiationConfigurer configurer) { 
	     configurer.favorPathExtension(false); 
	 }
}
