package test;

import nom_model.*;

import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.emf.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Je charge l'instance map.xmi du méta-modèle maps.ecore
		Resource resource = chargerModele("model/map-model.xmi", Nom_modelPackage.eINSTANCE);
		if (resource == null) System.err.println(" Erreur de chargement du modèle");
		
		
		//Instruction récupérant le modèle sous forme d'arbre à partir de la classe racine "map"
		map maMap = (map) resource.getContents().get(0);
						
		System.out.println(maMap.getName());
		
		System.out.println("les rues sont: ");
		for (Road road : maMap.getRoads()) {
			if(!(road instanceof Pedestrian))
				System.out.println(" - " + road.getName());
			else {
				if(road.getLenght() > 1000)
					System.out.println(" - " + road.getName() + " (rue pietonne > 1000)");
			}
		}
		
		
	}
	
	EList<Road> getRuesAdjacentes(Road road, map map){
		EList<Road> roads = (EList<Road>) new ArrayList<Road>();
		for (Road road2 : map.getRoads()) {
			if(road.equals(road2)) {
				roads.add(road.getMeet());
			}
		}
		return roads;
	}
	 
	
	public static Resource chargerModele(String uri, EPackage pack) {
		   Resource resource = null;
		   try {
		      URI uriUri = URI.createURI(uri);
		      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		      resource = (new ResourceSetImpl()).createResource(uriUri);
		      XMLResource.XMLMap xmlMap = new XMLMapImpl();
		      xmlMap.setNoNamespacePackage(pack);
		      java.util.Map options = new java.util.HashMap();
		      options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		      resource.load(options);
		      
		   }
		   catch(Exception e) {
		      System.err.println("ERREUR chargement du modèle : "+e);
		      e.printStackTrace();
		   }
		   return resource;
		}

}
