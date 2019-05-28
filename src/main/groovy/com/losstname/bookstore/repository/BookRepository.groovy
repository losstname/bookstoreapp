package com.losstname.bookstore.repository

import com.losstname.bookstore.model.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-05-28.
 */

@Repository
interface BookRepository extends JpaRepository<Book, Long> {

}