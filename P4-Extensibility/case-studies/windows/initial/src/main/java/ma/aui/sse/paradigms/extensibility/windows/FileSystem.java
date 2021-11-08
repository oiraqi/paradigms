package ma.aui.sse.paradigms.extensibility.windows;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import static ma.aui.sse.paradigms.extensibility.windows.Notification.CREATE;
import static ma.aui.sse.paradigms.extensibility.windows.Notification.DELETE;

public class FileSystem {

    private HashMap<String, String> nodes = new HashMap<>();
    private LinkedList<Window> windows = new LinkedList<>();

    public void subscribe(Window window) {
        windows.add(window);
    }

    public void unsubscribe(Window window) {
        windows.remove(window);
    }

    public void create(Node node) {
        if (nodes.containsKey(node.getPath())) {
            throw new IllegalArgumentException(node.getPath());
        }
        nodes.put(node.getPath(), node.getType());
        notify(new Notification(node, CREATE));
    }

    public void delete(Node node) {
        nodes.remove(node.getPath());
        notify(new Notification(node, DELETE));
    }

    private void notify(Notification notification) {
        Iterator<Window> it = windows.iterator();
        while (it.hasNext()) {
            it.next().update(notification);
        }
    }
}
