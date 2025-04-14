import java.util.ArrayList;

public class Jehlan extends ArrayList implements IDefinice{

    private double hranaDP;
    private double vyskaJehlan;
    double obsahCtverce = hranaDP*hranaDP;
    double obsahPlast =  (hranaDP*vyskaJehlan)/2;

    public Jehlan(double hranaDP,double vyskaJehlan){
        this.hranaDP=hranaDP;
        this.vyskaJehlan=vyskaJehlan;
    }

    public double povrch(){
        double povrchJehlan = obsahCtverce + obsahPlast;
        return povrchJehlan;
    }
    public double objem(){
        double objemJehlan = (obsahCtverce/3)*vyskaJehlan;
        return objemJehlan;
    }

    public String informace() {
        System.out.println("Povrch jehlanu je " + povrch() + " a objem jehlanu je " + objem());
        return informace();
    }
}