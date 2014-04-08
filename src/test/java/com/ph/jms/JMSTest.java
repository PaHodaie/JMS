package com.ph.jms;

import com.ph.jms.JMSConsumer;
import com.ph.jms.JMSServer;
/**
 * this class test communication between a jms-producer and consumer.
 * 
 * @author Parviz
 *
 */
public class JMSTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 thread(new JMSServer());
		 thread(new JMSConsumer());

	}
	public static void thread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
