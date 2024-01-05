public class CartaNumerica extends Carta{
    private int numero;
    public CartaNumerica(String nombre,int numero) {
        super(nombre);
        this.numero=numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public void calculo(){
        try{ double numc =(double)numero;
            System.out.println("el calculo de su carta es "+numc);
        }catch(Exception e){
            System.out.println("El digito no es un entero");

        }
    }

}
