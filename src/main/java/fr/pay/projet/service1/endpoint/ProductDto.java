package fr.pay.projet.service1.endpoint;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonRootName;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(Include.NON_NULL)
@JsonRootName(value = "Product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

	
	@Pattern(regexp="^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$", message="id Invalide")
	@Schema(accessMode = Schema.AccessMode.READ_ONLY)
	private String id;

	private String libelle;
	
}
