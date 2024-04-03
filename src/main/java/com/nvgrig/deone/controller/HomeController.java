package com.nvgrig.deone.controller;

import com.nvgrig.deone.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private BookRepository bookRepository;

    public HomeController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "index";
    }
}
