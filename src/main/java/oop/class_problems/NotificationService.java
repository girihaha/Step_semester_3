package oop.class_problems;

interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {
    String email;
    EmailNotifier(String email) { this.email = email; }
    public void send(String message) {
        System.out.println("Email to " + email + ": " + message);
    }
}

class SmsNotifier implements Notifier {
    String phone;
    SmsNotifier(String phone) { this.phone = phone; }
    public void send(String message) {
        System.out.println("SMS to " + phone + ": " + message);
    }
}

public class NotificationService {
    public static void main(String[] args) {
        Notifier n1 = new EmailNotifier("student@srm.edu.in");
        Notifier n2 = new SmsNotifier("9876543210");
        n1.send("Assignment deadline tomorrow.");
        n2.send("OTP is 44521.");
    }
}
