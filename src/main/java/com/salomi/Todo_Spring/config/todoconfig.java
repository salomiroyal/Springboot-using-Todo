package com.salomi.Todo_Spring.config;

import com.salomi.Todo_Spring.repository.InMemoryTodoRepo;
import com.salomi.Todo_Spring.repository.MongoTodoRepo;
import com.salomi.Todo_Spring.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class todoconfig {

    @Value("${storage}")
    private String storetype;

    @Autowired
    private MongoTodoRepo mongotodorepo;

    @Autowired
    private InMemoryTodoRepo inmemoryrepo;

    @Bean(name = "todorepository")
    public TodoRepo todoRepo(){

        if("inmemoryrepo".equals(storetype)){
            System.out.print("inmemoryrepository");
            return inmemoryrepo;
        }
        System.out.println("Mongo repo");
        return mongotodorepo;

    }
}

