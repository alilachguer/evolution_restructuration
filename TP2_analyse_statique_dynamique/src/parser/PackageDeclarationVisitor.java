package parser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.PackageDeclaration;

public class PackageDeclarationVisitor extends ASTVisitor {

	// Set<PackageDeclaration> packages = new HashSet<PackageDeclaration>();
	List<PackageDeclaration> packagesnames = new ArrayList<PackageDeclaration>();

	public boolean visit(PackageDeclaration node) {
		packagesnames.add(node);

		return super.visit(node);
	}

	public List<PackageDeclaration> getPackages() {
		return packagesnames;
	}

	public void removeDuplicates(List<PackageDeclaration> list) {
		Set<PackageDeclaration> hs = new HashSet<>();
		hs.addAll(list);
		list.clear();
		list.addAll(hs);
	}
}
