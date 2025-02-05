package com.example.healthcareapp.service;

import java.util.List;

public interface GenericService<T, ID> {
    T getById(ID id);
    List<T> getAll();
    T save(T entity);
    void delete(ID id);
}

