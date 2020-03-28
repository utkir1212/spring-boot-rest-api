package restful.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import restful.dto.PersonDTO;
import restful.mapping.Converter;
import restful.repository.PersonRepository;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public PersonDTO getPerson(Long id) {
        return Converter.personToDTO(personRepository.findById(id).get());
    }
}
