import javax.swing.*;

public class Enumerations2
{

    public enum Ugedag
    {
        MANDAG, TIRSDAG, ONSDAG, TORSDAG, FREDAG, LØRDAG, SØNDAG;
    }

    public static void main(String[] arg)
    {
        Ugedag dag = Ugedag.MANDAG;

        switch (dag) {
            case LØRDAG:
            case SØNDAG:
                System.out.println("Hurra, det er "+dag);
                break;
            default:
                System.out.println("Øv, det er "+dag);
        }
        int n = Ugedag.LØRDAG.ordinal()-dag.ordinal();
        System.out.println("Der er "+n+" dage til weekend.");
    }
}