package parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.enoir.graphvizapi.Attribute;
import org.enoir.graphvizapi.Edge;
import org.enoir.graphvizapi.Graph;
import org.enoir.graphvizapi.GraphType;
import org.enoir.graphvizapi.Graphviz;
import org.enoir.graphvizapi.Node;

public class Parser {

	public static final String projectPath = "C:\\Users\\ali\\Desktop\\m2\\evolution_restructuration\\TP2_analyse_statique_dynamique";
	public static final String projectSourcePath = projectPath + "/src/";
	public static final String jrePath = "C:\\Program Files\\Java\\jre1.8.0_191\\lib\\rt.jar";
	public static int classNumber = 0;
	public static int methodNumber = 0;
	public static int packageNumber = 0;
	public static int attributesNumber = 0;
	static int nbMaxArguments = 0;
	public static int lines = 0;
	static List<Classe> classes = new ArrayList<Classe>();
	//static List<Map.Entry<MethodDeclaration, Integer>> methods = new ArrayList<Map.Entry<MethodDeclaration, Integer>>();
	//static List<List<Entry<MethodDeclaration, Integer>>> allMethods = new ArrayList<List<Entry<MethodDeclaration, Integer>>>();
	

	public static void main(String[] args) throws IOException {

		// read java files
		final File folder = new File(projectSourcePath);
		ArrayList<File> javaFiles = listJavaFilesForFolder(folder);

		List<CompilationUnit> compilationUnits = new ArrayList<CompilationUnit>();
		
		// creation du graphe de Graphiz
		Graphviz gv = new Graphviz("C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe", ".");
	    Graph graph = new Graph("methods", GraphType.DIGRAPH);
	    graph.addAttribute(new Attribute("rankdir","LR"));

        for (File fileEntry : javaFiles) {
            String content = FileUtils.readFileToString(fileEntry);
            // 9 1 2
            CompilationUnit parse = parse(content.toCharArray());
        }
	    
		for (File fileEntry : javaFiles) {
			String content = FileUtils.readFileToString(fileEntry);
			// System.out.println(content);

			CompilationUnit parse = parse(content.toCharArray());

			/*
			 * // print methods info printMethodInfo(parse);
			 * 
			 * // print variables info printVariableInfo(parse);
			 * 
			 * //print method invocations printMethodInvocationInfo(parse);
			 * 
			 */

			// count number of classes in application
			countClassNumber(parse);
			// count number of methods
			countMethodNumber(parse);
			// count number of packages
			countPackageNumber(parse);
			// count number of attributes
			countAttributesNumber(parse);

			// recuperer les infos d'une classes
			getClassInfo(parse);
			
			compilationUnits.add(parse);
			
			countNumberOfLinesByClass(parse, fileEntry);
			
			drawAllMethodsGraph(parse, gv, graph);
			
			// afficher le nombre de lignes
//			String filepath = projectSourcePath + getPackageName(parse) + "\\" + fileEntry.getName();
//			BufferedReader reader = new BufferedReader(new FileReader(filepath));
//			while (reader.readLine() != null)
//				lines++;
//			reader.close();

			// classWithMethods(parse, 10);

			//allMethods.add(numberOfLinesByMethod(parse));
		}
		
		

		// print number of classes
		System.out.println("1. le nombre de classes de l'application: " + classNumber);
		// print number of lines
		System.out.println("2. le nombre de lignes de l'application: " + lines);
		// print number of methods
		System.out.println("3. le nombre de methodes de l'application: " + methodNumber);
		// print number of packages
		System.out.println("4. le nombre de packages de l'application: " + packageNumber);
		// print avg nb of methods by class
		printAvergaNumberOfMethodsByClass();
		// print avg nb of lines by class
		printAverageNumberOfLinesByClass();
		// print avg nb of attributes by class
		printAverageNumberOfAttributesByClass();

		List<Classe> listeQ10 = new ArrayList<Classe>();

		System.out.println("8. 10% des classes qui possedent le plus grand nombre de methodes: ");
		Collections.sort(classes, new Comparator<Classe>() {
			@Override
			public int compare(Classe c1, Classe c2) {
				return Integer.compare(c1.getNbMethods(), c2.getNbMethods());
			}
		});
		for (int i = classes.size() - 1; i >= Math.round(classes.size() - (classes.size() * 0.1)); i--) {
			System.out.println("    - " + classes.get(i).getName());
			listeQ10.add(classes.get(i));
//			System.out.println("classe: " + classes.get(i).getName() + ", nb attributes: " + classes.get(i).getNbAttributes() 
//				+ ", nb methods: " + classes.get(i).getNbMethods());
//			System.out.println("    methods: ");
//			for (MethodDeclaration m : classes.get(i).getMethodDeclarations()) {
//				System.out.println("    - " + m.getName().toString());
//			}
		}

		System.out.println("9. 10% des classes qui possedent le plus grand nombre d'attributs: ");
		Collections.sort(classes, new Comparator<Classe>() {
			@Override
			public int compare(Classe c1, Classe c2) {
				return Integer.compare(c1.getNbAttributes(), c2.getNbAttributes());
			}
		});
		for (int i = classes.size() - 1; i >= Math.round(classes.size() - (classes.size() * 0.1)); i--) {
			System.out.println("    - " + classes.get(i).getName());
			listeQ10.add(classes.get(i));
		}

		// find duplicate elements in listeQ10 => elements in both precedent lists
		Set<Classe> set = new HashSet<>();
		Set<Classe> duplicateElements = new HashSet<>();
		for (Classe element : listeQ10) {
			if (!set.add(element)) {
				duplicateElements.add(element);
			}
		}

		System.out.println("10. Les classes qui font partie en meme temps des deux categories precedentes: ");
		for (Classe classe : duplicateElements) {
			System.out.println("    - " + classe.getName());
		}

		System.out.println("11. Les classes qui possedent plus de 3 methodes: ");
		printClassesWithMethodsMoreThan(3);

		System.out.println("12. Les 10% des methodes qui possedent le plus grand nombre de ligne de code (par classe)");
		
		List<Entry<MethodDeclaration, Integer>> methodsWithNumberOfLines = numberOfLinesByMethod(compilationUnits);
		for (int i = 0; i < (methodsWithNumberOfLines.size()*0.1); i++) {
			System.out.println("nb ligne methode " + methodsWithNumberOfLines.get(i).getKey().getName() +" : " + methodsWithNumberOfLines.get(i).getValue().toString() );
		}
		
		
		System.out.println("13. le nombre maximal de parametres de toutes les methodes de l'application: " + nbMaxArguments);
		
		
	}

	// read all java files from specific folder
	public static ArrayList<File> listJavaFilesForFolder(final File folder) {
		ArrayList<File> javaFiles = new ArrayList<File>();
		for (File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				javaFiles.addAll(listJavaFilesForFolder(fileEntry));
			} else if (fileEntry.getName().contains(".java")) {
				// System.out.println(fileEntry.getName());
				javaFiles.add(fileEntry);
			}
		}

		return javaFiles;
	}

	// create AST
	private static CompilationUnit parse(char[] classSource) {
		ASTParser parser = ASTParser.newParser(AST.JLS4); // java +1.6
		parser.setResolveBindings(true);
		parser.setKind(ASTParser.K_COMPILATION_UNIT);

		parser.setBindingsRecovery(true);

		Map options = JavaCore.getOptions();
		parser.setCompilerOptions(options);

		parser.setUnitName("");

		String[] sources = { projectSourcePath };
		String[] classpath = { jrePath };

		parser.setEnvironment(classpath, sources, new String[] { "UTF-8" }, true);
		parser.setSource(classSource);

		return (CompilationUnit) parser.createAST(null);
	}

	// navigate method information
	public static void printMethodInfo(CompilationUnit parse) {
		MethodDeclarationVisitor visitor = new MethodDeclarationVisitor();
		parse.accept(visitor);

		for (MethodDeclaration method : visitor.getMethods()) {
			System.out.println("Method name: " + method.getName() + " Return type: " + method.getReturnType2());
		}

	}

	// navigate variables inside method
	public static void printVariableInfo(CompilationUnit parse) {

		MethodDeclarationVisitor visitor1 = new MethodDeclarationVisitor();
		parse.accept(visitor1);
		for (MethodDeclaration method : visitor1.getMethods()) {

			VariableDeclarationFragmentVisitor visitor2 = new VariableDeclarationFragmentVisitor();
			method.accept(visitor2);

			for (VariableDeclarationFragment variableDeclarationFragment : visitor2.getVariables()) {
				System.out.println("variable name: " + variableDeclarationFragment.getName() + " variable Initializer: "
						+ variableDeclarationFragment.getInitializer());

//				FieldAccessVisitor visitor3 = new FieldAccessVisitor();
//				variableDeclarationFragment.accept(visitor3);
//				for (SimpleName field : visitor3.getFields()) {
//					System.out.println("----------- filed: " + field.getFullyQualifiedName());
//				}

			}

		}
	}

	// navigate method invocations inside method
	public static void printMethodInvocationInfo(CompilationUnit parse) {

		MethodDeclarationVisitor visitor1 = new MethodDeclarationVisitor();
		parse.accept(visitor1);
		for (MethodDeclaration method : visitor1.getMethods()) {

			MethodInvocationVisitor visitor2 = new MethodInvocationVisitor();
			method.accept(visitor2);

			for (MethodInvocation methodInvocation : visitor2.getMethods()) {
				System.out.println("method " + method.getName() + " invoc method " + methodInvocation.getName());
			}

		}
	}

	// compter le nombre de classes
	public static void countClassNumber(CompilationUnit parse) {
		TypeDeclarationVisitor visitor1 = new TypeDeclarationVisitor();
		parse.accept(visitor1);
		classNumber += visitor1.getTypes().size();
	}

	
	// compter le nombre de methodes
	public static void countMethodNumber(CompilationUnit parse) {
		MethodDeclarationVisitor visitor1 = new MethodDeclarationVisitor();
		parse.accept(visitor1);
		methodNumber += visitor1.getMethods().size();
		
		for (MethodDeclaration m : visitor1.getMethods()) {
			if(nbMaxArguments <= m.parameters().size())
				nbMaxArguments = m.parameters().size();
		}
	}

	// compter le nombre de packages
	public static void countPackageNumber(CompilationUnit parse) {
		PackageDeclarationVisitor visitor1 = new PackageDeclarationVisitor();
		parse.accept(visitor1);

		// List<PackageDeclaration> ps = new ArrayList<>(new
		// HashSet<>(visitor1.getPackages()));
		packageNumber = visitor1.getPackages().size();
	}

	// nombre moyen de methodes par classes
	public static void printAvergaNumberOfMethodsByClass() {
		System.out.println("5. Nombre moyen de methodes par classe: " + Math.round(methodNumber / classNumber));
	}

	public static void countAttributesNumber(CompilationUnit parse) {
		TypeDeclarationVisitor visitor1 = new TypeDeclarationVisitor();
		parse.accept(visitor1);
		for (TypeDeclaration typeDeclaration : visitor1.getTypes()) {
			VariableDeclarationFragmentVisitor visitor2 = new VariableDeclarationFragmentVisitor();
			typeDeclaration.accept(visitor2);
			attributesNumber += visitor2.getVariables().size();
		}
	}

	// nombre moyen de lignes par classe
	public static void printAverageNumberOfLinesByClass() {
		System.out.println("6. Nombre moyen de lignes par classe: " + Math.round(lines / classNumber));
	}

	public static String getPackageName(CompilationUnit parse) {
		String res = "";
		PackageDeclarationVisitor visitor1 = new PackageDeclarationVisitor();
		parse.accept(visitor1);

		res = parse.getPackage().getName().toString();
		res = res.replace(".", "\\");
		return res;
	}

	public static void printAverageNumberOfAttributesByClass() {
		System.out.println("7. Nombre moyen d'attributs par classe: " + Math.round(attributesNumber / classNumber));
	}

	public static void getClassInfo(CompilationUnit parse) {

		List<MethodDeclaration> methods = new ArrayList<MethodDeclaration>();

		TypeDeclarationVisitor tdvisitor = new TypeDeclarationVisitor();
		parse.accept(tdvisitor);

		for (TypeDeclaration typeDeclaration : tdvisitor.getTypes()) {
			// compter nombre de methodes de la classe
			MethodDeclarationVisitor visitor1 = new MethodDeclarationVisitor();
			typeDeclaration.accept(visitor1);
			int nbMethods = visitor1.getMethods().size();
			// liste des methodes de la classe
			methods = visitor1.getMethods();

			// compter le nombre d'attributs de la classe
			VariableDeclarationFragmentVisitor visitor2 = new VariableDeclarationFragmentVisitor();
			typeDeclaration.accept(visitor2);
			int nbAttributes = visitor2.getVariables().size();

			classes.add(new Classe(typeDeclaration.getName().toString(), nbMethods, nbAttributes, methods));
		}

	}

	public static void printClassesWithMethodsMoreThan(int x) {
		for (Classe classe : classes) {
			if (classe.getNbMethods() >= x) {
				System.out.println("    - " + classe.getName().toString());
			}
		}
	}

	public static void countNumberOfLinesByClass(CompilationUnit parse, File fileEntry) {
		BufferedReader reader;
		int classLine = 0;
		String filepath = projectSourcePath + getPackageName(parse) + "\\" + fileEntry.getName();
		try {
			reader = new BufferedReader(new FileReader(filepath));
			while (reader.readLine() != null) {
				lines++;
				classLine++;
			}
			
			for (Classe classe : classes) {
				if(classe.getName().toString().equals(fileEntry.getName().substring(0, fileEntry.getName().length() - 5))) {
					classe.setNbLines(classLine);
				}
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<Entry<MethodDeclaration, Integer>> numberOfLinesByMethod(List<CompilationUnit> compilationUnits) {
		Map<MethodDeclaration, Integer> methods = new HashMap<MethodDeclaration, Integer>();
		
		for (CompilationUnit parse : compilationUnits) {
			MethodDeclarationVisitor visitor1 = new MethodDeclarationVisitor();
			parse.accept(visitor1);
			
			for (MethodDeclaration method : visitor1.getMethods()) {
				if(method.getBody() != null) {
					String body = method.getBody().toString();
					String[] lines = body.split("\n");
					int nbLines = lines.length;
					methods.put(method, nbLines);
				}
			}
		}
		
		List<Map.Entry<MethodDeclaration, Integer>> methodList = new ArrayList<>(methods.entrySet());
		System.out.println("- Nombre total de methodes: " + methods.size());
		Collections.sort(methodList, new Comparator<Map.Entry<MethodDeclaration, Integer>>() {
			@Override
			public int compare(Entry<MethodDeclaration, Integer> o1, Entry<MethodDeclaration, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}   
		});
		
		Collections.reverse(methodList);
		return methodList;
	}
	
	public static void drawAllMethodsGraph(CompilationUnit parse, Graphviz gv, Graph graph) {
		
//	    TypeDeclarationVisitor tdvisitor = new TypeDeclarationVisitor();
//	    parse.accept(tdvisitor);
//	    for (TypeDeclaration classe : tdvisitor.getTypes()) {
//			Node classNode = new Node(classe.getName().toString());
//			classNode.addAttribute(new Attribute("color","blue"));
			
			MethodDeclarationVisitor visitor1 = new MethodDeclarationVisitor();
			parse.accept(visitor1);
			
			for (MethodDeclaration method : visitor1.getMethods()) {
				Node n1 = new Node(method.getName().toString());
				graph.addNode(n1);
				//graph.addEdge(new Edge(classNode, n1));
				
				MethodInvocationVisitor visitor2 = new MethodInvocationVisitor();
				method.accept(visitor2);
				
				for (MethodInvocation invocation : visitor2.getMethods()) {
					Node n2 = new Node(invocation.getName().toString());
					graph.addNode(n2);
					graph.addEdge(new Edge(n1, n2));
				}
			}
		//}
	    
		String type = "png";
	    File out = new File("graph."+ type);
	    writeGraphToFile( gv.getGraphByteArray(graph, type, "100"), out );
	    
	}
	
	static public int writeGraphToFile(byte[] img, File to){
        try {
            FileOutputStream fos = new FileOutputStream(to);
            fos.write(img);
            fos.close();
        } catch (java.io.IOException ioe) { return -1; }
        return 1;
    }
	
	
	/**
	 * TP4 - Comprehension des programmes
	 * HMIN306
	 * */
	
	// exercice 1 - Graphe de couplage entre classes
	// 1) 
	public static void grapheCouplage(CompilationUnit parse) {
        MethodDeclarationVisitor visitor1 = new MethodDeclarationVisitor();
        parse.accept(visitor1);

        for (MethodDeclaration method : visitor1.getMethods()) {

        }
	}
	
}
