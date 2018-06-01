package stackqueue;

import java.util.Arrays;

/**
 * Describe how you could use a single array to implement three stacks
 */
class _03_01_ThreeInOne {
    private int[] stacks;
    private int[] pointers;
    private int capacity;

    _03_01_ThreeInOne(int initSize) {
        stacks = new int[initSize*3];
        pointers = new int[]{-1, -1, -1};
        capacity = initSize;
        System.out.println(" initSize" + initSize);

    }

    void push(int stackNum, int val) {
        System.out.println(" Push " + stackNum + " val" + val);
        if(stackNum < 0 || stackNum > 3) throw new IllegalArgumentException("stacknum is invalid");
        pointers[stackNum] += 1;
        if(pointers[stackNum] == capacity) throw new IllegalArgumentException("Stack " + stackNum + "is full");
        int index = getHead(stackNum);
        stacks[index] = val;
        System.out.println(Arrays.toString(stacks) + " p" + Arrays.toString(pointers));
//        throw new UnsupportedOperationException();
    }
    private int getHead( int stackNum){
        return (int) capacity*stackNum + pointers[stackNum];
    }

    int pop(int stackNum) {
        int index = getHead(stackNum);
        int val = stacks[index];
        pointers[stackNum] -= 1;
        return val;
    }


}
