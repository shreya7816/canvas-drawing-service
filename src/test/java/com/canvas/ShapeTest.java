package com.canvas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.canvas.managers.CanvasManager;
import com.canvas.managers.FillManager;
import com.canvas.managers.shapes.LineManager;
import com.canvas.managers.shapes.RectangleManager;
import com.canvas.models.Canvas;

public class ShapeTest {
	
	    @Test
	    public void testCanvas() throws Exception {
	       Canvas canvas  = new Canvas();
	       String command = "C 20 4";
	       char[][] dimArray = null;
		   dimArray = new CanvasManager().draw(command, dimArray, canvas);
	        assertEquals(canvas.render(dimArray),
	        "----------------------\n" +
	        "|                    |\n" +
	        "|                    |\n" +
	        "|                    |\n" +
	        "|                    |\n" +
	        "----------------------");
	    }
	    
	    @Test
	    public void testLine() throws Exception {
	       Canvas canvas  = new Canvas();
	       String command = "C 20 4";
	       char[][] dimArray = null;
		   dimArray = new CanvasManager().draw(command, dimArray, canvas);
		   command = "L 1 2 6 2";
		   dimArray = new LineManager().draw(command, dimArray, canvas);
		   assertEquals(canvas.render(dimArray),
				   "----------------------\n"
				   +"|                    |\n"
				   +"|XXXXXX              |\n"
				   +"|                    |\n"
				   +"|                    |\n"
				   +"----------------------" );

	    }
	    
	    @Test
	    public void testRectangle() throws Exception {
	       Canvas canvas  = new Canvas();
	       String command = "C 20 4";
	       char[][] dimArray = null;
		   dimArray = new CanvasManager().draw(command, dimArray, canvas);
		   command = "R 14 1 18 3";
		   dimArray = new RectangleManager().draw(command, dimArray, canvas);
		   assertEquals(canvas.render(dimArray),
				   "----------------------\n"
				   +"|             XXXXX  |\n"
				   +"|             X   X  |\n"
				   +"|             XXXXX  |\n"
				   +"|                    |\n"
				   +"----------------------");
	    }
	    
	    @Test
	    public void testFillColor() throws Exception {
	       Canvas canvas  = new Canvas();
	       String command = "C 20 4";
	       char[][] dimArray = null;
		   dimArray = new CanvasManager().draw(command, dimArray, canvas);
		   command = "B 10 3 Z";
		   dimArray = new FillManager().draw(command, dimArray, canvas);
		   assertEquals(canvas.render(dimArray),
				   "----------------------\n"
				  +"|ZZZZZZZZZZZZZZZZZZZZ|\n"
				  +"|ZZZZZZZZZZZZZZZZZZZZ|\n"
				  +"|ZZZZZZZZZZZZZZZZZZZZ|\n"
				  +"|ZZZZZZZZZZZZZZZZZZZZ|\n"
				  +"----------------------");
	    }

}
