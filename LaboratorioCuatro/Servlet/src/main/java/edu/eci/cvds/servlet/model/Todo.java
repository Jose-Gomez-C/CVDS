/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.servlet.model;

public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;
    public Todo() {
    }
	
	public int getUserId() {
		return userId;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public boolean getCompleted() {
		return completed;
	}
	
	public void setUserId(int newUserId) {
		userId = newUserId;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	
	public void setCompleted(boolean newCompleted) {
		completed =  newCompleted;
	}
}
