public class Krychle implements IDefinice {

    private int hranaKrychle;

    public int povrch(){
        int povrchKrychle = 6*hranaKrychle*hranaKrychle;
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
