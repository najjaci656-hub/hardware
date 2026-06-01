package hr.java.spring.boot.Test.Controller;

import hr.java.spring.boot.Test.HardwareDto.HardwareDto;
import hr.java.spring.boot.Test.Serviss.HardwareServis;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class Controller {

    private HardwareServis hardwareServis;

    @GetMapping
    public List<HardwareDto> getAllHardware () {
        return hardwareServis.getAllHardware();
    }

}
