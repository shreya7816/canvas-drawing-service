package com.canvas.interfaces;

import com.canvas.models.Canvas;

public interface ShapeManager {
	   public char[][] draw(String command,  char[][] dimArray, Canvas canvas) throws Exception;
}
