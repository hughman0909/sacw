package com.a.a;

import java.util.*;

// クラスの名前が違う
public class a {

    // adminが暗号化されてる
    private static final String a = b.a("H4sIAAAAAAAAA0rNyclRSMsvyklRBAQAAP//YqsDyhAAAAA=");
    private static final int b = 123;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        String a2 = sc.nextLine();
        System.out.print("Enter your Password: ");
        int a3 = sc.nextInt();
        if (a(a2, a3)) {
            System.out.println("you made it!!!");
        } else {
            System.out.println("you failed to login");
        }
    }

    // メソッドの名前が違う
    public static boolean a(String str, int i) {
        if (str.equals(b.a(a)) && i == b) {
            return true;
        } else {
            return false;
        }
    }
}