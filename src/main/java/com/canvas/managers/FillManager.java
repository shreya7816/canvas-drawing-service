package com.canvas.managers;

import com.canvas.interfaces.ShapeManager;
import com.canvas.models.Canvas;
import com.canvas.utils.CommonUtils;

public class FillManager implements ShapeManager {

	@Override
	public char[][] draw(String command, char[][] dimArray, Canvas canvas) throws Exception {
		String[] cmd = command.split(" ");
		int x = Integer.parseInt(cmd[1]);
		int y = Integer.parseInt(cmd[2]);
		char drawingSymbol = cmd[3].charAt(0);
		dimArray = fillcolor(x, y, drawingSymbol, dimArray, canvas);
		return dimArray;
	}
	
	public char[][] fillcolor(int x, int y, char drawingSymbol, char[][] dimArray, Canvas canvas) throws Exception {
		CommonUtils.checkCanvas(dimArray);
		if((int)dimArray[y][x] != 0) {
			return null;
		}
		if(x > 0 || x < canvas.getHeight() || y > 0 || y  < canvas.getWidth()) {
			if((int)dimArray[y][x] == 0)
				dimArray[y][x] = drawingSymbol;
			fillcolor(x+1, y, drawingSymbol, dimArray, canvas);
			fillcolor(x-1, y, drawingSymbol, dimArray, canvas);
			fillcolor(x, y-1, drawingSymbol, dimArray, canvas);
			fillcolor(x, y+1, drawingSymbol, dimArray, canvas);
		}
		return dimArray;
	}


}
