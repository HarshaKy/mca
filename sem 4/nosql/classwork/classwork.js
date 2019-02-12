
// update operations on arrays\

// addToSet operation
db.student.update({
	name: "Harsha Ky"
}, {
	$addToSet: {
		marks:  94
	}
})

// pop operation, uses only 1 or -1 (first or last element)
db.student.update({
	name: "Harsha Ky"
}, {
	$pop: {
		marks: 1
	}
})

// pull operation
db.student.update({
	name: "Harsha Ky"
}, {
	$pull: {
		marks: {
			$lt: 100
		}
	}
})

// push and each operation
db.student.update({
	name: "Harsha Ky"
}, {
	$push: {
		marks: {
			$each: [40, 45, 50]
		}
	}
})

// create a collection books
// insert -  id, username
// embedded doc - title, author, pages

db.createCollection("books")

db.books.insert({
	_id: 1,
	name: "harsha ky",
	info: [{
		title: "book1",
		author: "asdf",
		pages: 123
	}, {
		title: "book2",
		author: "qwer",
		pages: 452
	}]
})

db.books.insert({
	_id: 2,
	name: "Ronaldo",
	info: [{
		title: "harry potter part 1",
		author: "JK Rowling",
		pages: 566
	}, {
		title: "LOTR",
		author: "JRR Tolkien",
		pages: 1000
	}]
})

db.books.insert({
	_id: 3,
	name: "Messi",
	info: [{
		title: "harry potter part 7",
		author: "JK Rowling",
		pages: 542
	}, {
		title: "Running out of book names",
		author: "some author",
		pages: 567
	}, {
		title: "Some good book",
		author: "Cliche author",
		pages: 654
	}]
})

db.books.insert({
	_id: 4,
	name: "Ozil",
	info: [{
		title: "asdfqwer",
		author: "not jk rowling",
		pages: 542
	}, {
		title: "Running out of book names pt 2",
		author: "some author again",
		pages: 567
	}, {
		title: "Some good book pt 111",
		author: "Cliche author gg",
		pages: 654
	}]
})
