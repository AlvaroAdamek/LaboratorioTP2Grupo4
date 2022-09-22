
package laboratoriotp2grupo4;


public class Auto extends Vehiculo {
    private  Double consumo;

    public Auto( String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
        this.consumo = 100/7.0;// cantidad de KM con un litro
    }
    

    @Override
    public Double calcularCostoDeCombustible(Double distancia) {
       return (distancia /consumo )* combustible.getPrecio();
    }

    @Override
    public String toString() {
        return "Auto{" + "consumo=" + consumo + '}';
    }
    
} 
