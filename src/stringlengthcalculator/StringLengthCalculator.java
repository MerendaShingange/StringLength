/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringlengthcalculator;
        import java.util.Scanner;


/**
 *
 * @author Lenovo-User
 */
public class StringLengthCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();

        System.out.println("Length of the string: " + length);
    }
}
    
    

