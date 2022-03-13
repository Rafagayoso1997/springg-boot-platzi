package com.gsoft.SpringPlatzi.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImpl implements ComponentDependency{

  @Override
  public void greet() {
    System.out.println("Hola Mundo desde mi componente");
  }
}
