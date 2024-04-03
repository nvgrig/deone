package com.nvgrig.deone.controller;

import com.nvgrig.deone.model.Book;
import com.nvgrig.deone.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    private BookRepository bookRepository;

    public HomeController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public String getIndex(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        model.addAttribute("newBook", new Book());

        return "index";
    }

    @PostMapping
    public String createBook(Book book) {
        bookRepository.save(book);
        return "redirect:/";
    }

}
