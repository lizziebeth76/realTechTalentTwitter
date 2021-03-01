package com.tts.TechTalentTwitter.repository;

import com.tts.TechTalentTwitter.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Interfaces only define functionality, you'll never see a method within one
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

}
