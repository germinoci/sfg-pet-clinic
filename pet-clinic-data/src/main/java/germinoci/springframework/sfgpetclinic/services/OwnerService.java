package germinoci.springframework.sfgpetclinic.services;

import germinoci.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
