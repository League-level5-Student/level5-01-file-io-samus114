package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;

public class FileEncryptor {
	int key = 12;
	public static void main(String[] args) {
		FileEncryptor fe = new FileEncryptor();
		fe.encrypt();
	}
	/*
	 * Encryption is the process of encoding a message or information
	 * in such a way that only authorized parties can access it and
	 * those who are not authorized cannot.
	 *
	 * A simple shift cipher works by shifting the letters of a message
	 * down based on a key. If our key is 4 then:
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * 
	 * becomes:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 * 
	 * "Hello World" changes to "Lipps Asvph"
	 *
	 * Create a program that takes a messager.
	 * Use any key you want (1 - 25) to shift each letter in the users input and save the final result to a file.
	 */
	private void encrypt() {
		FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/msg.txt");
		// TODO Auto-generated method stub
	for(int i = 0; i < fw.) {
			
		}
	}
}