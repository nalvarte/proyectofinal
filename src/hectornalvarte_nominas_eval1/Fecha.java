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
public class Fecha {
    private int dia, mes, anio;
    
    // constructor vacío de Fecha
    public Fecha(){
    }
    
    // constructor de Fecha con los parametros: dia, mes y año
    public Fecha(int dia,int mes,int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
    
    //metodo para saber si el año es bisiesto o no
    public boolean esBisiesto(){
        if(anio%4==0 && anio%100!=0 || anio%4000==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    //metodo para saber si el dia y el mes son correctos
    public boolean validarDia(){
            if(getMes()==1 || getMes()==3 || getMes()==5 || getMes()==7 || getMes()==9 || getMes()==11){
                if(dia>0 && dia<=31){
                    return true;
                }
                else{
                    return false;
                }
            }
            else if(getMes()==4 || getMes()==6 || getMes()==8 || getMes()==10 || getMes()==12){
                if(dia>0 && dia<=30){
                    return true;
                }
                else{
                    return false;
                }
            }
            else if(getMes()==2 && esBisiesto()==true){
                if(dia>0 && dia<=29){
                    return true;
                }
                else{
                    return false;
                }
            }
            else if(getMes()==2 && esBisiesto()==false){
                if(dia>0 && dia<=28){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
    }
           
    // método que te pide una fecha y la cambia con los valores que le das.
    public void pedirFecha(){
        int day,month,year;
        boolean terminar=false;
        Scanner sc = new Scanner(System.in);
        
        while(terminar==false){
        System.out.print("Introduce el día: ");
        day=sc.nextInt();
        System.out.print("\nIntroduce el mes: ");
        month=sc.nextInt();
        System.out.print("\nIntroduce el año: ");
        year=sc.nextInt();
        
        this.dia=day;
        this.mes=month;
        this.anio=year;
        
          if(validarDia()==true && year>1999){
                terminar=true;
            }
          else{
                System.out.println("Fecha incorrecta"); // Muestra que la fecha es incorrecta
            }
        }
    }
    
    // Método que muestra la fecha (mes) con palabras en vez de con números: 25 de Diciembre de 2015
    public String mostrarFecha(){
        String cadena;
        if(getMes()==1){
            cadena="Enero";
        }
        else if(getMes()==2){
            cadena="Febrero";
        }
        else if(getMes()==3){
            cadena="Marzo";
        }
        else if(getMes()==4){
            cadena="Abril";
        }
        else if(getMes()==5){
            cadena="Mayo";
        }
        else if(getMes()==6){
            cadena="Junio";
        }
        else if(getMes()==7){
            cadena="Julio";
        }
        else if(getMes()==8){
            cadena="Agosto";
        }
        else if(getMes()==9){
            cadena="Septiembre";
        }
        else if(getMes()==10){
            cadena="Octubre";
        }
        else if(getMes()==11){
            cadena="Noviembre";
        }
        else{
            cadena="Diciembre";
        }
        
        return dia+" de "+cadena+" de "+anio;
    }

    /**
     * @return devuelve el mes de la fecha.
     */
    public int getMes() {
        return mes;
    }
    
    
}
    

