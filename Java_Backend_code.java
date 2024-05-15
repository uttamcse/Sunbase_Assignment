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