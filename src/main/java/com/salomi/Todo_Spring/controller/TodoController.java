package com.salomi.Todo_Spring.controller;


import com.salomi.Todo_Spring.model.Todomodel;
import com.salomi.Todo_Spring.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoService tservice;

    @GetMapping("/todo")
    public List<Todomodel> getcontrollerTodo() {
        System.out.println("gettodo");
        return tservice.GetTodoService();
    }

    @PostMapping("/todo")
    public Todomodel postcontrollerTodo(@RequestBody Todomodel entity){
        System.out.println("postTodo:" + entity);
        return tservice.PostTodoService(entity);
    }
    @PutMapping("todo/{id}")
    public Todomodel Putcontroller(@PathVariable String id, @RequestBody Todomodel entity){
        System.out.print("putTodo:"+ entity);
        return tservice.PutTodoService(entity,id);
    }
    @DeleteMapping("todo/{id}")
    public String Deletecontroller(@PathVariable String id){
        System.out.print("Deleted todo");
        return tservice.DeleteTodoService(id);
    }


}
