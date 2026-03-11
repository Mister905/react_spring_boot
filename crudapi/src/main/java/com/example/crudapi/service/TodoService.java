package com.example.crudapi.service;

import com.example.crudapi.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final List<Todo> todos = new ArrayList<>();
    private Long nextId = 1L;

    public List<Todo> getAll() {
        return todos;
    }

    public Todo create(Todo todo) {
        todo.setId(nextId++);
        todos.add(todo);
        return todo;
    }

    public Optional<Todo> getById(Long id) {
        return todos.stream().filter(t -> t.getId().equals(id)).findFirst();
    }

    public Todo update(Long id, Todo updated) {
        Todo todo = getById(id).orElseThrow();
        todo.setTitle(updated.getTitle());
        todo.setCompleted(updated.isCompleted());
        return todo;
    }

    public void delete(Long id) {
        todos.removeIf(t -> t.getId().equals(id));
    }
}
