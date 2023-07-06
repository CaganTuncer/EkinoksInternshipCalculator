package ekinoksinternshipcalculator;

import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

public class InputProcessorImp implements InputProcessor {
	Map<String, BigInteger> lookupTableEng;
	Map<String, BigInteger> lookupTable;
	String[] namesEng = {"zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ",
            "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen ", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety ",
            "hundred ", "thousand ", "million ", "billion ", "trillion ", "quadrillion ", "quintillion ", "sextillion ", "septillion ", "octillion ", "nonillion ", "decillion "};
	String[] namesTr = {"sıfır ", "bir ", "iki ", "üç ", "dört ", "beş ", "altı ", "yedi ", "sekiz ", "dokuz ", "on ", "on bir ", "on iki ", "on üç ", "on dört ",
            "on beş ", "on altı ", "on yedi, ", "on sekiz ", "on dokuz ", "yirmi ", "otuz ", "kırk ", "elli ", "altmış ", "yetmiş ", "seksen ", "doksan ",
            "yüz ", "bin ", "milyon ", "milyar ", "trilyon ", "katrilyon ", "kentilyon ", "sekstilyon ", "septilyon ", "oktilyon ", "nonilyon ", "desilyon "};
	public InputProcessorImp(){
		this.lookupTableEng = new HashMap<>();
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
		this.lookupTable = new HashMap<>();
		lookupTable.put("sıfır", new BigInteger("0"));
        lookupTable.put("bir", new BigInteger("1"));
        lookupTable.put("iki", new BigInteger("2"));
        lookupTable.put("üç", new BigInteger("3"));
        lookupTable.put("dört", new BigInteger("4"));
        lookupTable.put("beş", new BigInteger("5"));
        lookupTable.put("altı", new BigInteger("6"));
        lookupTable.put("yedi", new BigInteger("7"));
        lookupTable.put("sekiz", new BigInteger("8"));
        lookupTable.put("dokuz", new BigInteger("9"));
        lookupTable.put("on", new BigInteger("10"));
        lookupTable.put("yirmi", new BigInteger("20"));
        lookupTable.put("otuz", new BigInteger("30"));
        lookupTable.put("kırk", new BigInteger("40"));
        lookupTable.put("elli", new BigInteger("50"));
        lookupTable.put("altmış", new BigInteger("60"));
        lookupTable.put("yetmiş", new BigInteger("70"));
        lookupTable.put("seksen", new BigInteger("80"));
        lookupTable.put("doksan", new BigInteger("90"));
        lookupTable.put("yüz", new BigInteger("100"));
        lookupTable.put("bin", new BigInteger("1000"));
        lookupTable.put("milyon", new BigInteger("1000000"));
        lookupTable.put("milyar", new BigInteger("1000000000"));
        lookupTable.put("trilyon", new BigInteger("1000000000000"));
        lookupTable.put("katrilyon", new BigInteger("1000000000000000"));
        lookupTable.put("kentilyon", new BigInteger("1000000000000000000"));
        lookupTable.put("sekstilyon", new BigInteger("1000000000000000000000"));
        lookupTable.put("Septilyon", new BigInteger("1000000000000000000000000"));
        lookupTable.put("Oktilyon", new BigInteger("1000000000000000000000000000"));
        lookupTable.put("Nonilyon", new BigInteger("1000000000000000000000000000000"));
        lookupTable.put("Desilyon", new BigInteger("1000000000000000000000000000000000"));
	}
	@Override
	public BigInteger calculate(String[] inputs, boolean lang) {
		String number1 = inputs[0];
        String number2 = inputs[1];
        String operation = inputs[2];

        BigInteger operand1 = decode(number1, lang);
        BigInteger operand2 = decode(number2, lang);
        
        if(operation.equals("add")) {
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
	
	public String encode(BigInteger input, boolean lang) {
        int digitNo = input.toString().length();
        int largestPart = (digitNo % 3);
        int count = digitNo/ 3;
        String number = input.toString();
        String result = "";
        int val;
        if(lang) {
            if(largestPart != 0) {
                String word = number.substring(0, largestPart);
                if(word.length() == 1) {
                    val = Integer.valueOf(word.substring(0,1));
                    result = result + namesEng[val];
                } else {
                    val = Integer.valueOf(word.substring(0,1));
                    if(val == 1) {
                        val = Integer.valueOf(word.substring(1,2));
                        result = result + namesEng[10+val];
                    } else {
                        result = result + namesEng[18+val];
                        val = Integer.valueOf(word.substring(1,2));
                        if(val != 0) {
                            result = result + namesEng[val];
                        }
                    }
                }
                if(count >= 1) {
                    int zeroIndex = largestPart;
                    int oneIndex = largestPart + 1;
                    int twoIndex = largestPart + 2;
                    int threeIndex = largestPart + 3;
                    while(count > 0) {
                        result = result + namesEng[28+count];
                        val = Integer.valueOf(number.substring(zeroIndex, oneIndex));
                        if(val != 0) {
                            result = result + namesEng[val];
                            result = result + "hundred ";
                        }
                        val = Integer.valueOf(number.substring(oneIndex, twoIndex));
                        if(val == 1) {
                            result = result + namesEng[10+val];
                        } else {
                            result = result + namesEng[18+val];
                            val = Integer.valueOf(number.substring(twoIndex, threeIndex));
                            if(val != 0) {
                                result = result + namesEng[val];
                            }
                        }
                        zeroIndex = zeroIndex + 3;
                        oneIndex = oneIndex + 3;
                        twoIndex = twoIndex + 3;
                        threeIndex = threeIndex + 3;
                        count--;
                    }
                }

            } else {
                if(count >= 1) {
                    int zeroIndex = largestPart;
                    int oneIndex = largestPart + 1;
                    int twoIndex = largestPart + 2;
                    int threeIndex = largestPart + 3;
                    while(count > 0) {
                        val = Integer.valueOf(number.substring(zeroIndex, oneIndex));
                        if(val != 0) {
                            result = result + namesEng[val];
                            result = result + "hundred ";
                        }
                        val = Integer.valueOf(number.substring(oneIndex, twoIndex));
                        if(val == 1) {
                            result = result + namesEng[10+val];
                        } else {
                            result = result + namesEng[18+val];
                            val = Integer.valueOf(number.substring(twoIndex, threeIndex));
                            if(val != 0) {
                                result = result + namesEng[val];
                            }
                        }
                        zeroIndex = zeroIndex + 3;
                        oneIndex = oneIndex + 3;
                        twoIndex = twoIndex + 3;
                        threeIndex = threeIndex + 3;
                        if(count != 1){
                            result = result + namesEng[28+(count-1)];
                        }
                        count--;
                    }
                }
            }
        } else {
            if(largestPart != 0) {
                String word = number.substring(0, largestPart);
                if(word.length() == 1) {
                    val = Integer.valueOf(word.substring(0,1));
                    result = result + namesTr[val];
                } else if(word.length() == 2) {
                    val = Integer.valueOf(word.substring(0,1));
                    if(val == 1) {
                        val = Integer.valueOf(word.substring(1,2));
                        result = result + namesTr[10+val];
                    } else {
                        result = result + namesTr[18+val];
                        val = Integer.valueOf(word.substring(1,2));
                        if(val != 0) {
                            result = result + namesTr[val];
                        }
                    }
                }
                if(count >= 1) {
                    int zeroIndex = largestPart;
                    int oneIndex = largestPart + 1;
                    int twoIndex = largestPart + 2;
                    int threeIndex = largestPart + 3;
                    while(count > 0) {
                        result = result + namesTr[28+count];
                        val = Integer.valueOf(number.substring(zeroIndex, oneIndex));
                        if(val != 0) {
                            if(val != 1){
                                result = result + namesTr[val];
                            }
                            result = result + "yüz ";
                        }
                        val = Integer.valueOf(number.substring(oneIndex, twoIndex));
                        if(val == 1) {
                            result = result + namesTr[10+val];
                        } else {
                            result = result + namesTr[18+val];
                            val = Integer.valueOf(number.substring(twoIndex, threeIndex));
                            if(val != 0) {
                                result = result + namesTr[val];
                            }
                        }
                        zeroIndex = zeroIndex + 3;
                        oneIndex = oneIndex + 3;
                        twoIndex = twoIndex + 3;
                        threeIndex = threeIndex + 3;
                        count--;
                    }
                }

            } else {
                if(count >= 1) {
                    int zeroIndex = largestPart;
                    int oneIndex = largestPart + 1;
                    int twoIndex = largestPart + 2;
                    int threeIndex = largestPart + 3;
                    while(count > 0) {
                        val = Integer.valueOf(number.substring(zeroIndex, oneIndex));
                        if(val != 0) {
                            if(val != 1){
                                result = result + namesTr[val];
                            }
                            result = result + "yüz ";
                        }
                        val = Integer.valueOf(number.substring(oneIndex, twoIndex));
                        if(val == 1) {
                            result = result + namesTr[10+val];
                        } else {
                            result = result + namesTr[18+val];
                            val = Integer.valueOf(number.substring(twoIndex, threeIndex));
                            if(val != 0) {
                                result = result + namesTr[val];
                            }
                        }
                        zeroIndex = zeroIndex + 3;
                        oneIndex = oneIndex + 3;
                        twoIndex = twoIndex + 3;
                        threeIndex = threeIndex + 3;
                        if(count != 1){
                            result = result + namesTr[28+(count-1)];
                        }
                        count--;
                    }
                }
            }
        }


        return result;
    }
}