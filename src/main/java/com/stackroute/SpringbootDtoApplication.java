package com.stackroute;

import com.stackroute.model.Location;
import com.stackroute.model.User;
import com.stackroute.repository.LocationRepository;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootDtoApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		Location location=new Location();
		location.setPlace("guwahati");
		location.setDescription("a city");
		location.setLongitude(44.6);
		location.setLatitude(110.78);
		locationRepository.save(location);

		User user1=new User();
		user1.setFirstName("pranjit");
		user1.setLastName("das");
		user1.setEmail("p@gmail.com");
		user1.setPassword("password");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2=new User();
		user2.setFirstName("lima");
		user2.setLastName("das");
		user2.setEmail("l@gmail.com");
		user2.setPassword("sword");
		user2.setLocation(location);
		userRepository.save(user2);

	}
}
