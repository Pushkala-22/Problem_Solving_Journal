class Solution {
    public String intToRoman(int num) {
      Map<Integer,String> h=new LinkedHashMap<>();
      h.put(1000,"M");
      h.put(900,"CM");
      h.put(500,"D");
      h.put(400,"CD");
      h.put(100,"C");
      h.put(90,"XC");
      h.put(50,"L");
      h.put(40,"XL");
      h.put(10,"X");
      h.put(9,"IX");
      h.put(5,"V");
      h.put(4,"IV");
      h.put(1,"I");
      StringBuilder roman=new StringBuilder();
      for(Map.Entry<Integer,String>e:h.entrySet()){
        int value = e.getKey();
         String symbol = e.getValue();

            while (num >= value) {
                num -= value;
                roman.append(symbol);
            }
        }

        return roman.toString();
    
      


      


    }
}