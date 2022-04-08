package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repository.SpecialtiesRepository;
import guru.springframework.sfgpetclinic.services.SpecialtiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSpecialtiesSDJpaService implements SpecialtiesService {

    private final SpecialtiesRepository specialtiesRepository;

    public VetSpecialtiesSDJpaService(SpecialtiesRepository specialtiesRepository) {
        this.specialtiesRepository = specialtiesRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialtiesRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long id) {
        return specialtiesRepository.findById(id).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialtiesRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialtiesRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        specialtiesRepository.deleteById(id);
    }
}
