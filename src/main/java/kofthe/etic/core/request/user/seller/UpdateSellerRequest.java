package kofthe.etic.core.request.user.seller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSellerRequest {
    private String firstName;
    private String lastName;
    private String birthYear;
    private String companyName;
    private String phone;
}
