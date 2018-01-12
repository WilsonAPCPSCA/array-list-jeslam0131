import java.util.ArrayList;
public class randomZeros {

	public static void main(String[] args) {
		ArrayList<Integer>numsRandom = new ArrayList<Integer>(10);
		for (int i=0; i<10; i++){ 
			numsRandom.add ((int)(Math.random()*10)); 
		}
		
		System.out.println (numsRandom);
		for (int i = 0 ; i < 10 ; i ++){
			numsRandom.set(i, 0);
		}
		System.out.println(numsRandom);
	}

}
