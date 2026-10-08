package basic.syntax;

import java.util.Scanner;

//
// public class basic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String sh = sc.nextLine();
//         int sum = 0;
//         for (int i = 0; i < sh.length(); i++) {
//             System.out.println(" ascii " + sh.charAt(i) + " " + (int) sh.charAt(i));
//             sum = sum + (int) sh.charAt(i);
//         }
//         System.out.println( "ascii " + sum);
//
//     }
// }

// class basic {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int last = sc.nextInt();
//         while (last >= 10) {
//             last = last / 10;
//         }
//         System.out.println(last);
//     }
// }

class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        int rate = sc.nextInt();
        int time = sc.nextInt();

        double amount = principal;

        for (int i = 1; i <= time; i++) {
            amount = amount * (1 + rate / 100.0);
        }

        double compound = amount - principal;

        System.out.println(compound);
    }
}
