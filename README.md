Chat Messenger

Platform required: Windows NT platform
Architectural requirement: Intel 32-bit processor
User interface: Command Line Interface
Technology Used: Java Programming

Project Overview

The Chat Messenger is a Java-based client-server chat application developed using Java Socket Programming. It enables text-based communication between a client and a server over a TCP connection.

The server listens for client connection requests on a specific port, and the client connects to the server using the server's IP address and port number. After establishing the connection, the client and server can exchange messages through the socket connection.

This project provides a basic understanding of network programming, TCP communication, sockets, input/output streams, and client-server architecture in Java.

Key Features
• Client-Server Communication
Establishes communication between a client and a server using Java sockets.
Uses TCP-based socket communication.
• Real-Time Text Messaging
Allows the client to send text messages to the server.
Allows the server to send responses back to the client.
• Socket-Based Communication
Uses ServerSocket on the server side to listen for connections.
Uses Socket on both client and server sides for communication.
• Command Line Interface
Provides a simple console-based interface for sending and receiving messages.
• Message Termination
The client can terminate the chat session by entering end.
Technologies and Classes Used
Java Programming
Socket Programming
TCP/IP
ServerSocket
Socket
BufferedReader
InputStreamReader
PrintStream
Learning Outcomes
Practical knowledge of Java Socket Programming.
Understanding of TCP-based client-server communication.
Understanding of ServerSocket and Socket.
Experience with Java input and output streams.
Understanding of sending and receiving data over a network connection.
Understanding of basic client-server architecture.
Improved knowledge of Java network programming.
Project Working
                TCP Connection
      ┌─────────────────────────────┐
      │                             │
      ▼                             ▼
+-------------+              +-------------+
|    Client   | <----------> |    Server   |
+-------------+              +-------------+
      |                             |
      | Send Message                |
      |---------------------------->|
      |                             |
      |       Server Reply          |
      |<----------------------------|
      |                             |
      +-----------------------------+
Server
Creates a ServerSocket on port 2100.
Waits for a client connection using accept().
Creates input and output streams.
Receives messages from the client.
Sends a response back to the client.
Client
Creates a Socket and connects to localhost on port 2100.
Creates input and output streams.
Reads messages from the keyboard.
Sends messages to the server.
Receives and displays the server's response.
Terminates the chat when the user enters end.
How to Run
1. Compile the Server
javac ChatServer.java
2. Compile the Client
javac ChatClient.java
3. Start the Server
java ChatServer
4. Start the Client

Open another terminal and run:

java ChatClient
5. Start Chatting

Enter a message on the client side. The server will receive it and can send a reply.

To end the client session, enter:

end
Project Structure
Chat-Messenger/
│
├── ChatServer.java
├── ChatClient.java
└── README.md
Conclusion

The Chat Messenger project demonstrates the basic implementation of a client-server chat application using Java TCP Socket Programming. It helped in understanding how applications establish network connections and exchange messages using Java sockets and input/output streams.