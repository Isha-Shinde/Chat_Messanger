# Chat Messenger

A console-based Java application that enables text-based communication between a client and a server using TCP Socket Programming.

## Platform Requirements

* **Platform:** Windows NT or Linux
* **User Interface:** Command Line Interface (CLI)
* **Technology:** Java Programming

## Project Overview

The **Chat Messenger** is a console-based Java application developed using **Java Socket Programming**.

It establishes a TCP connection between a client and a server. The server listens for incoming client requests on a specific port, while the client connects to the server using the server address and port number.

After establishing the connection, the client can send messages to the server, and the server can send responses back to the client.

This project demonstrates the practical use of **Socket Programming, TCP/IP communication, Input/Output Streams, and Client-Server Architecture** in Java.

## Key Features

### 1. Client-Server Communication

* Establishes communication between a client and a server.
* Uses Java `Socket` and `ServerSocket` classes.
* Communication is performed using TCP.

### 2. Real-Time Text Messaging

* Client can send text messages to the server.
* Server receives and displays client messages.
* Server can send responses back to the client.
* Client receives and displays server responses.

### 3. TCP Socket Communication

* Server creates a `ServerSocket` on port `2100`.
* Client connects to the server using `Socket`.
* Data is exchanged through input and output streams.

### 4. Command Line Interface

* Provides a simple console-based interface.
* Users can enter messages directly through the keyboard.
* Displays sent and received messages on the console.

### 5. Chat Termination

* The client can terminate the chat by entering:

```text
end
```

* The socket connection is then closed.

## Technologies Used

### Language

* Java

### Packages and APIs

* `java.net.*`

  * `ServerSocket` for listening for client connections.
  * `Socket` for establishing communication.

* `java.io.*`

  * `BufferedReader` for reading input.
  * `InputStreamReader` for converting input streams into character streams.
  * `PrintStream` for sending text messages.

## Project Flow

```text
                    Start Server
                         |
                         v
                Create ServerSocket
                    Port: 2100
                         |
                         v
                Wait for Client
                         |
                         |
                         v
                   Client Starts
                         |
                         v
                  Create Socket
                         |
                         v
              Connect to Server
                         |
                         v
                Connection Established
                         |
              +----------+----------+
              |                     |
              v                     v
        Client sends          Server receives
          message                message
              |                     |
              |                     v
              |               Server sends
              |                  response
              |                     |
              +----------<----------+
                         |
                         v
                    Continue Chat
                         |
                         v
                  Client enters "end"
                         |
                         v
                 Close Connection
```

## Classes and Responsibilities

### ChatServer

Responsible for creating and managing the server-side communication.

**Responsibilities:**

* Creates a `ServerSocket` on port `2100`.
* Waits for a client connection using `accept()`.
* Creates input and output streams.
* Receives messages from the client.
* Displays client messages.
* Sends responses to the client.
* Closes the socket and server connection.

### ChatClient

Responsible for connecting to the server and communicating with it.

**Responsibilities:**

* Creates a `Socket` and connects to the server.
* Uses `localhost` and port `2100`.
* Creates input and output streams.
* Accepts messages from the keyboard.
* Sends messages to the server.
* Receives and displays server responses.
* Terminates the chat when the user enters `end`.

## Example Usage

### Server Console

```text
Server Application is running...
Server is waiting at port 2100
Client request gets accepted successfully

-----------------------------------------------
-----------Marvellous Chat Server--------------
-----------------------------------------------

Client says :Hello
Enter msg for client:
Hi
```

### Client Console

```text
Client Application is running...
connection is successful with server

-----------------------------------------------
-----------Marvellous Chat Client--------------
-----------------------------------------------

Enter msg for server:
Hello
Server says :Hi

Enter msg for server:
How are you?
Server says :I am fine
```

## Concepts Demonstrated

* Java Classes and Objects
* Socket Programming
* TCP/IP Communication
* Client-Server Architecture
* `ServerSocket`
* `Socket`
* `BufferedReader`
* `InputStreamReader`
* `PrintStream`
* Input and Output Streams
* `accept()`
* `getInputStream()`
* `getOutputStream()`
* Command Line Interface
* Exception Handling using `throws Exception`
* Basic Network Programming
