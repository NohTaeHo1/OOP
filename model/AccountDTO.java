package model;

import java.util.Date;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class AccountDTO {
    private long id;
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private Date transactionDate;


}
