package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.Expense;

public interface ExpenseService {
    String saveExpense(Expense expense);

    String deleteExpense(Expense expense);

}
