package edu.ycp.cs320.groupProject.model;

import java.io.*;
import java.net.*;
import java.util.TreeMap;

public class User implements Runnable{
	
	private String name;
	private String password;
 	private boolean admin;
	private TreeMap<String, String> UserList;
 	
	ServerSocket ss;
	
	
	//constructor
	public User(String name, String password, boolean admin)
	{
		this.name = name;
		this.password= password;
		this.admin = admin;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public boolean getAdmin()
	{
		return admin;
	}
	
	public void setName(String name)
	{
		this.name= name;
		
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setAdmin(boolean admin)
	{
		this.admin = admin;
	}
	

	
	//should it be return type Chatroom?
	public void createChatroom()
	{
		
	}
	
	//Contact database
	public void deleteAccount()
	{
		
	}
	
	public String CreateAccount()
	{
		return UserList.put(name, password);
	}
	
	
	
	

	@Override
	public void run() {
		throw new UnsupportedOperationException("TODO - implement");
		/*
		String name = Thread.currentThread().getName();
		
		while (true)
		{
			
			try{
				
				System.out.println("Client" + name + "ready to accept;");
				Socket s = ss.accept();
				System.out.println("Client accepted connection");
				
				BufferedReader readKb = new BufferedReader(new InputStreamReader(System.in));
				PrintStream writeC = new PrintStream(s.getOutputStream(), true);
				BufferedReader readC = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				
				
				
			}	
			
		}
		*/
		
		
		
	}
	
	
	

}
