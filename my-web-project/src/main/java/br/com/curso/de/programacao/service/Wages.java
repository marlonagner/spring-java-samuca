package br.com.curso.de.programacao.service;

import br.com.curso.de.programacao.controller.WageGenerator;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;

@RestController
public class Wages {

     @Autowired
   private WageGenerator wageGenerate;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "my-wage", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> getProgammerWage() {
        return new ResponseEntity<>(wageGenerate.programmerWage(), HttpStatus.OK);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "all-wages", produces = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> getAllWages() {
        return new ResponseEntity<>(wageGenerate.allWages(), HttpStatus.OK);
    }
}
