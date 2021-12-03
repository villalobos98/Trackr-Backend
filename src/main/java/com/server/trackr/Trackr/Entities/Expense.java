package com.server.trackr.Trackr.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "EXPENSES")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer expenseID;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "EXPENSE_AMOUNT")
    private Integer amount;

    @Column(name = "TRACKED_ITEM_DATE")
    private String date;
}
