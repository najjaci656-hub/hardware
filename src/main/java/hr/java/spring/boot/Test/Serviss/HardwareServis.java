package hr.java.spring.boot.Test.Serviss;

import hr.java.spring.boot.Test.HardwareDto.HardwareDto;
import hr.java.spring.boot.Test.domain.Hardware;
import org.springframework.stereotype.Service;

import java.util.List;


public interface HardwareServis {

    List<HardwareDto> getAllHardware();

}
