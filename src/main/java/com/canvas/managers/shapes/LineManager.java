package com.canvas.managers.shapes;

import com.canvas.exceptions.OutOfCanvasException;
import com.canvas.interfaces.ShapeManager;
import com.canvas.models.Canvas;
import com.canvas.utils.CommonUtils;

public class LineManager implements ShapeManager{
	
	public void draw(int x1, int y1, int x2, int y2, char mChar, char[][] dimArray) throws Exception {
        CommonUtils.checkCanvas(dimArray);
        try {
        	for(int i=y1; i<=y2; i++) {
        		for(int j=x1; j<=x2; j++) {
        			dimArray[i][j] = mChar;
        		}
        	}
        }catch(ArrayIndexOutOfBoundsException e) {
        	throw new OutOfCanvasException("You are trying to draw outside the canvas.");
        }
    }

	@Override
	public char[][] draw(String command, char[][] dimArray, Canvas canvas) throws Exception {
		String[] cmd = command.split(" ");
        draw(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),'X', dimArray);
		return dimArray;
	}

}
