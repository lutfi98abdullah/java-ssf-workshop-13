package sg.edu.nus.iss.demo.model;

import com.fasterxml.jackson.core.sym.Name;

public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private Character gender;

    public void setId(Integer _id){
        this.id = _id;
    }
    
    public void getId(Integer _id){
        return this.id;
    }

    public String setFirstName(String name){
        this.firstName = name;
    }
    
    public void getFirstName(Integer name){
        return this.name;
    }

    public String setLastName(String name){
        this.lastName = name;
    }
    
    public void getLastName(Integer name){
        return this.name;
    }
}
