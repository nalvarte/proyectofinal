/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hectornalvarte_nominas_eval1;

import java.util.Scanner;

/**
 *
 * @author Random
 */
public class Empleado {

   
   
    private String nombre;
    private static Double salarioBase;
    private Double plus;
    private int nHijos;
    
    //Constructor vacío de Empleado
    public Empleado(){
    }
    
    //Constructor con Parámetros: Nombre, Plus y número de hijos.
    public Empleado(String nombre,Double plus,int nHijos){
        this.nombre=nombre;
        this.plus=plus;
        this.nHijos=nHijos;
    }
    
    // Pide y cambia el salario base.
    public static void pedirSalarioB(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el Salario Base: ");
        salarioBase=sc.nextDouble();       
    }
    
    // Otra versión del método de antes, en esta pone "Nuevo salario" en vez de "Introduce salario".
     public static void pedirSalarioBase(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nuevo salario base: ");
        salarioBase=sc.nextDouble();
        
    }
    
     // Método que pide datos de un nuevo empleado.
    public void pedirDatos(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el nombre del empleado");
        setNombre(sc.nextLine());
        System.out.println("Introduce el plus de salario");
        setPlus((Double) sc.nextDouble());
        System.out.println("Introduce el numero de hijos");
        setnHijos(sc.nextInt());
        pedirSalarioB();
    }
    

    /**
     * @return nombre de empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return plus del empleado
     */
    public Double getPlus() {
        return plus;
    }

    /**
     * @return el número de hijos del empleado
     */
    public int getnHijos() {
        return nHijos;
    }
    
     /**
     * @return muestra el salario Base
     */
    public static Double getSalarioBase() {
        return salarioBase;
    }
    
     /**
     * @param sumarCifra para sumar la cifra que quieras al Salario Base
     */
    
    /*public static void sumarAlSalarioBase(Double sumarCifra) {
        salarioBase += sumarCifra;
    } */

    /**
     * @param nombre introduces el nuevo nombre por parámetro y cambias el anterior
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param plus  introduces el nuevo plus por parámetro y cambias el anterior
     */
    public void setPlus(Double plus) {
        this.plus = plus;
    }

    /**
     * @param nHijos introduces el nuevo número de hijos por parámetro y cambias el anterior
     */
    public void setnHijos(int nHijos) {
        this.nHijos = nHijos;
    }

    
}
