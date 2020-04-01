package com.bogdan.webapplicationtwo.controller;

import com.bogdan.webapplicationtwo.model.User;
import com.bogdan.webapplicationtwo.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;


@Controller
public class UserController implements WebMvcConfigurer {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("users/index").setViewName("index");
    }

    @RequestMapping({"/index"})
    public String listUsers(Model model) {

        User user = new User();

        model.addAttribute("users", user);

        return "index";
    }

    @RequestMapping({"/users"})
    public String getUsers(@ModelAttribute("users") @Valid User user,
                           BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return "index";
        } else {

            System.out.println("User " + user.getFirstName() + " " +
                    user.getLastName() + " " + user.getEmail());

            userRepository.save(user);

            return "users/index";
        }



    }


}
