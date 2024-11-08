package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args){
    //declarra variables
    double ingresom,oingreso,gastom;
    Scanner lectura=new Scanner(System.in);
    
    //entrada
        System.out.print("Ingresar el ingreso mensual: ");
        ingresom=lectura.nextDouble();
        System.out.print("Ingresar los otros ingresos: ");
        oingreso=lectura.nextDouble();
        System.out.print("Ingresar el gasto mensual: ");
        gastom=lectura.nextDouble();
        
        //crea el objeto en base a la instancia de la clase
        RegistroIngreso objregingreso=new RegistroIngreso();
        objregingreso.setIm(ingresom);
        objregingreso.setOi(oingreso);
        objregingreso.setGm(gastom);
        
        //salida
        System.out.println("El ahorro mensual es: " +objregingreso.ahorrom());
        System.out.println("El ahorro semestral es: " +objregingreso.ahorros());
        System.out.println("El ahorro anual es: " +objregingreso.ahorroa());
    }
}
