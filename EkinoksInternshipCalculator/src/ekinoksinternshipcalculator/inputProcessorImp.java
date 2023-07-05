package ekinoksinternshipcalculator;

import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

public class inputProcessorImp implements inputProcessor {
	@Override
	public BigInteger calculate(String[] inputs, boolean lang) {
		String number1 = inputs[0];
        String number2 = inputs[1];
        String operation = inputs[2];

        BigInteger operand1 = decode(number1, lang);
        BigInteger operand2 = decode(number2, lang);
        
        if(operation.equals("sum")) {
        	return operand1.add(operand2);
        } else if(operation.equals("sub")) {
        	return operand1.subtract(operand2);
        } else if(operation.equals("divide")) {
        	return operand1.divide(operand2);
        } else if(operation.equals("multiply")) {
        	return operand1.multiply(operand2);
        }
        return new BigInteger("-1");
	}
	
	@Override
	public BigInteger decode(String input, boolean lang) {
		String number1 = input;
		BigInteger result = new BigInteger("0");
		
		Map<String, BigInteger> lookupTableEng = new HashMap<>();
        lookupTableEng.put("Zero", new BigInteger("0"));
        lookupTableEng.put("One", new BigInteger("1"));
        lookupTableEng.put("Two", new BigInteger("2"));
        lookupTableEng.put("Three", new BigInteger("3"));
        lookupTableEng.put("Four", new BigInteger("4"));
        lookupTableEng.put("Five", new BigInteger("5"));
        lookupTableEng.put("Six", new BigInteger("6"));
        lookupTableEng.put("Seven", new BigInteger("7"));
        lookupTableEng.put("Eight", new BigInteger("8"));
        lookupTableEng.put("Nine", new BigInteger("9"));
        lookupTableEng.put("Ten", new BigInteger("10"));
        lookupTableEng.put("Eleven", new BigInteger("11"));
        lookupTableEng.put("Twelve", new BigInteger("12"));
        lookupTableEng.put("Thirteen", new BigInteger("13"));
        lookupTableEng.put("Fourteen", new BigInteger("14"));
        lookupTableEng.put("Fifteen", new BigInteger("15"));
        lookupTableEng.put("Sixteen", new BigInteger("16"));
        lookupTableEng.put("Seventeen", new BigInteger("17"));
        lookupTableEng.put("Eighteen", new BigInteger("18"));
        lookupTableEng.put("Nineteen", new BigInteger("19"));
        lookupTableEng.put("Twenty", new BigInteger("20"));
        lookupTableEng.put("Thirty", new BigInteger("30"));
        lookupTableEng.put("Fourty", new BigInteger("40"));
        lookupTableEng.put("Fifty", new BigInteger("50"));
        lookupTableEng.put("Sixty", new BigInteger("60"));
        lookupTableEng.put("Seventy", new BigInteger("70"));
        lookupTableEng.put("Eighty", new BigInteger("80"));
        lookupTableEng.put("Ninety", new BigInteger("90"));
        lookupTableEng.put("Hundred", new BigInteger("100"));
        lookupTableEng.put("Thousand", new BigInteger("1000"));
        lookupTableEng.put("Million", new BigInteger("1000000"));
        lookupTableEng.put("Billion", new BigInteger("1000000000"));
        lookupTableEng.put("Trillion", new BigInteger("1000000000000"));
        lookupTableEng.put("Quadrillion", new BigInteger("1000000000000000"));
        lookupTableEng.put("Quintillion", new BigInteger("1000000000000000000"));
        lookupTableEng.put("Sextillion", new BigInteger("1000000000000000000000"));
        lookupTableEng.put("Septillion", new BigInteger("1000000000000000000000000"));
        lookupTableEng.put("Octillion", new BigInteger("1000000000000000000000000000"));
        lookupTableEng.put("Nonillion", new BigInteger("1000000000000000000000000000000"));
        lookupTableEng.put("Decillion", new BigInteger("1000000000000000000000000000000000"));

        Map<String, BigInteger> lookupTable = new HashMap<>();
        lookupTable.put("sıfır", new BigInteger("0L"));
        lookupTable.put("bir", new BigInteger("1L"));
        lookupTable.put("iki", new BigInteger("2L"));
        lookupTable.put("üç", new BigInteger("3L"));
        lookupTable.put("dört", new BigInteger("4L"));
        lookupTable.put("beş", new BigInteger("5L"));
        lookupTable.put("altı", new BigInteger("6L"));
        lookupTable.put("yedi", new BigInteger("7L"));
        lookupTable.put("sekiz", new BigInteger("8L"));
        lookupTable.put("dokuz", new BigInteger("9L"));
        lookupTable.put("on", new BigInteger("10L"));
        lookupTable.put("yirmi", new BigInteger("20L"));
        lookupTable.put("otuz", new BigInteger("30L"));
        lookupTable.put("kırk", new BigInteger("40L"));
        lookupTable.put("elli", new BigInteger("50L"));
        lookupTable.put("altmış", new BigInteger("60L"));
        lookupTable.put("yetmiş", new BigInteger("70L"));
        lookupTable.put("seksen", new BigInteger("80L"));
        lookupTable.put("doksan", new BigInteger("90L"));
        lookupTable.put("yüz", new BigInteger("100L"));
        lookupTable.put("bin", new BigInteger("1000L"));
        lookupTable.put("milyon", new BigInteger("1000000L"));
        lookupTable.put("milyar", new BigInteger("1000000000L"));
        lookupTable.put("trilyon", new BigInteger("1000000000000L"));
        lookupTable.put("katrilyon", new BigInteger("1000000000000000L"));
        lookupTable.put("kentilyon", new BigInteger("1000000000000000000L"));
        lookupTable.put("sekstilyon", new BigInteger("1000000000000000000000L"));
        lookupTable.put("Septilyon", new BigInteger("1000000000000000000000000L"));
        lookupTable.put("Oktilyon", new BigInteger("1000000000000000000000000000L"));
        lookupTable.put("Nonilyon", new BigInteger("1000000000000000000000000000000L"));
        lookupTable.put("Desilyon", new BigInteger("1000000000000000000000000000000000L"));
        char space = ' ';
        String word;
        int count = 1;
        for(int i = 0; i < number1.length(); i++) {
            if(number1.charAt(i) == space) {
                count++;
            }
        }

        int spaceIndex = number1.indexOf(space);
        if(spaceIndex == -1)
            spaceIndex = number1.length();
        BigInteger decodedNumber = new BigInteger("0");
        BigInteger prev = new BigInteger("0");
        BigInteger tba = new BigInteger("0");
        if(lang) {
            for(int i = 0; i < count; i++) {
                word = number1.substring(0, spaceIndex);
                decodedNumber = lookupTableEng.get(word);
                if(word.equals("Hundred") || word.equals("Thousand") || word.equals("Million")
                        || word.equals("Billion") || word.equals("Trillion") || word.equals("Quadrillion") || word.equals("Quintillion") || word.equals("Sextillion")
                        || word.equals("Septillion") || word.equals("Octillion") || word.equals("Nonillion") || word.equals("Decillion")) {

                    if(word.equals("Hundred")) {
                        tba = tba.subtract(prev);
                        tba = tba.add(prev.multiply(decodedNumber));
                    } else {
                        result = result.add(tba.multiply(decodedNumber));
                        tba = tba.subtract(tba);
                    }
                } else {
                    tba = tba.add(decodedNumber);
                }
                prev = decodedNumber;
                if(i == count-1){
                    result = result.add(tba);
                }
                if(i != count-1){
                    spaceIndex++;
                    number1 = number1.substring(spaceIndex);
                }
                if(i == count-2){
                    spaceIndex = number1.length();
                } else {
                    spaceIndex = number1.indexOf(space);
                }
            }
        } else {
            for(int i = 0; i < count; i++) {
                word = number1.substring(0, spaceIndex);
                decodedNumber = lookupTable.get(word);
                if(word.equals("yüz") || word.equals("bin") || word.equals("milyon")
                        || word.equals("milyar") || word.equals("trilyon") || word.equals("katrilyon") || word.equals("kentilyon") || word.equals("sekstilyon")
                        || word.equals("septilyon") || word.equals("oktilyon") || word.equals("nonilyon") || word.equals("desilyon")) {

                    if(word.equals("yüz") || word.equals("bin")) {
                        if(prev.equals(new BigInteger("1")) || prev.equals(new BigInteger("2")) || prev.equals(new BigInteger("3"))
                                || prev.equals(new BigInteger("4")) || prev.equals(new BigInteger("5")) || prev.equals(new BigInteger("6"))
                                || prev.equals(new BigInteger("7")) || prev.equals(new BigInteger("8")) || prev.equals(new BigInteger("9"))) {
                            tba = tba.subtract(prev);
                            tba = tba.add(prev.multiply(decodedNumber));
                        } else {
                            tba = tba.add(decodedNumber);
                        }
                    } else {
                        result = result.add(tba.multiply(decodedNumber));
                        tba = tba.subtract(tba);
                    }
                } else {
                    tba = tba.add(decodedNumber);
                }
                prev = decodedNumber;
                if(i == count-1){
                    result = result.add(tba);
                }
                if(i != count-1){
                    spaceIndex++;
                    number1 = number1.substring(spaceIndex);
                }
                if(i == count-2){
                    spaceIndex = number1.length();
                } else {
                    spaceIndex = number1.indexOf(space);
                }
            }
        }
		return result;
	}
}