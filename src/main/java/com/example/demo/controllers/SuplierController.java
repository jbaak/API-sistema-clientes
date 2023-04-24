package com.example.demo.controllers;

import com.example.demo.entities.Suplier;
import com.example.demo.services.SuplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class SuplierController {

    @Autowired
    private SuplierService service;

    @GetMapping("/api/supliers")
    public List<Suplier> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/supliers/{id}")
    public Suplier getById(@PathVariable String id) {
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/supliers/{id}")
    public void remove(@PathVariable String id) {
        service.remove(Long.parseLong(id));
    }


    @PostMapping("/api/supliers")
    public void save(@RequestBody Suplier suplier) {
        service.save(suplier);
    }
}
