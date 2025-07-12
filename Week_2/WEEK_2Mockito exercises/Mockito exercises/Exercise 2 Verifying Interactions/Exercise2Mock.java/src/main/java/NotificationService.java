package org.example;

public class NotificationService {
    private final NotificationApi notificationApi;

    public NotificationService(NotificationApi notificationApi) {
        this.notificationApi = notificationApi;
        System.out.println("NotificationService initialized with NotificationApi.");
    }

    public void sendNotification(String message) {
        System.out.println("NotificationService: Triggering notification with message -> " + message);
        notificationApi.sendNotification(message); // delegate to the dependency
    }
}
