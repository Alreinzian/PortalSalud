package com.msvcdoctor.doctorservice.entity;





import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctor")

public class Doctor {

    public Integer getId_doctor() {
		return id_doctor;
	}

	public void setId_doctor(Integer id_doctor) {
		this.id_doctor = id_doctor;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_doctor")
    private Integer id_doctor;

    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;

    @Basic(optional = false)
    @Column(name = "apellidos")
    private String apellidos;

    @Basic(optional = false)
    @Column(name = "especialidad")
    private String especialidad;

    @Basic(optional = false)
    @Column(name = "disponibilidad")
    private String disponibilidad;
    
}
