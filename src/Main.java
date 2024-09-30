import java.util.Scanner;
import java.util.InputMismatchException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Cremos una variable
        double resultado = 0;

        // creamos los objetos numero1 y numero2
        Numero numero1 = new Numero();
        Numero numero2 = new Numero();

        //Creamos el objeto scanner para guardar lo tevclado por el usuario
        Scanner scanner = new Scanner(System.in);

        //Cremos el obreto de la operacion para la seleccion de la operacion
        Operacion operacion = new Operacion();

        //Cremos el objeto de calculadora con los objetos numero1 y numero2
        Calculadora calculadora = new Calculadora(numero1, numero2);
        do {
            try {
                System.out.println("\n-------------Menu de operaciones de la calculadora-------------");
                System.out.println("1.Suma");
                System.out.println("2.Resta");
                System.out.println("3.Multiplicacion");
                System.out.println("4.Division");
                System.out.println("5.Potencia");
                System.out.println("6.Raíz cuadrada");
                System.out.println("7.Salir");
                System.out.print("Ingresar el numero de la operacion: ");

                // Verificamos que la entrada sea un entero válido
                operacion.setOperacion(scanner.nextInt());
            }catch (InputMismatchException e) {
                    // Capturamos la excepción cuando la entrada no es un número entero
                    System.out.println("Error: Ingrese un número válido.");
                    // Limpiar el buffer del scanner
                    scanner.next();
                    continue;
                }
            try {
            switch (operacion.getOperacion()) {
                case 1:
                    //Realizamos la operacion set para dor valores a numero1 y numero2
                    numero1.setNumero(operacion.ingresarNumero());
                    numero2.setNumero(operacion.ingresarNumero());
                    //guardamo el resultado de la operacion
                    resultado = calculadora.suma();
                    break;
                case 2:
                    //Realizamos la operacion set para dor valores a numero1 y numero2
                    numero1.setNumero(operacion.ingresarNumero());
                    numero2.setNumero(operacion.ingresarNumero());
                    //guardamo el resultado de la operacion
                    resultado = calculadora.resta();
                    break;
                case 3:
                    //Realizamos la operacion set para dor valores a numero1 y numero2
                    numero1.setNumero(operacion.ingresarNumero());
                    numero2.setNumero(operacion.ingresarNumero());
                    //guardamo el resultado de la operacion
                    resultado = calculadora.multiplicación();
                    break;
                case 4:
                    //Realizamos la operacion set para dor valores a numero1 y numero2
                    numero1.setNumero(operacion.ingresarNumero());
                    numero2.setNumero(operacion.ingresarNumero());
                    if (numero2.getNumero() == 0){
                        System.out.println("No es posibre dividir por 0, favor ingresar otro numero");
                        continue;
                    }else{
                        //guardamo el resultado de la operacion
                        resultado = calculadora.división();
                    }
                    break;
                case 5:
                    //Realizamos la operacion set para dor valores a numero1 y numero2
                    numero1.setNumero(operacion.ingresarNumero());
                    numero2.setNumero(operacion.ingresarNumero());
                    //guardamo el resultado de la operacion
                    resultado = calculadora.potencia();
                    break;
                case 6:
                    //Realizamos la operacion set para dor valores a numero1 y numero2
                    numero1.setNumero(operacion.ingresarNumero());
                    if(numero1.getNumero() < 0){
                        System.out.println("Error, no es posibre realizar la operacion, favor ingresar otro numero");
                        continue;
                    }
                    else {
                        //guardamo el resultado de la operacion
                        resultado = calculadora.raíz();
                    }
                    break;
                default:
                    System.out.println("La opcion seleccionada no se encuentra");
                    continue;
            }
            } catch (InputMismatchException e) {
                // Capturamos la excepción cuando la entrada no es un número entero
                System.out.println("Error: Ingrese un número válido.");
                continue;
            }
            //imprimimos el resultado
            System.out.println("El resultado de la operacion es: " + resultado);
        }while(operacion.getOperacion() != 7);
    }
}