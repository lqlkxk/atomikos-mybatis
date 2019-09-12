package com.inphase.utils;

import java.util.UUID;
public class UuidUtil {
    public UuidUtil() {
    }

    public static String generateUUID() {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-", "");
        return uuid;
    }
}
