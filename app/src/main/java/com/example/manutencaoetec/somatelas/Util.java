package com.example.manutencaoetec.somatelas;


import java.util.Locale;

public class Util {
     public String Teste(double numero){
         double numeroteste = Math.floor(numero);
         if (numero - numeroteste == 0){
             return String.format(Locale.ENGLISH, "%.0f", numero);
         }
         else{
             return String.format(Locale.ENGLISH, "%.2f", numero);
         }
     }

}
