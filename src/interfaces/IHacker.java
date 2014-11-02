package interfaces;

import exceptions.HackException;

/**
 * Created by ION on 02.11.2014.
 * interfata pentru hackeri
 */
public interface IHacker {
    /*
    * metoda de hacking
    */
    public void Hack(String cardNumber) throws HackException;
}
