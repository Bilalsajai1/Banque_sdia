package ma.enset.Projet_Spring_Angular_JWT.dtos;

import lombok.Data;

@Data
public class DebitDTO {
    private String accountId;
    private double amount;
    private String description;
}
