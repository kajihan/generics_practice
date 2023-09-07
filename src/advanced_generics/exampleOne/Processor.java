package advanced_generics.exampleOne;

public abstract class Processor<T, V> {

    private final String id;
    private final T data;

    public Processor(String id, T data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public T getData() {
        return data;
    }

    public abstract V process();
}
