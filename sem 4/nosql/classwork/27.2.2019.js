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

//
db.sales.aggregate([
  {
    $group: {
      _id: ""
    }
  }
])

//
db.student.aggregate([
  {
    $project: {
      name: 1,
      summary: {
        $switch: {
          branches: [
            {
              case: {
                $gte: [{$avg: "$grades"}, 90]
              },
              then: "great"
            },

            {
              case: {
                $and: [{
                  $gte: [{
                    $avg: "$grades"
                  }, 80]
                }, {
                  $lt: [{
                    $avg: "$grades"
                  }, 90]
                }]
              },
              then: "pretty well"
            },

            {
              case: {
                $lt: [{
                  $avg: "$grades"
                }, 80]
              },
              then: "can do  better"
            }
          ],
          default: "no scores found"
        }
      }
    }
  }
])
