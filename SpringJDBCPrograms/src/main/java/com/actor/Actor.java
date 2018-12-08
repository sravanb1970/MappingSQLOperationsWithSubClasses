package com.actor;

import java.util.Date;

public class Actor {
private int actorId;
private String firstName;
private String lastName;
private Date date;
private long number;
private String contactType;
private String location; 

public Actor(String firstName, String lastName, long number, String contactType, String location) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.number = number;
	this.contactType = contactType;
	this.location = location;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public String getContactType() {
	return contactType;
}
public void setContactType(String contactType) {
	this.contactType = contactType;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
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
	return "Actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", date=" + date
			+ ", number=" + number + ", contactType=" + contactType + ", location=" + location + "]";
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
