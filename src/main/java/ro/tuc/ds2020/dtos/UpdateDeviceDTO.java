package ro.tuc.ds2020.dtos;

import lombok.*;
import org.springframework.hateoas.RepresentationModel;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePersonDTO extends RepresentationModel<UpdatePersonDTO> {

    private String name;
    private String address;
}
