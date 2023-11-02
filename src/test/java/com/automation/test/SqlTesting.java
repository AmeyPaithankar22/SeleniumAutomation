package com.automation.test;

import java.sql.*;

public class SqlTesting {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		boolean status;
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","password");
		System.out.println("Connection Established : " + conn.isValid(10));
		Statement statement = conn.createStatement();
//		String query = "create table Automation(id integer, name varchar(30))";
//		status = statement.execute(query);
//		System.out.println(status);
//		String alter = "alter table Automation modify column name varchar(20)";
//		status = statement.execute(alter);
//		System.out.println(status);
//		String update = "update automation set id=1,name='Bablu' where name = 'Amey'";
//		status = statement.execute(update);
//		System.out.println(status);
//		String insert = "insert into automation values(2, 'Bunty'),(3, 'Chintu'),(4, 'Bittu')";
//		status = statement.execute(insert);
//		System.out.println(status);

//		//Normal Selection
//		String select = "select * from automation order by id desc";
//		ResultSet resultSet = statement.executeQuery(select);
//		while(resultSet.next()) {
//			System.out.print(resultSet.getInt("id")); 
//			System.out.print("\t"+resultSet.getString("name")+"\n"); 
//		}

		//Join
		String select = "select employee.EmpId, employee.FirstName, employee.LastName, employee.Salary, department.DepartmentName from employee right join department on employee.DeptId = department.DeptId";
		ResultSet resultSet = statement.executeQuery(select);
		System.out.println("EmpId\t\tFirst Name\t\tLast Name\t\tSalary\t\tDept Name");
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("employee.EmpId")); 
			System.out.print("\t\t"+resultSet.getString("employee.FirstName"));
			System.out.print("\t\t"+resultSet.getString("employee.LastName"));
			System.out.print("\t\t"+resultSet.getString("employee.Salary"));
			System.out.print("\t\t"+resultSet.getString("department.DepartmentName")+"\n");
		}


	}

}
