public class Notification {

    private String id;
    private String content;
    private boolean read;

    public Notification(String id, String content) {
        this.id = id;
        this.content = content;
        this.read = false;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public boolean isRead() {
        return read;
    }

    public void markAsRead() {
        this.read = true;
    }

    public void markAsUnread() {
        this.read = false;
    }
}
