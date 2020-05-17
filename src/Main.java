
//Напишите программу, отображающую переданную строку задом наперёд.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку");
        String u = in.nextLine();
        StringBuffer buffer = new StringBuffer(u);
        buffer.reverse();
        System.out.println(buffer);
    }
}
