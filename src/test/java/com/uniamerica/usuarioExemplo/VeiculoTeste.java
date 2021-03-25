package com.uniamerica.usuarioExemplo;

import com.uniamerica.usuarioExemplo.model.Veiculo;
import com.uniamerica.usuarioExemplo.service.VeiculoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VeiculoTeste {

    @Autowired
    private VeiculoService veiculoService;

    @Test
    void createVeiculo (){
        Veiculo veiculo=new Veiculo();
        veiculo.setVeiculo("Teste03");

        Veiculo resultDb=veiculoService.createVeiculo(veiculo);
        Assertions.assertEquals(veiculo,resultDb);
    }
}
