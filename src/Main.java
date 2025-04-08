import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            ArrayList<Krychle> krychle = new ArrayList<>();
            ArrayList<Kuzel> kuzel = new ArrayList<>();
            ArrayList<Jehlan> jehlan = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

             static void main(String[] args) {
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
                while (volba != 6);
            }
             static void pridejTeleso() {
                System.out.println("Zvol, které těleso si přeješ přidat : Krychle (1) / Kuzel (2) / Jehlan (3)");
                int druh = sc.nextInt();
                if (druh == 1){
                    System.out.println("Zadej hranu krychle");
                    double hrana = sc.nextDouble();
                    krychle.add(new Krychle(hrana));
                }
                else if (druh == 2) {
                    System.out.println("Zadej poloměr podstavy");
                    double podstava = sc.nextDouble();
                    kuzel.add(new Kuzel(podstava));
                    System.out.println("Zadej výšku");
                    double vyska = sc.nextDouble();
                    kuzel.add(new Kuzel(vyska));
                }
                else if (druh == 3) {
                    System.out.println("Zadej hranu dolní podstavy");
                    double podstavaDP = sc.nextDouble();
                    jehlan.add(new Jehlan(podstavaDP));
                    System.out.println("Zadej výšku jehlanu");
                    double vyskaJehlan = sc.nextDouble();
                    jehlan.add(new Jehlan(vyskaJehlan));
                }
            }

            static void vypisTelesa(){
                System.out.println("Zvol, který druh tělesa si přeješ vypsat : Krychle (1) / Kuzel (2) / Jehlan (3)");
                int druhVypis = sc.nextInt();
                if (druhVypis == 1){
                    System.out.println("");
                }
                else if (druhVypis == 2) {
                    System.out.println("");
                }
                else if (druhVypis == 3) {
                 System.out.println("");
                }
        }
            static void povrchyTeles(){



        }

            static void pocetDruhu(){
                System.out.println("Počet krychlí je " + krychle.size());
                System.out.println("Počet kuželů je " + kuzel.size());
                System.out.println("Počet jehlanů je " + jehlan.size());
        }

            static void objemyTeles(){

        }
            static void nejvetsiPovrch(){
                for (int i = 0; i < krychle.size(); i++) {
                }
                for (int i = 0; i < kuzel.size(); i++) {
                }
                for (int i = 0; i < jehlan.size(); i++) {
                }



        }
    }
}