package com.molgiem;

import java.util.Scanner;

public class MainTema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int precioInicial = sc.nextInt();
        System.out.println("El precio final es de " + calcularIva(precioInicial) + " euros");
    }

    public static double calcularIva(int precio){
        return precio * 1.16;
    }
}
