package com.neo4j.examples;

import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Relationship;
import java.io.File;
import java.util.Iterator;

public class Driver {

	public enum NodeType implements Label {
		Person, Course
	}
	
	public enum RelationType implements RelationshipType {
		Knows, BelongsTo;
	}
	
	
	public static void main(String[] args) {

		String fileAddress = "C:\\neo4jdata\\default.graphdb";
		File file = new File(fileAddress);
		
		GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
		GraphDatabaseService graphdbService = dbFactory.newEmbeddedDatabase(file);
		
		try (Transaction tx = graphdbService.beginTx()){
			
			//Below is to load the graph
			
			/*
			
			Node bobNode = graphdbService.createNode(NodeType.Person);
			bobNode.setProperty("Pid",5001);
			bobNode.setProperty("Name","Roberto");
			bobNode.setProperty("Age",41);
			
			Node aliceNode = graphdbService.createNode(NodeType.Person);
			aliceNode.setProperty("Pid",5002);
			aliceNode.setProperty("Name","Alizina");
			
			Node evaNode = graphdbService.createNode(NodeType.Person);
			evaNode.setProperty("Name","Evita");
			
			Node itNode = graphdbService.createNode(NodeType.Course);
			itNode.setProperty("Id",1);
			itNode.setProperty("Name","IT Beginners");
			itNode.setProperty("Location","Room 153");
			
			Node electronicNode = graphdbService.createNode(NodeType.Course);
			electronicNode.setProperty("Name","Electronics Advanced");
			
			bobNode.createRelationshipTo(aliceNode,RelationType.Knows);
			
			Relationship bobRelIT = bobNode.createRelationshipTo(itNode,RelationType.BelongsTo);
			bobRelIT.setProperty("function","student");
			
			Relationship bobRelElectronics = bobNode.createRelationshipTo(electronicNode,RelationType.BelongsTo);
			bobRelElectronics.setProperty("function","Teacher");
			
			Relationship aliceRelIT = aliceNode.createRelationshipTo(itNode,RelationType.BelongsTo);
			aliceRelIT.setProperty("function","Teacher");
			
			*/
			
			//This is to query the graph
			
			String getPersons = "match (n:Person) return n";
			
			Iterator<Node> columns = graphdbService.execute(getPersons).columnAs("n");
			
			while (columns.hasNext()){
				Node node = columns.next();
				System.out.println(node +" : " +node.getProperty("Name"));
			}
			
			tx.success();
			
			System.out.println("This try worked");
			
			
		}
		
		System.out.println("So far so good");
		
		

	}

}
