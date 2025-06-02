package com.jafarApp2.journalApp.entity;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
    @Indexed(unique = true)
    @NonNull
    private String userName;
    @NonNull
    private String password;
    @DBRef
    private List<JournalEntry> journalEntries=new ArrayList<>();

    private List<String > roles;


//    public User() {
//    }
//
//    public User(ObjectId id, @NonNull String userName, @NonNull String password, List<JournalEntry> journalEntries, List<String> roles) {
//        this.id = id;
//        this.userName = userName;
//        this.password = password;
//        this.journalEntries = journalEntries;
//        this.roles = roles;
//    }
//
//    public ObjectId getId() {
//        return id;
//    }
//
//    public void setId(ObjectId id) {
//        this.id = id;
//    }
//
//    public @NonNull String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(@NonNull String userName) {
//        this.userName = userName;
//    }
//
//    public @NonNull String getPassword() {
//        return password;
//    }
//
//    public void setPassword(@NonNull String password) {
//        this.password = password;
//    }
//
//    public List<JournalEntry> getJournalEntries() {
//        return journalEntries;
//    }
//
//    public void setJournalEntries(List<JournalEntry> journalEntries) {
//        this.journalEntries = journalEntries;
//    }
//
//    public List<String> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<String> roles) {
//        this.roles = roles;
//    }
}
