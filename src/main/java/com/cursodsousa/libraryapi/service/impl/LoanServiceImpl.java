package com.cursodsousa.libraryapi.service.impl;

import com.cursodsousa.libraryapi.model.entity.Loan;
import com.cursodsousa.libraryapi.service.LoanService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoanServiceImpl implements LoanService {
    @Override
    public Loan save(Loan loan) {
        return null;
    }

    @Override
    public Optional<Loan> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Loan update(Loan loan) {
        return null;
    }
}
