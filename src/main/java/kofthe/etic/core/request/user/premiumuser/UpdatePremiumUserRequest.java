package kofthe.etic.core.request.user.premiumuser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePremiumUserRequest {


    private String firstName;
    private String lastName;
    private String birthYear;
    private String phone;
    private String email;
    private String password;

}
