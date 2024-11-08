package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
    //declarar variables
    double c1,c2,c3,c4;
    Scanner lectura=new Scanner(System.in);
    
    //entrada
        System.out.print("Ingresar el valor de la primera compra: ");
        c1=lectura.nextDouble();
        System.out.print("Ingresar el valor de la segunda compra: ");
        c2=lectura.nextDouble();
        System.out.print("Ingresar el valor de la tercera compra: ");
        c3=lectura.nextDouble();
        System.out.print("Ingresar el valor de la cuarta compra: ");
        c4=lectura.nextDouble();
        
        //crear un objeto en base a la instancia de la clase
        RegistroCompra objregcompra=new RegistroCompra();
        objregcompra.setCompra1(c1);
        objregcompra.setCompra2(c2);
        objregcompra.setCompra3(c3);
        objregcompra.setCompra4(c4);
        
        //salida
        System.out.println("El valor total de las compras es: " +objregcompra.total());
        System.out.println("El promedio del valor de las compras es: " +objregcompra.promedio());
        System.out.println("El mayor valor de compra es: " +objregcompra.mayor());
        System.out.println("El menor valor de compra es: " +objregcompra.menor());
    }
}
