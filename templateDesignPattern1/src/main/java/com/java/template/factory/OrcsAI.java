package com.java.template.factory;

import java.util.ArrayList;
import java.util.List;

public class OrcsAI extends GameAI{

	 @Override
   protected void buildStructures() {
       if (hasResources()) {
       }
   }

   @Override
   protected void buildUnits() {
       if (hasPlentyOfResources()) {
           if (noScouts()) {
           } else {
           }
       }
   }

   @Override
   protected void sendScouts(Position position) {
       if (!scouts.isEmpty()) {
       }
   }

   @Override
   protected void sendWarriors(Position position) {
       if (warriors.size() > 5) {
       }
   }

   @Override
   protected Enemy closestEnemy() {
       return null; // or actual enemy
   }

   // Stub methods for resource and unit checks
   private boolean hasResources() { return true; }
   private boolean hasPlentyOfResources() { return true; }
   private boolean noScouts() { return scouts.isEmpty(); }

   private List<Unit> scouts = new ArrayList<>();
   private List<Unit> warriors = new ArrayList<>();

}
