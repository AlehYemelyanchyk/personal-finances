package com.alehyem.personalfinances.controllers;

import com.alehyem.personalfinances.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
@Controller
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String getUserById(Model model) {

        model.addAttribute("users", userRepository.findAll());

        return "users/index";
    }
}
