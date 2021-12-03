package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.Expense;
import com.server.trackr.Trackr.Repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public String saveExpense(Expense expense) {
        expenseRepository.save(expense);
        return "Expense saved";
    }

    @Override
    public String deleteExpense(Expense expense) {
        expenseRepository.delete(expense);
        return "Expense deleted";
    }
}
