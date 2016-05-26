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
public class Nomina {
    Empleado em;
    Fecha fecha;
    private static final int SALARIO_MINIMO=600, AYUDA=100;
    private static final float IRPF_MAX=24f, IRPF_MIN=9f;
    
    // Método que realiza y muestra la nómina. Teniendo en cuenta las Ayudas, Extraordinarias, IRPF... etc
    public void hacerNomina(Fecha fecha,Empleado empleado){
       this.fecha=fecha;
       this.em=empleado;
       Double salBase=Empleado.getSalarioBase(), ayudaHijos=em.getnHijos()*AYUDA*1.0, total;  // multiplico por 1.0 la AYUDA para convertirlo el Double
       System.out.printf("\n\t\t\tNOMINA\n");
       System.out.printf("\nFecha: "+fecha.mostrarFecha());  // muestra la fecha, ej: 21 de Diciembre de 2015
       System.out.printf("\nEmpleado: "+em.getNombre()+" Numero Hijos: "+em.getnHijos()); // muestra el nombre y el nº de hijos
       System.out.printf("\n\n\t\t\tSalario Base: %5.2f", Empleado.getSalarioBase()); // muestra el Salario Base
       System.out.printf("\n\t\t\tPlus: %5.2f", em.getPlus()); // muestra el plus
       //Empleado.plusConSalarioBase(em.getPlus());
       
       if(fecha.getMes()==6 || fecha.getMes()==12){
           System.out.printf("\n\t\t\tExtraordinaria: %5.2f", Empleado.getSalarioBase()); // muestra la extraordinaria
           total=Empleado.getSalarioBase()+Empleado.getSalarioBase()+em.getPlus(); // sumamos al total 2 veces el Salario Base y el Plus
       }
       else if(fecha.getMes()==9 && em.getnHijos()>0){
           System.out.printf("\n\t\t\tAyuda por hijos: %5.2f", ayudaHijos); // muestrs la ayuda por hijos
           
          total=(Empleado.getSalarioBase()+ayudaHijos); // sumamos al total el Salario Base y la ayuda
       }
       else{
           total=Empleado.getSalarioBase();  
       }
       
       // se deja de restar 100 al saldo total. 
       
       if(total<SALARIO_MINIMO){
           if(em.getnHijos()>=IRPF_MIN){ 
           System.out.printf("\n\t\t\t1.0%% de IRPF: %5.2f",total/100);  
           total=total-(total/100);                     //al ser 1% no calculo el IRPF (1*X =X)           
           }
           else{
           System.out.printf("\n\t\t\t%2.1f de IRPF: %5.2f",IRPF_MIN-em.getnHijos(),(IRPF_MIN-em.getnHijos())*total/100);  // Mostramos el %IRPF restando al IRPF el numero de hijos
           total=total-(IRPF_MIN-em.getnHijos())*total/100;    //añadimos al total el calculo del IRPF y los hijos                                                          // y el valor de ese IRPF.
           }
       }
       else{
           if(em.getnHijos()>=IRPF_MAX){ 
           System.out.printf("\n\t\t\t1.0%% de IRPF: %5.2f",total/100);
           total=total-(total/100);                     //al ser 1% no calculo el IRPF (1*X =X)
           }
           else{
           System.out.printf("\n\t\t\t%2.1f de IRPF: %5.2f",IRPF_MAX-em.getnHijos(),(IRPF_MAX-em.getnHijos())*total/100);   // Mostramos el %IRPF restando al IRPF el numero de hijos
           total=total-(IRPF_MAX-em.getnHijos())*total/100;      //añadimos al total el calculo del IRPF y los hijos                                                            // y el valor de ese IRPF.
           }
       }
           
       System.out.printf("\n\t\t\t----------------");
       System.out.printf("\n\t\t\tTotal a recibir: %5.2f",total); // Mostramos el total.
          
    }
    
 
}
