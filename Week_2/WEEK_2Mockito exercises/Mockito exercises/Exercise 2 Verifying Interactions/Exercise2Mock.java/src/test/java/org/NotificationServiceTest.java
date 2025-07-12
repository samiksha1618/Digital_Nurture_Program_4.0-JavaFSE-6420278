package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Test
    public void testSendNotificationCalledWithCorrectArgument() {
        System.out.println("Creating mock NotificationApi...");
        NotificationApi mockNotificationApi = mock(NotificationApi.class);

        System.out.println("Initializing NotificationService with mock NotificationApi.");
        NotificationService service = new NotificationService(mockNotificationApi);

        String expectedMessage = "HelloUser";
        System.out.println("Triggering notification with message: \"" + expectedMessage + "\"");
        service.sendNotification(expectedMessage);

        System.out.println("Verifying interaction with expected argument.");
        verify(mockNotificationApi).sendNotification(expectedMessage);

        System.out.println("Test completed successfully.");
    }
}
