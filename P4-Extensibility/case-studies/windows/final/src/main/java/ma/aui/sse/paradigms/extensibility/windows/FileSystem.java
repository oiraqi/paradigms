package ma.aui.sse.paradigms.extensibility.windows;

import java.util.HashMap;

import ma.aui.sse.paradigms.extensibility.Observable;

import static ma.aui.sse.paradigms.extensibility.windows.Notification.CREATE;
import static ma.aui.sse.paradigms.extensibility.windows.Notification.DELETE;

public class FileSystem extends Observable<Notification> {

    private HashMap<String, String> nodes = new HashMap<>();

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

}
