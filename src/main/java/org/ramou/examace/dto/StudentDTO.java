package org.ramou.examace.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class StudentDTO {
    private String name;
    private String email;
    private String dateNaissance;
}
