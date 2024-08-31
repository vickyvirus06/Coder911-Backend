package com.coder911.api_gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("CODER-SERVICE", r -> r.path("/coder/**")
                        .uri("lb://CODER-SERVICE"))

                .route("QUERIES-SERVICE", r -> r.path("/queries/**")
                        .uri("lb://QUERIES-SERVICE"))

                .route("QUERIES-SERVICE", r -> r.path("/queryLanguageType/**")
                        .uri("lb://QUERIES-SERVICE"))
                .build();
    }
}
