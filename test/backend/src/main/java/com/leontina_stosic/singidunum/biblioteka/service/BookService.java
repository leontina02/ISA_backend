package com.leontina_stosic.singidunum.biblioteka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leontina_stosic.singidunum.biblioteka.model.Book;
import com.leontina_stosic.singidunum.biblioteka.model.User;
import com.leontina_stosic.singidunum.biblioteka.repository.BookRepository;
import com.leontina_stosic.singidunum.biblioteka.repository.UserRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public Book assignBookToUser(Long bookId, String username) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new RuntimeException("User not found");
        }
        book.setUser(user); // assuming a Book has a User field for the owner
        return bookRepository.save(book);
    }

    public List<Book> findBooksByUser(Long userId) {
        return bookRepository.findByUserId(userId);
    }
    
}
