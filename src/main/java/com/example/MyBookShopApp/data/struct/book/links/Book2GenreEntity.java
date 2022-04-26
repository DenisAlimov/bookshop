package com.example.MyBookShopApp.data.struct.book.links;

import javax.persistence.*;

@Entity
@Table(name = "book2genre")
public class Book2GenreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int bookId;

    @Column
    private int genreId;
}
