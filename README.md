# Dmart Management System

This is a Java-based application that simulates a basic management system for a Dmart store. It allows users to add and manage products, assign cashiers, and handle customer details along with their shopping carts.

## Project Structure

### Classes and Their Responsibilities
1. **Dmart**:
   - Stores details about the Dmart branch such as address, contact info, email, and website.
   - Manages the list of products, the cashier, customer, and shopping cart.

2. **Product**:
   - Represents the details of a product, including category, name, and price.
   - Associates each product with a unique `Barcode`.

3. **Barcode**:
   - Holds the product ID and its corresponding Dmart price.

4. **Customer**:
   - Stores customer details such as name, contact number, payment mode, bill number, and total bill amount.

5. **Cashier**:
   - Stores details about the cashier such as name, ID, contact number, and counter number.

6. **Cart**:
   - Represents the shopping cart which can hold multiple products and has a specified type and capacity.

7. **DmartDriver**:
   - The main driver class where the application is executed. It demonstrates adding products, displaying details, and managing a cashier.

---

## Features
1. **Dmart Information**:
   - Display Dmart details including address, contact, email, and website.

2. **Product Management**:
   - Add products with category, name, price, barcode ID, and Dmart-specific price.
   - Display product details.

3. **Cashier Management**:
   - Add a cashier with name, ID, contact number, and counter number.
   - Display cashier details.

4. **Customer Management**:
   - Add customer details like name, contact, payment mode, bill number, and total bill.
   - Ensure cashier and products are added before managing customers.

5. **Cart Management**:
   - Add and display cart details, including type, capacity, and list of products in the cart.

---

## Prerequisites
- **Java Development Kit (JDK)**: Version 8 or above.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor like VS Code.

---

## How to Run
1. Clone the repository or copy the source code into your Java project.
2. Compile the program using:
   ```bash
   javac DmartDriver.java
3. Run the program using:
   ```bash
   java DmartDriver
4. Follow the prompts to add products and view details in the console.

---
Happy coding! 😊
