package com.weather.weatheer.dao;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.weather.weatheer.model.Person;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
public interface PersonDao {
    int insertPerson(@JsonProperty("id")  UUID id,
                     @JsonProperty("name")  Person person);
    default int insertPerson(Person person){
        UUID id=UUID.randomUUID();
        return insertPerson(id, person);
    }
    List<Person> selectAllpeople();
    Optional<Person>selectPersonbyID(UUID id);
    int deleteperson(UUID id);
}
