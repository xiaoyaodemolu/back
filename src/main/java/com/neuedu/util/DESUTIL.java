package com.neuedu.util;

import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import javax.crypto.KeyGenerator;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;

/**
 * Created by Administrator on 2019/4/1.
 */
public class DESUTIL {
    static Key key;
    static String KEYSTR="RL";
    static {
        try {
            KeyGenerator keyGenerator =KeyGenerator.getInstance("DES");
            SecureRandom secureRandom =SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(KEYSTR.getBytes());
            keyGenerator.init(secureRandom);
            key= keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
