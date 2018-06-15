package pagamento;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagamentoController {

    
    @RequestMapping("/v1/pagamento/info")
    public String hello() {
    	
        return "{\"mensagem\":\"Bem Vindo a API de Pagamentos!\"}";
    }
    
	@PostMapping("/v1/pagamento/")    
    public ResponseEntity<?> efetuaPagamento(@RequestBody Pagamento pagamento) {
		
		if(pagamento!=null) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} 
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		
		
				
    }

}
