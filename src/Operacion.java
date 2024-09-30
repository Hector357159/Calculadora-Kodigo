import java.util.Scanner;

public class Operacion {
    //Definimos la variable operacion
    private int operacion;

    //Contructor por defecto sin parametros
    public Operacion() {

    }


    public double ingresarNumero() {
        Scanner scanner = new Scanner(System.in);
        //creamos una variable a enviar
        double num;
        //pedimos los valores de numero
        System.out.println("Ingresar numero");

        num = scanner.nextDouble();

        return num;
    }
    //Constructor de la clase Operacion con parametros
    public Operacion(int operacion) {
        this.operacion = operacion;
    }
    //el metodo get de operacion
    public int getOperacion() {
        return operacion;
    }
    //El metodo set de operacion
    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }
}
