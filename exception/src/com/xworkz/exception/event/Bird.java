package com.xworkz.exception.event;

import java.nio.file.ClosedFileSystemException;
import java.util.concurrent.BrokenBarrierException;

import com.xworkz.exception.exceptional.BirdException;
import com.xworkz.exception.exceptional.BirdRuntimeException;
 
public class Bird {
	public void parrot() {
	System.out.println("invoking parrot in bird");
		throw new BirdRuntimeException();    		                     //sub class of runtime,unchecked

		                                                                      
	}	
public void crow() throws BrokenBarrierException,BirdException
{
	System.out.println("invoking crow in bird");
   throw new BrokenBarrierException();                                //sub class exception,checked
}
}