import java.util.ArrayList;

public class Krychle extends ArrayList implements IDefinice {

    private int hranaKrychle;

    public double povrch(){
        double povrchKrychle = 6*hranaKrychle*hranaKrychle;
        return povrchKrychle;
    }
    public int objem(){
        int objemKrychle = hranaKrychle*(hranaKrychle*hranaKrychle);
        return objemKrychle;
    }

    public String informace() {
        System.out.println("Povrch krychle je " + povrch() + " a objem krychle je " + objem());
        return informace();
    }
}
