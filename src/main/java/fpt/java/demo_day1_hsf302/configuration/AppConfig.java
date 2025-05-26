
//package fpt.java.demo_day1_hsf302.configuration;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.filter.CorsFilter;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.OncePerRequestFilter;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import java.io.IOException;
//import java.util.List;
//
////@Configuration
////public class AppConfig implements WebMvcConfigurer {
////    @Override
////    public void addCorsMappings(CorsRegistry registry) {
////        registry.addMapping("/**")
////                .allowCredentials(true)
////                .allowedOrigins("http://localhost:5173")
////                .allowedMethods("*")
////                .allowedHeaders("*");
////    }
////}
//
////@Configuration
////public class AppConfig {
////    @Bean
////    public WebMvcConfigurer corsFilter() {
////        return new WebMvcConfigurer() {
////            @Override
////            public void addCorsMappings(CorsRegistry registry) {
////                registry.addMapping("/**")
////                        .allowedOrigins("http://localhost:5173");
////            }
////        };
////    }
////} cach thu hai
//
////@Configuration
////public class AppConfig {
////    @Bean
////    public FilterRegistrationBean<CorsFilter> corsFilter() {
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        CorsConfiguration config = new CorsConfiguration();
////        config.setAllowCredentials(true);
////        config.addAllowedOrigin("http://localhost:5173");
//////        config.addAllowedMethod("*");
////        config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
////        config.addAllowedHeader("*");
////        source.registerCorsConfiguration("/**", config);
////        FilterRegistrationBean bean = new FilterRegistrationBean<>(new CorsFilter(source));
////        bean.setOrder(0); // Set the order of the filter
////        return bean;
////    }
////} cach thu ba
//
////@Component
////public class AppConfig extends OncePerRequestFilter
////{
////    @Override
////    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
////        response.setHeader("Access-Control-Allow-Origin", "*");
////        filterChain.doFilter(request, response);
////    }
////}
//@Configuration
//public class AppConfig implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:8080")
//                .allowedMethods("*")
//                .allowedHeaders("*")
//                .allowCredentials(true);
//    }
//}
