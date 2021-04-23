package ma.aui.sse.paradigms.extensibility.windows;

public class Node {

    private String path;
    private String type;
    public static final String FILE = "File";
    public static final String FOLDER = "Folder";

    public Node(String path, String type) {
        if (!type.equals(FILE) && !type.equals(FOLDER)) {
            throw new IllegalArgumentException(type);
        }
        this.path = path;
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!type.equals(FILE) && !type.equals(FOLDER)) {
            throw new IllegalArgumentException(type);
        }
        this.type = type;
    }
    
}
