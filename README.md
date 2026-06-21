# 🎫 Ticket Booking System

A console-based Java application for booking, viewing, searching, and managing travel tickets with automatic fare calculation.

## 📋 Overview

**Ticket Booking System** is a simple, menu-driven Java console application that simulates a basic ticket reservation system. It allows users to book tickets by entering passenger details, view all booked tickets, search for a specific ticket by its ID, and delete a ticket when needed.

The system is built using core Object-Oriented Programming concepts — the `Booking` class models a ticket with attributes like passenger name, age, mobile number, source, destination, and distance, while the `Main` class drives the application through an interactive menu loop.

## ✨ Features

- **Book a Ticket** — Enter passenger name, age, validated 10-digit mobile number, source, destination, and distance (km). A unique, auto-incrementing ticket ID is generated for each booking.
- **Automatic Fare Calculation** — Ticket price is calculated dynamically based on distance (₹3 per km).
- **Display All Tickets** — View a list of all currently booked tickets with full details.
- **Search by Ticket ID** — Quickly retrieve a specific ticket's details.
- **Delete a Ticket** — Remove a ticket by ID, with the system automatically reorganizing the remaining records.
- **Input Validation** — Mobile numbers are validated to ensure they are 10 digits and begin with 7, 8, or 9.

## 🛠️ Tech Stack

- **Language:** Java
- **Concepts used:** Object-Oriented Programming (classes, constructors, encapsulation), Arrays, Loops, Switch-case, Input validation with `Scanner`

## 📂 Project Structure

```
ticket-booking-system/
├── book.java       # Contains the Booking class and the Main driver class
└── README.md
```

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ticket-booking-system.git
   cd ticket-booking-system
   ```

2. Compile the program:
   ```bash
   javac book.java
   ```

3. Run the program:
   ```bash
   java Booking
   ```

## 💻 Sample Run

```
Select an option:
1. Book a Ticket
2. Display Tickets
3. Search for a Ticket by ID
4. Delete a Ticket by ID
5. Exit

Enter your choice: 1
Your Ticket ID: 125
Enter PassengerName: John Doe
Enter age: 28
Enter Mobile Number (10 digits, starts with 9/8/7): 9876543210
Enter source location: Ahmedabad
Enter destination location: Mumbai
Enter kms of your route: 530

--------------------------
Your ticketId is: 125
Your name is: John Doe
Your age is: 28
Mobile Number: 9876543210
Route: Ahmedabad to Mumbai
The price of ticket is 1590.0
--------------------------
```

## 🔮 Future Improvements

- Replace fixed-size array storage with a dynamic data structure (e.g., `ArrayList`)
- Add file/database persistence so tickets aren't lost on program exit
- Add update/edit functionality for existing bookings
- Improve input validation (e.g., handle non-numeric input gracefully)

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
