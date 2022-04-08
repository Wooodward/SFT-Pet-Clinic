package guru.springframework.sfgpetclinic.repository;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtiesRepository extends CrudRepository<Speciality, Long> {
}
