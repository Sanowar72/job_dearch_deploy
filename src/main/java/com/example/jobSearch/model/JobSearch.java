package com.example.jobSearch.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job")
public class JobSearch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;
    private String jobTitle;
    private String jobDesc;
    private String jobLocation;
    @Min(value = 20000, message = "Minimum salary should be 20,000")
    private Double jobSalary;
    @Email(message = "Invalid email format")
    @NotNull(message = "Company email is required")
    private String companyEmail;
    @NotBlank
    private String companyName;
    private String employerName;
    @Enumerated(EnumType.STRING)
    private Type jobType;

}
