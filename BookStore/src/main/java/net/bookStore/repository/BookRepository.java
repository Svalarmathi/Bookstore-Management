package net.bookStore.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.bookStore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
