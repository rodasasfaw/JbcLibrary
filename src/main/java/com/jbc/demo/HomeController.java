package com.jbc.demo;

import com.jbc.demo.Repository.BookRepository;
import com.jbc.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping("/")
    public String jbcLibrary(){


        return "index";
    }
    @GetMapping("/addbook")
    public String addbookForm(Model model){
        model.addAttribute("book",new Book());
        return "addbookform";
    }
    @GetMapping("/showbooklist")
    public String showbookList(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "booklist";

    }
    @PostMapping("/processbook")
    public String procesaddbookForm(@Valid @ModelAttribute("book") Book books, BindingResult result,Model model) {
        if (result.hasErrors()) {
            return "addbookform";
        }
        bookRepository.save(books);
        model.addAttribute("books", bookRepository.findAll());

        return "booklist";
    }

    @GetMapping("/processborrow")
    public String showborrowedList(Model model){
        model.addAttribute("books", bookRepository.findAll());

        return "booklist";

    }
    @GetMapping("/processreturn")
    public String showreturnlist(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "booklist";

    }
    @RequestMapping("/detail/{id}")
    public String showBook(@PathVariable("id") long id,Model model){
        model.addAttribute("book", bookRepository.findOne(id));
        return "booklist";
    }
    @RequestMapping("/update/{id}")
    public String updateBook(@PathVariable("id") long id, Model model){
        model.addAttribute("book", bookRepository.findOne(id));
        return "addbookform";

    }
    @RequestMapping("/delete/{id}")
    public String delBook(@PathVariable("id") long id){
        bookRepository.delete(id);
        return"booklist";
    }



}
