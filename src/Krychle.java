import java.util.ArrayList;

public class Krychle extends ArrayList implements IDefinice {

    private double hranaKrychle;

    Krychle(double hranaKrychle) {
        this.hranaKrychle = hranaKrychle;
    }

    public double povrch(){
        double povrchKrychle = 6*hranaKrychle*hranaKrychle;
        return povrchKrychle;
    }
    public double objem(){
        double objemKrychle = hranaKrychle*(hranaKrychle*hranaKrychle);
        return objemKrychle;
    }

    public String informace() {
        System.out.println("Povrch krychle je " + povrch() + " a objem krychle je " + objem());
        return informace();
    }
}