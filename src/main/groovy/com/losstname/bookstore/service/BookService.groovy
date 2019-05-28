package com.losstname.bookstore.service

import com.losstname.bookstore.model.Book
import com.losstname.bookstore.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-05-28.
 */
@Service
class BookService {

    @Autowired
    BookRepository bookRepository

    Book save(Book book){
        Book b = bookRepository.save(book)
        return b
    }

}
