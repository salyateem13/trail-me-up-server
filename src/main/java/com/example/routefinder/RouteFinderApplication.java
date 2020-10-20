package com.example.routefinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class RouteFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RouteFinderApplication.class, args);
	}

//	@Bean
//	public CorsFilter corsFilter() {
//
//		
//		final CorsConfiguration config = new CorsConfiguration();
//		config.setAllowCredentials(true);
//		config.addAllowedHeader("*");
//		config.addAllowedMethod("OPTIONS");
//		config.addAllowedMethod("PUT");
//		config.addAllowedMethod("GET");
//		config.addAllowedMethod("POST");
//		config.addAllowedMethod("DELETE");
//		
//		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource ();
//		source.registerCorsConfiguration("/**", config);
//		return new CorsFilter(source);
//	}
}
