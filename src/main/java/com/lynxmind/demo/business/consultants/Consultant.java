package com.lynxmind.demo.business.consultants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Consultant {

    @Id
    private String id;

    private String firstName;

    private String lastName;

}
