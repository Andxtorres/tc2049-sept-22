package com.items.todo.controllers;


import com.items.todo.models.Usuario;
import com.items.todo.repository.UsuarioRepository;
import com.items.todo.services.UsuarioService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    UsuarioRepository usuarioRepository;
    @PostMapping("/crear")
    public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<>(usuarioService.saveUser(usuario),HttpStatus.OK);
    }

    @PostMapping("login")
    public ResponseEntity<Map<String,Object>> login(@RequestBody Usuario usuario){
        try {
            String token = usuarioService.login(usuario);
            int id= usuarioRepository.findByEmail(usuario.getEmail()).getId();
            Map<String, Object> response = new HashMap<>();
            response.put("token", token);
            response.put("id",id);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (Exception e){
            Map<String, Object> response = new HashMap<>();
            response.put("mensaje",e.getMessage());
            return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
