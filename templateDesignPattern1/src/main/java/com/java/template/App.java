package com.java.template;

import com.java.template.factory.GameAI;
import com.java.template.factory.MonsterAI;
import com.java.template.factory.OrcsAI;

public class App {
    public static void main(String[] args) {
        System.out.println("Template Design Pattern!");
        
        GameAI orcsAI = new OrcsAI();
        GameAI monstersAI = new MonsterAI();

        System.out.println("=== Orcs AI Turn ===");
        orcsAI.turn();

        System.out.println("\n=== Monsters AI Turn ===");
        monstersAI.turn();
    }
}
