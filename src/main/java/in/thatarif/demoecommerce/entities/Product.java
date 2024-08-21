package in.thatarif.demoecommerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {
	@Id
	@SequenceGenerator(name = "product_id_seq", sequenceName = "product_id_seq", allocationSize = 1)
	@GeneratedValue(generator = "product_id_seq", strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String description;
	private Double price;
	private Integer quantity;
}
