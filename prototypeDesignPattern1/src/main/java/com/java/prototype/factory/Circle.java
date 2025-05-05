package com.java.prototype.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Circle extends Shape{
	private int radius;

	public Circle(Circle source) {
		if (source != null) {
			this.setX(source.getX());
			this.setY(source.getY());
			this.setColor(source.getColor());
			this.radius = source.radius;
		}
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	@Override
  public String toString() {
      return "Circle[x=" + this.getX() + ", y=" + this.getY() + ", color=" + this.getColor() + ", radius=" + radius + "]";
  }
}
