package org.library.main.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.library.main.entity.Book;

public class DatabaseUtils {
	
	private DataSource dataSource;

	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insert(Book book) {
		String sql = "INSERT INTO BOOK"+"(ID, GENRE, AUTHOR, PAGES) VALUES (?, ? ,?)";
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, book.getId());
			ps.setString(2, book.getGenre());
			ps.setString(3, book.getAuthor());
			ps.setInt(4, book.getPages());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
