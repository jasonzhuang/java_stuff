package com.zjut.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineListener implements HttpSessionListener{
	
	protected static int count = 0;
	
	public void sessionCreated(HttpSessionEvent event) {
		count++;
	}

	
	public void sessionDestroyed(HttpSessionEvent event) {
		if(count > 0)
			count--;
	}
	
	
	public static int getCount(){
		return count;
	}
}