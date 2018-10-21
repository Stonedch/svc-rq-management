package com.example.task;

import com.example.task.repository.RequestRepository;
import com.example.task.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/index")
    public String login(Map<String, Object> model) {
          return "admin";
    }
}
