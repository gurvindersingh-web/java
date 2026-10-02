package basic.syntax;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sh = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < sh.length(); i++) {
            System.out.println(" ascii " + sh.charAt(i) + " " + (int) sh.charAt(i));
            sum = sum + (int) sh.charAt(i);
        }
        System.out.println( "ascii " + sum);

    }
}
