package com.example.conversaodeunidades;

public class Conversao {

    public double Polegadas(double polegadas){
        double resultado;
        double centimetros = 2.54;

        resultado=centimetros*polegadas;

        return resultado;
    }

    public double Centimetros(double centimetros){
        double resultado;

        resultado= centimetros/2.54;

        return resultado;
    }
}
