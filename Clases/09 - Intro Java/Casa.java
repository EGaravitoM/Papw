/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author bena8
 */
public class Casa {
    
    static int o;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Afuera();
    }
    
    public static void Afuera(){
        System.out.println("Estás afuera.");
        System.out.println("¿Quieres entrar?");
        System.out.println("1. Sí \n2. No");
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        
        if(o == 1){
            Adentro();
        }
    }
    
    public static void Adentro(){
        System.out.println("Estás adentro.");
        System.out.println("¿Quieres salir?");
        System.out.println("1. Sí \n2. No");
        Scanner scanner = new Scanner(System.in);
        o = scanner.nextInt();
        scanner.nextLine();
        
        if(o == 1){
            Afuera();
        }
    }
    
}
