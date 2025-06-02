package com.jafarApp2.journalApp.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Document(collection = "journal_entries")
public class JournalEntry {

    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId   id;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date ;


//    public JournalEntry(ObjectId id, @NonNull String title, String content, LocalDateTime date) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//        this.date = date;
//    }
//
//    public JournalEntry() {
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
//    public @NonNull String getTitle() {
//        return title;
//    }
//
//    public void setTitle(@NonNull String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public LocalDateTime getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDateTime date) {
//        this.date = date;
//    }
}


// This is a POJO (plain old java object)
