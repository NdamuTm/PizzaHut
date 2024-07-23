
# Pizza Ordering System

## Question 1: 50 Marks

### Scenario
PizzaHut is a South African restaurant that specializes in selling pizza. They are in need of a system that helps them to calculate the final amount a pizza should cost after adding various toppings. They have approached you as a developer to develop the application for them.

### Project Requirements
You are required to create an application that calculates the total amount a customer should pay after ordering pizza. Use the following classes:

1. **Pizza Class**
   - An array that stores the toppings of the pizza. The class should be able to store a maximum of 10 pizza toppings.
   - The price for each pizza is $14, and each topping is $2.
   - The class should also have a `toString()` method that displays the description and price of the pizza.

2. **DeliveryPizza Subclass**
   - Inherits from Pizza but adds a numeric delivery fee and a String delivery address.
   - The delivery fee is $3 if the Pizza ordered costs more than $18; otherwise, the delivery fee is $5.

### Program Functionality
- Ask the user for toppings of the pizza. The user should continually enter the toppings until a sentinel value ('Q') is entered or until the maximum number of toppings (10) is reached.
- Ask the user whether the Pizza is to be delivered. If it is to be delivered, create an object for delivery and display all the values for the pizza; otherwise, just display the values without the delivery fee.
- Use Exception Handling where necessary.

## Installation
1. **Clone the repository:**
    ```bash
    git clone [https://github.com/your-username/pizza-ordering-system.git](https://github.com/NdamuTm/PizzaHut.git)
    ```
2. **Navigate to the project directory:**
    ```bash
    cd pizza-ordering-system
    ```
3. **Compile the code:**
    ```bash
    javac Main.java Pizza.java DeliveryPizza.java
    ```
4. **Run the program:**
    ```bash
    java Main
    ```

## Usage
1. **Run the program.**
2. **Follow the on-screen prompts:**
    - Select toppings from the menu.
    - Enter 'Q' to quit the toppings selection.
    - Choose whether the pizza is for delivery.
    - If delivery is chosen, enter the delivery address.
3. **View the total cost and order details.**

## Tools Used
- **Replit:** For quick prototyping and testing.
- **VS Code:** For extensive code editing and debugging.
- **IntelliJ IDEA Ultimate:** For advanced features and seamless development.
- **NetBeans:** For efficient project management and integrated development.

## Credits
This project was created with the help of various tools and a sprinkle of humor. Special thanks to PizzaHut for the inspiration! also I'm confused why we are we using dollars on a south african restaurant.

---

Happy coding and happy eating! 🍕 and under no circumstances should you order pizza with pineapple like never!!!😅😅😅😭

