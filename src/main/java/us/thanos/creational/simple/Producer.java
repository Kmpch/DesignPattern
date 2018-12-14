package us.thanos.creational.simple;

/**
 * Description: Producer
 * PackageName: us.thanos.creational.simple
 *
 * @author: chenglulu
 * @version: 1.0
 * Filename:    Producer.java
 * Create at:  2018/12/13
 * Copyright:   Copyright (c)2018
 * Company:     songxiaocai
 * Modification History:
 * Date              Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/12/13     chenglulu    1.0         1.0 Version
 */
public class Producer {

    public static void main(String[] args) {
        Product a = Factory.createProduct("A");
        a.use();

        Product b = Factory.createProduct("B");
        b.use();
    }
}
