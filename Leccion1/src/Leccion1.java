
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angie
 */
public class Leccion1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String frase;
        final int maximo=127;
        int valor=0;
        String mostrar=" ";
        int randomNum = ThreadLocalRandom.current().nextInt(1,10);
        System.out.println("aleatorio: "+randomNum);
        do{
            System.out.println("Ingrese una frase: ");
            frase= sc.nextLine();
        }while(frase.isEmpty());
        for(int i=0; i<frase.length();i++){
            if(randomNum+frase.codePointAt(i)>maximo){
                int d=frase.codePointAt(i);
                //System.out.println("ascii: "+d);
                valor = frase.codePointAt(i)+randomNum-frase.codePointAt(i);
                mostrar =mostrar+String.valueOf(valor)+" ";
                //System.out.print(valor);
            }else{
              int d=frase.codePointAt(i);
            //  System.out.println("ascill: "+d);  
            valor = frase.codePointAt(i)+randomNum;
            mostrar =mostrar+String.valueOf(valor)+" ";
//            System.out.println(valor);
            }
        }
        System.out.println("cadena: "+mostrar);
    }
}
