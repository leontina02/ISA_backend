package com.leontina_stosic.singidunum.biblioteka.service;

import com.leontina_stosic.singidunum.biblioteka.model.Event;
import com.leontina_stosic.singidunum.biblioteka.model.Book;
import com.leontina_stosic.singidunum.biblioteka.repository.EventRepository;
import com.leontina_stosic.singidunum.biblioteka.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private BookRepository bookRepository;

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event addBooksToEvent(Long eventId, List<Long> bookIds) {
        Event event = eventRepository.findById(eventId).orElseThrow(() -> new RuntimeException("Event not found"));
        List<Book> books = bookIds.stream()
                .map(bookId -> bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found")))
                .collect(Collectors.toList());
        event.setBooks(books);
        return eventRepository.save(event);
    }
}
