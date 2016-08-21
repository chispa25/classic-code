package com.seb.MultiThreading.ConsumerProducer.BlockingQueue;

/**
 * Created by curland on 8/21/2016.
 */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerPattern {

    public static void main(String args[]){

        //Creating shared object
        BlockingQueue sharedQueue = new LinkedBlockingQueue();

        //Creating Producer and Consumer Thread
        Thread prodThread = new Thread(new com.seb.MultiThreading.ConsumerProducer.BlockingQueue.Producer(sharedQueue));
        Thread consThread = new Thread(new com.seb.MultiThreading.ConsumerProducer.BlockingQueue.Consumer(sharedQueue));

        //Starting producer and Consumer thread
        prodThread.start();
        consThread.start();
    }

}

