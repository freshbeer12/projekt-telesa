public class Kuzel implements IDefinice {

    private int podstava;
    private int vyska;


        private int polomerKuzel;
        private int vyskaKuzel;

        public int povrch(){
            int povrchKuzele = 3.14*(podstava*(podstava*(polomerKuzel*polomerKuzel)/2);
            return povrchKuzele;
        }
        public int objem(){
            int mocninaR = podstava*podstava;
            int objemKuzele = (int) ((3.14*(podstava*podstava)*vyskaKuzel)/3);
            return objemKuzele;
        }

        public String informace() {
            System.out.println("Povrch kužele je " + povrch() + " a objem kužele je " + objem());
            return informace();
        }

}
