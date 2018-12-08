package com.actor;

import org.springframework.jdbc.core.JdbcTemplate;

public class ActorDAO {

	private JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public int insert(Actor ac) {
		String query="insert into actor values('"+ac.getActorId()+"','"+ac.getFirstName()+"','"+ac.getLastName()+"','"+ac.getDate()+"')";
			return jt.update(query);
	}
	public int update(Actor ac) {
		String query="update actor set first_name='"+ac.getFirstName()+"'where id='"+ac.getActorId()+"'";
	return jt.update(query);
	
	}
	public int delete(Actor ac) {
		String query="delete from actor where actorId = "+ac.getActorId();
return jt.update(query);
	}
	
}
