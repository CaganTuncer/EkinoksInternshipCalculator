package ekinoksinternshipcalculator;

import java.math.BigInteger;

public interface InputProcessor{
	BigInteger calculate(String[] inputs, boolean lang);
	BigInteger decode(String input,  boolean lang);
	String encode(BigInteger input, boolean lang);
}