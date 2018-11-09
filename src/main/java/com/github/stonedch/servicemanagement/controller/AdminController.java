package com.github.stonedch.servicemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.github.stonedch.servicemanagement.domain.Request;
import com.github.stonedch.servicemanagement.repository.RequestRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private RequestRepository requestRepository;

    @GetMapping
    public String getAdmin(Model model) {
        model.addAttribute(new Request());
        model.addAttribute("requests", requestRepository.findAll());
        return "admin";
    }

    @PostMapping("/request")
    public String createRequest(@ModelAttribute Request request,
                                BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) requestRepository.save(request);
        return "redirect:/admin";
    }
}
