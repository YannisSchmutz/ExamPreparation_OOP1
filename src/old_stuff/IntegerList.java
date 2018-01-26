package old_stuff;

import java.util.Arrays;

public class IntegerList {
    static final int INITIAL_SIZE = 10;

    private int[] integers;
    private int size;

    public IntegerList() {
        this.integers = new int[INITIAL_SIZE];
        this.size = 0;
    }

    /**
     * Adds an element to the end of  the IntegerList.
     *
     * @param x the new element
     * @return message
     */
    public String add(int x) {
        if (this.size == this.integers.length) {
            this.integers = Arrays.copyOf(this.integers, 2 * this.integers.length);
        }
        this.integers[this.size] = x;
        this.size++;
        return "Element added";
    }

    /**
     * Inserts an element to the given position.
     *
     * @param x        the new element
     * @param position the position to insert the element
     * @return message
     */
    public String insert(int x, int position) {
        if (position < 0 || position > this.size) {
            return "Invalid Position";
        }
        if (this.size == this.integers.length) {
            this.integers = Arrays.copyOf(this.integers, 2 * this.integers.length);
        }
        for (int i = this.size; i > position; i--) {
            this.integers[i] = this.integers[i - 1];
        }
        this.integers[position] = x;
        this.size++;
        return "Element inserted";
    }

    /**
     * Removes an element at the given position.
     *
     * @param position the position to insert the element
     * @return message
     */
    public String remove(int position) {
        if (position < 0 || position > this.size - 1) {
            return "Invalid Position";
        }
        for (int i = position; i < this.size - 1; i++) {
            this.integers[i] = this.integers[i + 1];
        }
        this.size--;
        return "Element removed";
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(this.integers, this.size));
    }

    public boolean contains(int number) {
        for (int n : integers) {
            if (number == n) {
                return true;
            }
        }
        return false;
    }

    public int position(int x){
        if (!contains(x)){
            return -1;
        }

        for (int pos=0; pos < size; pos++){
            if(x == integers[pos]){
                return pos;
            }
        }
        return -1;
    }

    public String swap(int i, int j){
        if ((i < 0 || i > this.size - 1) || (j < 0 || j > size -1)) {
            return "Invalid Position, swapping failed!";
        }

        int item_at_i = integers[i];
        int item_at_j = integers[j];

        integers[i] = item_at_j;
        integers[j] = item_at_i;

        return String.format("Swapped item at position at i (pos: %s, item: %s) with the one at position j (pos: %s, item: %s)",
                i, item_at_i, j, item_at_j);
    }
    public void reverse(){
        System.out.println(size);
        System.out.println((size-1)/2);
        // a b c d e f g h
        // a b c d
        int end_pos = Integer.valueOf(size)-1;
        if(size%2 == 0) {
            for (int pos = 0; pos <= (size - 1) / 2; pos++) {
                swap(pos, end_pos);
                end_pos--;
            }
        }else{
            for (int pos = 0; pos < (size-1)/2; pos++){
                swap(pos, end_pos);
                end_pos--;
            }
        }
    }

    public void sort(){
        boolean swapped = true;
        while (swapped){
            swapped = false;
            for(int pos = 0;pos < size;pos++){
                //System.out.println(String.format("Pos: %s, value: %s", pos, integers[pos]));
                if(pos+1 < size){
                    if(integers[pos] > integers[pos+1]){
                        //System.out.println("SWAP");
                        swap(pos, pos+1);
                        swapped = true;
                    }
                }
                System.out.println(Arrays.toString(integers));
            }
        }
    }
}
