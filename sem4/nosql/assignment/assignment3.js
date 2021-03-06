// 1. create collection called pets
db.createCollection("pets")

// 2. insert 10 documents
db.pets.insert([{
  _id: 0,
  name: "Karthik D",
  age: 22,
  pets: [
    {
      petName: "Jimmy",
      petAge: 23,
      petType: "Dog"
    },
    {
      petName: "Jonny",
      petAge: 13,
      petType: "Cat"
    }
  ]
}, {
  _id: 1,
  name: "Harsha KY",
  age: 22,
  pets: [
    {
      petName: "Leo",
      petAge: 11,
      petType: "Tiger"
    },
    {
      petName: "Kurzawa",
      petAge: 3,
      petType: "Snake"
    }
  ]
}, {
  _id: 2,
  name: "Sudhanva",
  age: 24,
  pets: [
    {
      petName: "Tyson",
      petAge: 6,
      petType: "Lizard"
    },
    {
      petName: "Jason",
      petAge: 8,
      petType: "Toad"
    },
    {
      petName: "Kri",
      petAge: 2,
      petType: "Cat"
    }
  ]
}, {
  _id: 3,
  name: "Jeevan",
  age: 12,
  pets: [
    {
      petName: "Jeswin",
      petAge: 4,
      petType: "Dog"
    }
  ]
}, {
  _id: 4,
  name: "Shubam",
  age: 3,
  pets: [
    {
      petName: "Jake Paul",
      petAge: 31,
      petType: "Human Dog"
    },
    {
      petName: "Logan Paul",
      petAge: 33,
      petType: "Worst Pet Ever"
    }
  ]
},  {
  _id: 5,
  name: "Sujay",
  age: 25,
  pets: [
    {
      petName: "Kay",
      petAge: 66,
      petType: "Some Pet"
    }
  ]
}, {
  _id: 6,
  name: "Manvantara",
  age: 27,
  pets: [
    {
      petName: "Gan",
      petAge: 12,
      petType: "Elephant"
    },
    {
      petName: "Lakshmi",
      petAge: 12,
      petType: "Cow"
    },
    {
      petName: "Nagini",
      petAge: 130,
      petType: "Python(Snake)"
    }
  ]
}, {
  _id: 7,
  name: "Some Dude",
  age: 18,
  pets: [
    {
      petName: "Hatchi",
      petAge: 7,
      petType: "Dog"
    },
    {
      petName: "Kurama",
      petAge: 190,
      petType: "Nine Tails Beast"
    }
  ]
}, {
  _id: 8,
  name: "Naruto Uzumaki",
  age: 29,
  pets: [
    {
      petName: "Ten Tails",
      petAge: 181,
      petType: "Tailed Beast"
    },
    {
      petName: "Six Tails",
      petAge: 187,
      petType: "Tailed Beast"
    },
    {
      petName: "Three Tails",
      petAge: 1234,
      petType: "Tailed Beast"
    },
    {
      petName: "Two Tails",
      petAge: 876,
      petType: "Tailed Beast"
    }
  ]
}, {
  _id: 9,
  name: "Abhiram",
  age: 20,
  pets: [
    {
      petName: "Jay",
      petAge: 67,
      petType: "Killer Whale"
    },
    {
      petName: "Ichigo",
      petAge: 40,
      petType: "Turtle"
    }
  ]
}])

// 3. find out how many have cats as pets
db.pets.find({"pets.petType": "Cat"}).count()

// 4. find out how many ppl have at least 2 pets
db.pets.aggregate([Create an output collection called dog_coll that consists of all documents that have only dogs
as pets
  {
    $project: {
      name: 1,
      numberOfPets: {$size: "$pets"}
    }
  }
])

// 5. Display the names of first two people who have dogs as pets.
db.pets.find({
  "pets.petType": "Dog"
}, {
  name: 1,
  _id: 0
})

// 6. Create an output collection called dog_coll that consists of all documents that have only dogs as pets
db.pets.find({
  "pets.petType": "Dog"
},{name: 1, age: 1, pets: 1}, {$out: "dog_coll"})
