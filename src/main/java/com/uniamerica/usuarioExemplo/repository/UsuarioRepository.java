package com.uniamerica.usuarioExemplo.repository;

import com.uniamerica.usuarioExemplo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    List<Usuario> findByNome(String nome);


}
