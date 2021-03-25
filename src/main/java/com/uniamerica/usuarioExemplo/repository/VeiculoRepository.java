package com.uniamerica.usuarioExemplo.repository;

import com.uniamerica.usuarioExemplo.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByVeiculo(String veiculo);
    List<Veiculo> findByPlaca(String placa);

}
