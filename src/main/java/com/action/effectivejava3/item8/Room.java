package com.action.effectivejava3.item8;
//import java.lang.ref.Cleaner;

//import java.lang.ref.Cleaner;
// 这个1.9jdk
// An autocloseable class using a cleaner as a safety net (Page 32)
//public class Room implements AutoCloseable {
//    @Override
//    public void close() throws Exception {
//
//    }
////    private static final Cleaner cleaner = Cleaner.create();
////
////    // Resource that requires cleaning. Must not refer to Room!
////    private static class State implements Runnable {
////        int numJunkPiles; // Number of junk piles in this room
////
////        State(int numJunkPiles) {
////            this.numJunkPiles = numJunkPiles;
////        }
////
////        // Invoked by close method or cleaner
////        @Override public void run() {
////            System.out.println("Cleaning room");
////            numJunkPiles = 0;
////        }
////    }
////
////    // The state of this room, shared with our cleanable
////    private final State state;
////
////    // Our cleanable. Cleans the room when it’s eligible for gc
////    private final Cleaner.Cleanable cleanable;
////
////    public Room(int numJunkPiles) {
////        state = new State(numJunkPiles);
////        cleanable = cleaner.register(this, state);
////    }
////
////    @Override public void close() {
////        cleanable.clean();
////    }
//}


import sun.misc.Cleaner;

public class Room implements AutoCloseable {
    private static Cleaner cleaner;

    // Resource that requires cleaning. Must not refer to Room!
    private static class State implements Runnable {
        int numJunkPiles; // Number of junk piles in this room

        State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        // Invoked by close method or cleaner
        @Override
        public void run() {
            System.out.println("Cleaning room");
            numJunkPiles = 0;
        }
    }

    private Room() {

    }

    // The state of this room, shared with our cleanable
    private State state;

    public Room(int numJunkPiles) {
        state = new State(numJunkPiles);
        cleaner = Cleaner.create(this, state);
    }

    @Override
    public void close() {
        cleaner.clean();
    }

    public static void main(String[] args) {
//        try (Room myRoom = new Room(7)) {
//            System.out.println("Goodbye");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        new Room(99);
        System.out.println("Peace out");
    }
}