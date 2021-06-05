import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePractice {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Enter txt here: ");
		Scanner sc = new Scanner(System.in);
		File f = new File("src/file.txt");
		Scanner scf = new Scanner(f);
		String text = sc.nextLine();
		while(scf.hasNextLine()) {
		String filetext = scf.nextLine();
		System.out.println(filetext);
		}
		System.out.println(text);
		
	}

}
