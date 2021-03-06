package AST;

import code_generation.CGVisitor;
import main.TypeVisitor;
import AST.Visitor.Visitor;

public class Minus extends Exp {
	public Exp e1, e2;

	public Minus(Exp ae1, Exp ae2, int ln) {
		super(ln);
		e1 = ae1;
		e2 = ae2;
	}

	public void accept(Visitor v) {
		e1.depth = e2.depth = this.depth + 1;
		v.visit(this);
	}

	public void accept(TypeVisitor v) {
		v.visit(this);
	}

	@Override
	public void accept(CGVisitor v) {
		v.visit(this);
	}
}
