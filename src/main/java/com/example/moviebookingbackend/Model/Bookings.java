package com.example.moviebookingbackend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Table
@Data
@Entity
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Bookingid;
    private int totalNoTicket ;
    private int totalCost ;

    @ManyToOne
    @JoinColumn(name = "movieid" , referencedColumnName = "movieid")
    private Movies movies ;

    @ManyToOne
    @JoinColumn(name = "customerid" , referencedColumnName = "customerid")
    private Customer customer;
}
