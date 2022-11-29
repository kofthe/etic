package kofthe.etic.core.request.user.normaluser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateNormalUserRequest {

    private String firstName;
    private String lastName;
    private String birthYear;
    private String password;

}
