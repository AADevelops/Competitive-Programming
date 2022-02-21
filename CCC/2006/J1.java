// Canadian Calorie Counting

import java.util.Scanner;
import java.util.Hashtable;

public class J1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c = 0;
        int burgerChoice, drinkChoice, sideChoice, dessertChoice;

        Hashtable<Integer, Integer> burgerChoices = new Hashtable<Integer, Integer>();
        burgerChoices.put(1, 461); burgerChoices.put(2, 431); burgerChoices.put(3, 420); burgerChoices.put(4, 0);
        Hashtable<Integer, Integer> drinkChoices = new Hashtable<Integer, Integer>();
        drinkChoices.put(1, 130); drinkChoices.put(2, 160); drinkChoices.put(3, 118); drinkChoices.put(4, 0);
        Hashtable<Integer, Integer> sideChoices = new Hashtable<Integer, Integer>();
        sideChoices.put(1, 100); sideChoices.put(2, 57); sideChoices.put(3, 70); sideChoices.put(4, 0);
        Hashtable<Integer, Integer> dessertChoices = new Hashtable<Integer, Integer>();
        dessertChoices.put(1, 167); dessertChoices.put(2, 266); dessertChoices.put(3, 75); dessertChoices.put(4, 0);

        burgerChoice = input.nextInt(); sideChoice = input.nextInt(); drinkChoice = input.nextInt(); dessertChoice = input.nextInt();
        c += burgerChoices.get(burgerChoice) + sideChoices.get(sideChoice) + drinkChoices.get(drinkChoice) + dessertChoices.get(dessertChoice);

        System.out.println("Your total Calorie count is " + c + ".");
    }
}
