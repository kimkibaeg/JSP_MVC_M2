package test;

import common.JDBCUtil;
import java.sql.*;

public class DB_Connection_test {
	public static void main(String[] args) {
		
		// DB 연결 테스트
		JDBCUtil.getConnection();
		
		// Oracle : 연결된 conn 객체를 받는다.
		Connection conn = JDBCUtil.getConnection();
	}

}
