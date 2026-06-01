package hr.java.spring.boot.Test.Repositoryy.impl;

import hr.java.spring.boot.Test.Repositoryy.HardwareRepository;
import hr.java.spring.boot.Test.domain.Hardware;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HardwareRepositoryImpl implements HardwareRepository {
    @Override
    public List<Hardware> getAllHardware () {
        return List.of();
    }


}
