package com.za.tutorial.mongodb;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;


public class InsertDriver {

	public static void main(String[] args) {
		
		
		DB db = (new MongoClient("localhost",27017)).getDB("zoneacademydatabase");
		
		DBCollection dbCollection = db.getCollection("Channel");
		
		BasicDBObject basicDBObject = new BasicDBObject();
		basicDBObject.put("name","zoneacademy");
		basicDBObject.put("subscription",4100);
		dbCollection.insert(basicDBObject);
		
		

	}

}
