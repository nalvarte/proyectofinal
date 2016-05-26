/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hectornalvarte_nominas_eval1;

/**
 *
 * @author Random
 */
public class Menu {
    
    
    // parte del Menu (cabecera) que se podrá reutilizar en otros menús
    public static void cabecera(){
        System.out.println("\n**********************");
        System.out.println("*****  ACME***********");
        System.out.println("**********************\n");
    }
    
    // Menu principal
    public static void menuPrincipal(){
        cabecera();
        System.out.println("1.-Calcular la nómina\n");
        System.out.println("2.-Datos del empleado\n");
        System.out.println("3.-Salario Base\n");
        System.out.println("otro.-TERMINAR\n");
        System.out.print("ELIGE OPCIÓN: ");
    }
    // Menu que te deja elegir el empleado
    public static void menuEmpleados(){
        cabecera();
        System.out.println("1.- Em Uno");
        System.out.println("2.- Em Dos");
        System.out.println("3.- Em Tres");
        System.out.println("4.- Em Cuatro");
        System.out.println("5.- Em Cinco");
        System.out.println("6.- Em Seis");
        System.out.println("7.- Em Siete");
        System.out.println("8.- Em Ocho");
        System.out.println("9.- Em Nueve");
        System.out.println("10.- Juan Diez");
        System.out.println("Otro.- Volver a la pantalla anterior");
         System.out.print("Introduce el nº de empleado: ");
    }
    
    // Menu de cambiar los datos del empleado.
    public static void menuCambiar(Empleado em){
        cabecera();
        System.out.println("NOMBRE: "+em.getNombre()+"\n");
        System.out.println("HIJOS: "+em.getnHijos()+"\n");
        System.out.println("PLUS: "+em.getPlus()+"\n");
        
        System.out.println("1.-CAMBIAR NOMBRE\n");
        System.out.println("2.-CAMBIAR NUMERO DE HIJOS\n");
        System.out.println("3.-CAMBIAR PLUS\n");
        System.out.println("OTRO.-VOLVER\n");
        System.out.print("ELIGE OPCIÓN: ");
    }
}
