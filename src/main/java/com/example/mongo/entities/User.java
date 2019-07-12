package com.example.mongo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

/**
 * @author linyongjin
 * @date 2019/7/12 14:19
 */
@Document(collection = "user")
public class User {

    @Id
    private Object id;

    @Indexed
    private String name;

    @Field
    private Date birthday;

    @Field
    private String password;

    @PersistenceConstructor
    public User(Object id, String name, Date birthday, String password) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.password = password;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
