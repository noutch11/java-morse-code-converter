//written by Brian Noutchang

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class MorseCodeConverter {
	private static MorseCodeTree tree = new MorseCodeTree ();
	
	public static String convertToEnglish (String code) {
		String result = "";
		
		//each word is delimited by '/', so first split the string by separate words;
		String[] words = code.split("/");
		
		//for each separate word...
		for (int i = 0; i < words.length; i++)
		{
			String s = words[i];
			
			//each character is delimited by ' ', so split the word into separate characters
			String[] letters = s.split(" ");
			
			//now for each letter we can fetch its data and start building our string result
			for (String c : letters)
				result += tree.fetch(c);
			
			//add the end of each word iteration, add a space to our string, except for the last word of course
			if (i != words.length - 1)
				result += " ";
		}
		
		return result;
	}
	
	//will read the file then call the previous method
	public static String convertToEnglish (File file) throws FileNotFoundException {
		if (!file.exists())
			throw new FileNotFoundException();
		
		Scanner scanner = new Scanner (file);
		String result = "";
		
		//read the file and store its contents in a string
		while (scanner.hasNextLine())
			result += scanner.nextLine();
		
		//now call the previous method passing the string of the contents of the file
		return convertToEnglish (result);
	}
	
	public static String printTree () {
		ArrayList<String> list = tree.toArrayList();
		String result = "";
		
		for (String s : list) {
				result += s;
				if (list.indexOf(s) != list.size() - 1)
					result += " ";
		}
			
		return result;
	}
}
