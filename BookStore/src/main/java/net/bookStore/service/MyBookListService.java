package net.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.bookStore.entity.MyBookList;
import net.bookStore.repository.MyBookRepository;

@Service
public class MyBookListService {
	@Autowired
	private MyBookRepository mybook;
	public void saveMyBooks(MyBookList book) {
		mybook.save(book);

}
	public List<MyBookList> getAllMyBooks(){
		return mybook.findAll()	;
}
	public void deleteById(int id) {
		mybook.deleteById(id);
	}
}