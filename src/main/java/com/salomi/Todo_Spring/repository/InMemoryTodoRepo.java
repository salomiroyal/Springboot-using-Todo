
package com.salomi.Todo_Spring.repository;
import com.salomi.Todo_Spring.model.Todomodel;
import com.salomi.Todo_Spring.services.TodoService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 @Repository
 public class InMemoryTodoRepo implements TodoRepo {

        private final Map<String, Todomodel> todoMap = new HashMap<>();

    @Override
    public List<Todomodel> GetTodo() {
        return new ArrayList<>(todoMap.values());
    }

    @Override
    public Todomodel PostTodo(Todomodel todo) {
        System.out.println("In memory post:" + todo);
        if (todo.get_id() == null) {
            todo.set_id(generateNewId());
        }
        todoMap.put(todo.get_id(), todo);
        return todo;
    }

    @Override
    public Todomodel PutTodo(String id, Todomodel updatedtodo) {
        if (todoMap.containsKey(id)) {
            updatedtodo.set_id(id);
            todoMap.put(id, updatedtodo);
            return updatedtodo;
        }
        return null;
    }

    @Override
    public String DeleteTodo(String id) {
        todoMap.remove(id);
        return id;
    }

    private String generateNewId() {
        System.out.println("generate id");
        return String.valueOf(todoMap.size() + 1);
    }


    }



