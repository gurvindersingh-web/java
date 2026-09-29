import java.util.Scanner;
class loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i % 2 == 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        sc.close();
    }
}
