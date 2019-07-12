package com.example.mongo;

import com.example.mongo.entities.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void insert() {
        User user = new User(1, "Jack", new Date(), "123456");
        mongoTemplate.insert(user);
    }

}
