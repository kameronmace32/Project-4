import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String characterName, move, characterName2, move2;
        int i, rounds, hp, movePower, attackSpeed, hp2, movePower2, attackSpeed2, p1Wins = 0, p2Wins = 0;
        boolean p1Turn;

        System.out.println("Pick an odd number of rounds to play: ");
        rounds = scanner.nextInt();
        while (rounds % 2 == 0) {
            System.out.println("Enter an ODD number of rounds: ");
            rounds = scanner.nextInt();
        }

        for (i = 1; i <= rounds; i++) {
            System.out.println("Round " + i);
            System.out.println("Player 1: Select a character and it's stats. ");
            System.out.println("Enter character name: ");
            characterName = scanner.next();
            System.out.println("Enter " + characterName + "'s hit points: ");
            hp = scanner.nextInt();
            System.out.println("Enter " + characterName + "'s move name: ");
            move = scanner.next();
            System.out.println("Enter the power points of " + characterName + "'s " + move + ":");
            movePower = scanner.nextInt();
            System.out.println("Enter " + characterName + "'s attack speed: ");
            attackSpeed = scanner.nextInt();

            System.out.println("Player 2: Select a character and it's stats. ");
            System.out.println("Enter character name: ");
            characterName2 = scanner.next();
            System.out.println("Enter " + characterName2 + "'s hit points: ");
            hp2 = scanner.nextInt();
            System.out.println("Enter " + characterName2 + "'s move name: ");
            move2 = scanner.next();
            System.out.println("Enter the power points of " + characterName2 + "'s " + move2 + ":");
            movePower2 = scanner.nextInt();
            System.out.println("Enter " + characterName2 + "'s attack speed: ");
            attackSpeed2 = scanner.nextInt();

            if (attackSpeed > attackSpeed2) {
                p1Turn = true;
            } else if (attackSpeed2 > attackSpeed) {
                p1Turn = false;
            } else {
                System.out.println("Equal attack speed, random number decides who goes first: ");
                int randomInt = random.nextInt(2);
                if (randomInt == 0) {
                    System.out.println("It is player 1's turn.\n");
                    hp2 = hp2 - movePower;
                    p1Turn = false;
                } else {
                    System.out.println("It is player 2's turn.\n");
                    hp = hp - movePower2;
                    p1Turn = true;
                }
            }

                while (hp > 0 && hp2 > 0) {
                    if (p1Turn) {
                        System.out.println("It is player 1's turn.\n");
                        hp2 = hp2 - movePower;
                        p1Turn = false;
                    } else if (!p1Turn) {
                        System.out.println("It is player 2's turn.\n");
                        hp = hp - movePower2;
                        p1Turn = true;
                    }
                    System.out.println("Player 1's hp: " + hp);
                    System.out.println("Player 2's hp: " + hp2);
                }
            if (hp2 <= 0) {
                System.out.println("Player 1 " + characterName + " wins this round.\n");
                p1Wins = p1Wins + 1;
            } else if (hp <= 0) {
                System.out.println("Player 2 " + characterName2 + " wins this round.\n");
                p2Wins = p2Wins + 1;
            }
        }
        System.out.println("Player 1 won " + p1Wins + " out of " + rounds + " rounds.");
        System.out.println("Player 2 won " + p2Wins + " out of " + rounds + " rounds.");

        if (p2Wins > p1Wins){
            System.out.println("Player 2 wins!");
        } else if(p1Wins > p2Wins){
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("error");
        }
    }
}

