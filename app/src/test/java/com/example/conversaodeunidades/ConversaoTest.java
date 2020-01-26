package com.example.conversaodeunidades;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConversaoTest {
    @Test
    public void ConvertePolegadasParaCM(){
        double valorEsperado = 2.54;
        double polegadas = 1;
        double valorReal;

        Conversao c = new Conversao();

        valorReal = c.Polegadas(polegadas);

        assertEquals(valorEsperado, valorReal);
    }

    @Test
    public void ConverteCentimetrosParaPolegada(){
        double valorEsperado = 2.54;
        double centimetros = 2.54;
        double valorReal;

        Conversao c = new Conversao();

        valorReal = c.Centimetros(centimetros);

        assertEquals(valorEsperado, valorReal);
    }
}
