package kofthe.etic.entities.user;


import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "seller_id", referencedColumnName = "user_id")
@Table(name = "sellers")
public class Seller extends User{
    @NotNull
    @Size(min = 11, max = 11)
    private String identityNumber;
    @Size(min = 3, max = 50)
    private String firstName;
    @Size(min = 3, max = 50)
    private String lastName;
    private String birthYear;
    @Size(min = 3, max = 50)
    private String companyName;
    @Pattern(regexp ="[0-9\\s]{12}")
    private String phone;

}
