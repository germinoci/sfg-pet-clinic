package germinoci.springframework.sfgpetclinic.services;

import germinoci.springframework.sfgpetclinic.model.Pet;
import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
