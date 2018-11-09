package com.github.stonedch.servicemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.github.stonedch.servicemanagement.domain.Request;
import com.github.stonedch.servicemanagement.repository.RequestRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client-panel")
public class ClientPanelController {
    @Autowired
    private RequestRepository requestRepository;

    @GetMapping
    public String client(Model model) {
        model.addAttribute("newRequest", new Request());
        model.addAttribute("requestList" , requestRepository.findAll());
        return "client-panel";
    }

    @PostMapping
    public String addRequest(@ModelAttribute Request request,
                             BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) requestRepository.save(request);
        return "redirect:/client-panel";
    }
}
