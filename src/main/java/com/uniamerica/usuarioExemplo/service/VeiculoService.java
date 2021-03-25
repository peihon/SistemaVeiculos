package com.uniamerica.usuarioExemplo.service;

import com.uniamerica.usuarioExemplo.model.Modelo;
import com.uniamerica.usuarioExemplo.model.Veiculo;
import com.uniamerica.usuarioExemplo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    @Autowired
    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public List<Veiculo> listaTodos() {return veiculoRepository.findAll(); }

    public List<Veiculo> getByVeiculo(String veiculo) {return veiculoRepository.findByVeiculo(veiculo); }

    public List<Veiculo> getByPlaca(String placa) {return veiculoRepository.findByPlaca(placa); }

    public Veiculo createVeiculo(Veiculo veiculo) {
        return  veiculoRepository.save(veiculo);
    }


}
