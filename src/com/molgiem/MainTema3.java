package com.molgiem;

public class MainTema3 {
    public static void main(String[] args) {

        String[] nms = {"Carlos", "Raul", "Monica"};

        concatenate(nms);

    }

    public static String concatenate(String[] items){
        String result = "";
        for(String i: items){
            result += " " + i;
        }
        System.out.println(result);
        return result;
    }


}
