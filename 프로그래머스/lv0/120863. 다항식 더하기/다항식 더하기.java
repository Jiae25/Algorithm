class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int xsum = 0, sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].contains("x")){
                if(arr[i].length() > 1){
                    xsum += Integer.parseInt(arr[i].substring(0, arr[i].length() - 1));
                }else{
                    xsum += 1;
                }
            }else if(!arr[i].equals("+")){
                sum += Integer.parseInt(arr[i]);
            }
        }

        if(xsum == 0){
            answer = sum + "";
        }else if(xsum == 1){
            if(sum == 0){
                answer = "x";
            }else{
                answer = "x + " + sum;
            }
        }else{
            if(sum == 0){
                answer = xsum + "x";
            }else{
                answer = xsum + "x + " + sum;
            }
        }
        
        return answer;
    }
}