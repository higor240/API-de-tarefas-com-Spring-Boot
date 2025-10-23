package com.crud.crud.controller;

import org.springframework.web.bind.annotation.RestController;

import com.crud.crud.entity.ToDo;
import com.crud.crud.service.TodoService;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;
    

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping
    List<ToDo> create (@RequestBody ToDo todo){
        return todoService.create(todo);

    }
    @GetMapping
     List<ToDo> list (){
        return todoService.list();

    }
    @PutMapping
     List<ToDo> update (@RequestBody ToDo todo){
        return todoService.update(todo);

    }
    @DeleteMapping("{id}")
     List<ToDo> delete (@PathVariable("id") Long id){
        return todoService.delete(id);

    }

}
