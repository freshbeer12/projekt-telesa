import java.util.ArrayList;

public class Kuzel extends ArrayList implements IDefinice {




    private double polomerKuzel;
    private double vyskaKuzel;

    public Kuzel(double polomerKuzel, double vyskaKuzel) {
        this.polomerKuzel = polomerKuzel;
        this.vyskaKuzel = vyskaKuzel;

    }
    public double povrch(){
        double povrchKuzele = Math.sqrt((polomerKuzel * polomerKuzel) + vyskaKuzel * vyskaKuzel);
        return povrchKuzele;
    }
    public double objem(){
        double mocninaR = polomerKuzel*polomerKuzel;
        double objemKuzele = (double) ((3.14*(polomerKuzel*polomerKuzel)*vyskaKuzel)/3);
        return objemKuzele;
    }

    public String informace() {
        System.out.println("Povrch kužele je " + povrch() + " a objem kužele je " + objem());
        return informace();
    }
}
