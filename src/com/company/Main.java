package com.company;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        int num, a, N = 1;
        Scanner number = new Scanner(System.in);
        System.out.println("Введите число");
                num = number.nextInt();
 for (a=1; a<= num; a++)
  N = N*a;
        System.out.println("Факториал от " +num+ " равно " +N);
        }
    }

