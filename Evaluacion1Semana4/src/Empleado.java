

class DEmpleado extends Edificio {
    String Nombre, Direccion, CargoDesemp;
    long CodigoE;
    int edad;
    double sueldoB, salarioF;
    int dia;
    int mes;
    int ano;
   // int fecha1;
    //boolean tipoDC;
    double Trab;
    

    public DEmpleado() {
        
    }  

    public DEmpleado(String Nombre, String Direccion, String CargoDesemp, long CodigoE, int edad, double sueldoB, double salarioF, int dia, int mes, int ano, double Trab){
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.CargoDesemp = CargoDesemp;
        this.CodigoE = CodigoE;
        this.edad = edad;
        this.sueldoB = sueldoB;
        this.salarioF = salarioF;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.Trab = Trab;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }


    public String getCargoDesemp() {
        return CargoDesemp;
    }

    public void setCargoDesemp(String CargoDesemp) {
        this.CargoDesemp = CargoDesemp;
    }

    public long getCodigoE() {
        return CodigoE;
    }

    public void setCodigoE(long CodigoE) {
        this.CodigoE = CodigoE;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(double sueldoB) {
        this.sueldoB = sueldoB;
    }

    public double getSalarioF() {
        return salarioF;
    }

    public void setSalarioF(double salarioF) {
        this.salarioF = salarioF;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getTrab() {
        return Trab;
    }

    public void setTrab(double Trab) {
        this.Trab = Trab;
    }
    
    String DatosP(DEmpleado L) {
        
        String Informacion = "";
        Informacion += "El nombre es :" + Nombre + "\n";
        Informacion += "El codigo del empleado es :" + CodigoE+ "\n";
        Informacion += "La edad del empleado es :" + edad + "\n";
        Informacion += "La direccion del empleado es :" + Direccion + "\n";      
        Informacion += "El cargo a desempeñar es :" + CargoDesemp + "\n";
        Informacion += "La fecha que ingreso el empleado es:" + dia + "/" + mes + "/" + ano + "\n";
        Informacion += "El sueldo base es : $" + sueldoB + "\n";
        Informacion += "El salario liquido del empleado es: $" + L.Desc(L);

        return Informacion;
    }

    double Desc(DEmpleado L) {

       // double salarioF;
        double afp;
        double iss;
        double renta;

        if (this.Trab == 1) {
            afp = (sueldoB * 0.725);
            iss = (sueldoB * 0.13);
            renta = (sueldoB * 0.1);
            salarioF = (sueldoB - (afp - iss - renta));

            return salarioF;
            
     //   } else if (this.Trab == 1) {
      //      System.out.println("El empleado es permanente");

        } else if (this.Trab == 2) {
            renta = (sueldoB * 0.1);
            salarioF = (sueldoB - renta);
        //    System.out.println("El empleado es de servicio");

            return salarioF;
        }
        return this.Trab;
    }

    double TEmpleado() {
         double Empleado = this.Trab;

        if (Empleado == 1) {
            
            System.out.println("El empleado es permanente");
            
            return Empleado;

        }else{
            System.out.println("El empleado es de servicio");
            
        }
        return Empleado;
    }

}

