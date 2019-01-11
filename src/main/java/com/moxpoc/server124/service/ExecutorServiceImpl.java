package com.moxpoc.server124.service;

import com.moxpoc.server124.entity.Executor;
import com.moxpoc.server124.repository.ExecutorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExecutorServiceImpl implements ExecutorService {
    @Autowired
    private ExecutorRepository repository;

    public List<Executor> getAll() {
        return repository.findAll();
    }

    public Executor getById(long id) {
        return repository.findById(id).orElse(new Executor());
    }

    public Executor save(Executor executor) {
        return repository.saveAndFlush(executor);
    }

    public void remove(long id) {
        repository.deleteById(id);
    }
}
