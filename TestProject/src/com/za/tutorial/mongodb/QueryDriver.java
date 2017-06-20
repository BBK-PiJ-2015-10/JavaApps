package com.za.tutorial.mongodb;


import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;


public class QueryDriver {

	public static void main(String[] args) {
		
		DB db = (new MongoClient("localhost",27017)).getDB("zoneacademydatabase");
		DBCollection dbCollection = db.getCollection("Channel");
		
		BasicDBObject basicDBObject = new BasicDBObject();
		basicDBObject.put("name","zoneacademy");
		DBCursor dbCursor = dbCollection.find(basicDBObject);
		while (dbCursor.hasNext()){
			System.out.println(dbCursor.next());
		}
		
		System.out.println("done");

	}

}