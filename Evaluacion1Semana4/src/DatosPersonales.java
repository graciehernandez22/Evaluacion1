
import java.util.Scanner;

public class DatosPersonales {
    public static void main(String[] args) {
    String Datos;
    double TipoE;
    String DatosEd;
    String DArea;
   
    DEmpleado empl = new DEmpleado();
    Edificio Direccion = new Edificio();
    AreaED area = new AreaED();
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Escriba el nombre del empleado: ");
        empl.setNombre(leer.nextLine());
        System.out.println("Digite el codigo del empleado: ");
        empl.setCodigoE(Integer.parseInt(leer.nextLine()));
        System.out.println("Digite la edad del empleado: ");
        empl.setEdad(Integer.parseInt(leer.nextLine()));
        System.out.println("Escriba la direccion del empledo: ");
        empl.setDireccion(leer.nextLine());
        System.out.println("Escriba el cargo a desempeñar: ");
        empl.setCargoDesemp(leer.nextLine());
        System.out.println("Digite el dia de ingreso: ");
        empl.setDia(Integer.parseInt(leer.nextLine()));
         System.out.println("Digite el mes de ingreso: ");
        empl.setMes(Integer.parseInt(leer.nextLine()));
         System.out.println("Digite el año de ingreso: ");
        empl.setAno(Integer.parseInt(leer.nextLine()));
        System.out.println("Escriba el sueldo base/bruto del empleado: ");
        empl.setSueldoB(Double.parseDouble(leer.nextLine()));
        System.out.println("Digite el codigo de Area: ");
        area.setCodArea(Integer.parseInt(leer.nextLine()));
        System.out.println("Digite el nombre del area");
        area.setNombreA(leer.nextLine());
        System.out.println("Digite la cantidad de empleados: ");
        area.setCodEmpleado(Integer.parseInt(leer.nextLine()));
        System.out.println("Digite la cantidad de edificios: ");
        area.setNumEdificio(Integer.parseInt(leer.nextLine()));
        System.out.println("El contrato del empleado es:");
        empl.setTrab(leer.nextDouble());
        
        
        System.out.println("-------------------------------------------");
        
       Datos = empl.DatosP(empl);
       System.out.println(Datos);
       TipoE = empl.TEmpleado();
       System.out.println(TipoE);
        System.out.println("-----------Datos del edificio-----------");
       
       DatosEd = Direccion.DatosE();
        System.out.println(DatosEd);
        
        
        
        System.out.println("---------------Datos de Area-----------------");
        
        DArea = area.DArea();
        System.out.println(DArea);    
       
    }
    
}


