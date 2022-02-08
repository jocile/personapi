package one.digitalinnovation.personapi.dto.request;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Data
public class PersonDTO {
  private Long id;

  @NotEmpty
  @Size(min = 2, max = 100)
  private String firstName;

  @NotEmpty
  @Size(min = 2, max = 100)
  private String lastName;

  @NotEmpty
  @CPF
  private String cpf;

  private String birthDate;

  @Valid
  @NotEmpty
  private List<PhoneDTO> phones;
}
