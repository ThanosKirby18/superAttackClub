import java.util.Scanner;

public class superAttackClub {
    Scanner input = new Scanner(System.in);
    private String atkName;
    private int power;

    public superAttackClub ()
    {
        atkName = "";
        power = 0;
    }

    public String getAtkName()
    {
        return atkName;
    }

    public void setAtkName(String atkName) {
        this.atkName = atkName;
    }

    @Override
    public String toString() {
        return "superAttackClub{" +
                "input=" + input +
                ", atkName='" + atkName + '\'' +
                ", power=" + power +
                '}';
    }
}
