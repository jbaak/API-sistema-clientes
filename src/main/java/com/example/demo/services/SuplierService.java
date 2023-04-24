package com.example.demo.services;

import com.example.demo.entities.Suplier;
import com.example.demo.repository.SuplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class SuplierService implements ISuplierService {

    @Autowired
    private SuplierRepository repository;
    @Override
    public List<Suplier> getAll() {
        return (List<Suplier>) repository.findAll();
    }

    @Override
    public Suplier getById(Long id) {
        return (Suplier) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(Suplier suplier) {
        repository.save(suplier);
    }
}