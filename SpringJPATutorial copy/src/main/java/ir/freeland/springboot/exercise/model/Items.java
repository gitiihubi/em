package ir.freeland.springboot.exercise.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ALL_ITEMS")

public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="NAME_ITEM",length=50,nullable=false,unique =false)
	private String name;
	@Column(name = "CATALOG_ITEM",length = 50,nullable = false,unique = false)
	private String catalog;
	@Column(name = "PRICE_ITEM",unique = false,nullable = false)
	private long price;
	
	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getCatalog() {
		return catalog;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public long getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", catalog" + catalog + ", price" + price + "]";
	}
	
	
}
