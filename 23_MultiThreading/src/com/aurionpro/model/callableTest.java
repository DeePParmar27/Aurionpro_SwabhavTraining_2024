package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class callableTest {
	public static void main(String[] args) throws ExecutionException {
		
		ExecutorService service = Executors.newCachedThreadPool();
//		Future<Integer> future = service.submit(new callabel());
		
		List<callabel> list = new ArrayList<callabel>();
		list.add(new callabel());
		list.add(new callabel());
		list.add(new callabel());
		list.add(new callabel());
		
		
		try {
			List<Future<Integer>> future = service.invokeAll(list);
		for(Future<Integer> futures : future ) {
			System.out.println(futures.get());
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
