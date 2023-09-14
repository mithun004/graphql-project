
Method: Post
http://localhost:9090/api/graphql

query{

getBookById(bookId : 2) { 
    id
    author
    description
    title
    publisher
    price
    pages
}

}
--------

query{

allBooks { 
    id
    author
    description
    title
    publisher
    price
    pages
}

}

------
mutation {
createBook(bookInput:{
    author: "Kishore",
    description:"This is story of Village People",
    title:"Wise Person",
    publisher:"Naveen Publication",
    price:333,
    pages: 4000

} ) { 
    id
    author
    description
    title
    publisher
    price
    pages
}

}
------------
mutation {
updateBook(bookInput:{
    author: "Kishore Kumar",
    description:"This is story of Village People",
    title:"Wise Person",
    publisher:"Naveen Publication",
    price:333,
    pages: 4000
    id :3

} ) { 
    id
    author
    description
    title
    publisher
    price
    pages
}

}
------
mutation {
deleteBook(bookId:3)
}