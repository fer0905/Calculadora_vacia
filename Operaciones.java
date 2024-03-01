import javax.swing.JOptionPane;
public class Operaciones {
//Atributos
int numero1;
int numero2;
int suma;
int resta;
int multiplicacion;
int division;
int modulo;
//Métodos
public void leerNumeros(){
    numero1=Integer.parseInt(JOptionPane.showInputDialog("Coloca el valor del numero 1: "));
    numero2=Integer.parseInt(JOptionPane.showInputDialog("Coloca el valor del numero 2: "));
}
//Método de suma
    public void sumar(){
        suma=numero1+numero2;
    }
//Método de resta
    public void restar(){
        resta=numero1-numero2;
    }
//Método de multiplicación
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
//Método de division
    public void division(){
        division=numero1/numero2;
    }
//Método de módulo
public void modulo(){
    modulo=numero1%numero2;
}    
//Método de visualizar el resultado
public void MostrarResultado() {
    System.out.println("El resultado de la suma es: "+suma);
    System.out.println("El resultado de la resta es: "+resta);
    System.out.println("El resultado de la multiplicación es: "+multiplicacion);
    System.out.println("El resultado de la división es: "+division);
    System.out.println("El resultado del módulo es: "+modulo);
}
}    
