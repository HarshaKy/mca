// set the discount value to 30, if qty value is greater than or equal to 100,
// 20, if less than 100
db.products.aggregate([
  {
    $project: {
      item: 1,
      discount: {
        $cond: {
          if: {
            $gte: ["$qty", 250]}, then: 30, else: 20
          }
        }
      }
    }
  }
])

// some collection
db.createCollection('mycol')

//
db.mycol.insert([
  {
    _id: 0,
    a: 8
  },
  {
    _id: 1,
    a: [1,2,3,4,5,6]
  },
  {
    _id: 2,
    a: {
      a: "apple",
      b: "ball",
      c: "cat"
    }
  },
  {
    _id: 3,
    a: "asdf"
  },
  {
    _id: 4,
    a: NumberLong(71)
  },
  {
    _id: 5
  }
])

// administrative commands

// rename collection
db.adminCommand(
  {
     renameCollection: "mycol",
     to: "testdb"
  }
)

// drop db
use test

db.createCollection('example')

db.example.insert({
  _id: 1,
  a: "asdf"
})

show dbs

db.runCommand({dropDatabase: 1})

// create a collection
db.runCommand({
  create: "asdf1",
  capped: true,
  size: 50241231
})

// drop a collection using name
db.asdf1.drop()

// limit number of results in db.find()
use employee

db.employee.find().limit(4).pretty()
