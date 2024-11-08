package programas;
public class RegistroCompra {
    //atributos
    private double compra1,compra2,compra3,compra4;

    public double getCompra1() {
        return compra1;
    }

    public void setCompra1(double compra1) {
        this.compra1 = compra1;
    }

    public double getCompra2() {
        return compra2;
    }

    public void setCompra2(double compra2) {
        this.compra2 = compra2;
    }

    public double getCompra3() {
        return compra3;
    }

    public void setCompra3(double compra3) {
        this.compra3 = compra3;
    }

    public double getCompra4() {
        return compra4;
    }

    public void setCompra4(double compra4) {
        this.compra4 = compra4;
    }
    
    //metodos de la clase
    public double total(){
        return(this.getCompra1()+this.getCompra2()+this.getCompra3()+this.getCompra4());
    }
    public double promedio(){
        return(this.total()/4);
    }
    public double mayor(){
        double mayor;
        mayor=this.getCompra1();
        if (this.getCompra2()>mayor) {
            mayor=this.getCompra2();
        }
        if (this.getCompra3()>mayor) {
            mayor=this.getCompra3();
        }
        if (this.getCompra4()>mayor) {
            mayor=this.getCompra4();
        }
        return(mayor);
    }
    public double menor(){
        double menor;
        menor=this.getCompra1();
        if (this.getCompra2()<menor) {
            menor=this.getCompra2();
        }
        if (this.getCompra3()<menor) {
            menor=this.getCompra3();
        }
        if (this.getCompra4()<menor) {
            menor=this.getCompra4();
        }
        return(menor);
    }
}

