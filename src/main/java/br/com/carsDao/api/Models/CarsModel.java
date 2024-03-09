package br.com.carsDao.api.Models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.*;
import java.time.Year;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table (name = "CARS_TB")
public class CarsModel{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CAR_ID")
    private UUID id;

    @Column (name = "CAR_NAME")
    @NotBlank (message = "You have to inform the name of the car")
    @NotNull (message = "The car name can't be Null")
    private String carName;


    @Column(name = "CAR_YEAR")
    @NotBlank (message = "You have to inform the year of the car")
    @NotNull (message = "The car year can't be Null")
    private Year carYear;

}
