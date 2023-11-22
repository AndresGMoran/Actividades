package com.andresmcon.Actividades;

public class Actividad01 {
    public String primeraLetraMayus(String palabra){
    StringBuilder sb = new StringBuilder();
    sb.append(Character.toUpperCase(palabra.charAt(0))); //Le decimos que el caracter en la posicion 0 de la palabra se cambie por mayuscula
    sb.append(palabra.substring(1)); //Coge desde la poscion 1 hasta el final de la palabra
    return sb.toString();
    }
}
