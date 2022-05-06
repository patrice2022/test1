package fr.pay.projet.service1.endpoint;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/products")
public class ProductEndPoint  {

	
	public ProductEndPoint() {
	}

		
	@Operation(summary = "Search for a product by its identifier")
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "The product is found", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = ProductDto.class))})//,
//			@ApiResponse(responseCode = "404", description = "The product is not found", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))})
	})
	@GetMapping("/{id}")
	public ResponseEntity<ProductDto> read(
			@Parameter(description = "Product ID") @PathVariable String id,
			HttpServletRequest request
			) {
		
		
		ProductDto productDto =  new ProductDto(id, "le produit");
		
		return ResponseEntity.ok(productDto);
	}
	
	
}
