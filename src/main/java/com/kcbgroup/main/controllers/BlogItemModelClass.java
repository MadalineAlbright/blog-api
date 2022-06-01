package com.kcbgroup.main.controllers;

public class BlogItemModelClass {
	
	//This class contains the properties of the blog item
	
	int id;//for a specific blog
	String title;//the title of the blog
	String content;//the blog content
	
	public BlogItemModelClass() {}
	
	 public BlogItemModelClass(int id, String title, String content) {
	        this.setId(id);
	        this.setTitle(title);
	        this.setContent(content);
	    }
	 
	 //Create getter and setter methods

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getContent() {
	        return content;
	    }

	    public void setContent(String content) {
	        this.content = content;
	    }

	    /*What does this part do??
	    They implemented a toString() method for printing the class content. 
	    A toString() is an in-built method in Java that returns the value given to it in string format???*/
	    
	    @Override
	    public String toString() {
	        return "Blog{" +
	                "id=" + id +
	                ", title='" + title + '\'' +
	                ", content='" + content + '\'' +
	                '}';
	    }
	}
	


