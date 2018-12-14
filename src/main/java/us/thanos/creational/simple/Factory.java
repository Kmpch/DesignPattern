package us.thanos.creational.simple;

/**
 * Description: Factory
 * PackageName: us.thanos.creational.simple
 *
 * @author: chenglulu
 * @version: 1.0
 * Filename:    Factory.java
 * Create at:  2018/12/13
 * Copyright:   Copyright (c)2018
 * Company:     songxiaocai
 * Modification History:
 * Date              Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/12/13     chenglulu    1.0         1.0 Version
 */
public class Factory {

    public static Product createProduct(String productName){
        
        if("A".equals(productName)){
            return new ProductA();
        }
        if("B".equals(productName)){
            return new ProductB();
        }
        return null;
    }
}
