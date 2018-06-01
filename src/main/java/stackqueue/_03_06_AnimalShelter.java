package stackqueue;

import java.util.LinkedList;

/**
 * An animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" basis.
 * People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
 * or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type).
 * They cannot select which specific animal they would like.
 * <p>
 * Create the data structures to maintain this system and implement operations such as
 * enqueue, dequeueAny, dequeueDog, and dequeueCat.
 * <p>
 * You may use the built-in Linked list data structure.
 */
class _03_06_AnimalShelter {
    private int time = 0;
    private LinkedList<Animal> dogs = new LinkedList<>();
    private LinkedList<Animal> cats = new LinkedList<>();

    void enqueueDog(int num) {
        System.out.println("Enqueing dog" + num + "at time" + time);
        dogs.add(new Animal(num,time++));
    }

    void enqueueCat(int num) {
        System.out.println("Enqueing cat" + num + "at time" + time);
        cats.add(new Animal(num,time++));
    }

    int dequeueAny() {
        System.out.println("dequ any" + dogs.toString() + " cat" + cats.toString());

        if( dogs.isEmpty() && cats.isEmpty()) {
            return -1;
        }
        else if(dogs.isEmpty() && !cats.isEmpty()) {
            return cats.pop().num;
        }
        else if(!dogs.isEmpty() && cats.isEmpty()) {
            return dogs.pop().num;
        } else {
            Animal cat = cats.peek();
            Animal dog = dogs.peek();
            if(cat.counter < dog.counter ){
                return cats.pop().num;
            } else {
                return dogs.pop().num;
            }
        }
    }

    int dequeueDog() {
        System.out.println("dequ dog" + dogs.toString() );

        if( dogs.isEmpty() ) {
            return -1;
        }
        return dogs.pop().num;
    }

    int dequeueCat() {
        System.out.println("dequ cat" + cats.toString());

        if( cats.isEmpty() ) {
            return -1;
        }
        return cats.pop().num;
    }

    static class Animal {
        int num;
        int counter;

        Animal(int num, int counter) {
            this.num = num;
            this.counter = counter;
        }
    }
}
