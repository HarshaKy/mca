// assignment 2

// 1.
db.createCollection('employees')

// 2.
db.employees.insert(
    [
        {
            name: "Harsha Ky",
            salary: 98764,
            role: "CEO"
        },
        {
            name: "Ron",
            salary: 31341,
            role: "CTO"
        },
        {
            name: "Harry",
            salary: 45444,
            role: "PA"
        },
        {
            name: "Jeevan",
            salary: 67890,
            role: "MD"
        },
        {
            name: "Hermoine",
            salary: 90000,
            role: "Conjurer"
        },
        {
            name: "Draco",
            salary: 556,
            role: "Developer"
        },
        {
            name: "Frodo",
            salary: 9876543,
            role: "Ring Bearer"
        },
        {
            name: "NNN",
            salary: 45000,
            role: "Investigator"
        },
        {
            name: "AAA",
            salary: 14000,
            role: "Intern"
        }
    ]
)

// BulkWriteResult({
// 	"writeErrors" : [ ],
// 	"writeConcernErrors" : [ ],
// 	"nInserted" : 9,
// 	"nUpserted" : 0,
// 	"nMatched" : 0,
// 	"nModified" : 0,
// 	"nRemoved" : 0,
// 	"upserted" : [ ]
// })


// 3.

db.employees.update(
    {
        name: "AAA"
    },
    {
        $set: {
            "salary": 8000
        }
    }
)
// WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })


// 4.

db.employees.update(
    {},
    {
        $inc: {
            "salary": 4500
        }
    }
)
// WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })


// 5.

db.employees.update(
    {
        name: "NNN"
    },
    {
        $set: {
            role: ["head", "prof"]
        }
    }
)
// WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })


// 6.

db.employees.update(
    {
        name: "Harsha Ky"
    },
    {
        $addToSet: {
            remark: "VC"
        }
    }
)
// WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })


// 7.

db.employees.update(
    {
        name: "XXX"
    },
    {
        id: 11,
        name: "Jane",
        salary: 10000,
        role: "coach"
    },
    {
        upsert: true
    }
)
//  WriteResult({
// 	"nMatched" : 0,
// 	"nUpserted" : 1,
// 	"nModified" : 0,
// 	"_id" : ObjectId("5c6526da0f170eb40da0ac3b")
// })


// 8.

db.createCollection('restaurants')


// 9.

db.restaurants.insert(
    [
        {
            name: "Hotel 1",
            address: {
                building: "9",
                coordinates: [1332, 123430],
                street: "Church St.",
                city: "Bangalore",
                zipcode: 560020
            },
            cuisine: "American",
            ratings: {
                date: Date(),
                grade: "A+",
                score: "98"
            }
        },
        {
            name: "Church Street Social",
            address: {
                building: "1234",
                coordinates: [09876, 124315],
                street: "Church St.",
                city: "Bangalore",
                zipcode: 560020
            },
            cuisine: "Italian",
            ratings: {
                date: Date(),
                grade: "A++",
                score: "110"
            }
        },
        {
            name: "Meghana Foods",
            address: {
                building: "21",
                coordinates: [20111, 313240],
                street: "Residency Road",
                city: "Bangalore",
                zipcode: 560020
            },
            cuisine: "South Indian",
            ratings: {
                date: Date(),
                grade: "B+",
                score: "70"
            }
        },
        {
            name: "Kormangala Socials",
            address: {
                building: "56",
                coordinates: [1234, 1234],
                street: "Some Street",
                city: "Bangalore",
                zipcode: 560045
            },
            cuisine: "Continental",
            ratings: {
                date: Date(),
                grade: "X",
                score: "123"
            }
        },
        {
            name: "Auro Cafe",
            address: {
                building: "10",
                coordinates: [12345, 54313],
                street: "Rock Beach Road",
                city: "Pondicherry",
                zipcode: 560056
            },
            cuisine: "French",
            ratings: {
                date: Date(),
                grade: "A",
                score: "145"
            }
        },
        {
            name: "Hotel 2",
            address: {
                building: "111",
                coordinates: [212340, 341215210],
                street: "MG Road",
                city: "Bangalore",
                zipcode: 560020
            },
            cuisine: "Chinese",
            ratings: {
                date: Date(),
                grade: "C",
                score: "60"
            }
        },
        {
            name: "Russh",
            address: {
                building: "987",
                coordinates: [45678, 098765],
                street: "St. Marks Road",
                city: "Bangalore",
                zipcode: 560027
            },
            cuisine: "Indian",
            ratings: {
                date: Date(),
                grade: "A",
                score: "99"
            }
        },
        {
            name: "Some hotel pls",
            address: {
                building: "111",
                coordinates: [123431, 524514],
                street: "Dr. Rajkumar Road",
                city: "Bangalore",
                zipcode: 560065
            },
            cuisine: "Mexican",
            ratings: {
                date: Date(),
                grade: "A++",
                score: "190"
            }
        },
        {
            name: "No Name",
            address: {
                building: "89",
                coordinates: [43567, 767587],
                street: "Gandhi St.",
                city: "Mumbai",
                zipcode: 560085
            },
            cuisine: "Indian",
            ratings: {
                date: Date(),
                grade: "A",
                score: "100"
            }
        }
    ]
)
// BulkWriteResult({
// 	"writeErrors" : [ ],
// 	"writeConcernErrors" : [ ],
// 	"nInserted" : 9,
// 	"nUpserted" : 0,
// 	"nMatched" : 0,
// 	"nModified" : 0,
// 	"nRemoved" : 0,
// 	"upserted" : [ ]
// })


// 10.

db.restaurants.find(
    {},
    {
        _id: 1,
        name: 1,
        cuisine: 1
    }
)
// { "_id" : ObjectId("5c6529ed9e2eab7ea6b7ef7f"), "name" : "Hotel 1", "cuisine" : "American" }
// { "_id" : ObjectId("5c6529ed9e2eab7ea6b7ef80"), "name" : "Church Street Social", "cuisine" : "Italian" }
// { "_id" : ObjectId("5c6529ed9e2eab7ea6b7ef81"), "name" : "Meghana Foods", "cuisine" : "South Indian" }
// { "_id" : ObjectId("5c6529ed9e2eab7ea6b7ef82"), "name" : "Kormangala Socials", "cuisine" : "Continental" }
// { "_id" : ObjectId("5c6529ed9e2eab7ea6b7ef83"), "name" : "Auro Cafe", "cuisine" : "French" }
// { "_id" : ObjectId("5c6529ed9e2eab7ea6b7ef84"), "name" : "Hotel 2", "cuisine" : "Chinese" }
// { "_id" : ObjectId("5c6529ed9e2eab7ea6b7ef85"), "name" : "Russh", "cuisine" : "Indian" }
// { "_id" : ObjectId("5c6529ed9e2eab7ea6b7ef86"), "name" : "Some hotel pls", "cuisine" : "Mexican" }
// { "_id" : ObjectId("5c6529ed9e2eab7ea6b7ef87"), "name" : "No Name", "cuisine" : "Indian" }


// 11.

db.restaurants.find(
    {
        cuisine: "Chinese"
    }
).pretty()
// {
// 	"_id" : ObjectId("5c6529ed9e2eab7ea6b7ef84"),
// 	"name" : "Hotel 2",
// 	"address" : {
// 		"building" : "111",
// 		"coordinates" : [
// 			212340,
// 			341215210
// 		],
// 		"street" : "MG Road",
// 		"city" : "Bangalore",
// 		"zipcode" : 560020
// 	},
// 	"cuisine" : "Chinese",
// 	"ratings" : {
// 		"date" : "Thu Feb 14 2019 14:12:21 GMT+0530 (IST)",
// 		"grade" : "C",
// 		"score" : "60"
// 	}
// }


// 12.

db.restaurants.find(
    {},
    {
        arrayFilters: [{
            coordinates: {
                $lt: 95754168
            }
        }]
    }
)


// 13.

db.restaurants.find(
    {
        cuisine: "Continental"
    },
    {
        ratings: 1
    }
).pretty()
// {
// 	"_id" : ObjectId("5c6529ed9e2eab7ea6b7ef82"),
// 	"ratings" : {
// 		"date" : "Thu Feb 14 2019 14:12:21 GMT+0530 (IST)",
// 		"grade" : "X",
// 		"score" : "123"
// 	}
// }
