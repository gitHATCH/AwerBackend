package com.tasksmanager.tasksmanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DummyController {

    @GetMapping
    public ResponseEntity<String> getDummyResponse() {
        return new ResponseEntity<>("Dummy response", HttpStatus.OK);
    }
}

/* Controlador dummy */
