package ro.tuc.ds2020.dtos.builders;

import ro.tuc.ds2020.dtos.PersonDTO;
import ro.tuc.ds2020.dtos.PersonDetailsDTO;
import ro.tuc.ds2020.entities.Device;

public class PersonBuilder {

    private PersonBuilder() {
    }

    public static PersonDTO toPersonDTO(Device device) {
        return new PersonDTO(device.getId(), device.getName(), device.getAge());
    }

    public static PersonDetailsDTO toPersonDetailsDTO(Device device) {
        return new PersonDetailsDTO(device.getId(), device.getName(), device.getAddress(), device.getAge());
    }

    public static Device toEntity(PersonDetailsDTO personDetailsDTO) {
        return new Device(personDetailsDTO.getName(),
                personDetailsDTO.getAddress(),
                personDetailsDTO.getAge());
    }
}
