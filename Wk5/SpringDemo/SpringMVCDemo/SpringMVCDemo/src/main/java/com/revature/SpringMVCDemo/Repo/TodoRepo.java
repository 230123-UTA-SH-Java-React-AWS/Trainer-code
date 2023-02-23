package com.revature.SpringMVCDemo.Repo;

import org.springframework.stereotype.Repository;
import com.revature.SpringMVCDemo.Model.Todo;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoRepo {
    private List<Todo> todos;

    public TodoRepo(){
        todos = new ArrayList<>();
        todos.add(new Todo(1, "Finish the Project", false));
        todos.add(new Todo(2, "Clean Room", false));
    }

    public List<Todo> getTodoList()
    {
        return todos;
    }

    public Todo getTodoById(int id){
        return todos.get(id -1);
    }

    public boolean addTodo(Todo todo){
        todos.add(todo);
        return true;
    }

}
