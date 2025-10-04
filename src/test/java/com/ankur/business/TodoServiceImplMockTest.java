package com.ankur.business;

import com.ankur.data.api.TodoService;
import com.ankur.data.api.TodoServiceStub;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import  static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TodoServiceImplMockTest {

    @Test
   public void testRetrieveTodosRelatedToSpring_usingAMock() {

       // TodoService mockoTodoService = mock(TodoService.class);
       // stub(mockoTodoService.retrieveTodos("Parameter")).return("value");

        TodoService todoServiceMock = mock(TodoService.class);

          List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");

         when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

        TodoBusinessImpl todoBusinessImpl =  new TodoBusinessImpl(todoServiceMock);

       List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(2,filteredTodos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_withEmptyList() {
        TodoService todoServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList();
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
        TodoBusinessImpl todoBusinessImpl =  new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(0,filteredTodos.size());
    }

}