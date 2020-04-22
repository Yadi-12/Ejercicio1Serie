//Realiza una serie en base a un numero introducido
//Autor: García Vásquez Yadira Dalila
import java.util.Scanner;
public class Serie
{// inicia la clase
  public static void main (String [] args){// inicio del metodo
    Scanner sc= new Scanner (System.in);// variable utilizada para leer desde el teclado
    System.out.println("Ingrese el numero del cual desea que comienze la serie, el número de la serie tendra que ser entero y positivo");// impresion
    //solicitando el numero del cual iniciara la serie
    int n=sc.nextInt();//se guarda en la variable n  el numero ingresado
    int n2;// se declara una variable que se usara mas adelante
    if(n>0){ // miestras el numero ingresado sea mayor que 0 realizara lo siguiente
         System.out.print(n);
          while(n>1){// inicio del while
         if(n%2==0){  // se compara la division de el numero entre dos con cero     
         n2=n/2;// se asigna el valor de la variable n2
         }else{
         n2=n*3+1;  //se asigna nuevo valor a la varible 
         } 
         n=n2;// n tomara un nuevo valor
         System.out.print(","+n2);// impresion de la serie
         } //fin del while
    }else if(n<0) {// si en numero es meno que sero simplemente lo imprimira
         System.out.println( n +", el numero tiene que ser positivo"); // impresion 
    }      
    }  // cierre del metodo
}// cierre de la clase

