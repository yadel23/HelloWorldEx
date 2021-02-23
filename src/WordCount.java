import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		
		File HarryPotFile = new File("src/harry_potter_2.txt");

		Scanner fileInput = null;
		
		try {
			fileInput = new Scanner(HarryPotFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}

		int i = 0;
		while (fileInput.hasNext())
		{
			String name = fileInput.next();
			if (name.equalsIgnoreCase("harry") || name.equalsIgnoreCase("potter"))
			{
				i++;
				System.out.println(i);
			}
		}

	}
}