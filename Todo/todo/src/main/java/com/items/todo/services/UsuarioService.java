package com.items.todo.services;
import com.items.todo.authentication.TokenManager;
import com.items.todo.models.Usuario;
import com.items.todo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    BCryptPasswordEncoder encoder;
    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    TokenManager tokenManager;

    public Usuario saveUser(Usuario user){
        user.setPassword(encoder.encode(user.getPassword()));
        usuarioRepository.save(user);
        return user;
    }

    public String login(Usuario user) throws Exception{
        Usuario usuarioDeDb= usuarioRepository.findByEmail(user.getEmail());
        if(encoder.matches(user.getPassword(), usuarioDeDb.getPassword())){
            return tokenManager.getJWTToken(user.getEmail());
        }
        throw new Exception("Credenciales invalidas");
    }


}
