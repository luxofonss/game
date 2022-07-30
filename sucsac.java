public class sucsac {
    public int gieo() {
        int k = ((int)Math.floor(Math.random()*10 + 1) +1)%5 + 1; // k thuoc {1,2,3,4,5}
        System.out.println("suc sac so " + k);
        int temp = (int)Math.floor(Math.random()*100)+ 1;
        System.out.println("temp = " + temp);
        if (1<=temp && temp <= 20) {
            return (k+1)%6 == 0? 6 : (k+1)%6;
        } else if(21<=temp && temp <= 36) {
            return (k+2)%6 == 0? 6 : (k+2)%6;
        }else if(37<=temp && temp <= 52) {
            return (k+3)%6 == 0? 6 : (k+3)%6;
        }else if(53<=temp && temp <= 68) {
            return (k+4)%6 == 0? 6 : (k+4)%6;
        }else if(69 <= temp && temp <= 83) {
            return (k+5)%6 == 0? 6 : (k+5)%6;
        }else
            return (k+6)%6 == 0? 6 : (k+6)%6;
    }
}

