package com.vegia.monitor.repository;

import com.vegia.monitor.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Usado na tela de login para validar credenciais por E-mail
    Optional<Usuario> findByEmail(String email);

    // Usado na tela de login para validar credenciais por CPF
    Optional<Usuario> findByCpf(String cpf);
}