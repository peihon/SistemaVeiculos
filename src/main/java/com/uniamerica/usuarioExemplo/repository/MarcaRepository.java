package com.uniamerica.usuarioExemplo.repository;

import com.uniamerica.usuarioExemplo.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {

    List<Marca> findByMarca(String marca);
    List<Marca> findByModelo(String modelo);

}
