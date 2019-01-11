package com.moxpoc.server124.controller;

import com.moxpoc.server124.entity.Executor;
import com.moxpoc.server124.service.ExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/executor")
public class ExecutorController {

    @Autowired
    private ExecutorService executorService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public List<Executor> getAllExecutors(ModelMap modelMap){
        return executorService.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Executor getExecutor(@PathVariable("id") long id){
        return executorService.getById(id);
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseBody
    public Executor saveExecutor(@RequestBody Executor executor){
        return executorService.save(executor);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void removeExecutor(@PathVariable long id) {executorService.remove(id);}
}
