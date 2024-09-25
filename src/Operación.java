public class Operación {
    Numero numero1;
    Numero numero2;

    public Operación(Numero numero1, Numero numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodo suma de la clase Operacion
    public  double Suma(){
        //Definimos las variables a utilizar
        double Total;
        Total = numero1.getNumero() + numero2.getNumero();
        return Total;
    }
    //Metodo Resta de la clase Operacion
    public  double Resta(){
        //Definimos las variables a utilizar
        double Total;
        Total = numero1.getNumero() - numero2.getNumero();
        return Total;
    }
    //Metodo Multiplicación de la clase Operacion
    public  double Multiplicación(){
        //Definimos las variables a utilizar
        double Total;
        Total = numero1.getNumero() * numero2.getNumero();
        return Total;
    }
    //Metodo División de la clase Operacion
    public  double División(){
        //Definimos las variables a utilizar
        double Total;
        Total = numero1.getNumero() / numero2.getNumero();
        return Total;
    }
    //Metodo Potencia de la clase Operacion
    public  double Potencia(){
        //Definimos las variables a utilizar
        double Total;
        Total = Math.pow(numero1.getNumero(),numero2.getNumero() );
        return Total;
    }
    //Metodo Raíz de la clase Operacion
    public  double Raíz(){
        //Definimos las variables a utilizar
        double Total;
        Total = Math.sqrt(numero1.getNumero());
        return Total;
    }

}
