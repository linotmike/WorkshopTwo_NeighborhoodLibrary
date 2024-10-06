# Neighbourhood Library

![project license](https://img.shields.io/badge/license-MIT-blue.svg)

## Description

This Library Management System is a console-based Java application designed to manage a small neighborhood library. The system allows users to check out and check in books, view available books, and track which books are currently checked out and who they are checked out to. It's a simple, user-friendly application suitable for small libraries, providing essential functionality for managing a collection of books.

The system uses an array of 20 books, with each book containing attributes such as ID, ISBN, Title, Checked Out Status, and the person the book is checked out to. The user interacts with the system via a text-based menu.

## Table of Contents

- [Usage](#usage)
    - [Screen Recording](#screen-recording)
- [Features](#features)
- [How It Works](#How-It-Works)
- [Prerequisites](#prerequisites)
- [License](#license)

------------------

## Usage
To use the Library Management System, simply run the application from the command line. Upon starting, you'll be presented with a menu where you can view available books, check out or return books, and see which books are currently checked out. Select the appropriate option, enter the book's ID when prompted, and follow the on-screen instructions to manage the library's inventory.

## Screen recording
[Screen Recording](.src/demo/demo.mp4)


------------------

## Features
<ul>
<li> Display Available Books: Shows a list of all books that are currently available for checkout.
<li> Display Checked Out Books: Shows a list of all books that have been checked out, along with the name of the person who has the book.
<li> Check Out a Book: Users can check out a book by entering its ID. The system updates the book’s status and assigns it to the user.
<li> Check In a Book: Users can return a checked-out book by entering its ID, after which the system updates the book’s status to available.
</ul>

## How It Works
1. Main Menu: Upon running the application, users are presented with a main menu with options to view available books, view checked-out books, check out a book, or check in a book.
2. Check Out Process: To check out a book, the user is prompted to enter the book's ID. The system verifies if the book is available and, if so, allows the checkout.
3. Check In Process: To return a book, the user enters the book's ID. If the book is currently checked out, the system marks it as available.
4. Book Status Tracking: The system keeps track of which books are available and which are checked out, along with the information of the person who checked out the book.

------------------

## Prerequisites
<ul>
<li>Java 8 or above
<li>Any Java IDE (e.g., IntelliJ IDEA, Eclipse)
</ul>
------------------


## License
MIT License
