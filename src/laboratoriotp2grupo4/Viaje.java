
package laboratoriotp2grupo4;


public class Viaje {
    private Ciudad origen;
    private Ciudad destino;
    private Double distancia= 0d;
    private Vehiculo vehiculo;
    private Integer peajes;

    public Viaje(Ciudad origen, Ciudad destino, Double distancia, Vehiculo vehiculo, Integer peajes) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.vehiculo = vehiculo;
        this.peajes = peajes;
    }

    public Viaje(Ciudad origen, Ciudad destino, Vehiculo vehiculo, Integer peajes) {
        this.origen = origen;
        this.destino = destino;
        this.vehiculo = vehiculo;
        this.peajes = peajes;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getPeajes() {
        return peajes;
    }

    public void setPeajes(Integer peajes) {
        this.peajes = peajes;
    }
    
    public double calcularDistancia(){
        if (distancia==0) {
            return Math.abs(destino.getKm()- origen.getKm());
        }else 
            return distancia;
    }
    public double calcularCostoPeajes(){
        if (vehiculo.getTipo().equalsIgnoreCase("camion")) {
            return peajes * 500;
        }else{
        return peajes*100;}
        
    }
    
    public double calculoCostoCombustible(){
        return vehiculo.calcularCostoDeCombustible(calcularDistancia());
    }
    
    public double calcularCostoTotal(){
        return calcularCostoPeajes()+calculoCostoCombustible();
                
            
        
    }
    
}
