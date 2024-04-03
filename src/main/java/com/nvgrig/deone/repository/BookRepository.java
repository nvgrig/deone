package com.nvgrig.deone.repository;

import com.nvgrig.deone.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
