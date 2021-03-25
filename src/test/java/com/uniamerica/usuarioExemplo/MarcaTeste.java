package com.uniamerica.usuarioExemplo;

import com.uniamerica.usuarioExemplo.model.Marca;
import com.uniamerica.usuarioExemplo.service.MarcaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MarcaTeste {

    @Autowired
    private MarcaService marcaService;

    @Test
    void createMarca () {
        Marca marca = new Marca();
        marca.setMarca("Teste01");

        Marca resultDb = marcaService.createMarca(marca);
        Assertions.assertEquals(marca, resultDb);
    }

}
