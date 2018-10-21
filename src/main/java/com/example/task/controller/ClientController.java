package com.example.task.controller;

import com.example.task.domain.Request;
import com.example.task.repository.RequestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {
    @Autowired
    private RequestRepository requestRepository;

//    @GetMapping("/client")
//    public String getClient(Model model) {
//        model.addAttribute("request", new Request());
//        model.addAttribute("requests" , requestRepository.findAll());
//        System.out.println("TEST");
//
//
//        return "client";
//    }

    @PostMapping("/client")
    public String submit(@ModelAttribute Request request, Model model) {
        model.addAttribute("requests", requestRepository.findAll());
        requestRepository.save(request);
        return "client";
    }
}