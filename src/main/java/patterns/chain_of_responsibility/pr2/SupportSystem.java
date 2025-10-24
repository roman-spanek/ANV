package patterns.chain_of_responsibility.pr2;

public class SupportSystem {
    public static void main(String[] args) {
        // Create handlers
        SupportHandler levelOne = new LevelOneSupport();
        SupportHandler levelTwo = new LevelTwoSupport();
        SupportHandler levelThree = new LevelThreeSupport();

        // Link handlers into a chain
        levelOne.setNextHandler(levelTwo);
        levelTwo.setNextHandler(levelThree);

        // Create tickets
        Ticket lowTicket = new Ticket("Password reset", 1);
        Ticket mediumTicket = new Ticket("Software bug", 2);
        Ticket highTicket = new Ticket("Server down", 3);

        // Send tickets through the chain
        levelOne.handleRequest(lowTicket);      // Handled by Level One
        levelOne.handleRequest(mediumTicket);   // Handled by Level Two
        levelOne.handleRequest(highTicket);     // Handled by Level Three
    }
}