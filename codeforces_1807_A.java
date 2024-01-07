import java.util.Scanner;

public final class codeforces_1807_A {
    public static void main(String[] args) {
        // you code goes here
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i=0; i<number; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a+b==c)
                System.out.println('+');
            else
                System.out.println('-');
        }
        // System.out.println("Last Line!");
    }
}

