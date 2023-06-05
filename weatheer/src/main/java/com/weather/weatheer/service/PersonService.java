package com.weather.weatheer.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import  com.weather.weatheer.dao.PersonDao;
import com.weather.weatheer.model.Person;
import java.util.UUID;
@Service
public class PersonService {
    private final PersonDao persondao;
    @Autowired
    public PersonService(@Qualifier("fakeDao")PersonDao persondao) {
        this.persondao = persondao;
    }
    public int addPerson(Person person){
        return  persondao.insertPerson(person);
    }
    public List<Person> GetAllPeople(){
        return persondao.selectAllpeople();
    }
    public int deleteperson(UUID id){
        return persondao.deleteperson(id);
    }
    public Optional<Person> getPersonbyID(UUID id) {
        return persondao.selectPersonbyID(id);
}
}