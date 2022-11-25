package com.smba.api.billingAppBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BillingAppBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingAppBackendApplication.class, args);
	}
	
	/*ProductDaoTemplate
	 * @Bean public WebMvcConfigurer corsConfigurer() { return new
	 * WebMvcConfigurer() {
	 * 
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/greeting-javaconfig").allowedOrigins(
	 * "http://localhost:8080"); } }; }
	 */

}
