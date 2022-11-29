package kofthe.etic.core.request.user.premiumuser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePremiumUserRequest {

    private String identityNumber;
    private String firstName;
    private String lastName;
    private String birthYear;
    private Enum Gender;
    private String phone;
    private String userName;
    private String email;
    private String password;

}
