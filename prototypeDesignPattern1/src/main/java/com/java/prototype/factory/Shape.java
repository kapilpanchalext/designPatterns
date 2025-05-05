package com.java.prototype.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Shape {

	private int x;
  private int y;
  private String color;

  public abstract Shape clone();
}
