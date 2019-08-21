package stacks_and_queues;

import org.checkerframework.checker.units.qual.A;

public class AnimalShelter extends Queue<Animal> {

    public AnimalShelter() {
        super();
    }

    @Override
    public void enqueue(Animal sadPet) {
        super.enqueue(sadPet);
    }

    @Override
    public Animal dequeue() {
        return super.dequeue();
    }


    public Animal dequeue(String pref) {
        Node<Animal> pre = this.front;
        Node<Animal> cur = this.front;
        Class type;
        if(pref.toUpperCase().equals("DOG")) {
            type = Dog.class;
        }
        else {
            type = Cat.class;
        }

        if(this.front == null) {
            throw new NullPointerException("No Animals in the shelter");
        }

        else {
            while (cur != null && cur.data.getClass() != type) {
                pre = cur;
                cur = cur.next;
            }
            if(cur == null)
                throw new NullPointerException("There are no animals of type");
            pre.next = cur.next;
            return (Animal) cur.data;
        }
    }
}

class Animal{
    String name;

    public Animal (String name) {
        this.name = name;
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
}
