package com.gsoft.SpringPlatzi.bean.reto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Person implements BirthDate{

  private String name;
  private int age;


  @Override
  public LocalDate getBirthDate() {
    return LocalDate.now().minusYears(age);
  }
}
