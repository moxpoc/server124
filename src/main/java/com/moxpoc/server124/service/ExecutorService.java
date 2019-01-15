package com.moxpoc.server124.service;

import com.moxpoc.server124.entity.Executor;

import java.util.List;

public interface ExecutorService {

    List<Executor> getAll();
    Executor getById(long id);
    Executor save(Executor executor);
    void remove(long id);
}
