package com.canvas.models;

import com.canvas.utils.CommonUtils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Canvas {
	Integer width;
	Integer height;
	
	public String render(char[][] dimArray) throws Exception {
		CommonUtils.checkCanvas(dimArray);
		StringBuilder str = new StringBuilder();
		for(int i=0; i<this.height; i++) {
			for(int j=0; j<this.width; j++) {
				str.append(dimArray[i][j] == '\u0000'?' ':dimArray[i][j]);
			}
			str.append("\n");
		}
		return str.toString().trim();
	}

}
