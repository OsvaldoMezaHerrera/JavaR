import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        Double numero1 = Double.valueOf(JOptionPane.showInputDialog("Dame un numero"));
        Double numero2 = Double.valueOf(JOptionPane.showInputDialog("Dame un numero"));
        Double numero3 = Double.valueOf(JOptionPane.showInputDialog("Dame un numero"));
        System.out.println((numero1 + numero2 + numero3)/3);
    }
}