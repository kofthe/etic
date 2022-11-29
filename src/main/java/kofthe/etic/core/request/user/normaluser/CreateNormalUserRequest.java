package kofthe.etic.core.request.user.normaluser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateNormalUserRequest {

    private String firstName;
    private String lastName;
    private String birthYear;
    private Enum Gender;
    private String userName;
    private String email;
    private String password;


}
