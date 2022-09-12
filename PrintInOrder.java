package com.example.practice.leetcode.printInOrder;

public class PrintInOrder {

    class Foo {

        public Foo() {

        }

        private int flag = 0;

        public void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() outputs "first". Do not change or remove this line.
            if(flag != 0) return;
            printFirst.run();
            flag++;
        }

        public void second(Runnable printSecond) throws InterruptedException {
            // printSecond.run() outputs "second". Do not change or remove this line.
            while (flag != 1) Thread.sleep(5);
            printSecond.run();
            flag++;
        }

        public void third(Runnable printThird) throws InterruptedException {
            // printThird.run() outputs "third". Do not change or remove this line.
            while(flag != 2) Thread.sleep(5);
            printThird.run();
            flag++;
        }
    }
}
