package com.revature.SpringMVCDemo.Model;

import java.util.Objects;

public class Todo {
private int id;
private String title;

private boolean complete;

    public Todo(int id, String title, boolean complete) {
        super();
        this.id = id;
        this.title = title;
        this.complete = complete;
    }

    public Todo(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return id == todo.id && complete == todo.complete && Objects.equals(title, todo.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, complete);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", complete=" + complete +
                '}';
    }
}
