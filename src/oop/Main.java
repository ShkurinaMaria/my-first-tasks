package oop;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Илюя", 11);
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Виктор", 77);
        Dancer breakDankDancer = new BreakDankDancer("Михаил", 43);
        dancer.dance();
        electricBoogieDancer.dance();
        breakDankDancer.dance();
        }
    }
