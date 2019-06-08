package com.losstname.bookstore.controller

import com.losstname.bookstore.model.Book
import com.losstname.bookstore.service.BookService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.servlet.mvc.support.RedirectAttributes

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-05-29.
 */
@Controller
@RequestMapping("/book")
class BookController {

    @Autowired
    BookService bookService

    @GetMapping(["", "/"])
    String index(){
        return "book/book"
    }

    @GetMapping("/add-book")
    String addBook(){
        return "book/add-book"
    }

    @PostMapping("/add")
    String add(RedirectAttributes redirectAttributes,
               @RequestParam Map<String, String> params){

        Book book = new Book()
        book.author = params.get("author")
        book.title = params.get("title")
        book.price = params.get("price").toLong()
        book.stock = params.get("stock").toLong()
        book.reorder = params.get("reorder").toLong()

        bookService.save(book)

        redirectAttributes.addFlashAttribute("success", "New book saved!")

        return "redirect:../book"
    }

}
