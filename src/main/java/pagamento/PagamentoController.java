package pagamento;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentoController {

	@PostMapping("/v1/pagamento")    
    public ResponseEntity<?> efetuaPagamento(@RequestBody Pagamento pagamento) {
		
		if(pagamento!=null) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} 
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

}
