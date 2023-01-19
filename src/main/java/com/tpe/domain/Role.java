package com.tpe.domain;

import com.tpe.domain.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Enumerated(EnumType.STRING)   // 1 2 3   gibi değil yazı  değeri gelecek

    @Column(length = 30, nullable = false)
    private UserRole name;  // 1 2 3  alır

    @Override
    public String toString() {
        return "Role{" +
                "name=" + name +
                '}';
    }
}
