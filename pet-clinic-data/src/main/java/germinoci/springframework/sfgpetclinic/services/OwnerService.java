package germinoci.springframework.sfgpetclinic.services;

import germinoci.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudInterface<Owner, Long> {

    Owner findByLastName(String lastName);

}
