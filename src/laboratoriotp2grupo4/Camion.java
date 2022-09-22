
package laboratoriotp2grupo4;


public class Camion extends Vehiculo {
      private  Double consumo;

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
        this.consumo = 100/12.0;// cantidad de KM con un litro
    }

    @Override
    public Double calcularCostoDeCombustible(Double distancia) {
         return (distancia /consumo )* combustible.getPrecio();}

    @Override
    public String toString() {
        return "Camion{  marca=" + marca + ", patente=" + patente + ",combustible " + combustible.toString() +'}';
 
    }
    
}
