package parser;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;

public class MethodDeclarationVisitor extends ASTVisitor {
	List<MethodDeclaration> methods = new ArrayList<MethodDeclaration>();

	public boolean visit(MethodDeclaration node) {
		methods.add(node);
		//node.getLocationInParent()
		return super.visit(node);
	}

	public List<MethodDeclaration> getMethods() {
		return methods;
	}
}
