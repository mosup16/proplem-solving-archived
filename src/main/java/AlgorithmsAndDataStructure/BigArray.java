package AlgorithmsAndDataStructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class BigArray <T> {

    public static void main(String[] args) {
        BigArray<Integer> array = new BigArray<>(2);
        array.add(1);
        array.add(5);
        array.add(6);
        array.add(18);
        array.add(34);
        array.add(34);
        array.add(34);
       // array.set(2 ,346);
        System.out.println(array.getSize());
        System.out.println(array);
    }
    private static final int DEFAULT_UNIT_SIZE = 10;
    private int size; //starts from 1
    private int last;
    private int unitSize;
    private List<Object[]> arr;

    public BigArray(){
        this(DEFAULT_UNIT_SIZE);
    }
    public BigArray(int initSize) {
        this.unitSize = initSize;
        size = 0;
        last = 0;
        arr = new LinkedList<>();
        arr.add(new Object[unitSize]);
    }

    public void add(T Value) {
        int fullSize = arr.size() * unitSize;
        if (size == fullSize) {
            grow();
        }
        arr.get(arr.size() -1)[getRealIndex(size)] = Value;
        size++;
    }



    public void set(int index, T newVal) {
        System.out.println("index = " + index);
        getArray(index)[getRealIndex(index)] = newVal;
    }

    public T getAt(int index) {
        int valIndex = getRealIndex(index);
        return getArray(index)[valIndex];
    }
//
//    public T remove(int index) {
//        T deleted = getAt(index);
//        set(index, null);
//        return deleted;
//    }

    public int getSize() {
        return arr.size() * unitSize;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void grow() {
        Object[] objects = new Object[unitSize];
        arr.add(objects);
    }

    private T[] getArray(int index) {
        int arrIndex = index / (unitSize);
        return (T[]) arr.get(arrIndex);
    }

    private int getRealIndex(int index) {
        return index % unitSize;
    }

    @Override
    public String toString() {
        AtomicReference<String> arrays = new AtomicReference<>("");
        arr.forEach(objects -> {
            arrays.set(arrays + Arrays.toString(objects) + " , ");
        });
        return "BigArray{" +
                "size=" + size +
                ", last=" + last +
                ", unitSize=" + unitSize +
                ", arr=" + arrays.get() +
                '}';
    }
}
