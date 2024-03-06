import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Sorgulamak istediğiniz yılı girin :");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + "  yılı artık yıldır");
                } else {
                    System.out.println(year + "  yılı artık yıl değildir.");
                }
            } else {
                System.out.println(year + "  yılı artık yılldır.");
            }

        } else {
            System.out.println(year + "  artık yıl değildir");
        }
    }
