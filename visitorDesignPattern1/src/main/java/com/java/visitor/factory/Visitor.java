package com.java.visitor.factory;

public interface Visitor {

	void visit(Dot dot);
	void visitCircle(Circle circle);
	void visitRectangle(Rectangle rectangle);
	void visitCompoundShape(CompoundShape compoundShape);
}
