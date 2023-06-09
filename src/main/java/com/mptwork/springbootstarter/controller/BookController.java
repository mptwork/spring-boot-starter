package com.mptwork.springbootstarter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.mptwork.springbootstarter.model.Book;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;




/**
 * BookController is a Spring REST controller that handles HTTP requests related to books.
 * 
 * @author Issac Lee
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("/api/books")
@Tag(name = "Book", description = "Book APIs")
@SecurityRequirement(name = "bearerAuth")
public class BookController {

    /**
     * Handles HTTP GET requests to fetch book information by book ID.
     * 
     * @param id The ID of the book to be retrieved.
     * @return A Book instance representing the book with the specified ID.
     */
    @Operation(summary = "Get a book")
    @ApiResponses(value = { 
    @ApiResponse(
        responseCode = "200", 
        description = "Found the book", 
        content = { @Content(mediaType = "application/json", 
        schema = @Schema(implementation = Book.class)) }),
    @ApiResponse(
        responseCode = "400", 
        description = "Invalid id supplied", 
        content = @Content), 
    @ApiResponse(
        responseCode = "404", 
        description = "Book not found", 
    content = @Content) })  
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book getBookById(@PathVariable Long id) {
        // For simplicity, we are returning a hardcoded book.
        // In a real application, you'd typically fetch the data from a database.
        return new Book(id, "The Book Title", "The Book Author");
    }

    // POST create a new book
    @PostMapping
    @Operation(summary = "Add a book")    
    public Book createBook(@RequestBody Book book) {
        long id = 1;
        return new Book(id, "The Book Title", "The Book Author");
    }
    
    // PUT update a book by ID
    @PutMapping("/{id}")
    @Operation(summary = "Update a book")
    public Book updateBook(@PathVariable("id") Long id, @RequestBody Book book) {
        return new Book(id, "The Book Title", "The Book Author");
    }
    
    // DELETE a book by ID
    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a book")
    public Long deleteBook(@PathVariable("id") Long id) {
        return id;
    }  
}
