package com.caffeineshawn.thebigiscoming.Repository;

import com.caffeineshawn.thebigiscoming.Entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findBookByTitle(String title);
}
