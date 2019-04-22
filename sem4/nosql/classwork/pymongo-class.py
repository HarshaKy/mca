import pymongo
from pymongo import MongoClient

con = pymongo.MongoClient("mongodb://localhost")
# con = MongoClient
database = con.pes 
coll = database.mca

for i in range(10):
    coll.insert_one({"name": "ABC"})

docs = coll.find()

for i in docs:
    print(i)
# myColl = db.testdb
# print("asdf")
