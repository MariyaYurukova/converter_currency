package com.currency.converter.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "converters")
public class Converter extends BaseEntity{

    @Column(name = "value", nullable = false)
    private double value;

    @Column(name = "left_operand", nullable = false)
    private String leftOperand;

    @Column(name = "right_operand", nullable = false)
    private String  rightOperand;

    public Converter() {
    }

    public Converter(double value, String leftOperand, String rightOperand) {
        this.value = value;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(String leftOperand) {
        this.leftOperand = leftOperand;
    }

    public String getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(String rightOperand) {
        this.rightOperand = rightOperand;
    }


    public double calculateResult () {
        double result = 0;
        double result1 = 0;
        double result2 = 0;
        if ("BGN".equals(this.leftOperand) ) {
            result1 = 1 ;
        } else if ("USD".equals(this.leftOperand)) {
            result1 = 1.79;
        } else if ("EUR".equals(this.leftOperand)) {
            result1 = 1.95;
        } else if ("GBP".equals(this.leftOperand)) {
            result1 = 2.53;
        }
        if ("BGN".equals(this.rightOperand)) {
            result2 = 1;
        } else if ("USD".equals(this.rightOperand)) {
            result2= 1.79;
        } else if ("EUR".equals(this.rightOperand)) {
            result2 = 1.95;
        } else if ("GBP".equals(this.rightOperand)) {
            result2 = 2.53;
        }


        result = result1 / result2;
        return result;
    }

}

