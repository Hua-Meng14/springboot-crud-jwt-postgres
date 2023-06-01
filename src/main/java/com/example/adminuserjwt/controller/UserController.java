package com.example.adminuserjwt.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping
    public ResponseEntity<String> get() {return ResponseEntity.ok("GET:: user controller");}
    @PostMapping
    public ResponseEntity<String> post() {return ResponseEntity.ok("POST:: user controller");}
    @PutMapping
    public ResponseEntity<String> update() {return ResponseEntity.ok("UPDATE:: user controller");}
    @DeleteMapping
    public ResponseEntity<String> delete() {return ResponseEntity.ok("DELETE:: user controller");}
}
