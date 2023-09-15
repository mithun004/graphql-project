# GraphQL API Endpoints

## Get Book by ID

**Method:** POST

**Endpoint:** `http://localhost:9090/api/graphql`

```graphql
query {
  getBookById(bookId: 2) {
    id
    author
    description
    title
    publisher
    price
    pages
  }
}
```
## Get All Books

**Method** : POST

**Endpoint:** `http://localhost:9090/api/graphql`

```graphql
query {
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
```
# Create Book

**Endpoint** : POST

**Endpoint:** `http://localhost:9090/api/graphql`
```graphql
mutation {
  createBook(
    bookInput: {
      author: "Kishore"
      description: "This is the story of Village People"
      title: "Wise Person"
      publisher: "Naveen Publication"
      price: 333
      pages: 4000
    }
  ) {
    id
    author
    description
    title
    publisher
    price
    pages
  }
}

```
# Update Book
**Endpoint** : POST

**Endpoint:** `http://localhost:9090/api/graphql`

```graphql
mutation {
  updateBook(
    bookInput: {
      id: 3
      author: "Kishore Kumar"
      description: "This is the story of Village People"
      title: "Wise Person"
      publisher: "Naveen Publication"
      price: 333
      pages: 4000
    }
  ) {
    id
    author
    description
    title
    publisher
    price
    pages
  }
}
```

# Delete Book
**Endpoint** : POST

**Endpoint:** `http://localhost:9090/api/graphql`

```graphql
mutation {
  deleteBook(bookId: 3)
}

```

These are the GraphQL API endpoints and operations available for managing books.







