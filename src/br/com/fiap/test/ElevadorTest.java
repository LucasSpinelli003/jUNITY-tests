package br.com.fiap.test;

import br.com.fiap.model.Calculadora;
import br.com.fiap.model.Elevador;
import br.com.fiap.model.Pessoa;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElevadorTest {




    @Test
    public void testeEntradaElevador(){
        Elevador el = new Elevador();
        Pessoa jao = new Pessoa("Joao",20.0);

        Double result = el.entrarElevador(jao.getPeso());
        assertEquals(20,result,0);
    }
    @Test
    public void testeSaidaElevador(){
        Elevador el = new Elevador();
        Pessoa jao = new Pessoa("Joao",20.0);

        Double result = el.sairElevador(jao.getPeso());
        assertEquals(-20,result,0);
    }

    @Test
    public void avaliacaoPesoTesteElevador(){
        Elevador el = new Elevador();
        Pessoa jao = new Pessoa("Joao",25.0);

        boolean result = el.avaliarPeso(jao.getPeso());
        assertEquals(false,result);
    }

//    @Test
//    public void sinalAlertaTesteElevador(){
//        Pessoa jao = new Pessoa("Joao",500.0);
//        el.avaliarPeso(jao.getPeso());
//        boolean result = el.isSinalAlerta();
//        assertEquals(false,result);
//    }


}