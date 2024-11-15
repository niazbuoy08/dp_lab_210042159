import java.util.List;
import java.util.ArrayList;


public class TwitterPlatform implements SocialMediaPlatform{
    @Override
    public List<Notification> fetchNotifications() {

        List<Notification> notifications = new ArrayList<>();
        notifications.add(new Notification("1", "Twitter notification 1"));
        notifications.add(new Notification("2", "Twitter notification 2"));
        return notifications;
    }

    @Override
    public void markAsRead(String notificationId) {

        System.out.println("Twitter notification " + notificationId + " marked as read.");
    }

    @Override
    public void deleteNotification(String notificationId) {

        System.out.println("Twitter notification " + notificationId + " deleted.");
    }
}
