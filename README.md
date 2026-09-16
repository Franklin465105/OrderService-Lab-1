Order Service

The Order Service is responsible for creating and storing orders. For this lab, orders are stored temporarily in a Java List and there is no database yet.

Port

The Order Service runs on:
http://localhost:8082

Endpoints
Get all orders

GET /orders
Returns all orders currently stored in the service.

Create an order
POST /orders

Example request:

{
  "productId": 1,
  "quantity": 2
}

The service automatically gives each order an ID.

Swagger
Swagger UI is available at:
http://localhost:8082/swagger-ui/index.html

Project Structure
model - contains the PurchaseOrder class
service - contains the order service and temporary order list
controller - contains the REST endpoints

Other Service
The Catalog Service is a separate microservice and has its own GitHub repository.

The productId in an order refers to a product that belongs to the Catalog Service. However, the Order Service does not contact the Catalog Service yet. This is intentional for Lab 1.

Current Version
This is Lab 1, so the service currently uses temporary in-memory storage. JPA and a database will be added later.
