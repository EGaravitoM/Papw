/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea9;
import java.util.Scanner;

/**
 *
 * @author erneg_qpzhumf
 */
public class Tarea9 {

    static int player =0, opc=0, cpu =0, opca;
    static boolean continua = true, ppt = true, casa = true, mal = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        do {
        System.out.println("¿Desea jugar o recorrer la casa?");
        System.out.println("1. Jugar\n2. Recorrer la casa\n3. Ya dejame empaz");
        Scanner scanner = new Scanner(System.in);
        opc = scanner.nextInt();
        scanner.nextLine();
        
        switch(opc){
            case 1: ppc();
                    continua = true;
                break;
                
            case 2: casita();
                    continua = true;
                break;
                
            case 3:  System.out.println("Oye, tranquilo viejo");
                        continua = false;
                break;
            
            default:  System.out.println("Escoje una opción valida plox QQ");
                        continua = true;
                      
                
        }
        
        }while(continua);
    }
    
    public static void ppc(){
        
        int opppt;
        mal = true;
        do{
        System.out.println("Elija piedra, papel o tijera");
        System.out.println("1. Piedra\n2. Papel\n3. Tijera");
        Scanner scanner = new Scanner(System.in);
        player = scanner.nextInt();
        scanner.nextLine();
        cpu = (int)Math.ceil(Math.random()*3);
        
        switch(player){
        
            case 1: 
                switch(cpu){
                    case 1: System.out.println("Ambos escogieron piedra, es un EMPATE");
                        break;
                    case 2: System.out.println("La CPU escogió papel, PERDISTE");
                        break;
                    case 3: System.out.println("La CPU escogió tijera, GANASTE");
                        break;
                    default: System.out.println("Ups, algo programé mal XD");
                        break;
                }
                break;
            
            case 2:
                switch(cpu){
                    case 1: System.out.println("La CPU escogió piedra, GANASTE");
                        break;
                    case 2: System.out.println("Ambos escogieron papel, es un EMPATE");
                        break;
                    case 3: System.out.println("La CPU escogió tijera, PERDISTE");
                        break;
                    default: System.out.println("Ups, algo programé mal XD");
                        break;
                }
                break;
                
            case 3:
                switch(cpu){
                    case 1: System.out.println("La CPU escogió piedra, PERDISTE");
                        break;
                    case 2: System.out.println("La CPU escogió papel, GANASTE");
                        break;
                    case 3: System.out.println("Ambos escogieron tijera, es un EMPATE");
                        break;
                    default: System.out.println("Ups, algo programé mal XD");
                        break;
                }
                break;
        
        }
        
        do{
        System.out.println("Desea volver a jugar");
        System.out.println("1. Si\n2. No");
        scanner = new Scanner(System.in);
        opppt = scanner.nextInt();
        scanner.nextLine();
        
        if(opppt == 2){
            ppt = false;
            mal = false;
        }
        else if(opppt == 1){
            ppt = true;
            mal = false;
        }
        else{
            mal = true;
            System.out.println("Por favor elija una opción valida");
        }
        }while(mal);
        
        }while(ppt);
       
        
    }
    
    public static void casita(){
        PP();
    }
    
    public static void PP(){
        System.out.println("¿Desea entra a la casa?");
        System.out.println("1. Si\n2. No");
        Scanner scanner = new Scanner(System.in);
        opca = scanner.nextInt();
        scanner.nextLine();
        
        if(opca == 1){
            sala();
        }
        else{
            System.out.println("Ciao");
        }
    }
    
    public static void sala(){
        System.out.println("¿Desea ir a la cocina o salir?");
        System.out.println("1. Cocina\n2. Salir");
        Scanner scanner = new Scanner(System.in);
        opca = scanner.nextInt();
        scanner.nextLine();
        
        if(opca == 1){
            cocina();
        }
        else{
            PP();
        }
    }
    
    public static void cocina(){
        System.out.println("¿Desea ir a la jardin o sala?");
        System.out.println("1. Jardin\n2. Sala");
        Scanner scanner = new Scanner(System.in);
        opca = scanner.nextInt();
        scanner.nextLine();
        
        if(opca == 1){
            jardin();
        }
        else{
            sala();
        }
        
    }
    
    public static void jardin(){
        System.out.println("¿Desea ir a la cocina o saltar la varda?");
        System.out.println("1. Cocina\n2. Saltar la varda");
        Scanner scanner = new Scanner(System.in);
        opca = scanner.nextInt();
        scanner.nextLine();
        
        if(opca == 1){
            cocina();
        }
        else{
            System.out.println("Ciao");
        }
    }
    
    
}
    
