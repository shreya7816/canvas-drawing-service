package com.canvas;

import java.util.Scanner;
import com.canvas.managers.DrawingManager;

public class DrawingShapes {

	public static void main(String[] args) {
		printInstruction();
		try(Scanner sc = new Scanner(System.in)){
			String command = new String();
			while(!command.equals("Q")) {
				System.out.println("\nEnter command:");
				command = sc.nextLine();
				new DrawingManager().draw(command);;
			}
			System.out.println("Program Exited!");
			sc.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
    
	private static void printInstruction() {
		String instructions = "Follows the instructions:\n"
				+ "|Command 		|Description|\n"
				+ "|----|----|\n"
				+ "|C w h          | Create a new canvas of width w and height h.|\n"
				+ "|L x1 y1 x2 y2  | Draw a new line from (x1,y1) to (x2,y2). Currently, only|\n"
				+ "|               | horizontal or vertical lines are supported. Horizontal and vertical lines|\n"
				+ "|               | will be drawn using the 'x' character.|\n"
				+ "|R x1 y1 x2 y2  | Draw a rectangle whose upper left corner is (x1,y1) and|\n"
				+ "|               | lower right corner is (x2,y2). Horizontal and vertical lines will be drawn|\n"
				+ "|               | using the 'x' character.|\n"
				+ "|B x y c        | Fill the entire area connected to (x,y) with \"colour\" c. The|\n"
				+ "|               | behaviour of this is the same as that of the \"bucket fill\" tool in paint|\n"
				+ "|               | programs.|\n"
				+ "|Q              | Quit|\n";
		System.out.println(instructions);
	}
}
