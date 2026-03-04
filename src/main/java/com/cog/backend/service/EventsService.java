package com.cog.backend.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.cog.backend.model.Events;
import com.cog.backend.repository.EventsRepository;

@Service
public class EventsService {

    private final EventsRepository repository;

    public  EventsService(EventsRepository repository){
        this.repository=repository;
    }

    //Create
    public Events createEvents(Events event){
        return repository.save(event);
    }

    public List<Events> getAllEvents(){
        return repository.findAll();
    }

    public Events getEventsById(Long id){
        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Event not found"));
    }

    //Update
    public Events updateEvent(Long id,Events eventDetails){
        Events event=getEventsById(id);

        event.setTitle(eventDetails.getTitle());
        event.setDate(eventDetails.getDate());
        event.setDecription(eventDetails.getDecription());

        return repository.save(event);
    }

    //Delete
    public void deleteEvents(Long id){
        repository.deleteById(id);
    }

}
