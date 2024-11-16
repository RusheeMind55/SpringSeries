package mypackage.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tblspecializations")
public class Specialization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int specialization_id;
	private String specialization_name;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="qualification_id")
	private Qualification qualification;


	public Specialization() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Specialization(int specialization_id, String specialization_name, Qualification qualification) {
		super();
		this.specialization_id = specialization_id;
		this.specialization_name = specialization_name;
		this.qualification = qualification;
	}


	public int getSpecialization_id() {
		return specialization_id;
	}


	public void setSpecialization_id(int specialization_id) {
		this.specialization_id = specialization_id;
	}


	public String getSpecialization_name() {
		return specialization_name;
	}


	public void setSpecialization_name(String specialization_name) {
		this.specialization_name = specialization_name;
	}


	public Qualification getQualification() {
		return qualification;
	}


	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}
}
