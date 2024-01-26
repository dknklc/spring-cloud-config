package com.dekankilic.loans.service;

import com.dekankilic.loans.dto.LoanDto;

public interface ILoanService {
    void createLoan(String mobileNumber);
    LoanDto fetchLoan(String mobileNumber);
    boolean updateLoan(LoanDto loanDto);
    boolean deleteLoan(String mobileNumber);
}
