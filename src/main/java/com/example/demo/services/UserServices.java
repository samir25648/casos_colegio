package com.example.demo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelos.Usuario;
import com.example.demo.repository.UserRepository;

@Service

public class UserServices {
    @Autowired
    UserRepository userRepository;
    
    //SELECT * FROM usuarios WHERE user_id = ?
    public Usuario findByUserId(Long userId) {
        Usuario usuario = userRepository.findById(userId).orElseThrow();
        return usuario;
        
    }

    //SELECT * FROM usuarios
    public List<Usuario> findAllUsuario(){
        List<Usuario> usuarios = userRepository.findAll();
        return usuarios;
    }

    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    public Usuario crearUsuario(Usuario usuario){
        return userRepository.save(usuario);
    }

    public Usuario findByEmail(String email){
        return userRepository.findByEmail(email);
    }

}
