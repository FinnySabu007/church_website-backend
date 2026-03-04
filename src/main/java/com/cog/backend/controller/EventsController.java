package com.cog.backend.controller;

import com.cog.backend.model.Events;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import jakarta.validation.Valid;
import com.cog.backend.service.EventsService;

@RestController
@RequestMapping("/api/events")
public class EventsController {

    private final EventsService service;

    public EventsController(EventsService service){
        this.service=service;
    }

    //CREATE
    @PostMapping
    public Events createEvent(@Valid @RequestBody Events event){
        return service.createEvents(event);
    }

    //READ ALL
    @GetMapping
    public List<Events> getAllEvents(){
        return service.getAllEvents();
    }

    //READ SPECIFIC
    @GetMapping("/{id}")
    public Events getEventById(@PathVariable Long id){
        return service.getEventsById(id);
    }

    @PutMapping("/{id}")
    public Events updateEvent(@PathVariable Long id, @Valid @RequestBody Events Event){
        return service.updateEvent(id,Event);
    }

    @DeleteMapping
    public  void deleteEvent(@RequestParam Long id){
        service.deleteEvents(id);
    }

}
