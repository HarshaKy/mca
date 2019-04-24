import pymongo
from pymongo import MongoClient

con = pymongo.MongoClient("mongodb://localhost")

db = con.pes 
coll = db.student

def insert():
	srn = input("Enter SRN for student: ")
	name = input("Enter name for student: ")
	sem = int(input("Enter the semester the student belongs to: "))
	sClass = input("Enter class name: ")
	isa = int(input("Enter ISA marks: "))
	caType = input("Enter the CA type: ")
	caMarks = int(input("Enter the CA marks: "))

	db.student.insert_one(
		{
			"srn": srn,
			"name": name,
			"sem": sem,
			"class": sClass,
			"isa": isa,
			"ca": {
				"caType": caType,
				"caMarks": caMarks
			}
		}
	)

def findByMarksGreaterThan(marks):
	docs = db.student.find( { "$and": [ { "ca.caType": { "$eq": "Assignment" } }, { "ca.caMarks": { "$gt": marks } } ] } )

	for i in docs: 
		print(i)

# for i in range(10):
# 	insert()

findByMarksGreaterThan(30)