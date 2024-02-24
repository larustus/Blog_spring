package com.example.blog3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DestinationsService {
    private final DestinationsRepository destinationsRepository;

    @Autowired
    public DestinationsService(DestinationsRepository destinationsRepository){
        this.destinationsRepository = destinationsRepository;
    }
    public List<Destinations> getAllDestinations(){
        return destinationsRepository.findAll();
    }
}
