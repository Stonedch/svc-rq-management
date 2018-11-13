package com.github.stonedch.servicemanagement.controller;

import com.github.stonedch.servicemanagement.domain.Request;
import com.github.stonedch.servicemanagement.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/requests")
public class RequestController {
    @Autowired
    private RequestRepository requestRepository;

    @PostMapping("/add")
    public String add(HttpServletRequest httpRequest,
                      @ModelAttribute Request request) {
        request.setDeletedStatus(false);
        request.setAcceptedStatus(false);
        requestRepository.save(request);
        String referer = httpRequest.getHeader("Referer");
        return "redirect:" + referer;
    }

    @PostMapping("/delete")
    public String setDeletedStatus(HttpServletRequest httpRequest,
                                   @RequestParam Long id,
                                   @RequestParam boolean status) {
        if (requestRepository.findById(id).isPresent()) {
            Request request = requestRepository.findById(id).get();
            request.setDeletedStatus(status);
            requestRepository.save(request);
        }
        String referer = httpRequest.getHeader("Referer");
        return "redirect:" + referer;
    }

    @PostMapping("/accept")
    public String setAcceptedStatus(HttpServletRequest httpRequest,
                                    @RequestParam Long id,
                                    @RequestParam boolean status) {
        if (requestRepository.findById(id).isPresent()) {
            Request request = requestRepository.findById(id).get();
            request.setAcceptedStatus(status);
            requestRepository.save(request);
        }
        String referer = httpRequest.getHeader("Referer");
        return "redirect:" + referer;
    }
}
