package hr.java.spring.boot.Test.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hardware {

    private String naziv;
    private int sifra;
    private int cijena;
    private String tip;
    private long id;

    public Hardware(String naziv, String number, int cijena, int i) {
    }

}
