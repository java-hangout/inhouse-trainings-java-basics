package org.jh.iht.java.basics.day02;

// Class with tightly-coupled code
public class InterfacesProgram02 {

    public String sendEmail(String email, String message) {
        EmailService emailService = new EmailService(); // Creating a concrete class dependency
        return emailService.send(email, message); // Using tightly-coupled email service
    }

    // Static run method to demonstrate tightly-coupled code
    public static String run(String email, String message) {
        InterfacesProgram02 program = new InterfacesProgram02();
        return program.sendEmail(email, message);
    }
}

// Concrete class with tightly-coupled logic
class EmailService {
    public String send(String email, String message) {
        // Simulate email sending
        return "Email sent to " + email + " with message: " + message;
    }
}