package br.com.curso.de.programacao.controller;

import br.com.curso.de.programacao.entity.Wages;
import org.springframework.stereotype.Controller;
import java.math.BigDecimal;

@Controller
public class WageGenerator {

    public BigDecimal programmerWage(){
        Wages programmerWage = new Wages();
        programmerWage.setMyProgrammerWage(new BigDecimal("10.00"));
        return programmerWage.getMyProgrammerWage();
    }

    public Wages allWages(){
        return new Wages(new BigDecimal("10.00"), new BigDecimal("20.00"));
    }

}
