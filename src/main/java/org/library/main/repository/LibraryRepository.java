package org.library.main.repository;


import org.library.main.entity.Book;
import org.library.main.utils.DatabaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
//@Repository
public class LibraryRepository {
	
	@Autowired
	private DatabaseUtils databaseUtils;
	
	public void saveRecord(Book book){
		databaseUtils.insert(book);
	}

}
