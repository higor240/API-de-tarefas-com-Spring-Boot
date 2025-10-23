package com.crud.crud.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.crud.crud.entity.ToDo;
import com.crud.crud.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<ToDo> create (ToDo todo){
        todoRepository.saveAndFlush(todo);
        return list();
    }

    public List<ToDo> list (){
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending());

        return todoRepository.findAll(sort);

    }

    public List<ToDo> update (ToDo todo){
        todoRepository.saveAndFlush(todo);
        return list();
    }

    public List<ToDo> delete (Long id){
        todoRepository.deleteById(id);

        return list();
    }

    

}
