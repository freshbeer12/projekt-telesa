import java.util.ArrayList;

public class Jehlan extends ArrayList implements IDefinice{

    private int hranaDP;
    private int vyskaJehlan;
    int obsahCtverce = hranaDP*hranaDP;
    int obsahPlast =  (hranaDP*vyskaJehlan)/2;



        public double povrch(){
            double povrchJehlan = obsahCtverce + obsahPlast;
            return povrchJehlan;
        }
        public int objem(){
            int objemJehlan = (obsahCtverce/3)*vyskaJehlan;
            return objemJehlan;
        }

        public String informace() {
            System.out.println("Povrch jehlanu je " + povrch() + " a objem jehlanu je " + objem());
            return informace();
        }
}
