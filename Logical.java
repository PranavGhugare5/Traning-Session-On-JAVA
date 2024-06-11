package Operators;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        boolean b = false;
        System.out.println("a&&b  =" +(a && b));
        System.out.println("a || b =" +(a || b));
        System.out.println("!(a & b) =" +!(a && b));
    }
}
