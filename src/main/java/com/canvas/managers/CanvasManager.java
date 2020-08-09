package com.canvas.managers;

import com.canvas.interfaces.ShapeManager;
import com.canvas.managers.shapes.LineManager;
import com.canvas.models.Canvas;

public class CanvasManager implements ShapeManager{

	@Override
	public char[][] draw(String command, char[][] dimArray, Canvas canvas ) throws Exception {
		String[] cmd = command.split(" ");
		int width = Integer.parseInt(cmd[1]);
		int height = Integer.parseInt(cmd[2]);
		if(width < 1 || height < 1) 
			throw new Exception("Canvas with width and height less than 1 is not possible");
		height += 2;
		width += 2;
		canvas.setHeight(height);
		canvas.setWidth(width);
		dimArray = new char[height][width];
		LineManager lineManager = new LineManager();
		lineManager.draw(0, 0, canvas.getWidth()-1, 0, '-', dimArray);
		lineManager.draw(0, canvas.getHeight()-1, canvas.getWidth()-1, canvas.getHeight()-1, '-', dimArray);
		lineManager.draw(0, 1,0, canvas.getHeight()-2, '|', dimArray);
		lineManager.draw(canvas.getWidth()-1, 1, canvas.getWidth()-1, canvas.getHeight()-2, '|', dimArray);
		return dimArray;
	}

}
