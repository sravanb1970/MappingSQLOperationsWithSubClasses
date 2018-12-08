package com.student.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.student.BO.StudentBO;

public class StudenDAO {

	private static final String QUERY="INSERT INTO STUDENT VALUES(?,?,?)";
	private JdbcTemplate jt;
		public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
		public int[] insert(final List<StudentBO> listbo) {
			int result[]=jt.batchUpdate(QUERY,new BatchInsertion(listbo));
			return result;
		}
		
		private static final class BatchInsertion implements BatchPreparedStatementSetter{
private List<StudentBO> listbo;
			public BatchInsertion(List<StudentBO> listbo) {
this.listbo=listbo;
			}
			public int getBatchSize() {
				System.out.println("this is batch size method");
				return listbo.size();
			}

			public void setValues(PreparedStatement ps, int i) throws SQLException {
System.out.println("This is setter method for setter values");
int index=1;
ps.setInt(1, listbo.get(index).getSno());
ps.setString(2, listbo.get(index).getSname());
ps.setString(3, listbo.get(index).getSaddress());

			}

			
		}
	
}
