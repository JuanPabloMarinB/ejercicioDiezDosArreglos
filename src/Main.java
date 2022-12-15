import Entidades.Arreglo;
import Servicios.ArregloServicios;

public class Main {
    public static void main(String[] args) {

        ArregloServicios as = new ArregloServicios();

        Arreglo a1 = as.llenarArregloUno();
        as.ordenarNumVectorUno(a1);
        as.llenarArregloDos();


    }
}