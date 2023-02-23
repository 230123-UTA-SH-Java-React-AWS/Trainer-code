package com.revature.SpringMVCDemo.Controller;

import com.revature.SpringMVCDemo.Model.Todo;
import com.revature.SpringMVCDemo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RequestMapping(path = "/todo")
@RestController // Combines @Controller and @ResponseBody
public class TodoController {
    private TodoService todoService;

    //Constructor injection
    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

//
//    @GetMapping("/{id}")
//    public ResponseEntity<Todo> getTodoById(@PathVariable int id){
//        Todo todo = todoService.getSingleTodo(id);
//        return ResponseEntity.status(200).body(todo);
//    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET) //todo/{id}
    public ResponseEntity<Todo> getTodoById(@PathVariable int id){
        Todo todo = todoService.getSingleTodo(id);
        return ResponseEntity.status(200).body(todo);
    }


//    public addTodo
    @PostMapping // /todo
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo){
        todoService.addTodo(todo);
        return ResponseEntity.status(200).body(todo);
    }
//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<Todo> getTodoById(@PathVariable int id){
//        Todo todo = todoService.getSingleTodo(id);
//        return ResponseEntity.status(200).body(todo);
//    }
////
//    public getList

    @GetMapping // /todo
    public List<Todo> getAllTodos(){
        return todoService.getList();
    }

}
