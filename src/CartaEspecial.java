public class CartaEspecial extends Carta{
    public CartaEspecial(String nombre) {
        super(nombre);
    }
    public void activarEfectoEspecial(){
        try {
            System.out.println("El efecto especial se ha activado");
        }catch(Exception e){
            System.out.println("no vale ");
        }
    }
}
