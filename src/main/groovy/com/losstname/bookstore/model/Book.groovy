package com.losstname.bookstore.model

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Version

/**
 * Created by umarwhk(umrwhk@gmail.com) on 2019-05-28.
 */

@Entity
class Book implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id

    Long price

    Long reorder

    Long stock

    String title

    String author

    @Version
    Long version

    @CreationTimestamp
    Date createdAt

    @UpdateTimestamp
    Date updatedAt
}
