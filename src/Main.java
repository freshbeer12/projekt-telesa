import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Krychle> krychle = new ArrayList<>();
    static ArrayList<Kuzel> kuzel = new ArrayList<>();
    static ArrayList<Jehlan> jehlan = new ArrayList<>();


    static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {

        int volba;
        System.out.println("Vyberte jednu z možností : Přídat těleso (1) / Vypsat všechna tělesa jednoho druhu (2) / Těleso s největším a nejmenším povrchem (3) / Počet jednotlivých druhů těles v poli (4) / Součet všech objemů těles (5) / Krychli, kužel a jehlan s největším povrchem (6)");
        volba = sc.nextInt();
        switch (volba) {
            case 1-> pridejTeleso();
            case 2-> vypisTelesa();
            case 3-> povrchyTeles();
            case 4-> pocetDruhu();
            case 5-> objemyTeles();
            case 6-> nejvetsiPovrch();
        }


    }
    public static void pridejTeleso() {
        System.out.println("Zvol, které těleso si přeješ přidat : Krychle (1) / Kuzel (2) / Jehlan (3)");
        int druh = sc.nextInt();
        if (druh == 1){
            System.out.println("Zadej hranu krychle");
            double hrana = sc.nextDouble();
            krychle.add(new Krychle());
        }
        else if (druh == 2) {
            System.out.println("Zadej poloměr podstavy");
            double podstava = sc.nextDouble();
            kuzel.add(new Kuzel());
            System.out.println("Zadej výšku");
            double vyska = sc.nextDouble();
            kuzel.add(new Kuzel());
        }
        else if (druh == 3) {
            System.out.println("Zadej hranu dolní podstavy");
            double podstavaDP = sc.nextDouble();
            jehlan.add(new Jehlan());
            System.out.println("Zadej výšku jehlanu");
            double vyskaJehlan = sc.nextDouble();
            jehlan.add(new Jehlan());
        }
    }

    public static void vypisTelesa(){
        System.out.println("Zvol, který druh tělesa si přeješ vypsat : Krychle (1) / Kuzel (2) / Jehlan (3)");
        int druhVypis = sc.nextInt();
        if (druhVypis == 1){
            System.out.println("Druh krychle " + krychle.size());
        }
        else if (druhVypis == 2) {
            System.out.println("Druh Kužely " + kuzel.size());
        }
        else if (druhVypis == 3) {
            System.out.println("Druh jehlany " + jehlan.size());
        }
    }


    public static void povrchyTeles(){
        double nejvetsiPovrch = -Double.MAX_VALUE;
        double nejmensiPovrch = Double.MAX_VALUE;

        String nejvetsiTeleso = "";
        String nejmensiTeleso = "";

        for (Krychle k : krychle) {
            double povrchKrychle = k.povrch();
            if (povrchKrychle > nejvetsiPovrch) {
                nejvetsiPovrch = povrchKrychle;
                nejvetsiTeleso = "Krychle s povrchem: " + povrchKrychle;
            }
            if (povrchKrychle < nejmensiPovrch) {
                nejmensiPovrch = povrchKrychle;
                nejmensiTeleso = "Krychle s povrchem: " + povrchKrychle;
            }
        }

        for (Kuzel k : kuzel) {
            double povrchKuzel = k.povrch();
            if (povrchKuzel > nejvetsiPovrch) {
                nejvetsiPovrch = povrchKuzel;
                nejvetsiTeleso = "Kuzel s povrchem: " + povrchKuzel;
            }
            if (povrchKuzel < nejmensiPovrch) {
                nejmensiPovrch = povrchKuzel;
                nejmensiTeleso = "Kuzel s povrchem: " + povrchKuzel;
            }
        }

        for (Jehlan j : jehlan) {
            double povrchJehlan = j.povrch();
            if (povrchJehlan > nejvetsiPovrch) {
                nejvetsiPovrch = povrchJehlan;
                nejvetsiTeleso = "Jehlan s povrchem: " + povrchJehlan;
            }
            if (povrchJehlan < nejmensiPovrch) {
                nejmensiPovrch = povrchJehlan;
                nejmensiTeleso = "Jehlan s povrchem: " + povrchJehlan;
            }
        }

        System.out.println("Těleso s největším povrchem: " + nejvetsiTeleso);
        System.out.println("Těleso s nejmenším povrchem: " + nejmensiTeleso);
    }



public static void pocetDruhu(){
    System.out.println("Počet krychlí je " + krychle.size());
    System.out.println("Počet kuželů je " + kuzel.size());
    System.out.println("Počet jehlanů je " + jehlan.size());
}

public static void objemyTeles(){
    double soucetObjemu = 0;

    for (Krychle k : krychle) {
        soucetObjemu += k.objem();
    }

    for (Kuzel k : kuzel) {
        soucetObjemu += k.objem();
    }

    for (Jehlan j : jehlan) {
        soucetObjemu += j.objem();
    }

    System.out.println("Součet všech objemů těles: " + soucetObjemu);
}


public static void nejvetsiPovrch(){
    double nejvetsiPovrch = -Double.MAX_VALUE;
    String nejvetsiTeleso = "";

    for (Krychle k : krychle) {
        double povrchKrychle = k.povrch();
        if (povrchKrychle > nejvetsiPovrch) {
            nejvetsiPovrch = povrchKrychle;
            nejvetsiTeleso = "Krychle s povrchem: " + povrchKrychle;
        }
    }

    for (Kuzel k : kuzel) {
        double povrchKuzel = k.povrch();
        if (povrchKuzel > nejvetsiPovrch) {
            nejvetsiPovrch = povrchKuzel;
            nejvetsiTeleso = "Kuzel s povrchem: " + povrchKuzel;
        }
    }

    for (Jehlan j : jehlan) {
        double povrchJehlan = j.povrch();
        if (povrchJehlan > nejvetsiPovrch) {
            nejvetsiPovrch = povrchJehlan;
            nejvetsiTeleso = "Jehlan s povrchem: " + povrchJehlan;
        }
    }

    System.out.println("Těleso s největším povrchem: " + nejvetsiTeleso);
}
}



