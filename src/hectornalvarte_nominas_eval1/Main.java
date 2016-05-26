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
public class Main {

    public static void main(String[] args) {
       int opcion, opcionSecundaria;
       Scanner sc = new Scanner(System.in);
       Empleado e1 = new Empleado("Em1",100.0,1);
       Empleado e2 = new Empleado("Em2",200.0,0);
       Empleado e3 = new Empleado("Em3",300.0,3);  // Creamos los empleados.
       Empleado e4 = new Empleado("Em4",400.0,0);  
       Empleado e5 = new Empleado("Em5",500.0,5);  
       Empleado e6 = new Empleado("Em6",600.0,0);
       Empleado e7 = new Empleado("Em7",700.0,7);
       Empleado e8 = new Empleado("Em8",800.0,0);
       Empleado e9 = new Empleado("Em9",900.0,9);
       
       Empleado.pedirSalarioB();    //pide y cambia el salario base
       
       Empleado e10 = new Empleado(); // Crea el empleado 10
       e10.pedirDatos();   // pide los datos del empleado 10
       
       Nomina nomina1 = new Nomina();  // crea una nueva nomina
       Fecha fecha1 = new Fecha();   // crea una nueva fecha
      
       do{
          
           Menu.menuPrincipal();   // muestra el menú principal
           opcion=sc.nextInt();     // recoge la opción
           
           if(opcion==1){
                fecha1.pedirFecha();        // pide la fecha
               do{
                    Menu.menuEmpleados();       // muestra menú empleados
                    opcionSecundaria=sc.nextInt();  // recoge la opción
                    switch(opcionSecundaria){
                        case 1: 
                          nomina1.hacerNomina(fecha1,e1);   // hace la nomina del empleado que le pasemos por parámetro.
                            break;
                        case 2:                        
                          nomina1.hacerNomina(fecha1,e2);
                            break;
                        case 3:        
                          nomina1.hacerNomina(fecha1,e3);  
                            break;
                        case 4:      
                          nomina1.hacerNomina(fecha1,e4);  
                            break;
                        case 5: 
                          nomina1.hacerNomina(fecha1,e5);  
                            break;
                        case 6:
                          nomina1.hacerNomina(fecha1,e6);  
                            break;
                        case 7:                         
                          nomina1.hacerNomina(fecha1,e7);  
                            break;
                        case 8:                        
                          nomina1.hacerNomina(fecha1,e8);  
                            break;
                        case 9:                          
                          nomina1.hacerNomina(fecha1,e9);  
                            break;
                        case 10:                         
                          nomina1.hacerNomina(fecha1,e10);  
                            break;
                        default:
                            break;
                    }    
                }while(opcionSecundaria>0 && opcionSecundaria<11);      // mientras la opcion sea válida se repite
           }
          else if(opcion==2){
               
               do{
                    Menu.menuEmpleados();   // muestra menú empleados
                    opcionSecundaria=sc.nextInt();  // recoge opción
                    
                    switch(opcionSecundaria){
                        case 1: 
                           cambiarDatosEM(e1);      // Metódo hecho en la clase Main (más abajo): cambia los datos 
                            break;                  // que le digas más adelante del empleado que le pases por parámetros.
                        case 2:
                           cambiarDatosEM(e2);     
                            break;
                        case 3: 
                           cambiarDatosEM(e3);
                            break;
                        case 4:
                           cambiarDatosEM(e4);
                            break;
                        case 5: 
                           cambiarDatosEM(e5);
                            break;
                        case 6:
                           cambiarDatosEM(e6);
                            break;
                        case 7: 
                           cambiarDatosEM(e7);
                            break;
                        case 8:
                           cambiarDatosEM(e8);
                            break;
                        case 9: 
                           cambiarDatosEM(e9);
                            break;
                        case 10:
                           cambiarDatosEM(e10);
                            break;
                        default:
                            break;
                    }    
                }while(opcionSecundaria>0 && opcionSecundaria<11);       // mientras la opcion sea válida se repite
             
          }
          else if(opcion==3){
              Empleado.pedirSalarioBase();  // pide y cambia el salario Base
          }
           
       }while(opcion>0 && opcion<4);     // mientras la opcion sea válida se repite
       
       
      
    }
    
     public static void cambiarDatosEM(Empleado em){
            Scanner sc = new Scanner(System.in);
            int op;
 
            do{
                Menu.menuCambiar(em);       // Muestra el menú de: Cambiar Nombre, Cambiar nº hijo... etc
                op=sc.nextInt();            // recoge opción
                
                
                if(op>0 && op<2){
                    System.out.print("Nuevo nombre: ");
                    em.setNombre(sc.nextLine());
                    em.setNombre(sc.nextLine()); //Le pongo dos veces que recoja la línea porque
                 }                               //la primera recoge el <Intro> y la segunda el valor que queremos
                 else if(op==2){
                   System.out.print("Nuevo número hijos: ");
                   em.setnHijos(sc.nextInt());         // cambia el numero de hijos     
                 }
                 else if(op==3){
                   System.out.print("Nuevo plus: ");
                   em.setPlus(sc.nextDouble());     // cambia el Plus
                 }
                 
            }while(op>0 && op<4);       // mientras la opcion sea válida se repite
    }
 }
    

