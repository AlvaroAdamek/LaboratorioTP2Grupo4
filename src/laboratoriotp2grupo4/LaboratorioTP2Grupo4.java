
package laboratoriotp2grupo4;


public class LaboratorioTP2Grupo4 {

   
    public static void main(String[] args) {
        
        //creamos una ciudad destino dentro de la misma ruta
        Ciudad ciudadDe = new Ciudad(7,100d,"Villa Mercedes");
        //creamos una ciudad de origen
        Ciudad ciudadOr= new Ciudad(7,0d,"San Luis");
        //creamos objeto combustible
        Combustible combus= new Combustible("nafta",142.2);
        //creamos vehiculo
       Vehiculo vehi = new Auto("toyota","ABC123",combus);
       //creamos viaje
       Viaje viaje= new Viaje(ciudadOr,ciudadDe,vehi,2);
       
        System.out.printf("El costo desde "+ ciudadOr.getNombre() + " hasta "+ ciudadDe.getNombre() + " es $%.2f",viaje.calcularCostoTotal());
        System.out.println("");
        System.out.println("Con un vehiculo con la siguientes caracteristicas: " + vehi.toString());
      
        //creamos ciudad de destino con  distinta ruta y reutilizamos ciudadOr
        Ciudad ciuDe=new Ciudad(34,250d,"Cordoba");
        //creamos combustible
        Combustible com=new Combustible("gasoil",200.5);
        //creamos otro vehiculo
        Vehiculo camioneta=new Camioneta("Ford","AAA222",com);
        //creamos otro viaje usando constructor que tiene la distancia en km
        Viaje viajecito =new Viaje(ciudadOr,ciuDe,500d,camioneta,3);
        
        System.out.printf("El costo desde "+ ciudadOr.getNombre() + " hasta "+ ciuDe.getNombre() + " es $%.2f",viajecito.calcularCostoTotal());
        System.out.println("");
        System.out.println("Con un vehiculo con la siguientes caracteristicas: " + camioneta.toString());
        
        
        
        
    }
    
} 
