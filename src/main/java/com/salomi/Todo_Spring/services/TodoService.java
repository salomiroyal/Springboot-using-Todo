package com.salomi.Todo_Spring.services;

import com.salomi.Todo_Spring.model.Todomodel;
import com.salomi.Todo_Spring.repository.TodoRepo;
import com.salomi.Todo_Spring.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepo trepo;

     @Autowired
    public TodoService(@Qualifier("todorepository") TodoRepo trepo){
        this.trepo = trepo;
        System.out.println("Service cons:");
    }

    public List<Todomodel> GetTodoService(){
        return trepo.GetTodo();

    }

    public Todomodel PostTodoService(Todomodel entity){
        return trepo.PostTodo(entity);
    }

    public Todomodel PutTodoService(Todomodel entity, String _id){
        return trepo.PutTodo(_id,entity);
    }
    public String DeleteTodoService(String _id){
        return trepo.DeleteTodo(_id);
    }
}
