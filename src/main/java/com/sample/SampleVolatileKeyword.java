package com.sample;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class SampleVolatileKeyword {
    private boolean ready = false;
    private int A = 0;
    private ThreadOne threadOne = new ThreadOne();
    private ThreadTwo threadTwo = new ThreadTwo();

    //    @Getter
    class ThreadOne extends Thread {
        @Override
        public void run() {
            A = 41;
            A = 42;
            ready = true;
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            A = 43;
        }
    }

    class ThreadTwo extends Thread {
        @Override
        public void run() {
            while (!ready) ;
            System.out.println(A);
        }
    }

//    public static void main(String[] args) {
//        ThreadOne threadOne = new ThreadOne();
//        ThreadTwo threadTwo = new ThreadTwo();
//
//        threadOne.start();
//        threadTwo.start();
//
//    }
}
