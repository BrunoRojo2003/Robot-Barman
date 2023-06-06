public class Trago {
//Atributos
    String nombre;
    int precio;

//Metodos

    public void tragos() {
     System.out.println("nombre del trago:"+getNombre() + "el precio es :"+getPrecio()  );
        
    }
//getter
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
    



}
