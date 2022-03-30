public class AreaED {
    
     String NombreA;
     int CodArea, CodEmpleado, NumEdificio;

    public AreaED() {
    }

    public String getNombreA() {
        return NombreA;
    }

    public void setNombreA(String NombreA) {
        this.NombreA = NombreA;
    }

    public int getCodArea() {
        return CodArea;
    }

    public void setCodArea(int CodArea) {
        this.CodArea = CodArea;
    }

    public int getCodEmpleado() {
        return CodEmpleado;
    }

    public void setCodEmpleado(int CodEmpleado) {
        this.CodEmpleado = CodEmpleado;
    }

    public int getNumEdificio() {
        return NumEdificio;
    }

    public void setNumEdificio(int NumEdificio) {
        this.NumEdificio = NumEdificio;
    }
String DArea (){
  String  Info = "";
  Info +="El codigo de Area es:" + CodArea  +"\n";
  Info +="El nombre del Area es:" + NombreA +"\n";
  Info +="La cantidad de empleados es:" + CodEmpleado +"\n";
  Info +="La cantidad de edificios es: " + NumEdificio +"\n";
  return Info;
}

    
}
