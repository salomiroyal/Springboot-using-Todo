package com.salomi.Todo_Spring.repository;

import com.salomi.Todo_Spring.model.Todomodel;

import java.util.List;

public interface TodoRepo {
    public List<Todomodel> GetTodo();
    public Todomodel PostTodo(Todomodel Entity);
    public Todomodel PutTodo(String id,Todomodel Entity );
    public String DeleteTodo(String id);


}

