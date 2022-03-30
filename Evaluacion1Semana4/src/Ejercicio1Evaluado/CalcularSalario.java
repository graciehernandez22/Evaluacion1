
package Ejercicio1Evaluado;


  public class CalcularSalario {

     private double horasTrabajadas;
     private double pagoHora;
    
     public CalcularSalario(){
    }
    
    public CalcularSalario(double horasTrabajadas, double pagoHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.pagoHora = pagoHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }
  
    double CalcularSalario(){
    double Salario = 0;
    double HorasxDos;
    double HorasxTres;
        
      if(this.horasTrabajadas <= 40){
      Salario = this.horasTrabajadas * this.pagoHora;
      return Salario;
    }else if (this.horasTrabajadas > 40 && this.horasTrabajadas < 48){
      HorasxDos = this.horasTrabajadas - 40;
       Salario = (40 * this.pagoHora) + (HorasxDos * this.pagoHora * 2);
        return Salario;     
    }else if(this.horasTrabajadas > 48){
     HorasxTres = this.horasTrabajadas - 48;
     Salario = (40 * this.pagoHora) + (8 * this.pagoHora * 2) + (HorasxTres * this.pagoHora * 3);
     return Salario;
    }
      return Salario;
   }
    double Renta(CalcularSalario salario){
    double Renta;
    salario.CalcularSalario();
    Renta = salario.CalcularSalario() * 0.10;
    return Renta;
    }
    double SalarioLiquido(CalcularSalario salarioLiquido){
     double SalarioLiquido;
     SalarioLiquido = salarioLiquido.CalcularSalario() - salarioLiquido.Renta(salarioLiquido);
    return SalarioLiquido;
    }
    
    
    
    
    
    
    
}


