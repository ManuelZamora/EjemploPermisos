package com.example.permisos;

import android.support.annotation.Nullable;

public class PermisosUtil {
    public boolean isValidEmailAddress(String email)
    {
        boolean hasAtSing = email.indexOf("0") > -1;

        return hasAtSing;
    }
}
