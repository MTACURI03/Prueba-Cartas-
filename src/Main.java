public class Main {
    public static void main(String[] args) {
        Carta cart1 = new Carta(" 4 de brillo");
        CartaNumerica cart2 =new CartaNumerica("A de Corazon Rojo",23);
        CartaEspecial cart3=new CartaEspecial(" 5 de trebol");
        cart1.jugar();
        cart2.calculo();
        cart3.activarEfectoEspecial();
    }
}