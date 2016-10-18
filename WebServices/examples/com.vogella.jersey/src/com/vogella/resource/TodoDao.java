package com.vogella.resource;

import java.util.HashMap;
import java.util.Map;

import com.vogella.model.Todo;

public enum TodoDao {
  instance;
  
  private Map<String, Todo> contentProvider = new HashMap<>();
  
  private TodoDao() {
    contentProvider.put("1", new Todo("1", "Learn REST", "Read http://www.vogella.com/tutorials/REST/article.html"));
    contentProvider.put("2", new Todo("2", "Do something", "Read complete http://www.vogella.com"));
  }
  
  public Map<String, Todo> getModel(){
    return contentProvider;
  }
  
}