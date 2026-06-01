package hr.java.spring.boot.Test.HardwareDto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HardwareDto {

    private String tip;
    private int cijena;
    private String naziv;
}
