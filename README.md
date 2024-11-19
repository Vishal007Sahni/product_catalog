# Product Catalog API

## Setup Instructions

1. Clone the repository.
2. Set up MongoDB (locally or using MongoDB Atlas).
3. Update `application.properties` with your MongoDB connection details.
4. Run the application using your IDE or `mvn spring-boot:run`.

## API Endpoints

- **POST** `/api/products` - Create a new product.
- **GET** `/api/products/{id}` - Get a product by ID.
- **GET** `/api/products` - Get all products.
- **PUT** `/api/products/{id}` - Update a product.
- **DELETE** `/api/products/{id}` - Delete a product.

## Example Responses
**Create Product**:
```json
{
    "id": "123",
    "name": "Product A",
    "description": "A great product",
    "price": 199.99,
    ...
}
