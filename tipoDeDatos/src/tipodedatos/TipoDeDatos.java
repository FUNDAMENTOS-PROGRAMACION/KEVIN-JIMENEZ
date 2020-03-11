/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodedatos;

import java.util.Arrays;

/**
 *
 * @author SISTEMAS CORP
 */
public class TipoDeDatos {

    /**
     * @param args the command line arguments
     */
    
    // enteros -32768 a 32767
    int numeroEntero = 10;
    double numeroDouble = 3;
    char letra = 'A';
    String caderna = "hola mundo"; 
    boolean valorBool = false; 
    // valorBool = true;
    boolean valorBoola = false;
    
    
   
    public static void main(String[] args) {  
        imprimirNombre();  
        sumar2Numeros(3,2);        
        System.out
        .println(sumar2Numeros(3,2));
        // TODO code application logic here
    }
                    
    
    public static void imprimirNombre(){
        // System.out.println("\n kevin \n jimenez \n");
        // System.out.println("kev\tin");
        String nombre = "kevin";
        // System.out.println(nombre.length());
        // System.out.println(nombre.trim());
        // System.out.println(nombre.toUpperCase());
        // System.out.println(nombre.toLowerCase());
        // System.out.println(nombre.replace(nombre, "1"));
        String [] arreglo =  nombre.split("");
        
        System.out.println(Arrays.toString(arreglo));
        
    }
    
    public static int sumar2Numeros
        (int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }
            
    
    // comentario de una linea        
    /*
    asdasdasdas
    asdasd
    asdas
    asdasd
    */
    
}
