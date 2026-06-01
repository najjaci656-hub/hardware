package hr.java.spring.boot.Test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HardwareDto {

    private Long id;
    private int sifra;
    private int cijena;
    private String naziv;
    private TipHardvera tip;

    public HardwareDto(long id, int sifra, int cijena, String naziv, String tip) {
    }
}
