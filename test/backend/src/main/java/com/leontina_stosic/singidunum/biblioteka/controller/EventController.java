package com.leontina_stosic.singidunum.biblioteka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leontina_stosic.singidunum.biblioteka.model.Event;
import com.leontina_stosic.singidunum.biblioteka.service.EventService;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PutMapping("/{eventId}/books")
    public Event addBooksToEvent(@PathVariable Long eventId, @RequestBody List<Long> bookIds) {
        return eventService.addBooksToEvent(eventId, bookIds);
    }
}
