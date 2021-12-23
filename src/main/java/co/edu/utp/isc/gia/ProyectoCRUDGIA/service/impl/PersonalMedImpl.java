package co.edu.utp.isc.gia.ProyectoCRUDGIA.service.impl;


import co.edu.utp.isc.gia.ProyectoCRUDGIA.repository.PersonalMedRepository;
import co.edu.utp.isc.gia.ProyectoCRUDGIA.service.PersonalMedService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalMedImpl implements PersonalMedService {

    @Autowired
    private PersonalMedRepository personalMedRepository;

    @Autowired
    private ModelMapper modelMapper;
}
