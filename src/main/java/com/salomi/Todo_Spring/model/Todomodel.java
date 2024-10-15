package com.salomi.Todo_Spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "todos")
    public class Todomodel {

        @Id
        private String _id;
        private String title;
        private String description;

//    public Todomodel(String _id, String title, String description) {
//        this._id = _id;
//        this.title = title;
//        this.description = description;
//    }
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    @Override
//    public String toString() {
//        return "Todomodel{" +
//                "_id='" + _id + '\'' +
//                ", title='" + title + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }
}

