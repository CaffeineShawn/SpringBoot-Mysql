package com.caffeineshawn.thebigiscoming.Repository;

import com.caffeineshawn.thebigiscoming.Entity.Book;
import com.caffeineshawn.thebigiscoming.Entity.User;
import org.springframework.data.repository.CrudRepository;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findUserByUsername(String username);
}
