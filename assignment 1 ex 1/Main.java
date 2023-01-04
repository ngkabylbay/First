import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        Phone iPhone = new Phone("877777777", "xr", 500.0);
        Phone samsung = new Phone("877777771", "21");
        Phone pixel = new Phone("877777772", "5", 510.0);

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(pixel);

        iPhone.receiveCall("Nureke");
        samsung.receiveCall("Bake");
        pixel.receiveCall("Sake");

        //samsung.sendMessage(new String[]{"877777771", "877777770"});

        samsung.sendMessage("877777771", "877777770");
        System.out.println(iPhone);
    }
}