import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            ArrayList<Krychle> krychle = new ArrayList<>();
            ArrayList<Kuzel> kuzel = new ArrayList<>();
            ArrayList<Jehlan> jehlan = new ArrayList<Jehlan>();
            Scanner sc = new Scanner(System.in);

            public static void main(String[] args) {
                int volba;
                System.out.println("Vyberte jednu z možností : Přídat těleso (1) / Vypsat všechna tělesa jednoho druhu (2) / Těleso s největším a nejmenším povrchem (3) / Počet jednotlivých druhů těles v poli (4) / Součet všech objemů těles (5) / Krychli, kužel a jehlan s největším povrchem (6)");
                volba = sc.nextInt();
                switch (volba) {
                    case 1: pridejTeleso();
                    case 2: vypisTelesa();
                    case 3: povrchyTeles();
                    case 4: pocetDruhu();
                    case 5: objemyTeles();
                    case 6: nejvetsiPovrch();
                }
                while (volba != 0);
            }
            public static void pridejTeleso() {
                System.out.println("Zvol, které těleso si přeješ přidat : Krychle (1) / Kuzel (2) / Jehlan (3)");
                int druh = sc.nextInt();
                if (druh == 1){
                    System.out.println("Zadej hranu krychle");
                    double hrana = sc.nextDouble();
                    krychle.add(new Krychle(hrana));
                } else if (druh == 2) {
                    System.out.println("Zadej poloměr podstavy");
                    double podstava = sc.nextDouble();
                    kuzel.add(new Kuzel(podstava));
                    System.out.println("Zadej výšku");
                    double vyska = sc.nextDouble();
                    kuzel.add(new Kuzel(vyska));
                }
            }


        }
    }
}