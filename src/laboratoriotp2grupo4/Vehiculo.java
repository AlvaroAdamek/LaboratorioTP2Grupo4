package laboratoriotp2grupo4;

public abstract class Vehiculo {

    protected String marca;

    protected String patente;

    protected Combustible combustible;

    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", patente=" + patente + ", combustible=" + combustible + '}';
    }

    public Double calcularCostoDeCombustible( Double distancia) {
        return null;

    }
}
