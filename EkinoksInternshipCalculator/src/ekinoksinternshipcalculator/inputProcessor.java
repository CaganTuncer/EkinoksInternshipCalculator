package ekinoksinternshipcalculator;

import java.math.BigInteger;

public interface inputProcessor{
	BigInteger calculate(String[] inputs, boolean lang);
	BigInteger decode(String input,  boolean lang);
}