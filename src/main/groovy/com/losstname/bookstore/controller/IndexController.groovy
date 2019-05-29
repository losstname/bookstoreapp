package com.losstname.bookstore.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-05-29.
 */
@Controller
class IndexController {

    @GetMapping(["", "/"])
    String index(){
        return "index"
    }
}
