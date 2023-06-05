package com.weather.weatheer.dao;
import com.weather.weatheer.model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;
@Repository("fakeDao")
public class FakePerson implements PersonDao{
    private static List <Person> DB= new ArrayList<>();
    @Override
    public int insertPerson(UUID id,Person person){
        DB.add(new Person(id, person.getname()));
        return 1;
    }
    public List<Person> selectAllpeople(){
        return DB;
    }
    @Override
    public int deleteperson(UUID id){
        Optional<Person> person =selectPersonbyID(id);
        if(person.isEmpty()){
            return 0;
        }
        DB.remove(person.get());
        return 1;
    }
    @Override
    public Optional<Person> selectPersonbyID(UUID id) {
        return DB.stream()
        .filter(person -> person.getid().equals(id))
        .findFirst();
    } 
}
