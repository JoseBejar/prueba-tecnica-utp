package com.pruebatecnica.jose.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "tbl_note")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Note{
    @JsonProperty("note")
    private String note;

    private Long iduser;

    @Id
    @GeneratedValue
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
