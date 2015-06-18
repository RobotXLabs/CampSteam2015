import java.util.Scanner;

public class Tester{
    public final static String COLOR_CHEATWORD = "\u001B[101m";
    public final static String COLOR_GREEN = "\u001B[42;31m";
    public static void main(String [] args){


    	boolean cheater = false;
        

        System.out.println(COLOR_GREEN + "This hangman game uses the autosolve plugin by c22am" + Board.COLOR_RESET);
        System.out.println("Enter the word to guess");
        Scanner scan = new Scanner(System.in);
        String inputWord = scan.nextLine();

        String lettersGuessed= "";
        Board board = new Board(inputWord);

        String input;

        boolean correct = false;
System.out.println("-------Placeholder-------");

System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");
System.out.println("-------Placeholder-------");

        while (board.getLives() > 0 || board.allLettersFilled() == false){ /* FIX THIS WHILE LOOP CONDITION */

        	if(board.getLives() == 6){
        		System.out.println(Hangman.base());
        	}
        	else if(board.getLives() == 5){
        		System.out.println(Hangman.strikeOne());
        	}
        	else if(board.getLives() == 4){
        		System.out.println(Hangman.strikeTwo());
        	}
        	else if(board.getLives() == 3){
        		System.out.println(Hangman.strikeThree());
        	}
        	else if(board.getLives() == 2){
        		System.out.println(Hangman.strikeFour());
        	}
        	else if(board.getLives() == 1){
        		System.out.println(Hangman.strikeFive());
        	}
        	else{
        		System.out.println(Hangman.strikeSix());
        	}
            /*else*/if(!board.getIncorrectGuesses().equals("\n")){
                System.out.println("Letters Guessed: " + board.getIncorrectGuesses());
            }
            if(board.allLettersFilled() == true){
            	System.out.println("VICTORY! \nThe guesser won!");
            	break;
            }
            else if(board.getLives() == 0){
            	System.out.println("The word maker won!");
                System.out.println(COLOR_CHEATWORD + "The word was " + inputWord + COLOR_RESET);
            	break;
            }

            System.out.println(board.toString());
            System.out.println("Enter your guess");

            input = scan.nextLine();

            if(input.equals("99999")){
            	if(cheater==false){
            		System.out.println(COLOR_CHEATWORD + "THE WORD IS " + inputWord + board.COLOR_RESET);
            		cheater=true;
            	}
            	else{
            		System.out.println(COLOR_CHEATWORD + "You already got a hint. Stop cheating" + board.COLOR_RESET);
            	}
            	
            }
            else if(input.equals("!99999")){
            	
            		System.out.println(COLOR_CHEATWORD + "THE WORD IS " + inputWord + board.COLOR_RESET);
            }
            else if(input.equals("hint")){
            	if(cheater==false){
            		System.out.println(COLOR_CHEATWORD + "THE FIRST TWO LETTERS ARE " + inputWord.substring(0,1) + " AND " + inputWord.substring(1,2) + board.COLOR_RESET);
            		cheater=true;
            	}
            	else{
            		System.out.println(COLOR_CHEATWORD + "You already got a hint. Stop cheating" + board.COLOR_RESET);
            	}
            	
            }
            else if(input.equals("exit")){
            	break;
            }
            input = input.substring(0,1);

            correct = board.setMove(input);
            board.updateNumberOfLives(correct);

            if(!correct){
                lettersGuessed += input + " ";

            }
        }

       

    }
}
