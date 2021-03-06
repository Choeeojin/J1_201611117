package com.sd.dao.v1;

public interface PersonDao {
  public List<Person> getAllPersons();
  public Person getPerson(int id);
  public void updatePerson(Person p);
  public void deletePerson();
}