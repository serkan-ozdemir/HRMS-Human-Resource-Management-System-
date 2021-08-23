package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="employers")
@NoArgsConstructor
@AllArgsConstructor
public class Employer extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employers_id")
    private int employersID;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_site_name")
    private String webSiteName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "system_verification")
    private boolean verification;

}
