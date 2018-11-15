package com.example.users.userportal.repository;


import com.example.users.userportal.domain.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * ....
 * { see @sdfsfsd}
 */
@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

  /**
   * ...
   */

  Optional<BookEntity> findByName(String name);

  /**
   *
   * @param name
   * @return
   */
  //@Query("SELECT b FROM BookEntity b WHERE b.name <> :name")
   // List<BookEntity> searchSomething(@Param("name") String name);
}
