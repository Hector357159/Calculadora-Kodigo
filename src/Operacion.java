public class Operacion {
    //Definimos la variable operacion
    private int operacion;

    //Contructor por defecto sin parametros
    public Operacion() {

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
