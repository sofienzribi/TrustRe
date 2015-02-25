package al.assu.trust.GestionImageSinistre.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Construction_Type
 * 
 */
@Entity
public class Construction_Type implements Serializable {

	private int id;
	private int load;
	private String category;
	private int IdFactor;
	private static final long serialVersionUID = 1L;

	public Construction_Type() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLoading() {
		return this.load;
	}

	public void setLoading(int loading) {
		this.load = loading;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getIdFactor() {
		return IdFactor;
	}

	public void setIdFactor(int idFactor) {
		IdFactor = idFactor;
	}

}
