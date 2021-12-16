package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.Expense;

import java.util.List;

public interface ExpenseService {
    String saveExpense(Expense expense);

    String deleteExpense(Expense expense);

    String updateExpense(Expense updatedExpense);

    List<Expense> getAllExpenses();
}
