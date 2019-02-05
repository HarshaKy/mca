
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

// slice
