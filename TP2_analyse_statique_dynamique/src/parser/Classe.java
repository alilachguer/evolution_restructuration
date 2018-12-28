package parser;

import java.util.List;

import org.eclipse.jdt.core.dom.MethodDeclaration;

public class Classe {
	String name;
	int nbMethods, nbAttributes, nbLines;
	List<MethodDeclaration> methodDeclarations;

	public Classe(String name, int nbMethods, int nbAttributes) {
		super();
		this.name = name;
		this.nbMethods = nbMethods;
		this.nbAttributes = nbAttributes;
	}

	public Classe(String name, int nbMethods, int nbAttributes, List<MethodDeclaration> methodDeclarations) {
		super();
		this.name = name;
		this.nbMethods = nbMethods;
		this.nbAttributes = nbAttributes;
		this.methodDeclarations = methodDeclarations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbMethods() {
		return nbMethods;
	}

	public void setNbMethods(int nbMethods) {
		this.nbMethods = nbMethods;
	}

	public int getNbAttributes() {
		return nbAttributes;
	}

	public void setNbAttributes(int nbAttributes) {
		this.nbAttributes = nbAttributes;
	}

	public List<MethodDeclaration> getMethodDeclarations() {
		return methodDeclarations;
	}

	public void setMethodDeclarations(List<MethodDeclaration> methodDeclarations) {
		this.methodDeclarations = methodDeclarations;
	}

	public int getNbLines() {
		return nbLines;
	}

	public void setNbLines(int nbLines) {
		this.nbLines = nbLines;
	}

	
}
