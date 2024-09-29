public class Calculadora {
    Numero numero1;
    Numero numero2;


    public Calculadora(Numero numero1, Numero numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodo suma de la clase Operacion
    public  double suma(){
        //Definimos las variables a utilizar
        double total;
        total = numero1.getNumero() + numero2.getNumero();
        return total;
    }
    //Metodo Resta de la clase Operacion
    public  double resta(){
        //Definimos las variables a utilizar
        double total;
        total = numero1.getNumero() - numero2.getNumero();
        return total;
    }
    //Metodo Multiplicación de la clase Operacion
    public  double multiplicación(){
        //Definimos las variables a utilizar
        double total;
        total = numero1.getNumero() * numero2.getNumero();
        return total;
    }
    //Metodo División de la clase Operacion
    public  double división(){
        //Definimos las variables a utilizar
        double total;
        total = numero1.getNumero() / numero2.getNumero();
        return total;
    }
    //Metodo Potencia de la clase Operacion
    public  double potencia(){
        //Definimos las variables a utilizar
        double total;
        total = Math.pow(numero1.getNumero(),numero2.getNumero() );
        return total;
    }
    //Metodo Raíz de la clase Operacion
    public  double raíz(){
        //Definimos las variables a utilizar
        double total;
        total = Math.sqrt(numero1.getNumero());
        return total;
    }
}
