package com.modul5.exception.custom;
import java.lang.Exception;
public class illegalAdminAccess extends Exception {
    public illegalAdminAccess(String message){
        super(message);
    }
}
