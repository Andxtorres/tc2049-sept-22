package com.items.todo.services;

import com.items.todo.models.Todo;
import com.items.todo.models.Usuario;
import com.items.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public Todo saveTodo(Todo todo, Usuario usuario){
        todo.setUsuario(usuario);
        todoRepository.save(todo);
        return todo;
    }

    public Todo changeStatus(Todo todo){
        todo.setFinished(!todo.isFinished());
        todoRepository.save(todo);
        return todo;
    }
}
