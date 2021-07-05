package com.caffeineshawn.thebigiscoming.Repository;

import com.caffeineshawn.thebigiscoming.Entity.BookUser;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface BookUserRepository extends CrudRepository<BookUser,Long> {
    @Query(value = "SELECT * FROM borrow_book_table bookUser WHERE bookUser.user_id=:userId AND bookUser.book_id=:bookId", nativeQuery = true)
    Optional<BookUser> findByUserIdAndBookId(Long userId, Long bookId);


    List<BookUser> findBookUserByUserId(Long userId);

//    @Query("DELETE FROM borrow_book_table record WHERE record IN (SELECT bookUser FROM borrow_book_table bookUser WHERE bookUser.userId=:userId AND bookUser.bookId=:bookId)")
    @Modifying
    @Transactional
    void deleteByUserIdAndAndBookId(Long userId, Long bookId);
}
