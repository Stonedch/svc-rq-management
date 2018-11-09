package com.example.task.controller;

import com.example.task.domain.Request;
import com.example.task.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ClientController {
    @Autowired
    private RequestRepository requestRepository;

    @GetMapping("/client")
    public String getClient(Model model) {
        model.addAttribute("request", new Request());
        model.addAttribute("requests" , requestRepository.findAll());
        return "client";
    }

    @PostMapping("/client")
    public String submit(@ModelAttribute Request request,
                         BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) requestRepository.save(request);
        return "redirect:/client";
    }
}