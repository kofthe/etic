package kofthe.etic.core.request.user.seller;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSellerRequest {

    private String userName;
    private String email;
    private String password;
    private String identityNumber;
    private String firstName;
    private String lastName;
    private String birthYear;
    private String companyName;
    private String phone;

}
