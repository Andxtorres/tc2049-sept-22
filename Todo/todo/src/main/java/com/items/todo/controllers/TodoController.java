package com.items.todo.controllers;


import com.items.todo.models.Todo;
import com.items.todo.models.Usuario;
import com.items.todo.repository.TodoRepository;
import com.items.todo.repository.UsuarioRepository;
import com.items.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/todo")
public class TodoController {

    @Autowired
    TodoService todoService;
    @Autowired
    TodoRepository todoRepository;
    @Autowired
    UsuarioRepository usuarioRepository;
    @PostMapping("/crear/{usuario_id}")
    @CrossOrigin
    public ResponseEntity<Todo> crearTodo(@RequestBody Todo todo, @PathVariable("usuario_id") int usuarioId){
        Usuario user= usuarioRepository.findById(usuarioId).get();
        todoService.saveTodo(todo,user);
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

    @GetMapping("/todos/{userId}")
    @CrossOrigin
    public ResponseEntity<List<Todo>> obtenerTodosDelUsuario(@PathVariable("userId") int id){
        Usuario usuario=usuarioRepository.findById(id).get();
        return new ResponseEntity<>(todoRepository.findByUsuario(usuario),HttpStatus.OK);
    }

    @GetMapping("/status-change/{todoId}")
    @CrossOrigin
    public ResponseEntity<Todo> cambiarStatusTodo(@PathVariable("todoId") int todoId){
        Todo todo = todoRepository.findById(todoId).get();
        todoService.changeStatus(todo);
        return new ResponseEntity<>(todo,HttpStatus.OK);
    }

}
