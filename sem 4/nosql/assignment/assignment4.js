// SCENARIO ONE
// 1. Create a document called Invoice
db.createCollection('invoice')

// 2. Insert 10 documents
db.invoice.insert([
  {
    id: 1,
    item: "Karthik D",
    qty: 200,
    rate: 80000,
    date: new Date("2016-05-18")
  },
  {
    id: 2,
    item: "Football",
    qty: 401,
    rate: 8000,
    date: new Date("2018-08-21")
  },
  {
    id: 3,
    item: "Pen",
    qty: 90213,
    rate: 20,
    date: new Date("2014-02-28")
  },
  {
    id: 4,
    item: "Notebook",
    qty: 50123,
    rate: 50,
    date: new Date("2019-04-21")
  },
  {
    id: 5,
    item: "Rolex",
    qty: 20,
    rate: 25000,
    date: new Date("2013-05-18")
  },
  {
    id: 6,
    item: "Dell XPS",
    qty: 550,
    rate: 120000,
    date: new Date("2018-05-23")
  },
  {
    id: 7,
    item: "POCO F1",
    qty: 10000,
    rate: 21000,
    date: new Date("2019-01-18")
  },
  {
    id: 8,
    item: "Huawei Honor 9",
    qty: 15000,
    rate: 11000,
    date: new Date("2018-08-15")
  },
  {
    id: 9,
    item: "Vincent Chase Glasses",
    qty: 600,
    rate: 2200,
    date: new Date("2015-09-18")
  },
  {
    id: 10,
    item: "Nvidia RTX 2080ti",
    qty: 250,
    rate: 160000,
    date: new Date("2016-05-18")
  }
])

// 3. Group by the invoice date field, and display the total cost, average quantity and number of an
// invoice in the same date.
db.invoice.aggregate(
   [
      {
        $group : {
           _id : { month: { $month: "$date" }, day: { $dayOfMonth: "$date" }, year: { $year: "$date" } },
           totalPrice: { $sum: { $multiply: [ "$rate", "$qty" ] } },
           averageQuantity: { $avg: "$qty" },
           count: { $sum: 1 }
        }
      }
   ]
).pretty()

// 4. Group by the invoice date and then by item field, and display the total cost, average quantity
// and number of an invoice in the same date.
db.invoice.aggregate(
   [
      {
        $group : {_id : {date : "$date", item : "$item"},
           totalCost: { $sum: { $multiply: [ "$rate", "$qty" ] } },
           avgQty: { $avg: "$qty" },
           count: { $sum: 1 }
        }
     }
  ]
).pretty()

// 5. Group by the invoice date and then by item field, and display the total cost, average quantity
// and number of an invoice in the same date for those documents which invoice date is
// 05/12/2014.
db.invoice.aggregate(
   [
    {
	$match : {date : "05/12/2014"}
    },
      {
        $group : {_id : {date : "$date", item : "$item"},
           totalCost: { $sum: { $multiply: [ "$rate", "$qty" ] } },
           avgQty: { $avg: "$qty" },
           count: { $sum: 1 }
        }
     }
  ]
).pretty()

// 6. Group the documents by the item to retrieve the distinct item values
 db.invoice.aggregate([{ $group : { _id : "$item" }}]).pretty()

// 7. Group the invoice date of the documents by the item.
db.invoice.aggregate(
   [
     { $group : { _id : "$item", Date: { $push: "$date" } } }
   ]
).pretty();

// 8. Show the documents 4 to 8
db.invoice.find().skip(3).limit(5).pretty()


// SCENARIO TWO
//1. Create a document called Employee
db.createCollection('employee')

// 2. Insert 10 documents
db.employee.insert([
  {
    id: 1,
    emp_code: "AX401",
    emp_name: "Karthik D",
    doj: new Date("2018-06-21"),
    salary: 200000
  },
  {
    id: 2,
    emp_code: "AX203",
    emp_name: "Harsha K Y",
    doj: new Date("2014-06-22"),
    salary: 500000
  },
  {
    id: 3,
    emp_code: "AX1000",
    emp_name: "Jeevan J",
    doj: new Date("2019-08-23"),
    salary: 250000
  },
  {
    id: 4,
    emp_code: "AX001",
    emp_name: "Bill Gates",
    doj: new Date("1997-04-21"),
    salary: 100000
  },
  {
    id: 5,
    emp_code: "AX010",
    emp_name: "Vineeth C",
    doj: new Date("2010-05-12"),
    salary: 100000
  },
  {
    id: 6,
    emp_code: "AX111",
    emp_name: "Shruti K",
    doj: new Date("2013-12-11"),
    salary: 800000
  },
  {
    id: 7,
    emp_code: "AX101",
    emp_name: "Jacques",
    doj: new Date("1999-08-21"),
    salary: 100000
  },
  {
    id: 8,
    emp_code: "AX221",
    emp_name: "Punit",
    doj: new Date("2004-08-21"),
    salary: 150000
  },
  {
    id: 9,
    emp_code: "AX551",
    emp_name: "Setevie G",
    doj: new Date("2007-07-07"),
    salary: 100000
  },
  {
    id: 10,
    emp_code: "AX991",
    emp_name: "Mark Ronson",
    doj: new Date("2008-01-21"),
    salary: 123456
  }
])

// 3. Include the _id, emp_code and emp_name in the output document
db.employee.aggregate([{$project : {emp_code : 1, emp_name : 1}}]).pretty()

// 4. Update the document to have an embedded document called deduction that consists of pf, pt, it
db.employee.updateOne({emp_name: "Harsha K Y"}, {
  $set: {
    deduction: {
      pf: 4000,
      pt: 3000,
      it: 200
    }
  }
})

db.employee.updateOne({emp_name: "Karthik D"}, {
  $set: {
    deduction: {
      pf: 3000,
      pt: 2000,
      it: 100
    }
  }
})

db.employee.updateOne({emp_name: "Jeevan J"}, {
  $set: {
    deduction: {
      pf: 3000,
      pt: 2000,
      it: 100
    }
  }
})

// 5. Include the _id and deduction detail of pf in the output document
db.employee.aggregate([{$project: {_id: 1, deduction: 1}}]).pretty()

// 6. Include the day, month and year taken from doj, emp_code, pf and salary
db.employee.aggregate([{$project: {doj: 1, emp_code: 1, "deduction.pf": 1, salary: 1}}]).pretty()

// 7. Display the documents that have the salary equal to 90000
db.employee.find({salary: {$eq: 90000}}).pretty()

// 8. Select the documents where the salary is greater than 9000 and less than or equal to 12000.
// Then sends the result for grouping to perform a count.
db.employee.aggregate([
  { $match : { salary : { $gt : 9000, $lte : 12000 } } },
  { $group: { _id: null, count: { $sum: 1 } } }
]);

// 9. 
