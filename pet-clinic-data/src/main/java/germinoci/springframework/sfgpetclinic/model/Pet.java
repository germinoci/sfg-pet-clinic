package germinoci.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private PetType lastName;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getLastName() {
        return lastName;
    }

    public void setLastName(PetType lastName) {
        this.lastName = lastName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
