package ma.aui.sse.paradigms.extensibility.windows;

import ma.aui.sse.paradigms.extensibility.Observer;

public class Window implements Observer<Notification> {

    private String name;
    private String currentPath;

    public Window(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Window other = (Window) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public String getCurrentPath() {
        return currentPath;
    }

    public void setCurrentPath(String currentPath) {
        this.currentPath = currentPath;
    }

    public void notify(Notification notification) {
        if (amIConcerned(notification)) {
            System.out.println("From " + name + " : " + notification.getNode().getType() + " " + notification.getNode().getPath() + ": " + notification.getOperation()); 
        }
    }

    private boolean amIConcerned(Notification notification) {
        if (notification != null && notification.getNode() != null && notification.getNode().getPath() != null
                && notification.getNode().getPath().contains(currentPath)) {
            
            String trailer = notification.getNode().getPath().substring(currentPath.length());
            if (trailer.indexOf("/", 1) == -1) {
                return true;
            }
        }
        return false;
    }

}
