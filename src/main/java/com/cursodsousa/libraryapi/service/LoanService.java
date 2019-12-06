package com.cursodsousa.libraryapi.service;

import com.cursodsousa.libraryapi.model.entity.Loan;

import java.util.Optional;

public interface LoanService {

    Loan save( Loan loan );

    Optional<Loan> getById(Long id);

    Loan update(Loan loan);
}
