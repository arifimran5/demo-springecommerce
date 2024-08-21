package in.thatarif.demoecommerce.entities;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductDTO {
	@Length(min = 3, max = 50)
	@NotBlank()
	private String name;
	private String description;
	private Double price;
	private Integer quantity;
}