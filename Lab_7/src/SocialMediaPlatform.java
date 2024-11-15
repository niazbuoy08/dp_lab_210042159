import java.util.List;

public interface SocialMediaPlatform {
    List<Notification> fetchNotifications();
    void markAsRead(String notificationId);
    void deleteNotification(String notificationId);
}
