package com.uniamerica.usuarioExemplo.controller;

import com.uniamerica.usuarioExemplo.model.Modelo;
import com.uniamerica.usuarioExemplo.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modelo")
public class ModeloController {

    private  final ModeloService modeloService;

    @Autowired
    public ModeloController(ModeloService modeloService) {
        this.modeloService = modeloService;
    }

    @PostMapping
    public ResponseEntity<?> insereModelo(@RequestBody Modelo modelo) throws Exception {
        try {
            Modelo modeloSaved = modeloService.createModelo(modelo);
            return new ResponseEntity<>(modeloSaved, null, HttpStatus.CREATED);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @GetMapping
    public ResponseEntity<?> listaTodos(){
        List<Modelo> modeloList = modeloService.listaTodos();

        if(!modeloList.isEmpty()){
            return new ResponseEntity<>(modeloList, null, HttpStatus.OK);

        }
        return new ResponseEntity<>(modeloList, null, HttpStatus.NO_CONTENT);

    }
