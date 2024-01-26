package com.dekankilic.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Account extends BaseEntity{
    @Id
    private Long accountNumber;
    private String accountType;
    private String branchAddress;


    private Long customerId;
}
