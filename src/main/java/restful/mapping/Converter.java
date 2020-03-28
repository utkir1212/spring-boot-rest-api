package restful.mapping;

import restful.domain.Person;
import restful.dto.PersonDTO;

public class Converter {
    public static PersonDTO personToDTO(Person person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(person.getId());
        personDTO.setName(person.getName());
        return personDTO;
    }
}
