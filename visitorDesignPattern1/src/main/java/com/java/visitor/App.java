package com.java.visitor;

import java.util.ArrayList;
import java.util.List;
import com.java.visitor.factory.Circle;
import com.java.visitor.factory.CompoundShape;
import com.java.visitor.factory.Dot;
import com.java.visitor.factory.Rectangle;
import com.java.visitor.factory.Shape;
import com.java.visitor.factory.XMLExportVisitor;

public class App {
    public static void main(String[] args) {
        System.out.println("visitor Design Pattern!");
        
        List<Shape> allShapes = new ArrayList<>();

        Dot dot = new Dot(1, 10, 20);
        Circle circle = new Circle(2, 15, 25, 5);
        Rectangle rectangle = new Rectangle(3, 5, 10, 100, 200);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        allShapes.add(dot);
        allShapes.add(circle);
        allShapes.add(rectangle);
        allShapes.add(compoundShape);

        XMLExportVisitor exportVisitor = new XMLExportVisitor();

        for (Shape shape : allShapes) {
            shape.accept(exportVisitor);
        }
    }
}
