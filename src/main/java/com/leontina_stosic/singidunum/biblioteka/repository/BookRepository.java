package com.leontina_stosic.singidunum.biblioteka.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leontina_stosic.singidunum.biblioteka.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByUserId(Long userId);
}


