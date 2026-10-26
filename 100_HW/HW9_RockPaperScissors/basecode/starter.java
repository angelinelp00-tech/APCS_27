/*
 *	Author: Angeline Peng
 *  Date: 10/25/36
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Would you like to play the computer? (yes/no/done): ");
        String yes = sc.nextLine();
        System.out.println("\n----------------------------------------------------");
        while(!yes.equalsIgnoreCase("yes") && !yes.equalsIgnoreCase("no") && !yes.equalsIgnoreCase("done")){
            System.out.print("That is an invalid input!\nWould you like to play the computer? (yes/no/done): ");
            yes = sc.nextLine();
            System.out.println("\n-----------------------------------------------------");
        }
        while(!yes.equalsIgnoreCase("done")){
            if(yes.equalsIgnoreCase("yes")){
                System.out.print("Enter rock/paper/scissors: ");
                String pRole = sc.nextLine();
                System.out.println("\n-----------------------------------------------------");
                while(!pRole.equalsIgnoreCase("rock") && !pRole.equalsIgnoreCase("paper") && !pRole.equalsIgnoreCase("scissors")){
                    System.out.print("That is an invalid input!\nPlease enter rock/paper/scissors: ");
                    pRole = sc.nextLine();
                }
                String compRole = getObject();
                if(compare2(pRole, compRole) == 0){
                    System.out.println("You tied!\n");
                }
                else if(compare2(pRole, compRole) == 1){
                    System.out.println("You won!\n");
                }
                else if(compare2(pRole, compRole) == 2){
                    System.out.println("You lost!\n");
                }
                System.out.println("-------------------------------------------------------");
                System.out.print("Would you like to play the computer? (yes/no/done): ");
                yes = sc.nextLine();
            }  
            else if(yes.equalsIgnoreCase("no")){
                System.out.print("How many times would you like the computer to play itself? (whole number): ");
                int comPlay = sc.nextInt();
                sc.nextLine();
                int countComPlay = 1;
                int win1 = 0;
                int win2 = 0;
                int tie = 0;
                while(countComPlay <= comPlay){
                    String cRole1 = getObject();
                    String cRole2 = getObject();
                    int winner = compare2(cRole1, cRole2);
                    if(winner == 0){
                        tie++;
                    }
                    else if(winner == 1){
                        win1++;
                    }
                    else if(winner == 2){
                        win2++;
                    }
                    countComPlay++;
                }
                System.out.println("Player 1 wins: " + win1);
                System.out.println("Player 2 wins: " + win2);
                System.out.println("Ties: " + tie);
                System.out.println("");
                System.out.println("-------------------------------------------------------");
                System.out.print("Would you like to play the computer? (yes/no/done): ");
                yes = sc.nextLine();
            }
            else if(yes.equalsIgnoreCase("done")){
                System.out.println("Thank you for playing!");
            }
        }
        System.out.println("Thank you for playing!");
    }
    public static String getObject(){
        int num = (int)(Math.random() * 3 + 1);
        String role = "";
        if(num == 1){
            role = "scissors";
        }
        else if(num == 2){
            role = "paper";
        }
        else if(num == 3){
            role = "rock";
        }
        else{
            role = "ERROR";
        }
        return role;
    }
    public static int compare2(String x, String y){
        int winner = 4;
        if((x.equals("rock") && y.equals("scissors")) || (x.equals("paper") && y.equals("rock")) || (x.equals("scissors") && y.equals("paper"))){
            winner = 1;
        }
        else if((y.equals("rock") && x.equals("scissors")) || (y.equals("paper") && x.equals("rock")) || (y.equals("scissors") && x.equals("paper"))){
            winner = 2;
        }
        else if((x.equals("rock") && y.equals("rock")) || (x.equals("paper") && y.equals("paper")) || (x.equals("scissors") && y.equals("scissors"))){
            winner = 0;
        }
        return winner;
    }
}
