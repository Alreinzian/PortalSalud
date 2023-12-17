package com.msvccita.citaservice.entity;






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






@Entity
@Table(name = "cita")

public class Cita {

    

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cita")
    private Integer id_cita;

    @Basic(optional = false)
    @Column(name = "id_paciente")
    private String id_paciente;

    @Basic(optional = false)
    @Column(name = "id_doctor")
    private String id_doctor;

    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;

    
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    
    @Basic(optional = false)
    @Column(name = "hora")
    private String hora;
    
    public Integer getId_cita() {
		return id_cita;
	}

	public void setId_cita(Integer id_cita) {
		this.id_cita = id_cita;
	}

	public String getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(String id_paciente) {
		this.id_paciente = id_paciente;
	}

	public String getId_doctor() {
		return id_doctor;
	}

	public void setId_doctor(String id_doctor) {
		this.id_doctor = id_doctor;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getId_especialidad() {
		return id_especialidad;
	}

	public void setId_especialidad(String id_especialidad) {
		this.id_especialidad = id_especialidad;
	}

	@Basic(optional = false)
    @Column(name = "id_especialidad")
    private String id_especialidad;
    
    
    
    
    
}
