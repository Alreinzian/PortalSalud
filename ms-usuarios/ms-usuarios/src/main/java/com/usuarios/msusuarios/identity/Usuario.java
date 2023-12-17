package com.usuarios.msusuarios.identity;




import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "usuario")

public class Usuario {

    public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoMaterno() {
		return apellido_materno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellido_materno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return apellido_paterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellido_paterno = apellidoPaterno;
	}

	public String getFechaNac() {
		return fecha_nac;
	}

	public void setFechaNac(String fechaNac) {
		this.fecha_nac = fechaNac;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer id_usuario;

    @Basic(optional = false)
    @Column(name = "nombres")
    private String nombres;

    @Basic(optional = false)
    @Column(name = "apellido_materno")
    private String apellido_materno;

    @Basic(optional = false)
    @Column(name = "apellido_paterno")
    private String apellido_paterno;

    @Basic(optional = false)
    @Column(name = "fecha_nac")
    private String fecha_nac;

    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;

    @Basic(optional = false)
    @Column(name = "contrasenia")
    private String contrasenia;

    @Basic(optional = false)
    @Column(name = "dni")
    private String dni;

    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;

    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    
}
