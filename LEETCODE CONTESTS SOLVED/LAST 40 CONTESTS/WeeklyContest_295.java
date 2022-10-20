//2288. Apply Discount to Prices
class Solution {
    public String discountPrices(String sentence, int discount) {
        String arr[] = sentence.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].charAt(0)=='$' && arr[i].substring(1).matches("\\d+"))
            {
                String str = arr[i].substring(1);
                double val = Double.parseDouble(str);
                double amount = val-(val*discount/100.00);
                String s = "$".concat(String.format("%.2f",amount));
                arr[i] = s;
            } 
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
            if(i<arr.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}
