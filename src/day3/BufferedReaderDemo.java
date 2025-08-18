package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String [] args) throws IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Name :");
		String name = buffer.readLine();
		
		System.out.println("Enter the value :");
		int a = Integer.parseInt(buffer.readLine());
		
		System.out.println(" "+name + " "+a);
	}
}
