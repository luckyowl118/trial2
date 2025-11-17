package com.web431.controller;

import com.web431.model.SignInForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SignInController {

    @GetMapping
    public String showSignInForm(Model model) {
        model.addAttribute("signInForm", new SignInForm());
        return "signin";
    }

    @PostMapping("/signin")
    public String processSignIn(@Valid SignInForm signInForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "signin";
        }

        // TODO: Add authentication logic here
        // For now, just redirect to a success page
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String showSuccessPage() {
        return "success";
    }
}

