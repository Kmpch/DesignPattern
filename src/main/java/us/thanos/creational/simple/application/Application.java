package us.thanos.creational.simple.application;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;

/**
 * Description: Application
 * PackageName: us.thanos.creational.simple.application
 *
 * @author: chenglulu
 * @version: 1.0
 * Filename:    Application.java
 * Create at:  2018/12/13
 * Copyright:   Copyright (c)2018
 * Company:     songxiaocai
 * Modification History:
 * Date              Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/12/13     chenglulu    1.0         1.0 Version
 */
public class Application {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {

        /**
         * Java 加密技术
         */

        /**
         * 获取不同加密算法的密钥生成器:
         */
        KeyGenerator deSede = KeyGenerator.getInstance("DESede");

        /**
         * 创建密码器
         */
        Cipher cp= Cipher.getInstance("DESede");


    }
}
