package com.example.sumaisac;
import java.util.ArrayList;
import java.util.Iterator;

public class Operacion {
    public int suma(ArrayList<Integer> numeros){
        int resultado=0;
        for (Integer numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
}

