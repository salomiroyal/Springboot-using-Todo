package com.salomi.Todo_Spring.repository;

import com.salomi.Todo_Spring.model.Todomodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Primary
@Repository
public class MongoTodoRepo implements TodoRepo{

    @Autowired
    private MongoRepo mrepo;

    @Override
    public List<Todomodel> GetTodo() {
        System.out.print("get_todo");
        return mrepo.findAll();
    }

    @Override
    public Todomodel PostTodo(Todomodel entity) {
        System.out.print("PostTodo:" + entity);
        return mrepo.save(entity);
    }

    @Override
    public Todomodel PutTodo(String id, Todomodel entity) {
        Todomodel oldEntity = mrepo.findById(id).get();
        oldEntity.setTitle(entity.getTitle());
        oldEntity.setDescription(entity.getDescription());
        return mrepo.save(oldEntity);
    }

    @Override
    public String DeleteTodo(String id) {
        mrepo.deleteById(id);
        return id;
    }
}
