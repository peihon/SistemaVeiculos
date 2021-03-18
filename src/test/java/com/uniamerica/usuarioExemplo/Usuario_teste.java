package com.uniamerica.usuarioExemplo;

import com.uniamerica.usuarioExemplo.model.Usuario;
import com.uniamerica.usuarioExemplo.service.UsuarioService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Usuario_teste {

    @Autowired
    private UsuarioService usuarioService;

    @Test
    void insereUsuario(){

        Usuario usuario = new Usuario();
        usuario.setNome("roberto");
        usuario.setEmail("roberto@gmail.com");
        usuario.setTelefone("45123456789");

        Usuario usrSaved = usuarioService.insereUsuario(usuario);

        Assertions.assertEquals(usuario, usrSaved);
    }


    @Test
    void listarTodos(){

        Usuario usuario = new Usuario();
        usuario.setNome("roberto");
        usuario.setEmail("roberto@gmail.com");
        usuario.setTelefone("45123456789");

        Usuario usuario2 = new Usuario();
        usuario2.setNome("roberto2");
        usuario2.setEmail("roberto@gmail2.com");
        usuario2.setTelefone("4512345678922");

        usuarioService.insereUsuario(usuario);
        usuarioService.insereUsuario(usuario2);

        List<Usuario> lista = usuarioService.listaTodos();

        Assertions.assertEquals(2, lista.size());
    }

    @Test
    void getByName(){

        Usuario usuario = new Usuario();
        usuario.setNome("roberto3");
        usuario.setEmail("roberto@gmail.com");
        usuario.setTelefone("45123456789");

        usuarioService.insereUsuario(usuario);

        List<Usuario> result = usuarioService.getByName(usuario.getNome());

        Assertions.assertEquals(1, result.size());
    }


}
