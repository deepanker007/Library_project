package org.library.main.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.library.main.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;

public class DatabaseUtils {
	
	@Autowired
	private DataSource dataSource;

	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Book book) {
		String sql = "INSERT INTO BOOK"+"(ID, NAME, GENRE, AUTHOR, PAGES) VALUES (?, ?, ? ,?)";
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, book.getId());
			ps.setString(2, book.getName());
			ps.setString(3, book.getGenre());
			ps.setString(4, book.getAuthor());
			ps.setInt(5, book.getPages());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
