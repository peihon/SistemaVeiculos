package com.uniamerica.usuarioExemplo.model;

import javax.persistence.*;

@Entity
@Table(name = "Modelo")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Modelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

}
