package com.revature.SpringMVCDemo.Controller;

import com.revature.SpringMVCDemo.Model.Todo;
import com.revature.SpringMVCDemo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RequestMapping(path = "/todo")
@RestController // Combines @Controller and @ResponseBody
public class TodoController {
    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable int id){
        Todo todo = todoService.getSingleTodo(id);
        return ResponseEntity.status(200).body(todo);
    }

//    public addTodo
//
//    public getList


}
