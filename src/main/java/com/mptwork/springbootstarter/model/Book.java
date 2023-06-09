package com.mptwork.springbootstarter.model;

import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The Book class is a data model that represents a book with an id, title, and author.
 * 
 * @author Issac Lee
 * @version 1.0
 * @since 1.0
 */
@Schema(name="Book 📚", description="Book characteristic")
public class Book {
    private Long id;

    @NotBlank
    @Size(min = 0, max = 80)    
    private String title;

    @NotBlank
    @Size(min = 0, max = 32)
    private String author;

    /**
     * Constructor for the Book class.
     * 
     * @param id The ID of the book.
     * @param title The title of the book.
     * @param author The author of the book.
     */
    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    /**
     * Gets the ID of the book.
     * 
     * @return A Long representing the ID of the book.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Sets the ID of the book.
     * 
     * @param id The ID of the book to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the title of the book.
     * 
     * @return A String representing the title of the book.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the title of the book.
     * 
     * @param title The title of the book to set.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the book.
     * 
     * @return A String representing the author of the book.
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Sets the author of the book.
     * 
     * @param author The author of the book to set.
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}
