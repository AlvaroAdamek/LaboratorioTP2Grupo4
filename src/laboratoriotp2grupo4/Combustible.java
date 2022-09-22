package laboratoriotp2grupo4;

public class Combustible {

    private String tipo;
    private Double precio;

//    public Combustible(String tipo,Double precio) {
//        this.tipo = tipo;
//        if (tipo.equalsIgnoreCase("Nafta")) {
//            this.precio = 137.00;
//        } else if (tipo.equalsIgnoreCase("Gasoil")) {
//            this.precio = 186.00;
//        } else {
//            this.precio = precio;
//        }}

    public Combustible(String tipo, Double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Combustible{" + "tipo=" + tipo + ", precio=" + precio + '}';
    }
    
    

       public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

}
