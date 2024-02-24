package com.example.blog3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/des")
public class DestinationsController {
    private final DestinationsService destinationsService;

    @Autowired
    public DestinationsController(DestinationsService destinationsService){
        this.destinationsService = destinationsService;
    }
    @GetMapping
    public List<Destinations> getAllDestinations(){
        return destinationsService.getAllDestinations();
    }
}
