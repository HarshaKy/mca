// filter items array to include documents that have price greater thaor equal to 100

// failed students
db.student.aggregate([
  {
    $project: {
      name: 1,
      grades: {
        $filter: {
          input: "$grades", as: "score",
          cond: {
            $lt: ["$$grades", 70]
          }
        }
      }
    }
  }, {
    $out: "grades"
  }
])
