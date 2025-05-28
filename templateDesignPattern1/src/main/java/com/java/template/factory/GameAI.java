package com.java.template.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class GameAI {
	protected List<Structure> builtStructures;

  public GameAI() {
      this.builtStructures = new ArrayList<>();
  }

  //Template method: defines the algorithm skeleton
  public final void turn() {
      collectResources();
      buildStructures();
      buildUnits();
      attack();
  }

  // Concrete method with default implementation
  protected void collectResources() {
      for (Structure s : builtStructures) {
          s.collect();
      }
  }

  // Abstract methods (steps that subclasses must implement)
  protected abstract void buildStructures();
  protected abstract void buildUnits();

  // Template method with defined logic
  protected void attack() {
      Enemy enemy = closestEnemy();
      if (enemy == null) {
          sendScouts(Map.center());
      } else {
          sendWarriors(enemy.getPosition());
      }
  }

  // Abstract methods for attacking
  protected abstract void sendScouts(Position position);
  protected abstract void sendWarriors(Position position);

  protected abstract Enemy closestEnemy();
}
