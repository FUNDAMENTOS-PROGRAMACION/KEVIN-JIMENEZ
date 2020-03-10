/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodedatos;

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
        System.out.println("kevin");
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
