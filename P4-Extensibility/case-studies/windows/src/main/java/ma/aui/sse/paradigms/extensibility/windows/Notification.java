package ma.aui.sse.paradigms.extensibility.windows;

public class Notification {

    private Node node;
    private String operation;
    public static final String CREATE = "created";
    public static final String DELETE = "deleted";

    public Notification(Node node, String operation) {
        if (!operation.equals(CREATE) && !operation.equals(DELETE)) {
            throw new IllegalArgumentException(operation);
        }
        this.node = node;
        this.operation = operation;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        if (!operation.equals(CREATE) && !operation.equals(DELETE)) {
            throw new IllegalArgumentException(operation);
        }
        this.operation = operation;
    }

}
