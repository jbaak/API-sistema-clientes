package com.example.demo.services;

import com.example.demo.entities.Suplier;

import java.util.List;

public interface ISuplierService {
    List<Suplier> getAll();

    Suplier getById(Long id);

    void remove(Long id);

    void save(Suplier suplier);
}
