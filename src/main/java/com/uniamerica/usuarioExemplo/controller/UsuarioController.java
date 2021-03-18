package com.uniamerica.usuarioExemplo.controller;

import com.uniamerica.usuarioExemplo.model.Usuario;
import com.uniamerica.usuarioExemplo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<?> insereUsuario(@RequestBody Usuario usuario) throws Exception {
        try{
            Usuario usuarioSaved = usuarioService.insereUsuario(usuario);
            return new ResponseEntity<>(usuarioSaved, null, HttpStatus.CREATED);
        }catch (Exception e){
            throw new Exception(e);
        }
    }

    @GetMapping
    public ResponseEntity<?> listaTodos(){
        List<Usuario> usuarioList = usuarioService.listaTodos();

        if(!usuarioList.isEmpty()){
            return new ResponseEntity<>(usuarioList, null, HttpStatus.OK);
        }
        return new ResponseEntity<>(usuarioList, null, HttpStatus.NO_CONTENT);
    }

    @GetMapping("name/{name}")
    public ResponseEntity<?> listaPorNome(@PathVariable String name){

        List<Usuario> list = usuarioService.getByName(name);

        if(!list.isEmpty()){
            return new ResponseEntity<>(list,null,HttpStatus.OK);
        }
        return new ResponseEntity<>(list,null,HttpStatus.NO_CONTENT);
    }




}
