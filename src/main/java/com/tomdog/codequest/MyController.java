package com.tomdog.codequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");
        model.addAttribute("questions", List.of(
                new Question(1, "What is the capital of the United States?"),
                new Question(2, "What is the capital of the United Kingdom?"),
                new Question(3, "What is the capital of France?")
        ));
        return "hello"; // Return the name of the Thymeleaf template
    }

    @GetMapping("/all")
    public String showAll(Model model) {

        return "books/allBooks";
    }
}
