package com.stud.publisher;

public class MyTopicSubscriber implements Observer {
	private String name;
	private Subject topic;
	
	public MyTopicSubscriber(String name) {
		this.name = name;
	}
	
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null) {
			System.out.println(name + " no new message");
		}
		else {
			System.out.println(name + " consuming message: " + msg);
		}
	}
	
	public void setSubject(Subject subj) {
		this.topic = subj;
	}
}
