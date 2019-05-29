package com.losstname.bookstore.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-05-29.
 */
@Controller
@RequestMapping("/book")
class BookController {

    @GetMapping(["", "/"])
    String index(){
        return "book"
    }

}
