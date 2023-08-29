package com.raksmey.homeworkmicorservices001.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Setter
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_tb")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    private String firstName;
    private String lastName;

    @Column(unique = true, length = 255)
    private String email;

    @Temporal(value = TemporalType.DATE)
    private Date birthDate;

    @Transient
    private String temp;
}
