package com.example.Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
//	@Bean
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(r -> r.path("/users/**")
//						.filters(f -> f
//							.prefixPath("/api/v1")
//							.addResponseHeader("X-Powered-By","Choukri's Gateway Service")
//						)
//						.uri("http://localhost:8081")
//				)
//				.route(r -> r.path("/tasks/**")
//						.filters(f -> f
//								.prefixPath("/api/v1")
//								.addResponseHeader("X-Powered-By","Choukri's Gateway Service")
//						)
//						.uri("http://localhost:8082")
//				)
//				.build();
//	}

}
