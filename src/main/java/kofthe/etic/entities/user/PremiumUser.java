package kofthe.etic.entities.user;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

/**
 * Premium user için Mernis doğrulaması gereklidir.
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "premiumuser_id", referencedColumnName = "user_id")
public class PremiumUser extends User{

    @NotNull
    private String identityNumber;
    @NotNull
    @Size(min = 3, max = 50)
    private String firstName;
    @NotNull
    @Size(min = 3, max = 50)
    private String lastName;
    @NotNull
    private String birthYear;
    private Enum Gender;
    @Pattern(regexp ="[0-9\\s]{12}")
    @NotNull
    private String phone;


}
