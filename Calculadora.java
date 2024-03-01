public class Calculadora {
    public static void main(String[] args) {
        Operaciones opera1=new Operaciones ();
        opera1.leerNumeros();
        opera1.sumar();
        opera1.restar();
        opera1.multiplicar();
        opera1.division();
        opera1.modulo();
        opera1.MostrarResultado();   
    }
}    