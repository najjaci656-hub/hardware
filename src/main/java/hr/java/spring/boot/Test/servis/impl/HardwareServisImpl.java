package hr.java.spring.boot.Test.servis.impl;

import hr.java.spring.boot.Test.dto.HardwareDto;
import hr.java.spring.boot.Test.repository.HardwareRepository;
import hr.java.spring.boot.Test.servis.HardwareServis;
import hr.java.spring.boot.Test.domain.Hardware;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class HardwareServisImpl implements HardwareServis {

    private HardwareRepository hardwareRepository;

    @Override
    public List<HardwareDto> getAllHardware() {
        List<Hardware> hardwares = hardwareRepository.getAllHardware();
        return toDto(hardwares);
    }

    private List<HardwareDto> toDto(List<Hardware> hardwares) {
        List<HardwareDto> dtoLista = new ArrayList<>();

        for (Hardware h : hardwares) {
            HardwareDto dto = new HardwareDto(h.getId(), h.getSifra(), h.getCijena(), h.getNaziv(), h.getTip());
            dtoLista.add(dto);
        }

        return dtoLista;
    }
}



