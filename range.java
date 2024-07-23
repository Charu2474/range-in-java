import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int a=d.nextInt();
        int b=d.nextInt();
        float range=0;
        for(int i=a;i<=b;i++)
        {
            range+=i;
        }
        System.out.printf("The sum of Range value from "+a+" to "+b+ " is "+(float)range);
    }
}
