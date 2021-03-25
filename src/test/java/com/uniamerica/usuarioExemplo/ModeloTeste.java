package com.uniamerica.usuarioExemplo;

import com.uniamerica.usuarioExemplo.model.Modelo;
import com.uniamerica.usuarioExemplo.service.ModeloService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ModeloTeste{

    @Autowired
    private ModeloService modeloService;

    @Test
    void createModelo (){
            Modelo modelo=new Modelo();
            modelo.setModelo("Teste02");

            Modelo resultDb=modeloService.createModelo(modelo);
            Assertions.assertEquals(modelo,resultDb);
            }
}