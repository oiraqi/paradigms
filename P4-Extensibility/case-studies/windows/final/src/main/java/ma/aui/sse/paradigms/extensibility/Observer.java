package ma.aui.sse.paradigms.extensibility;

public interface Observer<T> {
    
    void notify(T notification);
}
