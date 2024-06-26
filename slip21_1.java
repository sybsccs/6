/*
1. Write a java program to accept ‘N’ Subject Names from a user store them into 
LinkedList Collection and Display them by using Iterator interface.
 */
package com.mycompany.javaslip;


import java.util.*;

public class slip21_1
{
    public static void main(String[] args) {
        List<String> l = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many subjects:");
        int n = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter " + n + " subjects:");
        for(int i=0; i<n; i++)
            l.add(sc.nextLine());
        
        System.out.println("Subjects are:");
        Iterator itr = l.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
