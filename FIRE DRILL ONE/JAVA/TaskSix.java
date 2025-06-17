public class TaskSix{
	public static void main(String[] args){
		for(int count =1; count <=10; count++){
			if(count % 4 == 0){
			System.out.print(count);
				int fixCount = count;
				for(int counter = 1; counter <= 6; counter++){
					int multiple = count * fixCount;
						System.out.print(" ");
						System.out.print(multiple);
						count = multiple;
				}
			}
		}

	}


}