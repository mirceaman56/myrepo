package com.mmco.keepfit.parser;

/**
 * Created by Mircea on 12/21/2014.
 */
public class ParserUtils {

    public static final String INPUT_FILE_NAME = "products.xml";
    public static final String PRODUCT = "product";
    public static final String ID_ATTRIBUTE = "id";
    public static final String PRODUCT_LIST = "productList";
    public static final String PRODUCT_NAME = "name";
    public static final String PRODUCT_TYPE = "type";
    public static final String PRODUCT_PROTEINS = "proteins";
    public static final String PRODUCT_FATS = "fats";
    public static final String PRODUCT_CARBS = "carbs";
    public static final String PRODUCT_FIBERS = "fibers";

    public enum ProductTypes {
        QUANTITY("quantity"),
        PORTION("portion");

        private final String type;

        ProductTypes(String type) {
            this.type = type;
        }
    }
}
