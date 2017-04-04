package org.library.main.repository;


import org.library.main.entity.Book;
import org.library.main.utils.DatabaseUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryRepository {
	
	public static void main (String []args){
		ApplicationContext context = new ClassPathXmlApplicationContext("webapp/WEB-INF/dispatcher-servlet.xml");
		
		DatabaseUtils utils = (DatabaseUtils) context.getBean("DatabaseUtils");
		Book book = new Book();
		book.setId(1);
		book.setAuthor("Gary Arthur");
		book.setGenre("Science");
		book.setPages(250);
		utils.insert(book);
		
	}
  
}
