package com.uniamerica.usuarioExemplo.service;

import com.uniamerica.usuarioExemplo.model.Usuario;
import com.uniamerica.usuarioExemplo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario insereUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listaTodos() {
        return usuarioRepository.findAll();
    }

    public List<Usuario> getByName(String nome) {
        return usuarioRepository.findByNome(nome);
    }
}
