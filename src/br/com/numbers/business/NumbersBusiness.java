package br.com.numbers.business;

public class NumbersBusiness {


    public static String calculateNewNumber(int A, int B, Float limit){

        String strA = String.valueOf(A);
        String strB = String.valueOf(B);
        String strC = new String();

        int numDigitosMaiorInteiro
                = strA.length() > strB.length() ?
                strA.length() : strB.length();

        int positionA = 0;
        int positionB = 0;

        for(int i = numDigitosMaiorInteiro; i>0; i--){
            if(positionA < strA.length()) {
                strC = strC + strA.charAt(positionA);
                positionA++;
            }

            if(positionB < strB.length()) {
                strC = strC + strB.charAt(positionB);
                positionB++;
            }
        }

        float f = Float.parseFloat(strC);

        if(f > limit){
            return "-1";
        }

        return strC;

    }

}
