package com.java.prototype.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle extends Shape{
	private int width;
	private int height;
	
	public Rectangle(Rectangle source) {
		if (source != null) {
			this.setX(source.getX());
			this.setY(source.getY());
			this.setColor(source.getColor());
			this.width = source.width;
			this.height = source.height;
		}
	}

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}
	
	@Override
  public String toString() {
      return "Rectangle[x=" + this.getX() + ", y=" + this.getY() + ", color=" + this.getColor() + ", width=" + width + ", height=" + height + "]";
  }

}
