package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelos.Usuario;

@Repository

public interface UserRepository extends JpaRepository<Usuario, Long> {
    
    Boolean existsByEmail(String email);
    Usuario findByEmail(String email);
}
