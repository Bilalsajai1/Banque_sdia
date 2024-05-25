package ma.enset.Projet_Spring_Angular_JWT.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.Projet_Spring_Angular_JWT.enums.OpType;


import java.util.Date;

@Data

public class OperationDTO {

    private Long id;
    private Date date;
    private double amount;
    private OpType type;
    private String description;
}
