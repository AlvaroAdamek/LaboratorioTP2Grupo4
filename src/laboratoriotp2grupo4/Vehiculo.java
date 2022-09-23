package laboratoriotp2grupo4;

public abstract class Vehiculo {

    protected String marca;

    protected String patente;
    
    protected String tipo;

    protected Combustible combustible;


    public Vehiculo(String marca, String patente, Combustible combustible, String tipo) {
        this.marca = marca;
        this.patente = patente;
        this.tipo = tipo;
        this.combustible = combustible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   

    public Double calcularCostoDeCombustible( Double distancia) {
        return null;

    }
}
