/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan2;
import java.util.Scanner;
/**
 *
 * @author albi
 */
public class Percabangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[3];
        
        for (int i = 0; i < 3; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (ribuan(a[i])) {
                System.out.println(a[i] + " adalah ribuan.");
            } else {
                System.out.println(a[i] + " bukan ribuan.");
            }
        }

        input.close();
    }

    public static boolean ribuan(int a) {
        return a >= 1000 && a < 10000;
    }
}