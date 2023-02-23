package com.revature.SpringMVCDemo.Service;

import com.revature.SpringMVCDemo.Model.Todo;
import com.revature.SpringMVCDemo.Repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepo todoRepo;


    @Autowired
    public TodoService(TodoRepo todoRepo){
        this.todoRepo = todoRepo;
    }
    public List<Todo> getList(){
        return todoRepo.getTodoList();
    }

    public Todo getSingleTodo( int id) {
        return todoRepo.getTodoById(id);
    }

    public boolean addTodo(Todo todo){
        return todoRepo.addTodo(todo);
    }

}
