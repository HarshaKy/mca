import pymongo
from pymongo import MongoClient

con = pymongo.MongoClient("mongodb://localhost")

db = con.pes 
coll = db.employee

def insert() :
	empid = input("enter id")
	empname = input("enter name")

	db.emp.insert_one(
		{
			"id": empid,
			"name": empname
		}
	)

for i in range(5) :
	insert()

# for i in range(10):
# 	coll.insert_one({"name": "ABC"})

# docs = coll.find()

# for i in docs:
# 	print(i)
