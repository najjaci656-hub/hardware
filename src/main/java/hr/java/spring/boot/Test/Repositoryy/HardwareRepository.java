package hr.java.spring.boot.Test.Repositoryy;

import hr.java.spring.boot.Test.domain.Hardware;

import java.util.List;

public interface HardwareRepository {
    List<Hardware> getAllHardware();
}
