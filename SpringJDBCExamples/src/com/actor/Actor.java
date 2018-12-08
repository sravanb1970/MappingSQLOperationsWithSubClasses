package com.actor;

import java.util.Date;

public class Actor {
private int actorId;
private String firstName;
private String lastName;
private Date date;
public int getActorId() {
	return actorId;
}
public void setActorId(int actorId) {
	this.actorId = actorId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "Actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", date=" + date + "]";
}
public Actor(int actorId, String firstName, String lastName, Date date) {
	super();
	this.actorId = actorId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.date = date;
}
public Actor() {
	super();
}

}
