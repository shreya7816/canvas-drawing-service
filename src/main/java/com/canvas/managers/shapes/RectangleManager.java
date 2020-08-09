package com.canvas.managers.shapes;

import com.canvas.interfaces.ShapeManager;
import com.canvas.models.Canvas;
import com.canvas.utils.CommonUtils;

public class RectangleManager implements ShapeManager{

	@Override
	public char[][] draw(String command, char[][] dimArray, Canvas canvas) throws Exception {
		String[] cmd = command.split(" ");
		CommonUtils.checkCanvas(dimArray);
        int x1 = Integer.parseInt(cmd[1]);
        int y1 = Integer.parseInt(cmd[2]);
        int x2 = Integer.parseInt(cmd[3]);
        int y2 = Integer.parseInt(cmd[4]);
        char drawingSymbol = 'X';
        LineManager lineManager = new LineManager();
        lineManager.draw(x1, y1, x2, y1, drawingSymbol, dimArray);
        lineManager.draw(x1, y1, x1, y2, drawingSymbol, dimArray);
        lineManager.draw(x2, y1, x2, y2, drawingSymbol, dimArray);
        lineManager.draw(x1, y2, x2, y2, drawingSymbol, dimArray);
		return dimArray;
	}

}
