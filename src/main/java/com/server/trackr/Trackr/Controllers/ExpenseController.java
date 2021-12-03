package com.server.trackr.Trackr.Controllers;

import com.server.trackr.Trackr.Entities.Expense;
import com.server.trackr.Trackr.Entities.User;
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

    @PostMapping("/create")
    public ResponseEntity<String> createExpense(@RequestBody Expense expense) {
//        service.saveExpense(expense);
        System.out.println(expense);
        return new ResponseEntity<>("Expense saved", HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteExpense(@RequestBody Expense expense) {
        service.deleteExpense(expense);
        return new ResponseEntity<>("Expense deleted", HttpStatus.OK);
    }
}
