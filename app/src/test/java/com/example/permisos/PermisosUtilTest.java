package com.example.permisos;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermisosUtilTest {

    private PermisosUtil utils;

    @Before
    public void setUp() {utils = new PermisosUtil();}

    @Test
    public void isValidEmailAddress()  throws Exception{
        assertTrue(!utils.isValidEmailAddress("foo@bar.com"));
    }
}