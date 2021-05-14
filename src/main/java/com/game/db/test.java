package com.game.db;


import io.xjar.XCryptos;

public class test {
    public static void main(String[] args) throws Exception {
        //加密
        //encryption
        //解密
        //decryption
        XCryptos.encryption()
                .from("C:\\Users\\Administrator\\Desktop\\qx-ios-1.0.0.jar")
                .use("123456")
                .include("/wd/**/*.class")
                .include("/mapper/**/*Mapper.xml")
                .exclude("/static/**/*")
                .exclude("/conf/*")
                .to("C:\\Users\\Administrator\\Desktop\\xqx-ios-1.0.0.jar");


//        XCryptos.decryption()
//                .from("C:\\Users\\Administrator\\Desktop\\wd-server-enc-1.0.0.jar")
//                .use("hhr666")
//                .include("/com/**/*.class")
//                .include("/mapper/**/*Mapper.xml")
//                .exclude("/static/**/*")
//                .exclude("/conf/*")
//                .to("C:\\Users\\Administrator\\Desktop\\xwd-server-enc-1.0.0.jar");

//        XCryptos.encryption()
//                .from("C:\\Users\\Administrator\\Desktop\\game-web.jar")
//                .use("h2021h05r08")
//                .include("/io/xjar/**/*.class")
//                .include("/mapper/**/*Mapper.xml")
//                .exclude("/static/**/*")
//                .exclude("/conf/*")
//                .to("C:\\Users\\Administrator\\Desktop\\xgame-web.jar");


//        String password = "h2021h05r07";
//        XKey xKey = XKit.key(password);
//        XBoot.decrypt("C:\\Users\\Administrator\\Desktop\\wd-server-enc-1.0.0.jar", "C:\\Users\\Administrator\\Desktop\\xwd-server-enc-1.0.0.jar", xKey);
//
//
//        String password = "io.xjar";
//        XKey xKey = XKit.key(password);
//        XJar.decrypt("/path/to/read/encrypted.jar", "/path/to/save/decrypted.jar", xKey);
    }


}
