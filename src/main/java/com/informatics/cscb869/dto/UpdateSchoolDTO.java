package com.informatics.cscb869.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UpdateSchoolDTO {
    private String name;
    private int maxNumberOfStudents;
    private LocalDate foundationDate;
}
