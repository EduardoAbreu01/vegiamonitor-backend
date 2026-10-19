// UsuarioRepository.java
package com.vegia.monitor.repository;

import com.vegia.monitor.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Optional<Usuario> findByCpfAndSenha(String cpf, String senha);
}