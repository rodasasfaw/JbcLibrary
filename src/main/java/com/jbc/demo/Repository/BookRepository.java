package com.jbc.demo.Repository;

import com.jbc.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long>{


}
