public class Carta {
    private String nombre;

    public Carta(String nombre) {
        this.nombre=nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void jugar(){
        System.out.println("usted esta jugando, con la carta :"+nombre);
    }
    public void mostarDescripcion(){
        System.out.println("el nombre de su carta es :"+nombre);
    }
}
