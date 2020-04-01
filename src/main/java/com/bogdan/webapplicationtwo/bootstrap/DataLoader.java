package com.bogdan.webapplicationtwo.bootstrap;

import com.bogdan.webapplicationtwo.model.User;
import com.bogdan.webapplicationtwo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//        User user1 = new User();
//        user1.setFirstName("john");
//        user1.setLastName("doe");
//        user1.setEmail("jd@gmail.com");
//
//        userRepository.save(user1);
//
//        User user2 = new User();
//        user2.setFirstName("bogdan");
//        user2.setLastName("stefoni");
//        user2.setEmail("whatever@email.com");
//
//        userRepository.save(user2);
//
//        User user3 = new User();
//        user3.setFirstName("some");
//        user3.setLastName("user");
//        user3.setEmail("someuser@emial.com");
//
//        userRepository.save(user3);






        System.out.println("Loading users.. ");

    }
}
