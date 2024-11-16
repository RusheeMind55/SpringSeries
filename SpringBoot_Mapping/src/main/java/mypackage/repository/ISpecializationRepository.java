package mypackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mypackage.model.Specialization;

public interface ISpecializationRepository extends JpaRepository<Specialization, Integer> {

}
