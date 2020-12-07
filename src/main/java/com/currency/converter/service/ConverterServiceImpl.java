package com.currency.converter.service;

import com.currency.converter.domain.entities.Converter;
import com.currency.converter.repository.ConverterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConverterServiceImpl implements ConverterService {


    @Autowired
    private ConverterRepository converterRepository;


    @Override
    public void saveExchange(Converter converter) {
        Converter currencyExchanges = new Converter();
        currencyExchanges.setLeftOperand(converter.getLeftOperand());
        currencyExchanges.setRightOperand(converter.getRightOperand());
        currencyExchanges.setValue(converter.getValue());
        converterRepository.save(converter);
    }




//    @Override
//    public ConverterModel getConverterModel() {
//        ConverterModel cm = new ConverterModel();
//        return cm;
//    }
//
//    @Override
//    public void  getConvertedValue(double value, String leftOperand, String rightOperand) {
//        Converter converter = new Converter(value,leftOperand, rightOperand);
//        double result = converter.calculateResult();
//
//    }


}
