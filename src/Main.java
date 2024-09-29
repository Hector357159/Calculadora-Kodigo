//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double resultado;
        Operacion operacion = new Operacion();
        Numero numero1 = new Numero();
        Numero numero2 = new Numero();
        Calculadora calculadora = new Calculadora(numero1, numero2);
        operacion.setOperacion(2);
        do {

            switch (operacion.getOperacion()) {
                case 1:
                    resultado = calculadora.suma();
                    System.out.println(resultado);
                case 2:


            }
        }while(operacion.getOperacion() != 7);
    }
}