package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name="job_seekers")
@NoArgsConstructor
@AllArgsConstructor
public class Candidates extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int userID;

    @Column(name = "name")
    private String userName;

    @Column(name = "surname")
    private String userLastName;

    @Column(name = "national_id")
    private String nationalID;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "mernis_verification")
    private boolean mernisVerification;
}
