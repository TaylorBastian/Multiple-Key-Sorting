import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws IOException {

		Scanner sf = new Scanner(new File("src\\Name_ages.txt"));
		Scanner sf2 = new Scanner(new File("src\\Name_ages.txt"));
		
		String[] text = new String[20];
		String line;
		String line2; 
		
		int[] ToSort = new int[20];
		int age;
		char stringToChar;
		
		
	
		
		for (int i=0;sf.hasNext();i++) {
			line = sf.nextLine();
			age = sf.nextInt();
			text[i] = line;
			stringToChar = line.charAt(0);
			ToSort[i] = (int) stringToChar;	
		}
		
		
		sort(ToSort, text);
			
		System.out.println("After:");
		for (int q = 0; q < text.length; q++) {
			if (text[q] != null) {
				System.out.println(text[q]);
			}
		}
		
}
	
	
	public static void sort(int a[], String[] b) {
		int min, minIndex, minIndex2;
		String min2;
		for (int i = 0; i < a.length; i++) {
			min = a[i];
			min2 = b[i];
			minIndex = i;
			minIndex2 = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					min2 = b[j];
					minIndex = j;
					minIndex2 = j;
				}
			}
			a[minIndex] = a[i];
			b[minIndex2] = b[i];
			a[i] = min;
			b[i] = min2;
		}
		
	}
}
