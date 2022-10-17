package AlgorithmsAndDataStructure;

import java.util.Arrays;

// parent = [n/2] decedents = i * 2 , i * 2 + 1
public class MaxHeap implements Heap {

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(4);
        heap.add(2);
        heap.add(5);
        heap.add(4);
        heap.add(3);
        heap.add(6);
        heap.add(18);
        heap.add(23);
        heap.add(-2);
        heap.add(22);
        heap.add(0);
    }

    private int[] array;
    private int max;
    private int first;
    private int last;  // replaced with the variable this.size
    private int size; //size indicates number of elements added to the heap not the real size of the array

    public MaxHeap(int size) {
        this.array = new int[size];
        last = array.length - 1;
        first = 0;
    }

    @Override
    public void add(int node) {
        if (size == array.length) array = Arrays.copyOf(array, size * 2);
        int index = size;
        array[index] = node;
        int parent = (index) / 2; //getParent
        while (array[index] > array[parent]) {
            index = swap(index, parent);
            parent = index / 2;
        }
        max = array[first];
        size++;
        System.out.println(Arrays.toString(array));
        System.out.println(max);
    }

    private int swap(int index, int parent) {
        int temp = array[parent];
        array[parent] = array[index];
        array[index] = temp;
        index = parent;
        return index;
    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    public int get(int node) {
        return 0;
    }

    public int size() {
        return size;
    }

//    private void swap(int parent, int index) {
//        int temp = arr[parent];
//        arr[parent] = arr[index];
//        arr[index] = temp;
//        index = parent;
//
////        int temp2 = parent;
////        parent = node;
////        node = temp2;
//
//
//    }
}
