import pymongo
from pymongo import MongoClient

con = pymongo.MongoClient("mongodb://localhost")

db = con.pes 
coll = db.customers

def insert():
	cName = input("Enter name: ")
	cAddress = input("Enter address: ")
	cPhNo = int(input("Enter phone number: "))
	cAge = int(input("Enter age: "))
	cID = input("Enter id: ")

	db.customers.insert_one(
		{
			"name": cName,
			"address": cAddress,
			"phone": cPhNo,
			"age": cAge,
			"cid": cID
		}
	)

def displayExceptID() :
	docs = db.customers.find({}, {"_id": 0})
	for i in docs: 
		print(i)

def findByName(cName) :
	docs = db.customers.find({"name": cName}, {"address": 1, "age": 1, "_id": 0})
	for i in docs:
		print(i)

def findByAgeGreaterThan(age) :
	docs = db.customers.find({"age": {"$gt": age}})
	for i in docs:
		print(i)

def findByPlace(address) :
	docs = db.customers.find({"address": address})
	for i in docs:
		print(i)

def updateByPlace(address): 
	docs = db.customers.update_many(
		{ "address": "Somewhere" }, 
		{ "$inc": { "age": 2 } }
	)
	print(docs.modified_count, "documents updated.")

def deleteByID(cID):
	db.customers.delete_one(
		{ "cid": cID }
	)
	# print(docs.modified_count, "document(s) deleted.")

# def addNewField():
# 	docs = db.customers.find()

	

# addNewField()

# num = int(input("enter number of records you want to insert: "))
# for i in range(num):
# 	insert()

# displayExceptID()

# name = input("Enter name of person whose details you want to fetch: ")
# findByName(name)

# findByAgeGreaterThan(50)

# findByPlace("Somewhere")

# updateByPlace("Somewhere")

# deleteByID("101")