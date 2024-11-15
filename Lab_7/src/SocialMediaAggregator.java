
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocialMediaAggregator {

    private Map<String, SocialMediaPlatform> platforms = new HashMap<>();

    public void addPlatform(String name, SocialMediaPlatform platform) {
        platforms.put(name, platform);
    }

    public List<Notification> getAllNotifications() {
        List<Notification> allNotifications = new ArrayList<>();
        for (SocialMediaPlatform platform : platforms.values()) {
            allNotifications.addAll(platform.fetchNotifications());
        }
        return allNotifications;
    }

    public void markNotificationAsRead(String platformName, String notificationId) {
        SocialMediaPlatform platform = platforms.get(platformName);
        if (platform != null) {
            platform.markAsRead(notificationId);
        } else {
            System.out.println("Platform not found: " + platformName);
        }
    }

    public void deleteNotification(String platformName, String notificationId) {
        SocialMediaPlatform platform = platforms.get(platformName);
        if (platform != null) {
            platform.deleteNotification(notificationId);
        } else {
            System.out.println("Platform not found: " + platformName);
        }
    }
}
