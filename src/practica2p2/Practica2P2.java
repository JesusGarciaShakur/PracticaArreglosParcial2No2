/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ashkh
 */
public class Practica2P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    
    String entrada;
    int t;
    int min = 0;
    int par = 0;
    int impar = 0;
    int max = 0; 
    
    int[] arreglo;
            System.out.println("escriba el tamaño del arreglo: ");
            System.out.println("-----------------------------");
            entrada = bufer.readLine();
             t=Integer.parseInt(entrada);
             
             arreglo= new int[t];
             
             System.out.println("llenado del arreglo de "+arreglo.length+" espacios ");
             System.out.println("---------------------------------------------");
             for(int i=0;i<t;i++){
             System.out.println("ingrese el valor ["+i+"] del arreglo");
             entrada = bufer.readLine();
             arreglo[i]=Integer.parseInt(entrada);
             }
     
             for (int recorrido:arreglo){
             if(recorrido>max){
                 max=recorrido;
             }
             if(recorrido<min){
                 min=recorrido;
             }
               
             }
             for (int recorridopar:arreglo){
             if (recorridopar %2==0){
             par++;
            } else{
                 impar++;
             }
        }
             System.out.println("maximo es: "+max);
             System.out.println("-------------");
             System.out.println("el minimo es: "+min);
             System.out.println("---------------");
             
             System.out.println("los pares son: "+par);
             System.out.println("----------------");
             System.out.println("los impares son: "+impar);
             System.out.println("--------------------");
    
    
    }   
    }