
package Ejercicio1Evaluado;

import java.util.Scanner;


public class SalarioEmpleado {

    
    public static void main(String[] args) {
        double salario1 = 0.0;
        double salario2 = 0.0;
        double salario3 = 0.0;
        CalcularSalario salario = new CalcularSalario();
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingresa las horas trabajadas :");
        salario.setHorasTrabajadas(leer.nextDouble());
        System.out.println("Introduzca el pago por hora: ");
        salario.setPagoHora(leer.nextDouble());
        System.out.println("-----------------");
        salario.CalcularSalario();
        
        salario1 = salario.CalcularSalario();
        salario2 = salario.Renta(salario);
        salario3 = salario.SalarioLiquido(salario);
        
        
        System.out.println("El salario bruto es : $" + salario1);
        System.out.println("El monto de la retencion aplicada es: $" + salario2);
        System.out.println("El salario liquido es : $" + salario3);
    }
    
}
