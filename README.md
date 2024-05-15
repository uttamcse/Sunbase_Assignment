
# Sunbase Assignment:

Create a Basic RAG model AI chatbot using any open-source model available.
 Database: Zilliz/Supabase or any Vector DB, of your choice.
Backend: Java
Frontend: HTML/CSS/JS (or anything you are familiar with)


Backend should haveAPI for:
• Upload a file or text - text should then be converted into chunks and then embeddings
(You can use any open-source embedding model or paid one too). Embedding should
then be stored in a vector DB with vector index of your choice (Cosine/ L2/KNN).
• Chat API -> prompt or user queries should be passed in this API and using prompt
engineering response should be derived from any Language model.
Frontend:
UI does not have to look pretty. basic pages should be there -
1. For uploading docs or text for training the RAG model.
2. Basic chat interface where user can send message and receive the response

## Process to create the Application


Creating a basic RAG (Red, Amber, Green) model AI chatbot in Java can be done using various open-source libraries such as OpenNLP for natural language processing and Supabase for the database. For simplicity, I'll outline a basic structure for the chatbot along with a simple implementation using Java, HTML, CSS, and JavaScript.

Here's a basic overview of what we'll do:

Frontend: Create a basic HTML/CSS/JS interface for the chatbot.
Backend: Develop a Java application that handles the chatbot logic.
Database: Utilize Supabase as the database for storing RAG model information.


## Frontend (HTML/CSS/JS):

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>RAG Model Chatbot</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="chat-container">
        <div id="chat-box"></div>
        <input type="text" id="user-input" placeholder="Type a message...">
        <button onclick="sendMessage()">Send</button>
    </div>
    <script src="script.js"></script>
</body>
</html>

## Backend (Java):

import java.util.Scanner;

public class RAGChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("RAG Model Chatbot Initialized");
        System.out.println("Type 'exit' to quit");

        String input;
        do {
            System.out.print("You: ");
            input = scanner.nextLine();
            String response = respondTo(input);
            System.out.println("Bot: " + response);
        } while (!input.equalsIgnoreCase("exit"));
        
        scanner.close();
    }

    public static String respondTo(String input) {
        // Placeholder logic for generating bot responses
        return "Received: " + input;
    }
}

## Database (Supabase):

You'll need to set up a Supabase project and create a table to store RAG model information. You can refer to Supabase documentation for setting up and interacting with the database.


## Integration:

You would need to integrate the Java backend with the frontend using HTTP requests. You can use libraries like java.net.HttpURLConnection for making HTTP requests from Java. The backend should expose an API endpoint that the frontend can communicate with.

