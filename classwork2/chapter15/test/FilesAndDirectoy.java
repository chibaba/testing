package classwork2.chapter15.test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilesAndDirectoy {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter File or Directory name: ");

        //Create file based on user input
        Path path = Paths.get(input.nextLine());
    }
}
