import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class GFG1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(read.readLine());
        Solution1 ob = new Solution1();
        System.out.println(ob.addDigits(N));


    }
}
class Solution1{
    public int addDigits(int num) {
        int n = num;
        int sum = sumdigits(n);
        while (sum>10){
            sum=sumdigits(sum);
        }
        return sum;
    }

    public int sumdigits(int num){
        int sum=0;
        while (num>0){
            sum = sum +num%10;
            num =num/10;
        }
        return sum;
    }
}

