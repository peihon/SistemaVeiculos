package com.uniamerica.usuarioExemplo.controller;

import com.uniamerica.usuarioExemplo.model.Marca;
import com.uniamerica.usuarioExemplo.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marca")
public class MarcaController {

    private  final MarcaService marcaService;

    @Autowired
    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @PostMapping
    public ResponseEntity<?> insereMarca(@RequestBody Marca marca) throws Exception {
        try {
            Marca marcaSaved = marcaService.createMarca(marca);
            return new ResponseEntity<>(marcaSaved, null, HttpStatus.CREATED);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @GetMapping
    public ResponseEntity<?> listaTodos(){
        List<Marca> marcaList = marcaService.listaTodos();

        if(!marcaList.isEmpty()){
            return new ResponseEntity<>(marcaList, null, HttpStatus.OK);

        }
        return new ResponseEntity<>(marcaList, null, HttpStatus.NO_CONTENT);

    }






}
