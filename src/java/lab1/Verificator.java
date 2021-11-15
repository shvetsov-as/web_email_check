/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Verificator implements IVerificator {

    Pattern patternName = Pattern.compile("^[a-zA-Zа-яёА-ЯЁ]+$");
    Pattern patternMail = Pattern.compile("\\A[^@]+@([^@\\.]+\\.)+[^@\\.]+\\z");

    @Override
    public boolean nameCheck(String userName) {

        Matcher matcher = patternName.matcher(userName);
        return matcher.find();

    }

    @Override
    public boolean emailCheck(String emailAddr) {

        Matcher matcher = patternMail.matcher(emailAddr);
        return matcher.find();

    }

}
