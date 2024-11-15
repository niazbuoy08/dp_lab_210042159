import java.util.List;


public class Main {
    public static void main(String[] args) {
        SocialMediaAggregator aggregator = new SocialMediaAggregator();


        aggregator.addPlatform("Twitter", new TwitterPlatform());


        List<Notification> notifications = aggregator.getAllNotifications();
        for (Notification notification : notifications) {
            System.out.println("Notification: " + notification.getContent() + ", Read: " + notification.isRead());
        }


        aggregator.markNotificationAsRead("Twitter", "1");

        // Delete a notification
        aggregator.deleteNotification("Twitter", "2");
    }

}
