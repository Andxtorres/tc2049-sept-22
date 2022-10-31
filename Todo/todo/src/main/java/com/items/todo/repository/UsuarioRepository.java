package com.items.todo.repository;

import com.items.todo.models.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {
    Usuario findByEmail(String email);
}
