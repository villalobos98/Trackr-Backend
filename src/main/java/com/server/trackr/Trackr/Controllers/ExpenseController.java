package com.server.trackr.Trackr.Controllers;

import com.server.trackr.Trackr.Entities.Expense;
import com.server.trackr.Trackr.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expense")
@CrossOrigin(origins = "http://localhost:3000")
public class ExpenseController {
    @Autowired
    ExpenseService service;

    // The entire expense object must be passed and the expenseID given in the front-end must match the one stored in DB
    @PostMapping("/create")
    public ResponseEntity<String> createExpense(@RequestBody Expense expense) {
        service.saveExpense(expense);
        return new ResponseEntity<>("Expense saved", HttpStatus.OK);
    }

    // The entire expense object must be passed and the expenseID must match the ID in the database
    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteExpense(@RequestBody Expense expense) {
        service.deleteExpense(expense);
        return new ResponseEntity<>("Expense deleted", HttpStatus.OK);
    }

    //NOT TEST JUST YET
    @PutMapping("/update")
    public ResponseEntity<String> updateExpense(@RequestBody Expense expense) {
    //        service.updateExpense(expense)
        return new ResponseEntity<>("Expense deleted", HttpStatus.OK);
    }

}
