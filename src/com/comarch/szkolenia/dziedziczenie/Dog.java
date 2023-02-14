package com.comarch.szkolenia.dziedziczenie;

public class Dog extends Pet {
    private double tailLength;

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) obj;
        if(this.getName().equals(dog.getName())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getRace();
    }
}
