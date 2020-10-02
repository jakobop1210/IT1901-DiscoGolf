package todolist.json;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.module.SimpleModule;
import todolist.core.TodoItem;
import todolist.core.TodoList;
import todolist.core.TodoModel;

@SuppressWarnings("serial")
class TodoModule extends SimpleModule {

  private static final String NAME = "TodoModule";

  /**
   * Initializes this TodoModule with appropriate serializers and deserializers.
   */
  public TodoModule() {
    super(NAME, Version.unknownVersion());
    addSerializer(TodoItem.class, new TodoItemSerializer());
    addSerializer(TodoList.class, new TodoListSerializer());
    addSerializer(TodoModel.class, new TodoModelSerializer());
    addDeserializer(TodoItem.class, new TodoItemDeserializer());
    addDeserializer(TodoList.class, new TodoListDeserializer());
    addDeserializer(TodoModel.class, new TodoModelDeserializer());
  }
}