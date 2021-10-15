import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessing {

	// main method
	public static void main(String[] args) {
		// creating the reference for scanner class
		Scanner scanner = new Scanner(System.in);

		// reading the file name
		System.out.print("Enter the file name: ");
		String fileName = scanner.nextLine();

		Integer characterCount = 0;

		try {
			// reading the file using scanner
			Scanner fileReader = new Scanner(new File(fileName));

			while (fileReader.hasNextLine()) {
				// reading the line in file
				String line = fileReader.nextLine();
				// omitting the spaces and counting the characters
				characterCount += line.replaceAll("\\s", "").length();
			}

			// displaying the number of characters available in the text file
			System.out.println("The number of characters is " + characterCount);

			// closing the file scanner
			fileReader.close();
		} catch (FileNotFoundException e) {
			// handling the file not found exception
			System.out.println("File not found!");
		}

		// closing the scanner instance
		scanner.close();

	}

}
