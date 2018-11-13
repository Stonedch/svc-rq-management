package com.github.stonedch.servicemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.github.stonedch.servicemanagement.domain.Request;
import com.github.stonedch.servicemanagement.repository.RequestRepository;

@Controller
@RequestMapping("/moderator-panel")
public class ModeratorPanelController {
    @Autowired
    private RequestRepository requestRepository;

    @GetMapping
    public String getModeratorPanel(Model model) {
        model.addAttribute("newRequest", new Request());
        model.addAttribute("requestList", requestRepository.findAll());
        return "moderator-panel";
    }
}
