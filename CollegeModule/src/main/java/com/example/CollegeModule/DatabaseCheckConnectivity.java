package com.example.CollegeModule;

import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseCheckConnectivity implements CommandLineRunner {

	 private final JdbcTemplate jdbcTemplate;

	    public  DatabaseCheckConnectivity(JdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }

	    @Override
	    public void run(String... args) throws Exception {
	        try {
	            jdbcTemplate.execute("SELECT 1");  // Simple query to check DB connectivity
	            System.out.println("✅ Database connected successfully!");
	        } catch (Exception e) {
	            System.err.println("❌ Failed to connect to the database: " + e.getMessage());
	        }
	    }

}
