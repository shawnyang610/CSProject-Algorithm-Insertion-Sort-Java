/*CSCI700 Proj1 Insertion Sort
 * Prof. Tsaiyun Phillips
 * Author: Shawn Yang
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		if (args.length<2) {
			System.out.println("Please specify input and out text files.");
			return;
		}
		try {
			Scanner inFile = new Scanner(new FileReader(args[0]));
			PrintWriter outFile = new PrintWriter (args[1]);
			System.out.println("Connections to:"+args[0]+", "+args[1]+ " :Successful");
			linkedList lList= new linkedList();
			while (inFile.hasNext()) {
				lList.listInsert(inFile.next());
				lList.printList(outFile);
			}		
			inFile.close();
			outFile.close();
			System.out.println("Data written to "+args[1]+ " :Successful");
		}catch (IOException e) {
			System.out.println(e);
		}

	}

}
