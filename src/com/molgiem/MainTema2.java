package com.molgiem;

public class MainTema2 {
    public static void main(String[] args) {
        double precioInicial = 10.15;
        System.out.println("El precio final es de " + calcularIva(precioInicial) + " euros");
    }

    public static double calcularIva(double precio){
        return precio * 1.16;
    }
}
