/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percabangan1;
import java.util.Scanner;
/**
 *
 * @author albi
 */
public class Percabangan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tiga angka: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = max(a, b, c);

        System.out.println("nilai terbesar : " + max);

        input.close();
    }

 public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c; 
        }
        return max;
    }
}