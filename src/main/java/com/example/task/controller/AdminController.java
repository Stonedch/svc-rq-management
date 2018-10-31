package com.example.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.task.repository.RequestRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    RequestRepository requestRepository;

    @GetMapping
    public String getAdmin(Model model) {
        model.addAttribute("requests", requestRepository.findAll());
        return "admin";
    }
}
