package net.tecgurus.sistemabancario_ws.model;
// Generated 10/02/2018 12:00:20 PM by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "cliente", catalog = "sistemabancario_frame")
public class Cliente implements java.io.Serializable {

	private Integer idCliente;
	private Banco banco;
	private String nombre;
	private String apaterno;
	private String amaterno;
	private int edad;
	private Set<Cuenta> cuentas = new HashSet<Cuenta>(0);

	public Cliente() {
	}

	public Cliente(Banco banco, String nombre, String apaterno, String amaterno, int edad) {
		this.banco = banco;
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
		this.edad = edad;
	}

	public Cliente(Banco banco, String nombre, String apaterno, String amaterno, int edad, Set<Cuenta> cuentas) {
		this.banco = banco;
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
		this.edad = edad;
		this.cuentas = cuentas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idCliente", unique = true, nullable = false)
	public Integer getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idBanco", nullable = false)
	public Banco getBanco() {
		return this.banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Column(name = "nombre", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "apaterno", nullable = false, length = 30)
	public String getApaterno() {
		return this.apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	@Column(name = "amaterno", nullable = false, length = 50)
	public String getAmaterno() {
		return this.amaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	@Column(name = "edad", nullable = false)
	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	public Set<Cuenta> getCuentas() {
		return this.cuentas;
	}

	public void setCuentas(Set<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

}