package com.items.todo.repository;

import com.items.todo.models.Todo;
import com.items.todo.models.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo,Integer> {
    List<Todo> findByUsuario(Usuario usuario);
}
