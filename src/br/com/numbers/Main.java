package br.com.numbers;

import br.com.numbers.business.NumbersBusiness;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static float LIMIT = 1000000;

    public static void main(String[] args) throws IOException {

        String strC = new String();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String strA = "";
        String strB = "";
        int a = 0;
        int b = 0;
        String strLimit;
        Float limit;

        while(strA.isEmpty()){
            System.out.println("Colocar o valor de A:");
            strA =  br.readLine();
        }

        try{
            a = Integer.valueOf(strA).intValue();
            System.out.println("\n");
        }catch(NumberFormatException nfe){
            System.out.println("Valor A Incorreto ");
            System.exit(0);
        }

        while(strB.isEmpty()){
            System.out.println("Colocar o valor de B:");
            strB =  br.readLine();
        }


        try{
            b = Integer.valueOf(strB).intValue();
            System.out.println("\n");
        }catch(NumberFormatException nfe){
            System.out.println("Valor B Incorreto ");
            System.exit(0);
        }

        System.out.println("\n");

        System.out.println("Definir limite (Padrão 1000000): ");
        strLimit =  br.readLine();

        if(strLimit.isEmpty()){
            limit = LIMIT;
        }else{
            limit = Float.valueOf(strLimit).floatValue();
        }

        System.out.println("\n");

        strC = NumbersBusiness.calculateNewNumber(a,b,limit);
        System.out.println(strC);

    }
}
