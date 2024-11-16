package mypackage.model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tblqualifications")
public class Qualification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qualification_id;
	private String qualification_name;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "qualification")
 	@JsonIgnoreProperties(value = "qualification")
	private Set<Specialization>specializations;

	public Qualification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Qualification(int qualification_id, String qualification_name, Set<Specialization> specializations) {
		super();
		this.qualification_id = qualification_id;
		this.qualification_name = qualification_name;
		this.specializations = specializations;
	}

	public int getQualification_id() {
		return qualification_id;
	}

	public void setQualification_id(int qualification_id) {
		this.qualification_id = qualification_id;
	}

	public String getQualification_name() {
		return qualification_name;
	}

	public void setQualification_name(String qualification_name) {
		this.qualification_name = qualification_name;
	}

	public Set<Specialization> getSpecializations() {
		return specializations;
	}

	public void setSpecializations(Set<Specialization> specializations) {
		this.specializations = specializations;
	}
	
}
