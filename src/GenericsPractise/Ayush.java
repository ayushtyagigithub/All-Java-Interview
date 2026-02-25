package GenericsPractise;

public class Ayush<T> implements Test<T> {

    public T data;
    public void  getData(T data) {
        this.data=data;
    }


    @Override
    public T display() {
        return data;
    }
}
