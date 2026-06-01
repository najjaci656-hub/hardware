package hr.java.spring.boot.Test.repository.impl;

import hr.java.spring.boot.Test.dto.TipHardvera;
import hr.java.spring.boot.Test.repository.HardwareRepository;
import hr.java.spring.boot.Test.domain.Hardware;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HardwareRepositoryImpl implements HardwareRepository {

    private static final List<Hardware> hardverBaza = new ArrayList<>();

    static {

        hardverBaza.add(new Hardware("Intel Core i7-12700K", "1001", 350, 1));
        hardverBaza.add(new Hardware("NVIDIA RTX 4070", "1002", 650, 2));
        hardverBaza.add(new Hardware("Corsair Vengeance 16GB RAM", "1003", 80, 3));
    }

    @Override
    public List<Hardware> getAllHardware () {
        return hardverBaza;
    }


}
