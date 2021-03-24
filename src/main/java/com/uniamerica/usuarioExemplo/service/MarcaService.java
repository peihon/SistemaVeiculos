package com.uniamerica.usuarioExemplo.service;

import com.uniamerica.usuarioExemplo.model.Marca;
import com.uniamerica.usuarioExemplo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {

    private final MarcaRepository marcaRepository;

    @Autowired
    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public List<Marca> listaTodos() {return marcaRepository.findAll(); }

    public List<Marca> getByMarca(String marca) { return marcaRepository.findByMarca(marca); }

    public Marca createMarca(Marca marca) {
        return  marcaRepository.save(marca);
    }
}
