package com.mmco.parser;

/**
 * Created by Mircea on 12/21/2014.
 */
public class ParserUtils {

    private static final String PRODUCT_LIST = "productList";
    private static final String PRODUCT_NAME = "name";
    private static final String PRODUCT_TYPE = "type";
    private static final String PRODUCT_PROTEINS = "proteins";
    private static final String PRODUCT_FATS = "fats";
    private static final String PRODUCT_CARBS = "carbs";
    private static final String PRODUCT_FIBERS = "fibers";

    public enum ProductTypes {
        QUANTITY("quantity"),
        PORTION("portion");

        private final String type;

        ProductTypes(String type) {
            this.type = type;
        }
    }
}
