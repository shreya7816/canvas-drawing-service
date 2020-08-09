package com.canvas.utils;

import com.canvas.exceptions.InvalidInputException;
import com.canvas.exceptions.NoCanvasFoundException;
import com.canvas.interfaces.ShapeManager;
import com.canvas.managers.CanvasManager;
import com.canvas.managers.FillManager;
import com.canvas.managers.shapes.LineManager;
import com.canvas.managers.shapes.RectangleManager;

public class CommonUtils {

	public static ShapeManager getShapeManager(String command) {
		ShapeManager shapeManager = null;
		char ch = Character.toUpperCase(command.charAt(0));
		try {
			switch(ch) {
			case 'C' :
				shapeManager = new CanvasManager();
				break;
			case 'L' :
				shapeManager = new LineManager();
				break;
			case 'R' :
				shapeManager = new RectangleManager();
				break;
			case 'B' :
				shapeManager = new FillManager();
				break;
			case 'Q': 
				System.out.println("You choose to Quit. Closing program!");
				return null;
			default:
	           throw new InvalidInputException("Invalid command. Try again!!");
	           
			}

		} catch (Exception e) {
			System.out.println("\nSomething went wrong! : " + e.getMessage() + "\nPlease try again");
		}
		return shapeManager;
	}

	public static void checkCanvas(char[][] dimArray) throws Exception {
		if(dimArray == null)
			throw new NoCanvasFoundException("No canvas present for drawing. Create a canvas first.");
	}
}
