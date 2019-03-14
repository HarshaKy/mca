db.createCollection('products')
db.products.insert(
    [
        {
            item: "Book",
            desc: "This is a random book",
            quantity: 10,
            price: 100
        },
        {
            item: "Laptop",
            desc: "This is a random laptop",
            quantity: 1220,
            price: 12200
        },
        {
            item: "Mobile",
            desc: "This is a random mobile",
            quantity: 10,
            price: 1500
        },
        {
            item: "HDD",
            desc: "This is a random hdd",
            quantity: 10,
            price: 1002
        },
        {
            item: "Table",
            desc: "This is a random table",
            quantity: 10,
            price: 10000
        },
        {
            item: "Bike",
            desc: "This is a random bike",
            quantity: 10,
            price: 50000
        },
        {
            item: "Monitor",
            desc: "This is a random monitor",
            quantity: 10,
            price: 40000
        },
        {
            item: "Chair",
            desc: "This is a random chair",
            quantity: 10,
            price: 30000
        },
        {
            item: "Computer",
            desc: "This is a random PC",
            quantity: 10,
            price: 25000
        }
    ]
)
