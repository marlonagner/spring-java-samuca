package br.com.curso.de.programacao.entity;

import java.math.BigDecimal;

// @Entity
//@Table (schema = "", name  = "TB_WAGES")
public class Wages {
    private BigDecimal myProgrammerWage = BigDecimal.ZERO;
    private BigDecimal myStreamerWage = BigDecimal.ZERO;


    public Wages(){}

    public Wages(BigDecimal myProgrammerWage) {
        this.myProgrammerWage = myProgrammerWage;
    }

    public Wages(BigDecimal myStreamerWage, BigDecimal myProgrammerWage) {
        this.myStreamerWage = myStreamerWage;
        this.myProgrammerWage = myProgrammerWage;
    }



    public BigDecimal getMyProgrammerWage() {
        return myProgrammerWage;
    }

    public void setMyProgrammerWage(BigDecimal myProgrammerWage) {
        this.myProgrammerWage = myProgrammerWage;
    }

    public BigDecimal getMyStreamerWage() {
        return myStreamerWage;
    }

    public void setMyStreamerWage(BigDecimal myStreamerWage) {
        this.myStreamerWage = myStreamerWage;
    }

    @Override
    public String toString() {
        return "Wages{" +
                "myProgrammerWage=" + myProgrammerWage +
                ", myStreamerWage=" + myStreamerWage +
                '}';
    }
}


