package br.com.curso.de.programacao.request;

import jakarta.ws.rs.core.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
import java.math.BigDecimal;

@Restcontroller
public class Salarys {

    private BigDecimal myEmployeeSalary = new BigDecimal("10.00");

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET,
            path = "programmer-salary", produces  = MediaType.APPLICATION_JSON)
    public ResponseEntity<?> getProgrammerSalary() {
        return new ResponseEntity<>(myEmployeeSalary, HttpStatus.OK);
    }
}
