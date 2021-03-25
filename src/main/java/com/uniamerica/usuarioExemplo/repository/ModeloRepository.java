package com.uniamerica.usuarioExemplo.repository;

import com.uniamerica.usuarioExemplo.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {

    List<Modelo> findByModelo(String modelo);

}
