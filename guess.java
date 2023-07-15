import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        System.out.println("Lets Start the game, I will generate a number between 1 and 100, and you try to guess it.");
        
        Scanner sc = new Scanner(System.in); 
        
        boolean playAgain;
        
        do {
            playGame();  
            
            System.out.println("Would you like to play again? Y/N");
            
            String playAgainStr = sc.next();
            playAgain = playAgainStr.equalsIgnoreCase("Y");
        } while (playAgain);

        System.out.println("Hope you enjoyed the game.Thanks for playing");
    }
    static void playGame() {
        int computersNumber; 
        int usersGuess;     
        int guessCount;      
        
        computersNumber = (int)(100 * Math.random()) + 1;
        
        guessCount = 0;
        
        System.out.println();
        System.out.println("Enter your guess ?");
        
        Scanner sc= new Scanner(System.in);   
        
        while (true) {
            usersGuess = sc.nextInt(); 
            
            
            guessCount++;
            
            if (usersGuess == computersNumber) {
                System.out.println("You got it in " + guessCount + " guesses! My number was " + computersNumber);
                break;  
            }
            
            if (guessCount == 6) {
                System.out.println("You didn't get the number in 6 guesses.");
                System.out.println("You lose. My number was " + computersNumber);
                break;  
            }
            
            if (usersGuess < computersNumber) {
                System.out.println("Your number is too low. Try again:");
            }
            
            else if (usersGuess > computersNumber) {
                System.out.println("Your number is too high. Try again:");
            }
        }
        
        System.out.println();
    } 
}