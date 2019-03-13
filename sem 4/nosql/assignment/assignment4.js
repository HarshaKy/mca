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

// db.invoice.insert({
//   id: 11,
//   item: "Asus ROG Motherboard",
//   qty: 250,
//   rate: 19000,
//   date: new Date("2016-05-18")
// })

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
)

// 4. Group by the invoice date and then by item field, and display the total cost, average quantity
// and number of an invoice in the same date.
