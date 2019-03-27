// Primary Node
// 2.
db.createCollection('restaurants')

// 3.
db.restaurants.insert(
	[
		{
			address: {
				number: 2,
				street: 'asdf'
			},
			name: 'Chung Wah',
			id: 1,
			cusine: 'Chinese',
			star: 3,
			locality: 'Jaynagar',
			grade: {
				date: new Date('2014-03-01'),
				grade: 'A',
				score: 70
			}
		},
		{
			address: {
				number: 212,
				street: 'qwer'
			},
			name: 'The Hotel',
			id: 2,
			cusine: 'Continental',
			star: 2,
			locality: 'RR Nagar',
			grade: {
				date: new Date('2017-12-22'),
				grade: 'C',
				score: 45
			}
		},
		{
			address: {
				number: 1234,
				street: 'zxcv'
			},
			name: 'Some Other Hotel',
			id: 3,
			cusine: 'Japanese',
			star: 4,
			locality: 'RR Nagar',
			grade: {
				date: new Date('2018-04-21'),
				grade: 'B',
				score: 66
			}
		},
		{
			address: {
				number: 8767,
				street: 'fghjnm'
			},
			name: 'Another Hotel',
			id: 4,
			cusine: 'Mexican',
			star: 1,
			locality: 'RR Nagar',
			grade: {
				date: new Date('2013-12-11'),
				grade: 'D',
				score: 34
			}
		},
		{
			address: {
				number: 0987,
				street: 'oknbcdxcvg'
			},
			name: 'Dennys',
			id: 5,
			cusine: 'South Indian',
			star: 5,
			locality: 'RR Nagar',
			grade: {
				date: new Date('2016-11-11'),
				grade: 'A',
				score: 90
			}
		},
		{
			address: {
				number: 098765,
				street: 'uhbgfaub'
			},
			name: 'Sherlocks',
			id: 6,
			cusine: 'North Indian',
			star: 3,
			locality: 'Jaynagar',
			grade: {
				date: new Date('2011-03-01'),
				grade: 'B',
				score: 71
			}
		},
		{
			address: {
				number: 1234,
				street: 'lkansdho'
			},
			name: 'Shivaji Hotel',
			id: 7,
			cusine: 'American',
			star: 2,
			locality: 'RR Nagar',
			grade: {
				date: new Date('2010-03-01'),
				grade: 'C',
				score: 51
			}
		},
		{
			address: {
				number: 909099,
				street: 'localhost'
			},
			name: 'Shanghai Times',
			id: 8,
			cusine: '',
			star: 3,
			locality: 'RR Nagar',
			grade: {
				date: new Date('2014-03-01'),
				grade: 'A',
				score: 76
			}
		},
		{
			address: {
				number: 9090,
				street: 'localhost'
			},
			name: 'Udupi Grand',
			id: 9,
			cusine: 'South Indian',
			star: 3,
			locality: 'Malleswaram',
			grade: {
				date: new Date('2014-12-11'),
				grade: 'A',
				score: 76
			}
		},
		{
			address: {
				number: 1234567,
				street: 'asdfqwer'
			},
			name: 'Last Hotel',
			id: 10,
			cusine: 'asdf',
			star: 3,
			locality: 'Bangalore',
			grade: {
				date: new Date('2014-03-01'),
				grade: 'A',
				score: 76
			}
		}
	]
)

// 4.
db.restaurants.find().pretty()

// 5.
db.restaurants.find({}, {
	id: 1,
	cusine: 1,
	name: 1
}).pretty()

// 6.
db.restaurants.find({locality: 'RR Nagar'}).limit(5).pretty()

// 7.
db.restaurants.find(
	{ 'grade.score': { $mod: [7, 0] } },
	{ id: 1, name: 1, grade: 1 }
).pretty()

// 8.
db.restaurants.find().sort(
	{"cusine":1, "locality" : -1,}
).pretty()

// 9.
db.restaurants.find( 
	{ 
		"grade.date": ISODate("2014-03-01T00:00:00Z"), 
		"grade.grade":"A" , 
		"grade.score" : 76
	}, 
	{id : 1, name: 1, grade: 1}
).pretty()

// 10.
db.restaurants.find().sort(
	{ name: 1 }
).pretty()

// 14.
db.restaurants.find({ grade : { $elemMatch: {"grade.score": { $gt : 90 }}}});

// 15.
db.restaurants.find(
	{
		$and:
			[
				{"cusine" : {$ne :"Chinese"}},
				{"grade.score" : {$gt : 70}}
			]
	}
).pretty()

// 16.
db.restaurants.find( {
	"cusine" : {$ne : "Chinese"},
	"grade.grade" :"A",
	"locality": {$ne : "Jaynagar"}
} 
).sort({ "cuisine":-1 }).pretty()

// 17.
db.restaurants.find(
	{ name: /gar$/ },
	{
		id : 1,
		name: 1,
		locality: 1,
		cusine: 1
	}
).pretty()

// 18.
db.restaurants.find(
	{ 
		"locality": "MG Road", 
		$or: 
		[
			{ "cusine" : "Italian" },
			{ "cusine" : "Chinese" }
		] 
	} 
).pretty()
	