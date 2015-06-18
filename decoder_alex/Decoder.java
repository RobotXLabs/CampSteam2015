import java.util.Scanner;


public class Decoder{
	public static void main(String [] args){
		System.out.println("Enter 'encode' or 'decode' (As of now, only the decoding function works)");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int messageLength = input.length();
		String output = "";
		String currentLetter = "";
		int i=0;
		if(input.charAt(0)=='d'){
			System.out.println("Enter something to decode");
			input=scan.nextLine();
			while(i < messageLength-1){

				currentLetter += input.substring(i, i+1);
				i += 1;

				if ((currentLetter.length() % 5) == 0){
					if (currentLetter.equals("00000")) {
						output+="E";
					}
					else if (currentLetter.equals("00001")) {
						output+="T";
					}
					else if (currentLetter.equals("00010")) {
						output+="A";
					}
					else if (currentLetter.equals("00011")) {
						output+="O";
					}
					else if (currentLetter.equals("000100")) {
						output+="I";
					}
					else if (currentLetter.equals("00101")) {
						output+="N";
					}
					else if (currentLetter.equals("00110")) {
						output+="S";
					}
					else if (currentLetter.equals("00111")) {
						output+="R";
					}
					else if (currentLetter.equals("01000")) {
						output+="H";
					}
					else if (currentLetter.equals("01001")) {
						output+="D";
					}	
					else if (currentLetter.equals("01010")) {
						output+="L";
					}
					else if (currentLetter.equals("01011")) {
						output+="U";
					}
					else if (currentLetter.equals("01100")) {
						output+="C";
					}
					else if (currentLetter.equals("01101")) {
						output+="M";
					}
					else if (currentLetter.equals("01110")) {
						output+="F";
					}
					else if (currentLetter.equals("01111")) {
						output+="Y";
					}
					else if (currentLetter.equals("10000")) {
						output+="W";
					}
					else if (currentLetter.equals("10001")) {
						output+="G";
					}
					else if (currentLetter.equals("10010")) {
						output+="P";
					}
					else if (currentLetter.equals("10011")) {
						output+="B";
					}
					else if (currentLetter.equals("10100")) {
						output+="V";
					}
					else if (currentLetter.equals("10101")) {
						output+="K";
					}
					else if (currentLetter.equals("10110")) {
						output+="X";
					}
					else if (currentLetter.equals("10111")) {
						output+="Q";
					}
					else if (currentLetter.equals("11000")) {
						output+="J";
					}
					else if (currentLetter.equals("11001")) {
						output+="Z";
					}
					else if(currentLetter.equals("11010")){
						output+=" ";
					}
					else{
						System.out.println("Error: You incorrectly entered your encryption.");
					}
					currentLetter ="";
        		}

        		System.out.println(output);
       	 	}
       		
		}
	}
}

		
        
    


