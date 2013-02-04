package singleton;

import static org.junit.Assert.*;

import org.junit.Test;

import singleton.Singleton;


public class SingletonTests {

	@Test
	public void test_singleton() {
		
		assertEquals(0, Singleton.getInstanceCount());
		
		Thread a = new Thread(){
			public void run() {
				Singleton.getInstance().getName();
			};
		};
		
		Thread b = new Thread(){
			public void run() {
				Singleton.getInstance().getName();
			};
		};
		
		a.start();
		b.start();
		
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertEquals(1, Singleton.getInstanceCount());
	}

}
