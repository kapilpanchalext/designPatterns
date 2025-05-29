package com.java.visitor.factory;

public class XMLExportVisitor implements Visitor {

	@Override
	public void visit(Dot dot) {
		System.out.println("<dot id=\"" + dot.getId() + "\" x=\"" + dot.getX() + "\" y=\"" + dot.getY() + "\" />");
		
	}

	@Override
	public void visitCircle(Circle circle) {
		System.out.println("<circle id=\"" + circle.getId() + "\" x=\"" + circle.getX() + "\" y=\"" + circle.getY()
    + "\" radius=\"" + circle.getRadius() + "\" />");
	}

	@Override
	public void visitRectangle(Rectangle rectangle) {
		System.out.println("<rectangle id=\"" + rectangle.getId() + "\" x=\"" + rectangle.getX() + "\" y=\"" + rectangle.getY()
    + "\" width=\"" + rectangle.getWidth() + "\" height=\"" + rectangle.getHeight() + "\" />");
	}

	@Override
	public void visitCompoundShape(CompoundShape compoundShape) {
		System.out.println("<compoundShape id=\"" + compoundShape.getId() + "\">");
    for (Shape child : compoundShape.getChildren()) {
        child.accept(this);
    }
    System.out.println("</compoundShape>");
	}
}
