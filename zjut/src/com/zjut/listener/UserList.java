package com.zjut.listener;

import java.util.Vector;
import java.util.Enumeration;

public class UserList
{
    private static final UserList userList=new UserList();
    private Vector<String> v;
    
	private UserList()
	{
	    v=new Vector<String>();
	}

	public static UserList getInstance()
	{
		return userList;
	}
    
    public void addUser(String id)
    {
        if(id!=null)
            v.addElement(id);
    }
    
    public void removeUser(String id)
    {
        if(id!=null)
            v.remove(id);
    }
    
    public Enumeration<String> getUserList()
    {
        return v.elements();
    }
    
    public int getUserCount()
    {
        return v.size();
    }
}
