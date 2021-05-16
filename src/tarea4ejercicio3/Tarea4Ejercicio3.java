/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4ejercicio3;
import java.util.Scanner;
/**
 *
 * @author ROCIO
 */
public class Tarea4Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menor =0;
        int mayor=0;
        int n=1;
        int promedio =0;
        int distancia=0;
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        for(int i =1;i<numero;i++){
        n=n+i;
            System.out.println(i);
            if(menor<i){menor=i;}
            else if(mayor>i){mayor=i;} 
        }
        promedio=n/numero;
        distancia =mayor-menor;
        System.out.println("El promedio del número es "+promedio);
        System.out.println("El número menor es "+menor);
        System.out.println("El número mayor es "+mayor);
        System.out.println("La distancia entre los números es "+distancia);
        System.out.println("");
    }
    
}
