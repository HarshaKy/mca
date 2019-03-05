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
