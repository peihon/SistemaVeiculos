package com.uniamerica.usuarioExemplo.controller;

import com.uniamerica.usuarioExemplo.model.Veiculo;
import com.uniamerica.usuarioExemplo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    private final VeiculoService veiculoService;

    @Autowired
    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @PostMapping
    public ResponseEntity<?> insereVeiculo(@RequestBody Veiculo veiculo) throws Exception {
        try {
            Veiculo veiculoSaved = veiculoService.createVeiculo(veiculo);
            return new ResponseEntity<>(veiculoSaved, null, HttpStatus.CREATED);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @GetMapping
    public ResponseEntity<?> listaTodos() {
        List<Veiculo> veiculoList = veiculoService.listaTodos();

        if (!veiculoList.isEmpty()) {
            return new ResponseEntity<>(veiculoList, null, HttpStatus.OK);

        }
        return new ResponseEntity<>(veiculoList, null, HttpStatus.NO_CONTENT);

    }

}