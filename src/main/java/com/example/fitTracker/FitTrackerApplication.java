package com.example.fitTracker;

import com.example.fitTracker.run.Location;
import com.example.fitTracker.run.Run;
import com.example.fitTracker.run.RunRepository;
import com.example.fitTracker.user.User;
import com.example.fitTracker.user.UserRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@SpringBootApplication
public class FitTrackerApplication {

	private static final Logger log = LoggerFactory.getLogger(FitTrackerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FitTrackerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UserRestClient client) {
		return args -> {
			List<User> users = client.findAll();
			System.out.println(users);
		};
	}
}
