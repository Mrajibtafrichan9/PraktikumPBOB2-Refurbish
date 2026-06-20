

public class DAOManager {
    
    PersonDAO personDAO;

    void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    PersonDAO getPersonDAO(){
        return personDAO;
    }
}
