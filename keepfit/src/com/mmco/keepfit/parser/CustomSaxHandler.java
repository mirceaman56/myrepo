package com.mmco.keepfit.parser;

import com.mmco.keepfit.model.Product;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.SAXException;
import org.xml.sax.Attributes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MIRCEA on 12/22/2014.
 */
public class CustomSaxHandler extends DefaultHandler {

    private Product product = null;
    private String elementContent = null;
    private List<Product> productList = new ArrayList<>();

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        elementContent = String.copyValueOf(ch, start, length).trim();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (ParserUtils.PRODUCT.equals(qName)) {
            product = new Product();
            product.setId(Integer.parseInt(attributes.getValue(ParserUtils.ID_ATTRIBUTE)));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case ParserUtils.PRODUCT:
                productList.add(product);
                break;
            case ParserUtils.PRODUCT_NAME:
                product.setName(elementContent);
                break;
            case ParserUtils.PRODUCT_PROTEINS:
                product.setProteins(Double.parseDouble(elementContent));
                break;
            case ParserUtils.PRODUCT_CARBS:
                product.setCarbs(Double.parseDouble(elementContent));
                break;
            case ParserUtils.PRODUCT_FATS:
                product.setFats(Double.parseDouble(elementContent));
                break;
            case ParserUtils.PRODUCT_FIBERS:
                product.setFibers(Double.parseDouble(elementContent));
                break;
            case ParserUtils.PRODUCT_TYPE:
                product.setType(elementContent);
        }
    }


}
