package programas;
public class RegistroIngreso {
    //atributos
    private double im,oi,gm;

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public double getOi() {
        return oi;
    }

    public void setOi(double oi) {
        this.oi = oi;
    }

    public double getGm() {
        return gm;
    }

    public void setGm(double gm) {
        this.gm = gm;
    }
    
    //metodos de clase
    public double ahorrom(){
        return((this.getIm()+this.getOi())-this.getGm());
    }
    public double ahorros(){
        return(this.ahorrom()*6);
    }
    public double ahorroa(){
        return(this.ahorrom()*12);
    }
}
