package com.uniamerica.usuarioExemplo.service;

import com.uniamerica.usuarioExemplo.model.Modelo;
import com.uniamerica.usuarioExemplo.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloService {

    private final ModeloRepository modeloRepository;

    @Autowired
    public ModeloService(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    public List<Modelo> listaTodos() {return modeloRepository.findAll(); }

    public List<Modelo> getByModelo(String modelo) { return modeloRepository.findByModelo(modelo); }

    public Modelo createModelo(Modelo modelo) {
        return  modeloRepository.save(modelo);
    }
}