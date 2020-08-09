package com.canvas.managers;

import com.canvas.interfaces.ShapeManager;
import com.canvas.models.Canvas;
import com.canvas.utils.CommonUtils;

public class DrawingManager {
	
	 public static Canvas canvas = new Canvas();
	 public static char[][] dimArray;
	
	 public void draw(String command) throws Exception {
		 try {
	        ShapeManager shapeManager = CommonUtils.getShapeManager(command);
	        if(shapeManager == null)
	        	return;
	        dimArray = shapeManager.draw(command, dimArray, DrawingManager.canvas);
	        System.out.println(DrawingManager.canvas.render(dimArray));
		 }catch(Exception e) {
			 System.out.println("\nSomething went wrong. Please check the error logs and try again!!\n Error: " +e.getMessage());
		 }
	 }
}
