# scenario two

import pymongo
from pymongo import MongoClient

con = pymongo.MongoClient("mongodb://localhost")

db = con.pes 
coll = db.movie

def insert():
    title = input("Enter title: ")
    writer = input("Enter writer: ")
    year = int(input("Enter release year: "))
    franchise = input("Enter the franchise: ")
    actor1 = input("Enter actor 1 name: ")
    actor2 = input("Enter actor 2 name: ")
    actor3 = input("Enter actor 3 name: ")
    
    coll.insert_one({
        "title": title,
        "writer": writer,
        "year": year,
        "franchise": franchise,
        "actors": [
            {"name": actor1},
            {"name": actor2},
            {"name": actor3}
        ]
    })

for i in range(10):
    insert()

qt = coll.find({ "writer": "Quentin Tarantino" })
for i in qt:
    print(i)

brad = coll.find({}, {
    "$each": {
        "actors.name": "Brad Pitt"
    }
})
for i in brad:
    print(i)

hp = coll.find({"franchise": "Harry Potter"})
for i in hp:
    print(i)

year = coll.find({}, {
    "year": {
        "$lt": 2000,
        "$gt": 1989
    }
})
for i in year:
    print(i)

year = coll.find({}, {
    "year": {
        "$lt": 2011,
        "$gt": 2000
    }
})
for i in year:
    print(i)