package com.ankur.business;

import com.ankur.data.api.TodoService;
import com.ankur.data.api.TodoServiceStub;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TodoServiceImplStubTest {

    @Test
    void testRetrieveTodosRelatedToSpring_usingAStub() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl =  new TodoBusinessImpl(todoServiceStub);

       List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(2,filteredTodos.size());
        // Assert the contents
//        assertTrue(filteredTodos.contains("Learn Spring MVC"), "Missing 'Learn Spring MVC'");
//        assertTrue(filteredTodos.contains("Learn Spring Boot"), "Missing 'Learn Spring Boot'");
//
//        // Optional: assert exact order if relevant
//        assertIterableEquals(
//                List.of("Learn Spring MVC", "Learn Spring Boot"),
//                filteredTodos,
//                "Todos do not match expected Spring-related items"
//        );

    }
    @Test
    void testRetrieveTodosRelatedToSpring_usingAStubNull() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(2, filteredTodos.size());
    }
}