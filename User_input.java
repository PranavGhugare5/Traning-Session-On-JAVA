package Operators;

import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("Eligible for voting");

        }
        else{
            System.out.println("Not eligible for voting");
        }
    }
}
